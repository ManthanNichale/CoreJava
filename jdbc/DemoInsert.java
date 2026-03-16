package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoInsert {

    static void main() throws SQLException ,ClassNotFoundException{
        Connection conn = DemoConnection.getConnection();
        Statement statement = conn.createStatement();
        try {

            String qure = "SELECT name FROM student where roll=141";
            ResultSet re = statement.executeQuery(qure);

            if(!re.next()){
                System.out.println("No name found");
            }
            else{
                do{
                    System.out.println(re.getString("name"));
                }while(re.next());
            }

        }
        catch(SQLException e) {
            System.out.println(e);
        }    }
}

