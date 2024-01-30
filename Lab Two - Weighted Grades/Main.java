import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter Point Total:");
        double pointTotal = scanner.nextDouble();

        System.out.println("Enter Earned Points:");
        double earnedPoints = scanner.nextDouble();

        System.out.println("Enter Assignment Percentage");
        double assignmentPercentage = scanner.nextDouble();

        // Create an instance of GradeWeightCalculator
        GradeWeightCalculator gradeCalculator = new GradeWeightCalculator(pointTotal, earnedPoints, assignmentPercentage);

        // Calculate total weighted grade
        gradeCalculator.calculateTotalWeightedGrade();

        // Display the total weighted grade
        System.out.println("Total Weighted Grade: " + gradeCalculator.getTotalWeightedGrade());

        scanner.close();
    }
}
