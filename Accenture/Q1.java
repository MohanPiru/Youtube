/******************************************************************************
Given a string you are requested to determine whether the string should be
converted to all uppercase or all lowercase, depending on the count of 
uppercase and lowercase letter in that string. 

Example:
Input:AbCdEfG 
Output 1: ABCDEFG        

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine(); 

        int upper = 0, lower = 0;

        // Count uppercase and lowercase
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {      // if(c>='A' && c<='Z')
                upper++;
            } else if (Character.isLowerCase(c)) {   //if(c>='a' && c<='z')
                lower++;
            }
        }

        // Convert based on condition
        if (upper >= lower) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}
