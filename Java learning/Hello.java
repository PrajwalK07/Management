import java.util.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*===Day 1 :26-Aug start========*/
        /*
         * Link : https://www.youtube.com/watch?v=3vbizK6KzaU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa
         */
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter value of a ");
        //int a = sc.nextInt();
        //System.out.println("Enter value of b ");
        //int b = sc.nextInt();
        //System.out.println("Before swap value of a " + a + "value of b " + b);
        //swappingOne(a, b);// using third variable
        //swappingTwo(a, b);//without using third variable addition subtraction
        //swappingThree(a, b);//without using third variable mul/div
        /*===Day 1 :26-Aug end========*/


        /*===Day 2 :27-Aug Start========
         * link : https://www.youtube.com/watch?v=m0lMpNIG6vU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=2
         * 
        */
        //System.out.println("Algo Reverse of the number is " + reverseNumberAlgo(1020));
        //reverseNumberStrBuffer(201);
        //reverseNumberStrBuilder(201);
        //2reverse string 
        //reverseStrAlgoString("ABCV"); // String
        //reverseStrAlgoCharArr("ABCV"); // char array
        //reverseStrBuf("ABCD");
        /*===Day 2 :27-Aug end========*/

        /*===Day 3 :28-Aug Start========
         * link : https://www.youtube.com/watch?v=kNE3vq1g2e8&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=4
         * link : https://www.youtube.com/watch?v=8BlUi4-4N4E&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=5
         * 
        */
        boolean isPlain = palindromeNumber(121);
        if(isPlain){
            System.out.println("yes palindrome");
        }else{
             System.out.println("no palindrome");
        }

        boolean isPalStr = palindromeString("nitin");
        if(isPalStr){
            System.out.println("yes palindrome");
        }else{
             System.out.println("no palindrome");
        }
        /*===Day 3 :27-Aug end========*/
        /*===Day 4 :29-Aug Start========
         * link : https://www.youtube.com/watch?v=CnFBzBMEdMg&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=6
         * 
        */
        //System.out.println("No of digits = > " + noOfDigitsNumber(109));
        
        /*Day 4 end */
        /*===Day 5 :29-Aug Start========
            link : Count of even odd digits in number-> https://www.youtube.com/watch?v=Ns4LoG56SZ4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=7
            link : Sum of digits in number -> https://www.youtube.com/watch?v=ZLaBlxnmrxc&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=8
        */
        noOfEvennOddDigits(10245);
        System.out.println("Sun of digits - > "+ sumOfDigits(12345));
        if(primeNumber(11)){
            System.out.println("Prime number");
        }else{
            System.out.println("not prime");
        }
        
        /*day 5 end  */
        
    }

    public static void swappingOne(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swap value of a " + a + " value of b " + b);
    }

    public static void swappingTwo(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("without third::add/sub After swap value of a " + a + " value of b " + b);
    }

    public static void swappingThree(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("without third::mul/div After swap value of a " + a + " value of b " + b);
    }

    public static int reverseNumberAlgo(int num) {
        int rev = 0;
        while (num != 0) {
            System.out.println("inside while");
            rev = (rev * 10) + (num % 10);
            num = num / 10;

        }

        return rev;
    }

    public static void reverseNumberStrBuffer(int num){
        StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("reverse of number using SB ==> " +rev) ;
    }
    public static void reverseNumberStrBuilder(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        System.out.println("Using Builder" + sb.reverse()); 
    }
    public static void reverseStrAlgoString(String str){
        String reverseStr = "";
        for(int i=str.length()-1 ; i >=0 ;i --){//here we have length() on string
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println("String rev -> " +reverseStr);
    }
    public static void reverseStrAlgoCharArr(String str){
        char a[] = str.toCharArray();
        String rev ="";
        for(int i= a.length -1  ; i>=0 ;i--){// char array par length not () function
            rev = rev + a[i];
        }
        System.out.println("Reverse using string char array --> " + rev);
    }
    public static void reverseStrBuf(String str){
        StringBuffer sb = new StringBuffer(str);
        System.out.println("reverse using string buffer--> " + sb.reverse());
    }
    public static boolean palindromeNumber(int num){
        
        int rev=0;
        int ori = num;
        while(num!=0){
            rev = num%10  + rev *10;
            num=num/10;
        }
        if(rev==ori){
            return true;
        }
        return false;

    }
    public static boolean palindromeString(String str) {
        //String ori = str;
        System.out.println("str function callsed");
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev+ str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str) ){
            return true;
        }
        return false;
    }
    public static int noOfDigitsNumber(int num){
        int countDigit = 0;
        while(num!=0){
            countDigit ++ ;
            num = num /10;
        }
        return countDigit;
    }
    public static void noOfEvennOddDigits(int num){
        int evenDigits = 0;
        int oddDigits = 0 ;
        while(num!=0){
            if(num % 2 == 0){
                evenDigits++;
            }else{
                oddDigits++;
            }
            num=num/10;
        }
        System.out.println("Even Digiits=>"+evenDigits);
        System.out.println("Odd Digiits=>"+oddDigits);
    }
    public static int sumOfDigits(int num){
        int digSum = 0;
        while(num!=0){
            digSum = digSum + num%10;
            num=num/10;

        }
        return digSum;
    }
    public static int largetAmoungThree1(){
        int largest=0; 
        return largest;
    }
    public static boolean primeNumber(int num){
        int pc = 0;
        boolean prime = true;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                pc++;
            }
            if(pc>2){
                prime = false;
                break;
            }
        }
        return prime;
    } 
    
}