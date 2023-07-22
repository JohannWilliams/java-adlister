package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {

        System.out.println("config.getUrl() = " + config.getUrl());
        System.out.println("config.getUser() = " + config.getUser());
        System.out.println("config.getPassword() = " + config.getPassword());
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
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

        long id = ad.getId();
        String title = ad.getTitle();
        String description = ad.getDescription();

        String queryStringAd = "INSERT INTO ads (user_id, title, description) VALUES (" + ad.getUserId() + ",'" +  ad.getTitle() + "','" + ad.getDescription() +"')";

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
