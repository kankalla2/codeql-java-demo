package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Vulnerable {

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();

        // SQL Injection – CodeQL WILL flag this
        stmt.execute("SELECT * FROM users WHERE name = '" + args[0] + "'");
    }
}
