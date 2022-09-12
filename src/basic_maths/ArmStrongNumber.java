package basic_maths;

import java.util.*;
import java.lang.Math;

public class ArmStrongNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
        int n = 153;
        double totalSum = 0;
        int numberOfDigits = 0;
        int temp = n;
        while (temp != 0) {
            numberOfDigits++;
            temp = temp % 10;
        }
        System.out.println(numberOfDigits);
        while (n > 0) {
            int digit = n % 10;
            totalSum += Math.pow(digit,numberOfDigits);
            n = n / 10;
        }
        if(totalSum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }
}
