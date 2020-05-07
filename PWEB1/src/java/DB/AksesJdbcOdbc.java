/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;

/**
 *
 * @author Lab330-20
 */
public class AksesJdbcOdbc {

    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private PreparedStatement ps;
    private String dsn;
    private String login;
    private String pwd;

    public AksesJdbcOdbc(){
        
    }
    
    public AksesJdbcOdbc(String dsn, String login, String pwd) {
        this.dsn = dsn;
        this.login = login;
        this.pwd = pwd;
    }

    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_apotek", "root", "");
        stmt = con.createStatement();
        return con;
    }

    public int executeUpdate(String str) throws SQLException {
        return stmt.executeUpdate(str);
    }

    public ResultSet executeQuery(String str) throws SQLException {
        rs = stmt.executeQuery(str);
        return rs;
    }

    public void disconnect() throws SQLException {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (con != null) con.close();
    }

    public ResultSet getResultSet() {
        return rs;
    }

    public Statement getStatement() {
        return stmt;
    }

    public PreparedStatement getPreparedStatement(String str) throws SQLException {
        ps = con.prepareStatement(str);
        return ps;
    }
}
