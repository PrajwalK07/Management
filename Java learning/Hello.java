import java.util.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*===Day 1 :26-Aug start========*/
        /*
         * Link : https://www.youtube.com/watch?v=3vbizK6KzaU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a = sc.nextInt();
        System.out.println("Enter value of b ");
        int b = sc.nextInt();
        System.out.println("Before swap value of a " + a + "value of b " + b);
        //swappingOne(a, b);// using third variable
        //swappingTwo(a, b);//without using third variable addition subtraction
        //swappingThree(a, b);//without using third variable mul/div
        /*===Day 1 :26-Aug end========*/


        /*===Day 2 :27-Aug Start========
         * link : https://www.youtube.com/watch?v=m0lMpNIG6vU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=2
         * 
        */
        System.out.println("Algo Reverse of the number is " + reverseNumberAlgo(1020));
        reverseNumberStrBuffer(201);
        reverseNumberStrBuilder(201);
        //2reverse string 
        reverseStrAlgoString("ABCV"); // String
        reverseStrAlgoCharArr("ABCV"); // char array
        reverseStrBuf("ABCD");
        /*===Day 2 :27-Aug end========*/
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
}