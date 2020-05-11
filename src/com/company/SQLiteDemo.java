
package com.company;
import java.sql.*;

public class SQLiteDemo {
    public static void main(String[] args) throws Exception {
        Connection c=null;
        try {
            Class.forName("org.sqlite.JDBC");
            c=DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("SQLite DB Connection successful");

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
