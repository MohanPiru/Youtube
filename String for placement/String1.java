/*
Write a java code to count the uppercase and lowercase letters of a given string.
Avoid special characters, spaces and digits.

input: This is A Big Line 123.
output:
UPPERCASE:4
LOWERCASE:10

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int u=0,l=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))         // if(ch>='A' && ch<='Z')
            u++;
            else if(Character.isLowerCase(ch))     //  if(ch>='a' && ch<='z')
            l++;
        }

        System.out.println("UPPERCASE:"+u);
        System.out.println("LOWERCASE:"+l);

    }
}
