package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static paneles.reportes.JPanelVentasHoy.tbVentasHoy;
import static paneles.reportes.JPanelVentasHoy.tbVentasHoyDetalles;

public class ConsultasSQL_Reportes {
    String CadSql = "";
    public void VentasHoy(int numero,Date fecha){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoVenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo");
        switch(numero){
            case 1:
                CadSql="SELECT DISTINCT cod_venta,fecha,tipo from ventas WHERE fecha='"+fecha+"' AND estado='VENDIDO';";
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
            tbVentasHoy.setModel(modelo);
            //Inventario_Administracion.tbproductos_administracion.setModel(modelo);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex);
        }
    }   
    public int DetalleVenta(int cod_venta){
        int total=0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IdProducto");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        CadSql="SELECT p.id, p.nombre,v.cantidad, v.precio from ventas v, productos p WHERE cod_venta='"+cod_venta+"' AND estado='VENDIDO' AND v.id_producto=p.id and id_producto!=3;";
        try {
            String[] datos = new String[4];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                total=Integer.parseInt(rs.getString(4))+total;
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            tbVentasHoyDetalles.setModel(modelo);
            //Inventario_Administracion.tbproductos_administracion.setModel(modelo);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex);
        }
        return total;
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
