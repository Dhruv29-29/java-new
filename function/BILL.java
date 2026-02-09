package function;
import java.util.*;
public class BILL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float  pen = sc.nextFloat();
        float pencil = sc.nextFloat();

        float MRP = pen+pencil;
        float total = MRP + (MRP*0.18f);

        System.out.println(total);

        
    }
}
