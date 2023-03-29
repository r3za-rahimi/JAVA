import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Repository {

    Connection ccn ;
    PreparedStatement statement;

    public Repository() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        ccn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst", "root" , "1234");
    }


    public void insert() throws SQLException {

        statement = ccn.prepareStatement("insert into user (id,name,pass) values (?,?,?)" );
        statement.setInt(1 , 1);
        statement.setString(2 , "reza");
        statement.setString(3 , "rok");

        statement.executeUpdate();

    }
}
