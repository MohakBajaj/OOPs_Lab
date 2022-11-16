// Create a database of employee of company in mysql and then use java program to 
// access the database for inserting information of employees in database. 
// The SQL statement can be used to view the details of the data of employees in the database

package Lab_10.Program_2;

import java.sql.*;

public class empDB {

    Connection con;
    Statement stmt;

    public Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Statement statement() {
        try {
            Statement stmt = con.createStatement();
            return stmt;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void insert(int id, String name, int age, String address, int salary) {
        try {
            String sql = "INSERT INTO emp VALUES (" + id + ", '" + name + "', " + age + ", '" + address + "', " + salary
                    + ")";
            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void view() {
        try {
            String sql = "SELECT * FROM emp";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Age: " + rs.getInt(3)
                        + ", Address: " + rs.getString(4) + ", Salary: " + rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        empDB obj = new empDB();
        obj.con = obj.connect();
        obj.stmt = obj.statement();
        obj.insert(1, "John", 25, "New York", 50000);
        obj.insert(2, "Smith", 30, "California", 60000);
        obj.insert(3, "David", 28, "Texas", 55000);
        obj.view();
    }

}
