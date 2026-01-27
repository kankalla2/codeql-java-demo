package com.demo;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SemgrepVuln {

    public void bad(HttpServletRequest request) throws Exception {
        String user = request.getParameter("user");

        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();

        // SQL Injection – Semgrep WILL flag this
        stmt.execute("SELECT * FROM users WHERE name = '" + user + "'");
    }
}
