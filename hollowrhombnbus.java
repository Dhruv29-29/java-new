public class hollowrhombnbus {
    public static void main(String[] args) {
        
        for(int i = 5 ; i >=0;i--){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
                
            }
            for(int j =0;j<=5;j++){
                if(j==5||i==0||j==0||i==5){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
}
