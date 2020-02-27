package practice26;
import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number between 2 and 20");
        int number=x.nextInt();
        if(2<=number && number <=20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number+" "+"x"+" "+i+" "+"="+" "+number * i);
            }

        }
    }
}
