package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlCreateTable{
    public static void main(String[] args){
        //Connect to DB
        MysqlConnect mscon = new MysqlConnect();
        mscon.connectDb();
        mysqlSet set = new mysqlSet();

        try{
            String url = set.getUrl();
            //String url = "jdbc:mysql://192.168.122.72/java_base";
            //String username = "java";
            String username = set.getUsername();
            //String password = "java";
            String password = set.getPassword();
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            //Create table change name
            String sqlCommand = "CREATE TABLE test2 (Id INT PRIMARY KEY AUTO_INCREMENT,FirstName VARCHAR(20), SecondName VARCHAR(20),Age INT)";
            try (Connection conn = DriverManager.getConnection(url , username , password)){
                Statement statement = conn.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Table create sucsess");
            }
        }
        catch(Exception ex){
            System.out.println("Table not create, because connection to database failed");
            System.out.println(ex);
        }
    }

    
}
