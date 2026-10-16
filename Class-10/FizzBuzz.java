
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
      
// FIZZBUZZ Task
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

      // 1. Take a num = ...
      // 2. if num is fully divisible by 3 print : FIZZ
      // 3. if num is fully divisible by 5 print : BUZZ
      // 4. if is fully divvisible by 5 & 3 both print : FIZZBUZZ
      // 5. if num is not divisible by 5 nor 3 print : "OM PHAT SWAHA"

      
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FIZZBUZZ");
        }
        else if (num % 3 == 0) {
            System.out.println("FIZZ");
        }
        else if (num % 5 == 0) {
            System.out.println("BUZZ");
        }
        else {
            System.out.println("OM PHAT SWAHA");
        }

        sc.close();
    }
}
