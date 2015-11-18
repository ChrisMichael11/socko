import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {
   public static void main(String args[]) {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/sockoDB", 
            "ChrisMichael", "123456");
			// Will name DB "sockoDB", user "ChrisMichael", PW = 123456
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}