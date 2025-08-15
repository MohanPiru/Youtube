/******************************************************************************
write a java code In the main method read five values for an 
integer array and another two Value which are the limits 
(limit 1 limit2), the method should print the average of integer 
values which are greater than 2 and less than 6 For example
if the values are 1,2,3,4,5 and the limits 2 and 6 then the average is 4(3-4-5).

 * Input : 
   1
   2 
   3 
   4 
   5 
   2 
   6
 * Output : 4 

*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    int limit1=sc.nextInt();
    int limit2=sc.nextInt();
    
    int sum=0;
    int count=0;
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]>limit1 && arr[i]<limit2){
            sum=sum+arr[i];
            count++;
        }
    }
    
    int avg=sum/count;
    
    System.out.println(avg);
    
    }
}
