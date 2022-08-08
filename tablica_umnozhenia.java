package tasks;

import java.util.Scanner;

public class tablica_umnozhenia {
    public static void main(String[] args){
        System.out.println("insert number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
            for(int i=0;i<10;i++){
                System.out.println(a+" x "+(i+1)+" = " +(a*(i+1)) );
                scanner.close();
            }
    }
}
