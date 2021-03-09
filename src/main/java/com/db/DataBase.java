package com.db;

import com.model.Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private final static String url = "jdbc:postgresql://localhost:5433/test";
    private final static String user = "postgres";
    private final static String password = "123";

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static boolean addApplication(Application application){
        String sql = "INSERT INTO applications(full_name, course, is_online, email) " +
                    "VALUES(?,?,?,?)";
        try(Connection connection = connect();
            PreparedStatement stmt = connection.prepareStatement(sql)){

            stmt.setString(1, application.getFullName());
            stmt.setString(2, application.getCourse());
            stmt.setBoolean(3, application.getIsOnline());
            stmt.setString(4, application.getEmail());

            stmt.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static List<Application> getAllApplications(){
        String sql = "SELECT * FROM applications";
        List<Application> result = new ArrayList<>();

        try(Connection connection = connect();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()){
                Application appl = new Application();
                appl.setApplicationId(rs.getInt("application_id"));
                appl.setFullName(rs.getString("full_name"));
                appl.setCourse(rs.getString("course"));
                appl.setIsOnline(rs.getBoolean("is_online"));
                appl.setEmail(rs.getString("email"));
                result.add(appl);
            }
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

}
