public class GradeWeightCalculator {
    private double pointTotal;
    private double earnedPoints;
    private double assignmentPercentage;
    private double totalWeightedGrade;

    // Constructor
    public GradeWeightCalculator(double pointTotal, double earnedPoints, double assignmentPercentage) {
        this.pointTotal = pointTotal;
        this.earnedPoints = earnedPoints;
        this.assignmentPercentage = assignmentPercentage;
    }

    // Method to calculate total weighted grade
    public void calculateTotalWeightedGrade() {
        this.totalWeightedGrade = (earnedPoints / pointTotal) * assignmentPercentage;
    }

    // Getter for total weighted grade
    public double getTotalWeightedGrade() {
        return totalWeightedGrade;
    }
}
