import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        checkLeap(in);
        twoSum(in);
        System.out.print("Enter a number for multiplication table:");
        int n = in.nextInt();
        mulTable(n);

    }

    static void checkLeap(Scanner in){
        System.out.print("Enter a year:");
        int n = in.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0 )
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }

    static void twoSum(Scanner in){
        System.out.print("Enter a number:");
        float n1 = in.nextFloat();
        System.out.print("Enter another number:");
        float n2 = in.nextFloat();
//        int sum = (int) (n1 + n2);
        System.out.println("Sum: " + (n1 + n2));
        System.out.println("GCD/HCF: "+hcf(120,6));
        System.out.println("LCM: "+lcm(120,6));
    }

    static void mulTable(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }

    static float hcf(float n1, float n2){
        while(n2 != 0) {
            float temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    static float lcm(float n1, float n2){
        return (n1 * n2) / hcf(n1, n2);
    }
}