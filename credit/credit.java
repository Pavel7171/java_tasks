package tasks;

import java.util.Scanner;

public class credit {
    public void credits(){
        Scanner summa = new Scanner(System.in);
        System.out.println("Vvedite summu credita");
        int summ = summa.nextInt();
        Scanner srok = new Scanner(System.in);
        System.out.println("Vvedite srok credita");
        int sr = srok.nextInt();
        Scanner procent = new Scanner(System.in);
        System.out.println("Vvedite procent godovih");
        double proc = procent.nextDouble();
        double platezhB;
        double platezhA;
        double platezhC;
        platezhA = proc/12/100;
        platezhB = platezhA*(Math.pow(1+platezhA, sr*12))/(Math.pow(1+platezhA, sr*12)-1);
        platezhC = platezhB*summ;
        System.out.printf("Summa ezjemeczchnogo platezha = %.2f \n  ",platezhC );
        
        summa.close();
        srok.close();
        procent.close();
    }
}
