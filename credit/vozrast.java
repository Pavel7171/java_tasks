package tasks;
import java.util.Scanner;
public class vozrast {
    public void youvozrast(){
        Scanner voz = new Scanner(System.in);
        System.out.println("Insert you age");
        int voz1 = voz.nextInt();
        if (voz1<=30){
            System.out.println("You are young"+ " ,you "+ voz1);
                    }
        else {
            System.out.println("You are old"+ " ,you "+ voz1);
        }
        int god = 2022;
        int itog = god-voz1;
        System.out.println("You are burn in "+itog+" year");
        //voz.close();
    }
    }
