/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.SQLException;
import java.util.ArrayList;
import EntityClass.*;
import DB.*;

/**
 *
 * @author M. Yofi Indrawan
 */
public class FacadeLogin {
    AksesJdbcOdbc akses = new AksesJdbcOdbc();
    
    public Akun getDataLogin(String us, String pw){
        Akun login = null;
        String sql = "SELECT * FROM akun WHERE username = '"+us+"' and password = '"+pw+"'";
        
        try {
            akses.connect();
            akses.executeQuery(sql);
            
            if (akses.getResultSet().next()) {                
                login = new Akun();
                login.setId(akses.getResultSet().getInt("id_akun"));
                login.setUsername(akses.getResultSet().getString("username"));
                login.setPassword(akses.getResultSet().getString("password"));
                login.setLevel_user(akses.getResultSet().getInt("level_user"));
            }
        } catch (ClassNotFoundException | SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
                return login;
            } catch (SQLException x) {
                x.printStackTrace();
                return login;
            }
        }
    }
}
