import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

       JdbcClass jdbcClass = new JdbcClass();

       jdbcClass.makeConnectionStatement();
//       jdbcClass.insert(3,"ali","8523");

        jdbcClass.select(2);
    }
}
