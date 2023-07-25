package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
import models.Ad;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
        long result = 0;

        String queryStringAd = "INSERT INTO ads (user_id, title, description) VALUES (" + ad.getUserId() + ",'" +  ad.getTitle() + "','" + ad.getDescription() +"')";

        try {
            Statement stmt = connection.createStatement();
            result = stmt.executeUpdate(queryStringAd, Statement.RETURN_GENERATED_KEYS);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
