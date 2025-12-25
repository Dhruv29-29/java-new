import java.util.Scanner;

public class fac {

    public static int factorial(int a){

        // for(int i = 1;i<=a;i++){
        //     facc = facc*i;
        //     System.out.println(facc);

        // }

        int facc = a;
        if (a>1) {
            
            return facc*factorial(a-1);
        }else{return 1;}



        
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(factorial(a));
        
    }
}
