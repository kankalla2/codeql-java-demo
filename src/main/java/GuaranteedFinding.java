import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GuaranteedFinding {

    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement s = c.createStatement();
        s.execute("SELECT * FROM users WHERE name = '" + args[0] + "'");
    }
}
