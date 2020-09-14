
package Modelo;
//Librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Clase
public class ConexionSQL {
    //Variables de conexion
    public static Connection conexion;
    private static ConexionSQL conexionsql;

    static ResultSet consulta(ResultSet consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Constructor
    private ConexionSQL(){
    }
    //Patron Singleton
    public static ConexionSQL getInstance(){
        if(conexionsql == null){
            conexionsql = new ConexionSQL();
        }
        return conexionsql;
    }
    //Metodo
    //obtener conexion
    public static Connection conectar(){
            try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
     // line below needs to be modified to include the database name, user, and password (if any)
  conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Biblioteca;user=anbu;password=0969433452;");
 
     System.out.println("Connected to database !");
 
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   } 
      return conexion;
    }
    //Consultas
    public static ResultSet consulta(String consulta){
        Statement declarar;
        try{
            declarar = conexion.createStatement();
            ResultSet respuesta = declarar.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e){
            System.out.println("Error");
        }
        return null;
    }
}
