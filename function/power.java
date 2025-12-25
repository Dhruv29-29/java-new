package function;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        int pow = 1;
        for(int i = 0; i<=b;i++){
            pow*=b;
        }
        System.out.println(pow);
    }
}
