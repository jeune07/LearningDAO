package nombreEmpresa;

import java.sql.*;

public class Empresas {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("org.h2.Driver").newInstance();
        Connection connection= DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement stmt= connection.createStatement();

        //creacion tablae

        String creacionTabla="DROP TABLE IF EXISTS, CREATE TABLE  COMPAGNY(ID INT PRIMARY KEY,NAME VARCHAR(300)";
        stmt.execute(creacionTabla);

        //insercion de filas

        String insertFila ="INSERT INTO VALUES(1,`DIGITAL`)";
        String insertFila1 ="INSERT INTO VALUES(2,`FACEBOOK`)";
        stmt.execute(insertFila);
        stmt.execute(insertFila1);
        // mostrar los datos de la tabla

        String datos="SELECT * FROM COMPAGNY";
        ResultSet rd =stmt.executeQuery(datos);
        while (rd.next()){
            System.out.println(rd.getInt(1) + rd.getString(2));
        }
    }
}
