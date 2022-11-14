import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLog {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement stmt = con.createStatement();

        //Para crear una tabla. Elimina la tabla si existe lo elimina

        String creacionTabla= "DROP TABLE IF EXISTS TEST;\n" +
                "CREATE TABLE TEST (ID INT PRIMARY KEY,NAME VARCHAR(255);\n" +
                "INSERT INTO TEST VALUES(1,`JEUNE`);\n"+
                "INSERT INTO TEST VALUES(2,`WINSLEY`);\n";
        stmt.execute(creacionTabla);

        //Codigo para consultar todos los registros de una tabla

        String consultaRegistro= "select * from TEST";
        ResultSet RestadoConsulta=stmt.executeQuery(consultaRegistro);

        //recorer el resulta de la consulta

        while (RestadoConsulta.next()){
            System.out.println(RestadoConsulta.getInt(1) + RestadoConsulta.getString(2));
        }

    }
}
