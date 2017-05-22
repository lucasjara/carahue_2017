package consultas;

import com.toedter.calendar.JDateChooser;
import conectar.conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Inventario_Administracion;
import static vista.Inventario_Administracion.CboNombreProveedor;

public class ConsultasSQL_Inventario_Administracion {

    String CadSql = "";

    public void Tabla_Inventario(int numero, String categoria, String nombre) {
        /*
         Numero = Accion a realizar.
         Campo = Condicional Consulta.
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Codigo", "Nombre", "Descripcion", "Categoria", "Cantidad", "Nombre Proveedor", "Dia de LLegada", "Num_Fac."};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                //MOSTRAR TODOS LOS PRODUCTOS
                CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.dia_llegada, p.numero_factura FROM productos p, proveedores pe WHERE p.cod_inventario!='LALA' AND pe.id=p.id_proveedor;";
                break;
            case 2:
                //BUSQUEDA CON NOMBRE SOLAMENTE
                CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.dia_llegada, p.numero_factura FROM `productos` p, proveedores pe WHERE p.cod_inventario!='LALA' AND p.nombre like'%" + nombre + "%' AND pe.id=p.id_proveedor;";
                break;
            case 3:
                //BUSQUEDA NOMBRE Y CATEGORIA
                CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.dia_llegada, p.numero_factura FROM `productos` p, proveedores pe WHERE p.categoria='" + categoria + "' AND p.nombre like'%" + nombre + "%' AND pe.id=p.id_proveedor;";
                break;
            case 4:
                //BUSQUEDA CON CATEGORIA
                CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.dia_llegada, p.numero_factura FROM `productos` p, proveedores pe WHERE p.categoria='" + categoria + "' AND pe.id=p.id_proveedor;";
                break;
            case 5:
                //BUSQUEDA CON CATEGORIA Y CODIGO
                CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.dia_llegada, p.numero_factura FROM `productos` p, proveedores pe WHERE p.categoria='" + categoria + "' AND p.cod_inventario like'%" + nombre + "%' AND pe.id=p.id_proveedor;";
                break;
            case 6:
                CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.dia_llegada, p.numero_factura FROM `productos` p, proveedores pe WHERE p.cod_inventario!='LALA' AND p.cod_inventario like'%" + nombre + "%' AND pe.id=p.id_proveedor;";
                break;
        }
        try {
            String[] datos = new String[8];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                modelo.addRow(datos);
            }
            Inventario_Administracion.tbproductos_administracion.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public String Disponibilidad_Cod_Producto(String Nombre, String Categoria) {
        String valor = "";
        try {
            CadSql = "SELECT p.cod_inventario FROM `productos` p WHERE p.cod_inventario!='LALA' AND p.cod_inventario='" + Nombre + "' AND p.categoria='" + Categoria + "';";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                valor = rs.getString(1);
                break;
            }
        } catch (Exception ex) {

        }
        return valor;
    }
    public void SetearProveedores(){
        try {
            CadSql = "SELECT nombre FROM proveedores WHERE 1;";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
            String valor = rs.getString(1);
                CboNombreProveedor.addItem(valor);
            }
        } catch (Exception ex) {

        }
    }

    public void GuardarProductos(String codigo_producto, String nombre, String descripcion, String categoria, int cantidad, String nombre_proveedor, int valor_compra, int valor_venta, Date dia, int numero_factura) {
        //ID, COD_INVENTARIO,NOMBRE,DESCRIPCION,CATEGORIA,CANTIDAD,NOM_PROVEEDOR,VALOR COMPRA,VALOR VENTA,DIA LLEGADA,NUM_FACTURA
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO productos(cod_inventario,nombre,descripcion,categoria,cantidad,id_proveedor,valor_compra,valor_venta,dia_llegada,numero_factura) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, codigo_producto);
            pst.setString(2, nombre);
            pst.setString(3, descripcion);
            pst.setString(4, categoria);
            pst.setInt(5, cantidad);
            pst.setString(6, nombre_proveedor);
            pst.setInt(7, valor_compra);
            pst.setInt(8, valor_venta);
            pst.setDate(9, dia);
            pst.setInt(10, numero_factura);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ModificarProductos(String codigo_producto, String nombre, String descripcion, String categoria, int cantidad, String nombre_proveedor, int valor_compra, int valor_venta, Date dia, int numero_factura) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET nombre=?, descripcion=?, cantidad=?, nom_proveedor=?, valor_compra=?, valor_venta=?,dia_llegada=?, numero_factura=? WHERE cod_inventario=? AND categoria=?;");
            pst.setString(1, nombre);
            pst.setString(2, descripcion);
            pst.setInt(3, cantidad);
            pst.setString(4, nombre_proveedor);
            pst.setInt(5, valor_compra);
            pst.setInt(6, valor_venta);
            pst.setDate(7, dia);
            pst.setInt(8, numero_factura);
            pst.setString(9, codigo_producto);
            pst.setString(10, categoria);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public String[] SetearCampos(String codigo, String categoria) {
        String[] datos = new String[10];
        try {
            CadSql = "SELECT p.cod_inventario, p.nombre,p.descripcion, p.categoria,p.cantidad,pe.nombre,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM `productos` p, proveedores pe WHERE p.categoria='" + categoria + "' AND p.cod_inventario ='" + codigo + "' AND pe.id=p.id_proveedor;";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return datos;
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();

}
