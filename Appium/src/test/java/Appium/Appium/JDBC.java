package Appium.Appium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {
        // MySQL connection parameters
        String url = "jdbc:mysql://10.0.0.250:3306/DEV-1";
        String username = "karmjeet";
        String password = "Karmjeetmor123";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database!");

            // Create a statement
            statement = connection.createStatement();

            // Execute the query
            String query = "SELECT * FROM wealth_usermanagement.otprequests order by CreatedDate desc";
            resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Replace 'column1', 'column2' with actual column names from your table
                String column1 = resultSet.getString("column1");
                String column2 = resultSet.getString("column2");
                System.out.println("Column1: " + column1 + ", Column2: " + column2);
            }
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
