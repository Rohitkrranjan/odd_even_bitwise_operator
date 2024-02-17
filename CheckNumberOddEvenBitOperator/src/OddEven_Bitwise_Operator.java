import java.util.Scanner;

public class OddEven_Bitwise_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = input.nextInt();

        if((num & 1)== 1)
            System.out.print("given number is odd ");
        else {
            System.out.print("number is even");
        }
    }
}