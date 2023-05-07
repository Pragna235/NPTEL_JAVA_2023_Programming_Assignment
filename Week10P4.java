//Complete the code segment to create a new table named ‘PLAYERS’ in SQL database using the following information.
import java.sql.*;
import java.lang.*;
public class CreateTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
// The statement containing SQL command to create table "players"

// Execute the statement containing SQL command below this comment
 String sql = "CREATE TABLE PLAYERS " +
                   "(UID INT, " +
                   " First_Name VARCHAR(45), " + 
                   " Last_Name VARCHAR(45), " + 
                   " Age INT, " + 
                   " PRIMARY KEY ( UID ))"; 

      stmt.executeUpdate(sql);   
      
ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());
            System.out.println("Column 1 Name: " + rsmd.getColumnName(1));
            System.out.println("Column 1 Type : " + rsmd.getColumnTypeName(1));
            System.out.println("Column 2 Name: " + rsmd.getColumnName(2));
            System.out.println("Column 2 Type : " + rsmd.getColumnTypeName(2));
            System.out.println("Column 3 Name: " + rsmd.getColumnName(3));
            System.out.println("Column 3 Type : " + rsmd.getColumnTypeName(3));
            System.out.println("Column 4 Name: " + rsmd.getColumnName(4));
            System.out.println("Column 5 Type : " + rsmd.getColumnTypeName(4));
            stmt.close();
            conn.close();
}
       catch(Exception e){ System.out.println(e);}  
    }
}
