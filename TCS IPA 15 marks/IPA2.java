/*
Write a java code to count the words starting with a vowel in a string. 
If no such word found print "No String found". 

Note: all search should be case insensitive.

sample input1:
Everyone should practice and learn to became professional.
output:2

sample input2:
hi guys
output:No String found

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String[] arr=str.split("\\s+");
        for(int i=0;i<arr.length;i++){
            char ch=Character.toUpperCase(arr[i].charAt(0));
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            count++;
        }

        if(count>0)
        System.out.println(count);
        else
        System.out.println("No String found");
    }
}
