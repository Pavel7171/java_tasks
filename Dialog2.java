package tasks;

import java.sql.SQLException;
import java.util.Scanner;

public class Dialog {
    public void dial() throws SQLException{
        System.out.println("Insert your name");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        System.out.println("Insert your second name");
        Scanner secondName = new Scanner(System.in);
        String secondName2 = secondName.nextLine();
        System.out.println();
        System.out.println("Hello "+name1+" "+secondName2 );
        addInTable add = new addInTable();
        add.addToBase();
        setDialog setd = new setDialog();
        setd.getName();
        setd.getSecondName();
        //name.close();
        //secondName.close();
    }
}
class setDialog{
    String name1;
    String secondName2;
public void setName(String namee){
    name1 = namee;
}
    public String getName(){
        return name1;
    }
public void setSecondName(String secondNamee){
    secondName2=secondNamee;
}
    public String getSecondName(){
        return secondName2;
    }
}
