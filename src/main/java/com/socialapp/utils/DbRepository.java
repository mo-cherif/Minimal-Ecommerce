package com.socialapp.utils;
import java.sql.*;

public class DbRepository {
    static Connection connection;
    static Statement statement;

    public static void open() throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlite:identifier.sqlite";
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection(url);
        statement = connection.createStatement();
    }

    public static ResultSet select(String sqlQuery) throws SQLException {
        return  statement.executeQuery(sqlQuery);
    }

    public static int modify(String sqlQuery) throws SQLException {
        return statement.executeUpdate(sqlQuery);
    }

    public static void close() throws SQLException {
       connection.close();
    }

}
