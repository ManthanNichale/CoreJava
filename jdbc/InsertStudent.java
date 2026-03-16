package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudent {

    public static void main(String[] args) throws SQLException {

        Connection con = ConnectDB.getConnection();

        Statement statement = con.createStatement();

//        String qu = "INSERT INTO student( name,roll, marks) VALUES('Raj',141,85.5)";
//
//        int r = statement.executeUpdate(qu);
//        System.out.println(r + " Record(s) inserted");

        // Fetch  students particular name
        String q = "SELECT name FROM student where roll=141";
        ResultSet rst = statement.executeQuery(q);

        while (rst.next()) {
            System.out.println(rst.getString ("name") );
        }

        // Close resources
        rst.close();
        statement.close();
        con.close();
    }
}