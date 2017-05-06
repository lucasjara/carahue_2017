package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Venta_b;

public class ConsultasSQL_Venta {

    public String CadSql = "";

    public void Tabla_Productos(int numero, String campo, String categoria) {
        //numero = Accion a realizar en la tabla.
        //campo = Variable ingresada para busqueda.
        //categoria = En que negocio se encuentra mi producto.
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor Producto");
        switch (numero) {
            case 1:
                CadSql = "SELECT cod_inventario, nombre, descripcion, cantidad, valor_venta FROM productos where categoria ='" + categoria + "';";
                break;
            case 2:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, cantidad, valor_individual_venta FROM productos where nom_producto like'%" + campo + "%' AND categoria='" + categoria + "';";
                break;
            case 3:
                CadSql = "SELECT id_producto, cantidad from productos where categoria='" + campo + "';";
                break;
            case 4:
                CadSql = "SELECT cod_producto, nom_producto, descripcion, cantidad, valor_individual_venta FROM productos where cod_producto like'%" + campo + "%' AND categoria='" + categoria + "';";
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
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
