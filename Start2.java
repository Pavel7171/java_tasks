package tasks;

import java.sql.SQLException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws SQLException{
        Dialog dial = new Dialog();
        dial.dial();
        addInTable addToDb = new addInTable();
        addToDb.addToBase();      
        vozrast voz = new vozrast();
        voz.youvozrast();
        System.out.println("Do you have credit? 0-NO/1-YES");
        Scanner cr = new Scanner(System.in);
        int cr1 = cr.nextInt();
        if(cr1!=0){
            credit cr2 = new credit();
            cr2.credits();
        }
        else{
            System.out.println("all OK");
        }
        
    }
}

