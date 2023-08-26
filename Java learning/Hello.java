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
        swappingOne(a, b);// using third variable
        swappingTwo(a, b);//without using third variable addition subtraction
        swappingThree(a, b);//without using third variable mul/div
        /*===Day 1 :26-Aug end========*/
    }

    public static void swappingOne(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swap value of a " + a + " value of b " + b);
    }
    public static void swappingTwo(int a, int b) {
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println("without third::add/sub After swap value of a " + a + " value of b " + b);
    }
    public static void swappingThree(int a, int b) {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("without third::mul/div After swap value of a " + a + " value of b " + b);
    }
}