package com.techouts.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoConnection {

    static void main() throws ClassNotFoundException, SQLException {

Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techouts","postgres","manthan");
        System.out.println("connected ");


    }
}
