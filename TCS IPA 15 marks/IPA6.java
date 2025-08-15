/******************************************************************************
Write a java code to Count the number of spaces and characters

input:Hello world this is Java
output:
Spaces: 4
Characters (excluding spaces): 20
*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     int sp=0,c=0;
     
     for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         
         if(ch==' ')
         sp++;
        //  else
        //  c++;
         
     }
     
     c=str.length()-sp;
     System.out.println("Spaces:"+sp);
     System.out.println("Characters (excluding spaces):"+c);
    }
}
