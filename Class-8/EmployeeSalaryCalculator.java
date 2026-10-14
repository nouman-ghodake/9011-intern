
public class EmployeeSalaryCalculator {

    // 1. Add two salary components
    static double calculateBasicSalary(double a, double b) {
        return a + b;
    }

    // 2. Calculate HRA (20% of basic salary)
    static double calculateHRA(double c) {
        double hra = c * 20 / 100;
        return hra;
    }

    // 3. Calculate bonus (10% of the given amount)
    static double calculateBonus(double d) {
        double bonus = d * 10 / 100;
        return bonus;
    }

    // 4. Calculate total salary before deduction
    static double totalSalary(double a, double b,
                              double c, double d, double e) {
        double basicSalary = calculateBasicSalary(a, b);
        double hra = calculateHRA(c);
        double bonus = calculateBonus(d);

        return basicSalary + hra + bonus + e;
    }

    // 5. Calculate final salary after 5% deduction
    static double calculateFinalSalary(double a, double b,
                                       double c, double d, double e) {
        double total = totalSalary(a, b, c, d, e);
        double deduction = total * 5 / 100;

        return total - deduction;
    }

    public static void main(String[] args) {
        double a = 10000;
        double b = 5000;
        double c = 15000;
        double d = 10000;
        double e = 2000;

        double total = totalSalary(a, b, c, d, e);
        double deduction = total * 5 / 100;
        double finalSalary =
                calculateFinalSalary(a, b, c, d, e);

        System.out.printf("Total Salary: %.2f%n", total);
        System.out.printf("Deduction: %.2f%n", deduction);
        System.out.printf("Final Salary: %.2f%n", finalSalary);
    }
}


//OUTPUT.....

Total Salary: 33000.00
Deduction: 1650.00
Final Salary: 31350.00
