package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static paneles.JPanelIngresoAbonos.tbIngresoAbonos;

public class ConsultasSQL_Abonos {
    String CadSql="";
    public void Tabla_Credito(int numero, String campo) {
        /*
         numero = Accion a realizar en la tabla
         campo = valor condicional ["Codigo_Venta"]
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Cod_Venta", "Abonado", "Total"};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                CadSql = "SELECT c.cod_venta, c.abono, c.total FROM credito c, clientes cli WHERE cli.id=c.id_cliente AND cli.rut='" + campo + "';";
                break;
            case 2:
                CadSql = "SELECT p.nombre, p.descripcion, v.cantidad, p.valor_venta, v.precio FROM productos p, ventas v WHERE v.id_producto=p.id AND v.cod_venta='" + campo + "';";
                break;
        }
        try {
            String[] datos = new String[3];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tbIngresoAbonos.setModel(modelo);
            //if(numero==1){interfaz_venta_.tbventa.setModel(modelo);}else{interfaz_administracion.tblistado.setModel(modelo);}
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex);
        }
    }
    public String ConsultarCod_Venta(String cod_venta){
        String valor="";
        try {
            CadSql = "SELECT cod_venta FROM credito WHERE cod_venta='"+cod_venta+"'";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                valor = rs.getString(1);
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return valor;
    }
    public String Cod_VentaRegistrado(String cod_venta){
        String valor="";
        try {
            CadSql = "SELECT cod_venta FROM ventas WHERE cod_venta='"+cod_venta+"'";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                valor = rs.getString(1);
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return valor;
    }
    public int Consultar_Valor_Cod_Venta(int cod_venta){
        int valor=0;
        try {
            CadSql = "SELECT cantidad, precio FROM ventas WHERE cod_venta="+cod_venta+"";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            int datos[] = new int[2];
            while (rs.next()) {
                datos[0] =Integer.parseInt(rs.getString(1));
                datos[1] =Integer.parseInt(rs.getString(2));
                valor=(datos[0]*datos[1])+valor;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return valor;
    }
        public void NuevoCredito(int abono, int total, LocalDate fecha_termino,int cod_venta,int id_cliente, int id_usuario) {
        try {
            Date date = Date.valueOf(fecha_termino);
            
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO credito(abono,total,fecha_termino,cod_venta,id_cliente,id_usuario) VALUES (?,?,?,?,?,?)");
            pst.setInt(1, abono);
            pst.setInt(2, total);
            pst.setDate(3, date);
            pst.setInt(4, cod_venta);
            pst.setInt(5, id_cliente);
            pst.setInt(6, id_usuario);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
