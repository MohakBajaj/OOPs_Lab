// Student management system:
// - Database: Student
// - Table: StuDetails(Sno, rollno, name, address, contact, course, sem)
// - Create a registration page to add details of a new student (insert query)-
// - Create a page to update details of existing student (address, contact and sem)
// - Create a page to select and view data of existing student in the database (All details)

package Lab_10.Assignment;

import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class studentManagementSystem {
    Connection con;
    Statement stmt;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void intro() {
        System.out.println("Student Management System");
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public Statement getStatement() {
        try {
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return stmt;
    }

    public void initialSetup() {
        try {
            stmt.executeUpdate(
                    "create table if not exists StuDetails(Sno int primary key auto_increment, rollno int, name varchar(20), address varchar(255), contact int, course varchar(20), sem int)");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertData() {
        try {
            System.out.println("Enter Number of Students: ");
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Enter rollno: ");
                int rollno = Integer.parseInt(br.readLine());
                System.out.println("Enter name: ");
                String name = br.readLine();
                System.out.println("Enter address: ");
                String address = br.readLine();
                System.out.println("Enter contact: ");
                int contact = Integer.parseInt(br.readLine());
                System.out.println("Enter course: ");
                String course = br.readLine();
                System.out.println("Enter sem: ");
                int sem = Integer.parseInt(br.readLine());
                stmt.executeUpdate("insert into StuDetails(rollno, name, address, contact, course, sem) values("
                        + rollno
                        + ", '" + name + "', '" + address + "', " + contact + ", '" + course + "', " + sem + ")");
                System.out.println("\nData Inserted Successfully\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateData() {
        try {
            System.out.println("Enter rollno: ");
            int rollno = Integer.parseInt(br.readLine());
            System.out.println("Enter address: ");
            String address = br.readLine();
            System.out.println("Enter contact: ");
            int contact = Integer.parseInt(br.readLine());
            System.out.println("Enter sem: ");
            int sem = Integer.parseInt(br.readLine());
            stmt.executeUpdate(
                    "update StuDetails set address = '" + address + "', contact = " + contact + ", sem = " + sem
                            + " where rollno = " + rollno);
            System.out.println("\nData Updated Successfully\n");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewData() {
        try {
            System.out.println("Enter rollno: ");
            int rollno = Integer.parseInt(br.readLine());
            System.out.println("\nPrinting Data of Rollno: " + rollno + "\n");
            ResultSet rs = stmt.executeQuery("select * from StuDetails where rollno = " + rollno);
            while (rs.next()) {
                System.out.println("Sno: " + rs.getInt(1));
                System.out.println("Rollno: " + rs.getInt(2));
                System.out.println("Name: " + rs.getString(3));
                System.out.println("Address: " + rs.getString(4));
                System.out.println("Contact: " + rs.getInt(5));
                System.out.println("Course: " + rs.getString(6));
                System.out.println("Sem: " + rs.getInt(7));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteData() {
        try {
            System.out.println("Enter rollno: ");
            int rollno = Integer.parseInt(br.readLine());
            stmt.executeUpdate("delete from StuDetails where rollno = " + rollno);
            System.out.println("\nData Deleted Successfully\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewAllData() {
        try {
            ResultSet rs = stmt.executeQuery("select * from StuDetails");
            System.out.println("\nPrinting All Data\n");
            System.out.println("Sno\tRollno\tName\tAddress\t\tContact\t\tCourse\t\t\tSem");
            while (rs.next()) {
                System.out
                        .println(rs.getInt(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4)
                                + "\t\t" + rs.getInt(5) + "\t" + rs.getString(6) + "\t\t" + rs.getInt(7));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        studentManagementSystem sms = new studentManagementSystem();
        sms.intro();
        sms.getConnection();
        sms.getStatement();
        sms.initialSetup();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = 0;
        do {
            System.out.println("\n1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. View Data");
            System.out.println("5. View All Data");
            System.out.println("6. Exit\n");
            System.out.println("Enter your choice: ");
            try {
                ch = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (ch) {
                case 1:
                    sms.insertData();
                    break;
                case 2:
                    sms.updateData();
                    break;
                case 3:
                    sms.deleteData();
                    break;
                case 4:
                    sms.viewData();
                    break;
                case 5:
                    sms.viewAllData();
                    break;
                case 6:
                    System.out.println("Exiting...\nThank You for using this application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch != 6);
    }
}
