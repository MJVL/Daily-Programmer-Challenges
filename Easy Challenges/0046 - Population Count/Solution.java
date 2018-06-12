import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        System.out.printf("The population count of %d is %d.", num, populationCount(num));
    }

    public static int populationCount(int n) {
        return (n <= 0) ? 0 : ((n % 2 == 1) ? 1 : 0) + populationCount(n / 2);
    }
    
}
