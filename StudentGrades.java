import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Array to hold the marks
        int[] marks = new int[numberOfSubjects];
        
        // Loop to get marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.printf("Enter marks obtained in subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
            // Optional: Validate input mark to be between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks. Please enter again (between 0 and 100): ");
                marks[i] = scanner.nextInt();
            }
        }

        // Calculate total marks and average percentage
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        // Determine the grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("Total Marks: %d out of %d\n", totalMarks, numberOfSubjects * 100);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        // Close scanner resource
        scanner.close();
    }
}
