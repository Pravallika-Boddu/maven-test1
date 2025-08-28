package com.example.javamavenjunithelloworld;

public class Utility {
    public static void checkEvenOrOdd(int x){
        if(x%2==0) System.out.println(x+" is Even");
        else System.out.println(x+" is Odd");
    }
    public static boolean isDivisibleBy2(int x){
        if(x%2==0) return true;
        return false;
    }
    public static boolean isDivisibleBy3(int x){
        if(x%3==0) return true;
        return false;
    }
    public static boolean isDivisibleBy4(int x){
        if(x%4==0) return true;
        return false;
    }
    public static boolean isDivisibleBy5(int x){
        if(x%5==0) return true;
        return false;
    }
    public static boolean isDivisibleBy6(int x){
        if(x%6==0) return true;
        return false;
    }
    public static boolean isDivisibleBy7(int x){
        if(x%7==0) return true;
        return false;
    }
    public static boolean isDivisibleBy8(int x){
        if(x%8==0) return true;
        return false;
    }
    public static boolean isDivisibleBy9(int x){
        if(x%9==0) return true;
        return false;
    }
    public static int maxAmongTwo(int x,int y){
        if(x>y) return x;
        else return y;
    }
    public static int maxAmongThree(int x,int y,int z){
        if(x>y &&x>z) return x;
        else if(y>z) return y;
        else return z;
    }
    public static void printTenNumbers(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static int addTwo(int x,int y){
        return x+y;
    }
    public static int multiplyTwo(int x,int y){
        return x*y;
    }
    public static int divideTwo(int x,int y){
        return x/y;
    }
    public static int squareTwo(int x,int y){
        return (x+y)*(x+y);
    }
    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
    public static double areaOfSquare(double a) {
        return a*a;
    }
    public static double areaOfRectangle(double l,double b) {
        return l*b;
    }
    public static double areaOfTriangle(double b,double h) {
        return 0.5*b*h;
    }
    public static double squareRoot(int n) {
        return Math.sqrt(n);
    }
    public static void pravallika() {
        System.out.println("I am Pravallika");
    }

    public static void main(String[] args) {
        System.out.println("Check Even/Odd:");
        checkEvenOrOdd(7);
        System.out.println("Divisible by 3? " + isDivisibleBy3(9));
        System.out.println("Max among 2: " + maxAmongTwo(10, 20));
        System.out.println("Max among 3: " + maxAmongThree(10, 25, 15));
        printTenNumbers();
        System.out.println("Leap Year? " + isLeapYear(2024));
        System.out.println("Add: " + addTwo(5, 6));
        System.out.println("Multiply: " + multiplyTwo(5, 6));
        System.out.println("Divide: " + divideTwo(12, 3));
        System.out.println("(a+b)^2: " + squareTwo(2, 3));
        System.out.println("Area Circle: " + areaOfCircle(5));
        System.out.println("Area Square: " + areaOfSquare(4));
        System.out.println("Area Rectangle: " + areaOfRectangle(4, 6));
        System.out.println("Area Triangle: " + areaOfTriangle(6, 3));
        System.out.println("Square root: " + squareRoot(16));
        pravallika();
    }
}
