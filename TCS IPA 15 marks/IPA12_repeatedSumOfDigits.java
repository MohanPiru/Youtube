/******************************************************************************
Digital Root (Repeated Sum of Digits until One Digit)

 * Input : 195     
 * Output : 6         

*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     
     while(num>9){
         int sum=0;
         while(num>0){
             sum=sum+num%10;
             num=num/10;
         }
         num=sum;
     }
     
     System.out.println(sum);
     
    }
}
