import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class PostgreSQLJDBC {
   public static void main( String args[] )
     {
       Connection c = null;
       Statement stmt = null;
       try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/sockoDB", 
            "ChrisMichael", "123456");
			// Will name DB "sockoDB", user "ChrisMichael", PW = 123456
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "CREATE TABLE SOCKO " +
                      "(ID INT PRIMARY KEY       NOT NULL," +
                      " NAME           TEXT      NOT NULL, " +
                      " SOCK TYPE      CHAR(50)  NOT NULL, " +
                      " COLOR          CHAR(50)  NOT NULL, " +
                      " DATE LOST      DATE      NOT NULL, " + 
					  " SIZE		   CHAR (50) NOT NULL, " + 
					  " PHOTO          TEXT		 NOT NULL, ";
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
       } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
       }
       System.out.println("Table created successfully");
     }
}