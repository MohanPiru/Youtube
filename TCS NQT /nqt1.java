/*
Write a java code to check whether the sum of digits of a given number is divisible by 3
or not. If Divisible print true otherwise print false.

set1
input: 123
output: true

set2
input: 7082
output: false

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;

        while(temp>0){
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }

        if(sum%3==0)
        System.out.println(true);
        else
        System.out.println(false);
    }
}