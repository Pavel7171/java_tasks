package tasks;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        double c;
        System.out.println("Введите 1 число");
        Scanner ch1 = new Scanner(System.in);
        double a = ch1.nextDouble();

        System.out.println("Введите 2 число");
        Scanner ch2 = new Scanner(System.in);
        double b = ch2.nextDouble();

        System.out.println("Введите оператор (+,-,*,/)");
        Scanner op = new Scanner(System.in);
        String itog = op.nextLine();
        switch(itog){
            case "+": c=a+b;
            System.out.println("вжух!");
            System.out.println("Результат "+c);
                break;
            case "-": c=a-b;
            System.out.println("вжух!");
            System.out.println("Результат "+c);
                break;
            case "*":c=a*b;
            System.out.println("вжух!");
            System.out.println("Результат "+c);
                break;
            case "/": c=a/b;
            System.out.println("вжух!");
            System.out.println("Результат "+c);
                break;  
        }
       // System.out.println(c);
        ch1.close();
        ch2.close();
        op.close();
        

    }
       
    }

