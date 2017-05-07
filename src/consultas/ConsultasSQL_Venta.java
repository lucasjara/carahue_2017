package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Venta_b;

public class ConsultasSQL_Venta {

    public String CadSql = "";

    public void Tabla_Productos(int numero, String campo, String categoria) {
        /*
         Numero = Accion a realizar en la Tabla.
         Campo = Variable ingresada para busqueda[Codigo/Nombre].
         Categoria = En que negocio se encuentra mi producto.
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Codigo", "Nombre Producto", "Descripcion", "Cantidad", "Valor Producto"};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                CadSql = "SELECT cod_inventario, nombre, descripcion, cantidad, valor_venta FROM productos where categoria ='" + categoria + "';";
                break;
            case 2:
                CadSql = "SELECT cod_inventario, nombre, descripcion, cantidad, valor_venta FROM productos where nombre like'%" + campo + "%' AND categoria='" + categoria + "';";
                break;
            case 3:
                CadSql = "SELECT id_producto, cantidad from productos where categoria='" + campo + "';";
                break;
            case 4:
                CadSql = "SELECT cod_inventario, nombre, descripcion, cantidad, valor_venta FROM productos where cod_inventario like'%" + campo + "%' AND categoria='" + categoria + "';";
                break;
        }
        try {
//            if (numero == 3) {
//                String[] datos = new String[2];
//                Statement st = this.cn.createStatement();
//                ResultSet rs = st.executeQuery(CadSql);
//                while (rs.next()) {
//                    guardarRecuperacion(rs.getString(1), rs.getString(2));
//                }
//
//            } else {
            String[] datos = new String[5];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
//            }
            Venta_b.tbproductosListado.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void Tabla_Compra(int numero, String campo) {
        /*
            numero = Accion a realizar en la tabla
            campo = valor condicional ["Codigo_Venta"]
        */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Nombre", "Descripcion", "Cantidad","Precio", "Valor"};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                CadSql = "SELECT p.nombre, p.descripcion, v.cantidad, p.valor_venta, v.precio FROM productos p, ventas v WHERE v.id_producto=p.id AND v.cod_venta='" + campo + "' AND v.estado='INACTIVO';";
                break;
            case 2:
                CadSql = "select p.nom_producto, p.descripcion, v.cantidad, p.valor_individual_venta, v.precio from productos p, ventas v where p.cod_producto=v.cod_producto AND v.cod_venta='" + campo + "';";
                break;
        }
        try {
            String[] datos = new String[5];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            if(numero==1){
                Venta_b.tbventa.setModel(modelo);
            }
            //if(numero==1){interfaz_venta_.tbventa.setModel(modelo);}else{interfaz_administracion.tblistado.setModel(modelo);}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void NuevaVenta(int cod_venta,int cantidad,Double precio,String estado, int id_producto, int id_usuario) {
        try {
             /*
                cod venta|cantidad|precio|fecha|estado|id_producto|id_usuario
             */
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ventas(cod_venta,cantidad,precio,fecha,estado,id_producto,id_usuario) VALUES (?,?,?,?,?,?,?)");
            pst.setInt(1, cod_venta);
            pst.setInt(2, cantidad);
            pst.setDouble(3, precio);
            pst.setDate(4,  sqlDate);
            pst.setString(5, estado);
            pst.setInt(6, id_producto);
            pst.setInt(7, id_usuario);
            pst.executeUpdate();
            //GuardarOrdenVenta(cod_venta, cod_producto, precio);
            //StockProductos(cod_producto, cantidad2, categoria);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int ReservarCodigoVenta() {
        int cod_venta = 0;
        try {
            CadSql="SELECT cod_venta FROM `ventas` ORDER BY cod_venta DESC;";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                cod_venta = Integer.parseInt(rs.getString(1));
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cod_venta;
    }
    public int Id_producto(String codigo){
        try {
            CadSql="SELECT id FROM productos where cod_inventario='" + codigo + "';";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                codigo = rs.getString(1);
                break;
            }
        } catch (Exception e) {
        }
        return Integer.parseInt(codigo);
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();

    public void NuevaVenta(int cod_venta_reservado, int i, double d, Date valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
