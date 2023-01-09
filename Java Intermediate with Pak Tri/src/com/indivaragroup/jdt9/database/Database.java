package com.indivaragroup.jdt9.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public Connection connect() throws Exception{
        String url="jdbc:mysql://localhost:3306/hr";
        String username="root";
        String password="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
}
