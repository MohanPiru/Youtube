/*
Write a java code to count the toatl number of pairs in an array
which has a difference of k(user input).


input:
3 5 8 2 4 6
2
output: 4

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int k=sc.nextInt();
        String[] arr=input.split("\\s+");
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff=Math.abs(Integer.parseInt(arr[i])-Integer.parseInt(arr[j]));

                if(diff==k)
                count++;
            }
        }

        System.out.println(count);
    }
}

/* alternate approach
here arr containis integer elements.

HashSet<Integer> set = new HashSet<>();

        // Add all elements to the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Check for each element if there's a pair with the difference k
        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
            if (set.contains(num - k)) {
                count++;
            }
            // Remove the number to avoid counting the same pair twice
            set.remove(num);
        }

*/