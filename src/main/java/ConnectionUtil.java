/**
 * Created by artemsolonin on 25.05.2017.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by artemsolonin on 11.05.2017.
 */
public class ConnectionUtil {
    private static String driver="com.mysql.jdbc.Driver";
    private static String jdbcUrl="jdbc:mysql://nebbel.beget.tech:3306/nebbel_ws__lab_1";
    private static String user="nebbel_ws__lab_1";
    private static String password="111111";

    static {
        try{
            Class.forName(driver);
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException se)
        {
            se.printStackTrace();
        }
        return connection;
    }
}