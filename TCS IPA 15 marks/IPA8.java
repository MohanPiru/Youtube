/******************************************************************************
Write a java code to Print the last character of every word in a string

 * Input : Hello world this is Java            
 * Output : o d s s a 

*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String[] arr=str.split("\\s+");
     
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i].charAt(arr[i].length()-1)+" ");
     }
    }
}
