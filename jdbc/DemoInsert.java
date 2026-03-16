package com.techouts.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoInsert {

    static void main() throws SQLException {
        Connection conn=ConnectDB.getConnection();
      //  String sr="INSERT INTO student VALUES(55,'rajiv',99.7)";
        Statement statement=conn.createStatement();
      //  int p= statement.executeUpdate(sr);
       // System.out.println("Record is insert " +" "+p);

        //Fetch Data from Database.......

        String qure="SELECT name FROM student;";
        ResultSet re= statement.executeQuery(qure);
        while(re.next()){
            System.out.println(re.getString("name"));
        }
        String e="select roll from student where roll<10";
        ResultSet e1 =statement.executeQuery(e);
try{
        while(e1.next()) {
          //  System.out.println(e1.getInt(e1.getInt(1)+""+e1.getString(2)+""+ e1.getInt(3)));
        }

        }
catch (Exception ed){
    System.out.println("Not present the it any one  from it ");
}


    }
}
