package tasks;
import java.util.Scanner;
public class hello{
    public static void main(String[] args){
        System.out.println("Privet, what is yuor name");
        Scanner name = new Scanner(System.in);
        String string = name.nextLine();
        name.close();
        System.out.println("Your name is "+string);
    }
}
