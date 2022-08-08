package tasks;
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        double num = 0;
        double b = 1; // всегда еденица 
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите общее кол-во чисел");
        int a = scanner1.nextInt(); //а - всего чисел.
            while(b<=a){ // пока b не будет равно a
            System.out.println("Введите число " + "("+(int) b +")"+":"); 
            num +=scanner1.nextInt(); 
            b +=1;
            }
            double avgn = (num / a);
            System.out.println("Среднее из "+a+" чисел: " + avgn); 
            scanner1.close();
    }
}
