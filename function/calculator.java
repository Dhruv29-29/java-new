package function;

import java.util.Scanner;

public class calculator {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first num:");
    int A = sc.nextInt();
    System.out.println("Enter second num:");
    int B =  sc.nextInt();
    System.out.println("Enter oprator (+,-,*,%,/):");
    String oprator = sc.next();

    switch (oprator) {
        case "*" :
            System.out.println(A*B);
            
            break;
        case"-":
        System.out.println(A-B);

        break; 

        case"+":
        System.out.println(A+B);

        break;

        case"/":
        System.out.println(A/B);

        break;

        case"%":
        System.out.println(A%B);

        break;
    
        default:
            break;
    }



}
    
}
