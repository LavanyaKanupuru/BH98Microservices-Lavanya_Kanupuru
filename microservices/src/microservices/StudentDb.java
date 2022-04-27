package microservices;
import java.sql.*;

public class StudentDb {
   static final String DB_URL = "jdbc:mysql://localhost/practice";
   static final String USER = "root";
   static final String PASS = "L@@vi746746";
   static final String QUERY = "select * from student where grade='A'";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("\n rollno: " + rs.getInt("rollno"));
            System.out.print("\n name: " + rs.getString("name"));
            System.out.print("\n grade: " + rs.getString("grade"));
            
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}