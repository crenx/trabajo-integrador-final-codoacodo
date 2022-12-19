package com.example.trabajointegradorfinal.ficha.ficha;

 import java.sql.Statement;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import java.sql.Connection;
 import java.sql.ResultSet;
 import java.sql.SQLException;

public class IngresoDAO {

        /*metodos del crud*/
        public fichaIngresoDAO obtenerPorId(int id) {
            String sql = "SELECT * FROM ficha-de-ingreso WHERE ID="+id;

            //Connection
            Connection con = AdministradorDeConexiones.getConnection();

            fichaIngresoDAO fichadeinngresoFromDb = null;

            //Statement
            try {
                Statement st = con.createStatement();

                //resultset
                ResultSet rs = st.executeQuery(sql);

                //VIENE UN SOLO REGISTRO!!!

                if(rs.next()) {//si existe, hay uno solo
                    // rs > sacando los datos
                    int id = rs.getInt(1);//tomar la primer columna
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    int edad = rs.getInt(4);
                    Date fecha = rs.getDate(5);
                    String provincia = rs.getString(6);

                    //campos crear un objeto????
                    fichadeinngresoFromDb = new fichadeIngresoDAO(id,nombre,apellido,edad,fecha,provincia);
                }
            } catch (SQLException e) {
                // ERRORES
                e.printStackTrace();
            }
            return fichadeinngresoFromDb;
        }


        /*metodos del crud*/
        public List<fichadeingreso> listarfichadeingreso() {
            String sql = "SELECT * FROM ficha_de_ingreso ";

            //Connection
            Connection con = AdministradorDeConexiones.getConnection();

            List<fichadeingreso> list = new ArrayList<>();

            //Statement
            try {
                Statement st = con.createStatement();

                //resultset
                ResultSet rs = st.executeQuery(sql);

                //VIENE UN SOLO REGISTRO!!!

                while(rs.next()) {//
                    // rs > sacando los datos
                    int id = rs.getInt(1);//tomar la primer columna
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    int edad = rs.getInt(4);
                    Date fecha = rs.getDate(5);
                    String provincia = rs.getString(6);

                    //campos crear un objeto????
                    fichaIngresoDAO prodFromDb = new fichadeingreso(id,nombre,apellido,edad,fecha,provincia);

                    //agrego a la lista
                    list.add(fichadeingresoFromDb);
                }

                //cierro la conexion
                con.close();
            } catch (SQLException e) {
                // ERRORES
                e.printStackTrace();
            }
            return list;
        }

        /*crear un producto en la db*/
        public void crearfichadeingreso(int id, String nombre, String apellido, int edad, Date fecha, String provincia) {

            Connection con = AdministradorDeConexiones.getConnection();

            if(con != null) {
                // insert en la db > SQL: INSERT INTO....
                String sql = "INSERT INTO FICHADEINGRESO (id, nombre,apellido,edad,fecha,provincia) ";
                sql += "VALUES('"+id+"',"+nombre+",+ "+apellido+", "+edad+", "+provincia+"	CURRENT_DATE,'"+fecha+"')";

                //control de errores
                try {
                    Statement st = con.createStatement();
                    st.execute(sql);

                    //cierre de conexion
                    con.close();

                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void actualizarfichadeoingreso(int id, String nombre, String apellido, int edad, Date fecha, String provincia) {
            Connection con = AdministradorDeConexiones.getConnection();
            if(con != null) {
                String sql = "UPDATE FICHADEINGRESO "
                        + " set nombre='"+nombre+"',"
                        + " apellido ='"+apellido+"'"
                        + " WHERE edad = '"+edad+"'";

                try {
                    Statement st = con.createStatement();
                    st.executeUpdate(sql);

                    con.close();

                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /*metodos del crud*/
        public List<fichadeingreso> buscar(String clave) {
            String sql = "SELECT * FROM FICHADEINGRESO WHERE nombre LIKE '%"+clave+"%' ";

            //Connection
            Connection con = AdministradorDeConexiones.getConnection();

            List<fichadeingreso> listado = new ArrayList<fichadeingreso>();

            //Statement
            try {
                Statement st = con.createStatement();

                //resultset
                ResultSet rs = st.executeQuery(sql);

                //VIENE UN SOLO REGISTRO!!!

                if(rs.next()) {//si existe, hay uno solo
                    // rs > sacando los datos
                    int id = rs.getInt(1);//tomar la primer columna
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    int edad = rs.getInt(4);
                    Date fecha = rs.getDate(5);
                    String provincia = rs.getString(6);

                    //campos crear un objeto????
                    fichaIngresoDAO fichadeingresoFromDb = new fichadeingreso(id,nombre,apellido,edad,fecha,provincia);

                    listado.add(fichadeingresoFromDb);
                }
            } catch (SQLException e) {
                // ERRORES
                e.printStackTrace();
            }

            return listado;
        }
    }
    Footer
© 2022 GitHub, Inc.
            Footer navigation
    Terms
            Privacy
    Security
            S
}
