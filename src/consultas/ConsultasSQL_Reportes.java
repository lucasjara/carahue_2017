package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static paneles.reportes.JPanelDiax.tbVentasDiaX;
import static paneles.reportes.JPanelDiax.tbVentasDiaXDetalles;
import static paneles.reportes.JPanelVentasHoy.tbVentasHoy;
import static paneles.reportes.JPanelVentasHoy.tbVentasHoyDetalles;
import static paneles.reportes.JPanelVentasMensual.tbVentasMes;
import static paneles.reportes.JPanelVentasMensual.tbVentasMesDetalles;
import paneles.reportes.JPanelVentasSemanal;
import static paneles.reportes.JPanelVentasSemanal.tbVentasSemana;
import static paneles.reportes.JPanelVentasSemanal.tbVentasSemanaDetalles;

public class ConsultasSQL_Reportes {

    String CadSql = "";

    public void VentasHoy(int numero, Date fecha, Date fecha2) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CodigoVenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo");
        switch (numero) {
            case 1:
                CadSql = "SELECT DISTINCT cod_venta,fecha,tipo from ventas WHERE fecha='" + fecha + "' AND estado='VENDIDO';";
                break;
            case 2:
                CadSql = "SELECT DISTINCT cod_venta,fecha,tipo from ventas WHERE fecha BETWEEN '" + fecha + "' AND '" + fecha2 + "' AND estado='VENDIDO';";
                break;
            case 3:
                CadSql = "SELECT DISTINCT cod_venta,fecha,tipo from ventas WHERE fecha BETWEEN '" + fecha + "' AND '" + fecha2 + "' AND estado='VENDIDO';";
                break;
            case 4:CadSql = "SELECT DISTINCT cod_venta,fecha,tipo from ventas WHERE fecha='" + fecha + "' AND estado='VENDIDO';";
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
            switch (numero) {
                case 1:
                    tbVentasHoy.setModel(modelo);
                    break;
                case 2:
                    tbVentasSemana.setModel(modelo);
                    break;
                case 3:
                    tbVentasMes.setModel(modelo);
                    break;
                case 4:tbVentasDiaX.setModel(modelo);
                    break;
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex);
        }
    }

    public int DetalleVenta(int numero,int cod_venta) {
        int total = 0;
        int precio_individual=0;
        int valor=0;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IdProducto");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio/Unitario");
        modelo.addColumn("Valor");
        CadSql = "SELECT p.id, p.nombre,v.cantidad, v.precio from ventas v, productos p WHERE cod_venta='" + cod_venta + "' AND estado='VENDIDO' AND v.id_producto=p.id and id_producto!=3;";
        try {
            String[] datos = new String[5];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                int cantidad = Integer.parseInt(rs.getString(3));
                precio_individual=Integer.parseInt(rs.getString(4))/cantidad;
                total = (cantidad*precio_individual)+ total;
                datos[3] = Integer.toString(precio_individual);
                valor=precio_individual*cantidad;
                datos[4] = Integer.toString(valor);
                modelo.addRow(datos);
            }
            switch(numero){
                case 1:tbVentasHoyDetalles.setModel(modelo);
                    break;
                case 2:tbVentasSemanaDetalles.setModel(modelo);
                    break;
                case 3:tbVentasMesDetalles.setModel(modelo);
                    break;
                case 4:tbVentasDiaXDetalles.setModel(modelo);
                    break;
            }
            //Inventario_Administracion.tbproductos_administracion.setModel(modelo);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex);
        }
        return total;
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
