import java.sql.*;
public class DataBaseConn{
        public static void main(String[] args){
        String jdbcUrl = "jdbc:mysql://localhost:3306/happy";
        String username = "root";
        String password = "J@mysql@56D";

        Connection connection = null;

        try

        {
                connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Connected to the database!");

                // Perform database operations here...

        } catch(SQLException e)

        {
                System.out.println("An error occurred while connecting to the database: " + e.getMessage());
        } finally

        {
                try {
                        if (connection != null) {
                                connection.close();
                                System.out.println("Connection closed.");
                        }
                } catch (SQLException e) {
                        System.out.println("An error occurred while closing the connection: " + e.getMessage());
                }
        }
        }
}
