/* write a java code to find the number of even digits in a number

input:482357926
output:5

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt() ;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                count++;
            }
            num /= 10;
        }

        System.out.println(count);
    }
}