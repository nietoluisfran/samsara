package sominie.samsara.java.connectors;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    private static String driver="com.mysql.cj.jdbc.Driver";    // driver mysql 6 o superior
    //private static String driver="com.mysql.jdbc.Driver";       //driver mysql 5
    private static String vendor="mysql";
    private static String server="127.0.0.1";
    //private static String server="db4free.net";
    private static String port="3307";
    private static String db="colegio";
    //private static String db="colegioapp2020";
    private static String params="?serverTimezone=UTC";
    private static String user="root";
    private static String pass="";
    //private static String user="????";
    //private static String pass="????";

    
    private static String url="jdbc:"+vendor+"://"+server+":"+port+"/"+db+params;
    
    private static Connection conn=null;
    
    private Conexion(){ }
    
    public synchronized static Connection getConnection(){
        try{
            if(conn==null || conn.isClosed()){
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, pass);
            }
        }catch(SQLException e) { System.out.println("Problema de conexión");
        }catch(ClassNotFoundException e) { System.out.println("No se encontro el driver");
        }catch(Exception e){ e.printStackTrace(); }
        return conn;
    }
    
    public static void cerrarConexion(Connection conn) throws IOException {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
}