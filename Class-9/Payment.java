import java.util.Scanner;

public class Payment {
    public static void main(String[] args){

        double balance = 5000 ;
        System.out.println("Welcome To NG Pay..");
        
        Scanner sc = new Scanner(System. in);

        // PAISA --
        
        // 1. shop for some amount if amount is exceeding from current blance, show : Insufficient Balanace
        // 2. if amount is not execeeding the current balance , show : Payment Success
        // 3. if the amount is passed in negative show
        // 4. amount == balance , do payment but print a message : "Account Khali HO Gaya Hain"

        System.out.println("Enter an amount : ");

        double amount = sc.nextDouble(); 
        sc.close();

        if (amount >= 0) {

            if (amount > balance){
            System.out.println("Insufficient Balanace");
        }
        else if (amount == balance){
            System.out.println("Pyment Successfull, par bhai 1 raaz ki baat batatahu,  Account Khali ho Gaya Hain");
        }
        else {
            System.out.println("Payment Success");
        }
            
        } else {
            System.out.println("Invalid amount");
        }
        

    }


}
