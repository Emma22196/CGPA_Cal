import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); 

        Course[] courses = new Course[numCourses];

        // Input for each course
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter the Course Code " + (i + 1) + ": ");
            String courseName = scanner.nextLine();

            System.out.print("Enter the course unit for " + courseName + ": ");
            int courseUnit = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your Score for " + courseName + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); 

            courses[i] = new Course(courseName, courseUnit, score);
        }

        // Result Header Display
        System.out.printf("%-20s | %-12s | %-5s | %-15s%n",
                "Course & Code", "Course Unit", "Grade", "Grade-Units");
        System.out.println("-".repeat(55));

        // Calculate GPA and display
        double totalGradePoints = 0;
        int totalCourseUnits = 0;

        for (Course course : courses) {
            course.displayCourseInfo();
            totalGradePoints += course.getGradePoints();
            totalCourseUnits += course.getCourseUnit();
        }

        if (totalCourseUnits > 0) {
            double gpa = totalGradePoints / totalCourseUnits;
            System.out.printf("%nTotal GPA: %.2f%n", gpa);
        } else {
            System.out.println("\nTotal GPA: N/A (No courses provided)");
        }
    }
}
