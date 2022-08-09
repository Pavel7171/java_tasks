package tasks;

import java.util.Scanner;

public class Dialog {
    public void dial(){
        System.out.println("Insert your name");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        System.out.println("Insert your second name");
        Scanner secondName = new Scanner(System.in);
        String secondName2 = secondName.nextLine();
        System.out.println();
        System.out.println("Hello "+name1+" "+secondName2 );
        //name.close();
        //secondName.close();
    }
}
