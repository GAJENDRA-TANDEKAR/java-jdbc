import java.sql.*;

public class Javajdbc {
    public static void main(String[] args)throws SQLException {


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Gajju@1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(" select * from  person");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("firstname"));
        }
    }
}



