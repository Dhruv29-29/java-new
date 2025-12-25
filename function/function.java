package function;

import java.util.*;
public class function {

    public static int sumfunc(int a, int b){
        int addition = a+b;
        return addition;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter second number:");
        int b = sc.nextInt();
        

        int sum = sumfunc(a,b);
        System.out.println(sum);

        sc.close();
        


        
    }
}
