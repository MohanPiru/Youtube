/******************************************************************************
write a java code to check a number is palindrome or not

 * Input : 12321     
 * Output : palindrome         

*******************************************************************************/
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev = 0, temp = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}