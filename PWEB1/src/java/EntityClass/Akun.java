/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClass;

/**
 *
 * @author M. Yofi Indrawan
 */
public class Akun {
    private int id;
    private String username;
    private String password;
    private int level_user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel_user() {
        return level_user;
    }

    public void setLevel_user(int level_user) {
        this.level_user = level_user;
    }
}
