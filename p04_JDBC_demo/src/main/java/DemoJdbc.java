
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        // load and register
        // create connection
        // execute statement
        // process and result
        // close

        String  url = "jdbc:postgresql://localhost:5432/Demo";
        String  username = "postgres";
        String  password = "pass123";

        String sqlQuerry = "SELECT * from students";

        // Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to database successfully");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sqlQuerry);

        while (rs.next()) {
            System.out.print(rs.getString(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.print(rs.getString(3));
            System.out.println();
        }

        con.close();
        System.out.println("Connection closed successfully");
    }
}
