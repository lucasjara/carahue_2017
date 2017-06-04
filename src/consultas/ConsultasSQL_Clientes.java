package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static paneles.JPanelListadoClienteCredito.tbUltimosClientesRegistrados;

public class ConsultasSQL_Clientes {

    public boolean ValidarRut(String rut) {
        int suma = 0;
        String dvR, dvT;
        int[] serie = {2, 3, 4, 5, 6, 7};
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        dvR = rut.substring(rut.length() - 1);
        for (int i = rut.length() - 2; i >= 0; i--) {
            suma += Integer.valueOf(rut.substring(i, i + 1))
                    * serie[(rut.length() - 2 - i) % 6];
        }
        dvT = String.valueOf(11 - suma % 11);
        if (dvT.compareToIgnoreCase("10") == 0) {
            dvT = "K";
        }

        if (dvT.compareToIgnoreCase(dvR) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String formatear(String rut) {
        int cont = 0;
        String format;
        if (rut.length() == 0) {
            return "";
        } else {
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            format = "-" + rut.substring(rut.length() - 1);
            for (int i = rut.length() - 2; i >= 0; i--) {
                format = rut.substring(i, i + 1) + format;
                cont++;
                if (cont == 3 && i != 0) {
                    format = "." + format;
                    cont = 0;
                }
            }
            return format;
        }
    }

    public boolean ConsultarRutCliente(String rut) {
        {
            boolean Consulta = false;
            try {
                String CadSql = "select rut from clientes where rut='" + rut + "';";
                Statement st = this.cn.createStatement();
                ResultSet rs = st.executeQuery(CadSql);
                while (rs.next()) {
                    Consulta = true;

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            return Consulta;
        }
    }

    public String[] SetearCamposModCliente(String rut) {
        String datos[] = new String[4];
        try {
            String CadSql = "select nombre,telefono,fecha_ingreso,cantidad_credito from clientes where rut='" + rut + "';";
            Statement st = this.cn.createStatement();
            ResultSet rs = st.executeQuery(CadSql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return datos;
    }

    public void CrearClientes(String rut, String nombre, String telefono, Date fecha, int cantidad_credito, int id_usuario) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO clientes(rut,nombre,telefono,fecha_ingreso,cantidad_credito,id_usuario) VALUES (?,?,?,?,?,?)");
            pst.setString(1, rut);
            pst.setString(2, nombre);
            pst.setString(3, telefono);
            pst.setDate(4, fecha);
            pst.setInt(5, cantidad_credito);
            pst.setInt(6, id_usuario);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UltimosClientes() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabeceras = new String[]{"Id", "Nombre", "Rut", "Capacidad Credito", "Registrador"};
        modelo.setColumnIdentifiers(cabeceras);
        String CadSql = "SELECT c.id, c.nombre, c.rut, c.cantidad_credito, u.nombre FROM clientes c, usuarios u WHERE c.id_usuario=u.id ORDER BY id DESC;";
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
            tbUltimosClientesRegistrados.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}

