package mx.com.cm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args){
        
        var password = "123";
        System.out.println("password: "+password);
        System.out.println("Password encriptado: "+ EncriptarPassword(password));
        
        
    }
    public static String EncriptarPassword(String password){
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
