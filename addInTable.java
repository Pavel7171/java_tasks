package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class addInTable {
    public void addToBase() throws SQLException{
        MysqlConnect msqcon = new MysqlConnect();
        msqcon.connectDb();
        mysqlSet set = new mysqlSet();
        String url = set.getUrl();
        String username = set.getUsername();
        String password = set.getPassword();
        setDialog setPerson = new setDialog();
        String a = setPerson.getName();
        String b = setPerson.getSecondName();

        try 
        (Connection conn = DriverManager.getConnection(url,username,password)){
        //Statement statement = conn.createStatement();
        //int rows = statement.executeUpdate("INSERT test2(FirstName, SecondName)"+"VALUES ('"+a+"','"+b+"')");
       String sql = "INSERT INTO test2(FirstName,SecondName)"+"VALUES(?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, setPerson.getName());
        preparedStatement.setString(1, setPerson.getSecondName());

        //System.out.printf("Added %d rows \n", rows);
        //System.out.println(setPerson.getName()+setPerson.getSecondName()); 
        System.out.println(a+b);   
        }
            
        
    }

}
