import java.util.*;
import java.text.DecimalFormat;
public class kiran{
    public static void main(String[] args)
    {
         Scanner s=new Scanner (System.in);
        
       
        DecimalFormat sx=new DecimalFormat("0.00");
        int a=s.nextInt();
        int b=s.nextInt();
      int x=(int)  Math.pow(a,2) + (int ) Math.pow(b,2);
     float  hy= (float) Math.sqrt(x);
     System.out.print(sx.format(hy));
    }
}