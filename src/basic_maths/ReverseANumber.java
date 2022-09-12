package basic_maths;
import java.util.*;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int dig = 0;
        int revNum = 0;
        while(n>0){
            dig = n%10;
            revNum = revNum*10+ dig;
            n = n/10;
        }
        System.out.println("Reversed Number:"+ revNum);
    }
}
