package tasks;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnect {    //Connect to database 
    public void connectDb(){
        mysqlSet set = new mysqlSet();

        //Connect to DB
        try{
     String url = set.getUrl();
     String username = set.getUsername();
     String password = set.getPassword();
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url , username , password)){
                System.out.println("Connect to database sucsessfull");
                
            }
            
        }
        catch(Exception ex){
            System.out.println("Connection failed");
            System.out.println(ex);
        }
    }
    
        
    
}
