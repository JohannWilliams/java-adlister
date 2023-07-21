import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() {
        List<Ad> adList = new ArrayList<>();

        String queryStringAll = "SELECT * FROM ads";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(queryStringAll);

            while(rs.next()){
                Ad ad = new Ad(rs.getLong("id"),rs.getLong("user_id"), rs.getString("title"), rs.getString("description"));
                adList.add(ad);
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return adList;
    }

    @Override
    public Long insert(Ad ad) {

        String queryStringAd = String.format("INSERT INTO ads(id, user_id, title, description) values(%d, %d, %s, %s)", ad.getId(), ad.getUserId(), ad.getTitle(), ad.getDescription());

        long insertedID = 0;
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(queryStringAd, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                insertedID = rs.getLong(1);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return insertedID;
    }
}
