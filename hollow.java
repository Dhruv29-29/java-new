public class hollow {
    public static void main(String[] args) {
        int n = 6;

            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= i; j--) {
                    System.out.print("* ");
                }
                for (int m = 0; m < n; m++) {
                    if (i==1||i==6) {
                        System.out.print("* ");
                        
                    }
                    else{
                    System.out.print("& ");}


                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        
    }
}
