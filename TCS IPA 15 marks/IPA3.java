/*
Write a java code that reverses the words in a String 
(keeping each word intacat but reverseing their order):

input: Hello world this is Java
output: Java is this world Hello

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length;i>=0;i--){
           sb.append(arr[i]);
           if(i>0)
           sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}