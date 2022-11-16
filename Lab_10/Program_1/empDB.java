// Create a database table to store the records of employee in a company. 
// Use getConnection function to connect the database. 
// The statement object uses executeUpdate function to create a table.

package Lab_10.Program_1;

import java.sql.*;

public class empDB {
    public void connectAndUpdate() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE emp (id INT, name VARCHAR(255), age INT, address VARCHAR(255), salary INT)";
            stmt.executeUpdate(sql);
            con.close();
            System.out.println("Table created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        empDB obj = new empDB();
        obj.connectAndUpdate();
    }
}
