package consultas;

import conectar.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Caja;
import static vista.Caja.tblistado;
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
            /*
             Debemos agregar una condicional aca si agregamos
             la tabla recuperacion de carahue 1.0
             */
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
        String[] cabeceras = new String[]{"Nombre", "Descripcion", "Cantidad", "Precio", "Valor"};
        modelo.setColumnIdentifiers(cabeceras);
        switch (numero) {
            case 1:
                CadSql = "SELECT p.nombre, p.descripcion, v.cantidad, p.valor_venta, v.precio FROM productos p, ventas v WHERE v.id_producto=p.id AND v.cod_venta='" + campo + "' AND v.estado='INACTIVO';";
                break;
            case 2:
                CadSql = "SELECT p.nombre, p.descripcion, v.cantidad, p.valor_venta, v.precio FROM productos p, ventas v WHERE v.id_producto=p.id AND v.cod_venta='" + campo + "';";
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
            if (numero == 1) {
                Venta_b.tbventa.setModel(modelo);
            } else {
                tblistado.setModel(modelo);
            }
            //if(numero==1){interfaz_venta_.tbventa.setModel(modelo);}else{interfaz_administracion.tblistado.setModel(modelo);}
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void NuevaVenta(int cod_venta, int cantidad, Double precio, String estado,String tipo, int id_producto, int id_usuario, int cantidad2) {
        try {
            /*
             cod venta|cantidad|precio|fecha|estado|id_producto|id_usuario
             */
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

            PreparedStatement pst = this.cn.prepareStatement("INSERT INTO ventas(cod_venta,cantidad,precio,fecha,estado,tipo,id_producto,id_usuario) VALUES (?,?,?,?,?,?,?,?)");
            pst.setInt(1, cod_venta);
            pst.setInt(2, cantidad);
            pst.setDouble(3, precio);
            pst.setDate(4, sqlDate);
            pst.setString(5, estado);
            pst.setString(6, tipo);
            pst.setInt(7, id_producto);
            pst.setInt(8, id_usuario);
            pst.executeUpdate();
            //id_producto | cantidad
            if (estado.equals("RESERVADO")) {

            } else {
                DescontarInventario(id_producto, cantidad2);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void CambiarEstadoVenta(int cod_venta) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE ventas SET estado=? WHERE cod_venta=?;");
            pst.setString(1, "VENDIDO");
            pst.setInt(2, cod_venta);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void EliminarReservaCodigoVenta(int cod_venta){
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM ventas WHERE  cod_venta='" + cod_venta + "' AND id_producto=3");
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public int ReservarCodigoVenta() {
        int cod_venta = 0;
        try {
            CadSql = "SELECT cod_venta FROM `ventas` ORDER BY cod_venta DESC;";
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

    public int Id_producto(String codigo) {
        try {
            CadSql = "SELECT id FROM productos where cod_inventario='" + codigo + "';";
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

    public void LimpiarVenta() {
        DefaultTableModel modelo = (DefaultTableModel) Venta_b.tbventa.getModel();
        int filas = Venta_b.tbventa.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    public void DevolverStock_Parte1() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) Venta_b.tbventa.getModel();
            int filas = Venta_b.tbventa.getRowCount();
            for (int i = 0; filas > i; i++) {
                DevolverStock_Parte2(Integer.parseInt(Venta_b.tbventa.getValueAt(0, 2).toString()), Venta_b.tbventa.getValueAt(0, 0).toString(), Venta_b.tbventa.getValueAt(0, 1).toString());
                modelo.removeRow(0);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        public void DevolverStock_Parte1b() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblistado.getModel();
            int filas = tblistado.getRowCount();
            for (int i = 0; filas > i; i++) {
                DevolverStock_Parte2(Integer.parseInt(tblistado.getValueAt(0, 2).toString()), tblistado.getValueAt(0, 0).toString(), tblistado.getValueAt(0, 1).toString());
                modelo.removeRow(0);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void DevolverStock_Parte2(int cantidad, String nombre, String descripcion) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET cantidad=cantidad+? WHERE nombre=? AND descripcion=?;");
            pst.setInt(1, cantidad);
            pst.setString(2, nombre);
            pst.setString(3, descripcion);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void CancelarVenta(int valor) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("DELETE FROM ventas WHERE  cod_venta='" + valor + "'");
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void DescontarInventario(int id_producto, int cantidad) {
        try {
            PreparedStatement pst = this.cn.prepareStatement("UPDATE productos SET cantidad=? WHERE id=?;");
            pst.setInt(1, cantidad);
            pst.setInt(2, id_producto);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    conectar cc = new conectar();
    Connection cn = this.cc.conexion();
}
