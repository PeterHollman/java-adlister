import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDAO implements Ads {
    private Connection connection;
    private List<Ad> ads;
    private Ad extracted(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    public void MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUsername(),
                Config.getPassword()
        );
    }
    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM ads";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);
        return createArray(rs);
    }
    public List<Ad> createArray(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while(rs.next()) {
            ads.add(getDetails(rs));
        }
        return ads;
    }
    public Ad getDetails(ResultSet rs) throws SQLException {
        return new Ad(rs.getLong("id"),
                rs.getString("title"),
                rs.getString("description"));
    }
    @Override
    public Long insert(Ad ad) throws SQLException {
        String adding = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());
        Statement statement = connection.createStatement();
        long queue = statement.executeUpdate(adding);
        return queue;
    }
    public static void main(String[] args) {

    }
}
