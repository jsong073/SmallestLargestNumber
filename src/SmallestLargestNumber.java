import java.util.Scanner;
public class SmallestLargestNumber {
    public static void main (String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int greatestNum = 0;
        int smallestNum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2 = input.nextInt();
        System.out.print("Enter the 3rd number: ");
        num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            greatestNum = num1;
            if (num2 <= num3) {
                smallestNum = num2;
            } else {
                smallestNum = num3;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            greatestNum = num2;
            if (num1 <= num3) {
                smallestNum = num1;
            } else {
                smallestNum = num3;
            }
        } else {
            greatestNum = num3;
            if (num1 <= num2) {
                smallestNum = num1;
            } else {
                smallestNum = num2;
            }
        }

        System.out.println("The smallest number: " + smallestNum);
        System.out.println("The largest number: " + greatestNum);
    }
}
