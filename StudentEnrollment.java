import java.util.Scanner;

public class StudentEnrollment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Number of Units : ");
        int numberOfUnits = scanner.nextInt();

        // Validate number of units
        if (numberOfUnits > 10) {
            System.out.println("Maximum number of units is 10.");
            return;
        }

        // Compute Fee
        int feePerUnit = 1000;
        int totalFee = numberOfUnits * feePerUnit;

        // Student's name and total enrollment fee
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        // Payment process
        System.out.print("Enter Payment Amount: ");
        int paymentAmount = scanner.nextInt();

        // Payment status
        if (paymentAmount == totalFee) {
            System.out.println("Fully Paid");
        } else if (paymentAmount < totalFee) {
            System.out.println("Partial Payment: " + paymentAmount);
        } else {
            System.out.println("Overpayment: " + (paymentAmount - totalFee));
        }

        scanner.close();
    }
}
