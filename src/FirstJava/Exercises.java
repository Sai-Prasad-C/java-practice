package FirstJava;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Even-Odd Check
        if(checkEven(in)){
            System.out.println("Even Number!");
        }else{
            System.out.println("Odd number!");
        }

        //Greet user
        greet(in);

        //Simple Interest
        System.out.println("Simple Interest Calculator -");
        System.out.println("Simple Interest:" + simpleInterest(in));

        //Calculator
        System.out.println("Simple Arithmetic Calculator -");
        System.out.println("Result: " + calculate(in));

        //Largest of Two numbers
        System.out.println("Largest of two number check -");
        System.out.println("Largest of two number is: " + largeTwo(in));

        //INR to USD
        System.out.println("INR to USD converter -");
        System.out.println("USD :$" + inrToUsd(in) );

        //Fibonacci
        System.out.println("Fibonacci number generator -");
        fibo(in);

        //Palindrome
        System.out.println("Palindrome Checker -");
        if(checkPalin(in)){
            System.out.println("It's a palindrome!");
        }else{
            System.out.println("It's not a palindrome!");
        }

    }

    static boolean checkEven(Scanner in){

        System.out.print("Enter a number to check even or odd:");
        float num = in.nextFloat();
        return num % 2 == 0;

    }

    static void greet(Scanner in){
        System.out.print("Enter you name:");
        String name = in.next();
        System.out.println("Welcome to the world of code "+ name + "!");

    }

    static float simpleInterest(Scanner in){
        System.out.print("Enter Principle Amount:");
        float prin = in.nextFloat();
        System.out.print("Enter The Time:");
        float time = in.nextFloat();
        System.out.print("Enter The Rate in %:");
        float rate = in.nextFloat();

        return (prin * time * rate)/100;

    }

    static float calculate(Scanner in){
        System.out.print("Enter a number:");
        float n1 = in.nextFloat();
        System.out.print("Enter another number:");
        float n2 = in.nextFloat();
        while(true) {
            System.out.print("Enter an operator (+,-,/,*):");
            String operator = in.next();
            switch (operator) {
                case "+":
                    return n1 + n2;
                case "-":
                    return n1 - n2;
                case "*":
                    return n1 * n2;
                case "/":
                    if (n2 == 0){
                        System.out.println("Can't divide by 0! Try again.");
                        continue;
                    }
                    return n1 / n2;
                default:
                    System.out.println("Invalid operator! Try again.");
                    continue;
            }
        }

    }

    static float largeTwo(Scanner in){
        System.out.print("Enter a number:");
        float n1 = in.nextFloat();
        System.out.print("Enter another number:");
        float n2 = in.nextFloat();
        return Math.max(n1, n2);
    }

    static float inrToUsd(Scanner in){
        System.out.print("Enter amount in Rupees:");
        float rup = in.nextFloat();
        return rup / 89; //Approx current conversion rate
    }

    static void fibo(Scanner in){
        int n;
        long first = 0, second = 1;

        while (true){
            System.out.print("Enter a number:");
            n = in.nextInt();
            if (n <= 0) {
                System.out.println("Enter a positive number!");
                continue;
            }
            break;
        }

        for(int i = 1; i <= n; i++){
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    static boolean checkPalin(Scanner in){
        String str;
        while(true) {
            System.out.print("Enter a String:");
            str = in.next();
            if (str == null || str.isEmpty()) {
                System.out.println("Enter a valid String!");
                continue;
            }
            break;
        }
        str = str.toLowerCase();
        int front = 0,rear = str.length()-1;
        while(front < rear){
            if(str.charAt(front) != str.charAt(rear)){
                return false;
            }
            front++;
            rear--;
        }
        return true;

    }
}
