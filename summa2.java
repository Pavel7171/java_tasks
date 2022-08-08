package tasks;

import java.util.Scanner;

public class summa2 {
    public static void main(String[] args){
        System.out.println("Insert 1 number");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("Insert 2 number");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        int summ;
        summ = a+b;
        int umnozh;
        umnozh = a*b;
        System.out.println("Summa = "+ summ);
        System.out.println("Proizvedenie = "+ umnozh);
        scanner1.close();
        scanner2.close();
    }
}
