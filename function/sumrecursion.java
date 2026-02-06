package function;


public class sumrecursion {
    public static void sum(int i,int n,int summ ){
        
        
        if (i<=n) {
            summ +=i;
            System.out.println(summ);       
            sum(i+1,n,summ);
        }

        
    }
    
    public static void main(String[] args) {


        sum(1,5,0);
        
    }
}
