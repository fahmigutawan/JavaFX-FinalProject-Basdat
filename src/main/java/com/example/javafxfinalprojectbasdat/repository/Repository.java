package com.example.javafxfinalprojectbasdat.repository;

import com.example.javafxfinalprojectbasdat.util.DbUrl;

import java.sql.*;
import java.util.ArrayList;

public class Repository {
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DbUrl.dbUrl);
    }

    public static String getAllInstructor() {
        try (Connection con = getConnection()) {
            String command = "select * from instructor";

            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery(command);

            ArrayList<String> s = new ArrayList<>();
            while (set.next()){
                s.add(set.getString("name"));
            }
            return String.format("Success -> %s",s.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            return String.format("Error -> %s", e.getMessage());
        }
    }
}
