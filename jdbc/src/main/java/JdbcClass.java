import java.sql.*;

public class JdbcClass {



    private Connection connection;
    private PreparedStatement statement;

   public void makeConnectionStatement() throws ClassNotFoundException, SQLException {

       Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tst" , "root" , "1234");
   }


   public void insert(int id , String name , String pass) throws SQLException {

       statement = connection.prepareStatement("insert into user (id,name,pass) values (?,?,?)");
       statement.setInt(1,id);
       statement.setString(2,name);
       statement.setString(3,pass);

       statement.executeUpdate();


   }

   public void select(int id) throws SQLException {

       statement = connection.prepareStatement("select * from user where id=?");
       statement.setInt(1,id);
       ResultSet result = statement.executeQuery();

       while (result.next()){
           System.out.println(result.getString("name"));
           System.out.println(result.getString("pass"));


       }


   }
}
