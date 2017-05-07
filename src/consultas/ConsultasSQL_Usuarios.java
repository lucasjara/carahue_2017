package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.Usuarios.tbUsuarios;

public class ConsultasSQL_Usuarios {

    String CadSql = "";

    public void Tabla_Usuarios(int numero, String campo) {
        /*
         Numero = Accion a realizar.
         Campo = Condicional Consulta.
         */
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Id", "Usuario", "Contraseña", "Nombre", "Tipo", "Estado"};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                CadSql = "SELECT usuarios.id, usuarios.usuario, usuarios.password, usuarios.nombre, perfiles.nombre, usuarios.estado FROM usuarios, perfiles WHERE usuarios.id_perfil=perfiles.id;";
                break;
            case 2:
                CadSql = "SELECT * FROM usuarios where categoria=" + campo + ";";
                break;
            case 3:
                CadSql = "SELECT usuarios.id, usuarios.usuario, usuarios.password, usuarios.nombre, perfiles.nombre, usuarios.estado FROM usuarios, perfiles where usuarios.nombre like'%" + campo + "%' AND usuarios.id_perfil=perfiles.id;;";
                break;
        }
        try {
            String[] datos = new String[6];
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            tbUsuarios.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void GuardarUsuario(String nombre, String usuario, String contraseña,int id_perfil) { //revisado
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO usuarios(nombre,usuario,password,estado,id_perfil) VALUES (?,?,?,?,?)");
            pst.setString(1, nombre);
            pst.setString(2, usuario);
            pst.setString(3, contraseña);
            pst.setString(4, "ACTIVO");
            pst.setInt(5, id_perfil);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public String ConsultarNombre(String usuario) {
            try {
                CadSql = "select usuario from usuarios where usuario='" + usuario + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    usuario = rs.getString(1);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
                usuario="";
            }
            return usuario;
        }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
