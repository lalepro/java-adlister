import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//import java.sql.DriverManager;




public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao (Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()



            );
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while (rs.next()){
                ads.add(extractAd(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long id = (long)0;
        try {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    private String createInsertQuery(Ad ad){
        return "INSERT INTO ads(user_id, title, description) VALUES (" + ad.getUserId() + " + '" + ad.getTitle() + "' + '" + ad.getDescription() + "')";

    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
          rs.getLong("id"),
          rs.getLong("user_id"),
          rs.getString("title"),
          rs.getString("description")
        );
    }
}
