/******************************************************************************
Write a java code to Find the largest word in a string

 * Input : Java programming is awesome            
 * Output : programming 

*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] arr=str.split("\\s+");
    String largest="";
    
    for(int i=0;i<arr.length;i++){
        if(arr[i].length()>largest.length())
        largest=arr[i];
    }
    System.out.println(largest);
    }
}
