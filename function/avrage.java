package function;

import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average.
public class avrage {

    public static int avragetwo(int a, int b , int c){
        int avr = (a+b+c)/3;
        return avr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        System.out.println(avragetwo(a, b, c));

        
    }
    
}
