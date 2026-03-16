package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnection {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver"); // load PostgreSQL driver
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/techouts", "postgres", "manthan"
        );
    }

    // Optional main method to test the connection
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        System.out.println("Connected to PostgreSQL successfully!");
        conn.close();
    }
}
