import com.mysql.cj.jdbc.Driver;

import java.sql.*;


//    creditials go here

public class MySqlDemo {
    private Connection connection = null;

public static void main(String[] args) {
//    #1 connect to mysql server;
    try {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/el_adlister_db?serverTimezone=UTC&useSSL=false",
                "root",
                "codeup"
        );

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT now() AS today");
        rs.next();
        System.out.println("rs= " + rs.getString("today"));

//        multiple results
        rs = stmt.executeQuery("SELECT * FROM users;");
        while (rs.next()){
            System.out.println("users = " + rs.getString("first_name"));
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
// #2 create statements;




}
