package function;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();

        if (a<=b) {

            for(int i = b ; i>=1;i--){
                if(a%i==0&&b%i==0){
                    System.out.println(i);
                    break;
                }
            }
            
        }
        else{
            for(int i = a ; i>=1;i--){
                if(a%i==0&&b%i==0){
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
