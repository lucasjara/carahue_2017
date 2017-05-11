package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.Inventario.tbproductos;

public class ConsultasSQL_Inventario {
    String CadSql="";
    static String Categoria;
    public void Tabla_Inventario(int numero, String categoria, String nombre){
        /*
         Numero = Accion a realizar.
         Campo = Condicional Consulta.
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Codigo","Nombre","Descripcion","Cantidad","Nombre Proveedor","Dia de LLegada","Num_Fac."};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                CadSql = "SELECT `cod_inventario`,`nombre`,`descripcion`,`cantidad`,`dia_llegada`,`numero_factura` FROM `productos` WHERE `numero_factura` != 0 AND `categoria`='" + categoria + "';";
                break;
            case 2:
                CadSql = "SELECT `cod_inventario`,`nombre`,`descripcion`,`cantidad`,`dia_llegada`,`numero_factura` FROM `productos` WHERE categoria='" + categoria + "' AND nombre like'%"+nombre+"%';";
                break;
        }
        try {
            String[] datos = new String[7];
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
                modelo.addRow(datos);
            }
            tbproductos.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        public void Tabla_Inventario_Filtros(int numero, String categoria){
        /*
         Numero = Accion a realizar.
         Categoria = LIBRERIA|CASA Y PESCA | VESTUARIO.
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Codigo","Nombre","Descripcion","Cantidad","Nombre Proveedor","Dia de LLegada","Num_Fac."};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                //Cantidad 0
                CadSql = "SELECT `cod_inventario`,`nombre`,`descripcion`,`cantidad`,`dia_llegada`,`numero_factura` FROM `productos` WHERE `cantidad` = 0 AND `categoria`='" + categoria + "';";
                break;
            case 2:
                CadSql = "SELECT `cod_inventario`,`nombre`,`descripcion`,`cantidad`,`dia_llegada`,`numero_factura` FROM `productos` WHERE categoria='" + categoria + "' AND cantidad <= 10 ;";
                break;
        }
        try {
            String[] datos = new String[7];
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
                modelo.addRow(datos);
            }
            tbproductos.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
