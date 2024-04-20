package bank.management;
import java.sql.*;

public class DBHelper {
    
    Connection connection;
    Statement s;
    
    public DBHelper(){
        try {
            // Registering the JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // Establishing the connection
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\DESKTOP-232NALF:1433;databaseName=bankmanagementsystem;encrypt=true;trustServerCertificate=true","sa","8624");

            if (connection != null) {
                System.out.println("Connected to the database!");
                // Instantiate the statement object
                s = connection.createStatement();
                // Proceed with database operations here
                // For example: execute queries, updates, etc.
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("SQL Server JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }

    // Example method to execute SQL queries
    public void executeQuery(String query) {
        try {
            // Check if statement object is not null
            if (s != null) {
                s.executeUpdate(query);
            } else {
                System.out.println("Statement object is null. Connection might be invalid.");
            }
        } catch (SQLException e) {
            System.out.println("Error executing query: " + query);
        }
    }
}
