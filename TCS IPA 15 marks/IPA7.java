/******************************************************************************
Write a java code to Count number of prime digit in a Number 

 * Input : 254786135
 * Output : 5

*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     int count=0;
     
     for(int i=0;i<str.length();i++){
         int d=Integer.parseInt(String.valueOf(str.charAt(i)));  // int d=str.charAt(i) - '0';
         if(d==2||d==3||d==5||d==7)
         count++;
     }
     
     System.out.println(count);
    }
}
