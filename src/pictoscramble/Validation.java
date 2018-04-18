/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.util.regex.Pattern;

/**
 *
 * @author emmar
 */
public class Validation {
    
     String user;
    //private Pattern pattern;
    //private Matcher matcher;
    
    //private static final String namePattern = "^[a-z0-9_-]{3,15}$";
    
    private static final Pattern []  validUsername = new Pattern[2]; {
    
        validUsername[0] = Pattern.compile(".*[A-Z].*");
        validUsername[1] = Pattern.compile(".*[a-z].*");        
    }

    public boolean isLegalUsername(String user) {
        for (int i = 0; i < validUsername.length; i++){
            if(!validUsername[i].matcher(user).matches())
                return false;
        }
        return true;
    }
    
    private static final Pattern [] validAdmin = new Pattern[2]; {
    
        validAdmin[0] = Pattern.compile(".*[A-Z].*");
        validAdmin[1] = Pattern.compile(".*[a-z].*");
}
    
    public boolean isLegalAdmin(String admin) {
        for (int i = 0; i < validAdmin.length; i++){
            if(!validAdmin[i].matcher(admin).matches())
                return false;
        }
        return true;
    }  
    
    
}

