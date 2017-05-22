package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.Proveedores.tbproveedores;

public class ConsultasSQL_Proveedores {

    public void Tabla_Proveedores() {
        String CadSql="";
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"ID", "RUT", "NOMBRE", "TELEFONO"};
        modelo.setColumnIdentifiers(cabeceras);
        CadSql = "SELECT * FROM proveedores WHERE 1;";

        try {
            String[] datos = new String[4];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
                
            }
            tbproveedores.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void CrearProveedor(String rut, String nombre, String telefono) {
        try {

            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO proveedores(rut,nombre,telefono) VALUES (?,?,?)");
            pst.setString(1, rut);
            pst.setString(2, nombre);
            pst.setString(3, telefono);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ModificarProveedor(String rut, String nombre, String telefono, int id_proveedor) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE proveedores SET rut=?, nombre=?,  telefono=? WHERE id=?;");
            pst.setString(1, rut);
            pst.setString(2, nombre);
            pst.setString(3, telefono);
            pst.setInt(4, id_proveedor);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void EliminarProveedor(int id_proveedor) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM proveedores WHERE  id='" + id_proveedor + "'");
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
