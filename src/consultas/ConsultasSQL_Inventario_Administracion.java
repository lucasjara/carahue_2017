package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Inventario_Administracion;

public class ConsultasSQL_Inventario_Administracion {

    String CadSql = "";

    public void Tabla_Inventario(int numero, String categoria, String nombre) {
        /*
         Numero = Accion a realizar.
         Campo = Condicional Consulta.
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Codigo", "Nombre", "Categoria", "Cantidad", "Nombre Proveedor", "Valor Compra", "Valor Venta", "Dia de LLegada", "Num_Fac."};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                //MOSTRAR TODOS LOS PRODUCTOS
                CadSql = "SELECT p.cod_inventario, p.nombre, p.categoria,p.cantidad,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM productos p WHERE p.cod_inventario!='LALA';";
                break;
            case 2:
                //BUSQUEDA CON NOMBRE SOLAMENTE
                CadSql = "SELECT p.cod_inventario, p.nombre, p.categoria,p.cantidad,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM `productos` p WHERE p.cod_inventario!='LALA' AND p.nombre like'%" + nombre + "%';";
                break;
            case 3:
                //BUSQUEDA NOMBRE Y CATEGORIA
                CadSql = "SELECT p.cod_inventario, p.nombre, p.categoria,p.cantidad,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM `productos` p WHERE p.categoria='" + categoria + "' AND p.nombre like'%" + nombre + "%';";
                break;
            case 4:
                //BUSQUEDA CON CATEGORIA
                CadSql = "SELECT p.cod_inventario, p.nombre, p.categoria,p.cantidad,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM `productos` p WHERE p.categoria='" + categoria + "';";
                break;
            case 5:
                //BUSQUEDA CON CATEGORIA Y CODIGO
                CadSql = "SELECT p.cod_inventario, p.nombre, p.categoria,p.cantidad,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM `productos` p WHERE p.categoria='" + categoria + "' AND p.cod_inventario like'%" + nombre + "%';";
                break;
            case 6:
                CadSql = "SELECT p.cod_inventario, p.nombre, p.categoria,p.cantidad,p.valor_compra,p.valor_venta,p.dia_llegada, p.numero_factura FROM `productos` p WHERE p.cod_inventario!='LALA' AND p.cod_inventario like'%" + nombre + "%';";
                break;
        }
        try {
            String[] datos = new String[9];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = "SIN NOMBRE";
                datos[5] = rs.getString(5);
                datos[6] = rs.getString(6);
                datos[7] = rs.getString(7);
                datos[8] = rs.getString(8);
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
                 valor=rs.getString(1);
                 break;
             }
        } catch (Exception ex) {

        }
        return valor;
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
