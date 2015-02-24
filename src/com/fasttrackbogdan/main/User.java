package com.fasttrackbogdan.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bogdan on 2/24/2015.
 */
public class User {
    String Name ;
    String Password ;
    public boolean equals(Object obj) {

        User usr = (User)obj;
        if (this.Name.equals(usr.getName()) && this.Password.equals(usr.getPassword()))
            return true;
        else return false;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }




}

