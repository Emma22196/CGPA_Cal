public class Course {
    private String courseName;
    private int courseUnit;
    private int score;
    private char grade;
    private int gradeUnit;

    public Course(String courseName, int courseUnit, int score) {
        this.courseName = courseName;
        this.courseUnit = courseUnit;
        this.score = score;
        calculateGradeAndUnit();
    }

    private void calculateGradeAndUnit() {
        if (score >= 70) {
            grade = 'A';
            gradeUnit = 5;
        } else if (score >= 60) {
            grade = 'B';
            gradeUnit = 4;
        } else if (score >= 50) {
            grade = 'C';
            gradeUnit = 3;
        } else if (score >= 45) {
            grade = 'D';
            gradeUnit = 2;
        } else if (score >= 40) {
            grade = 'E';
            gradeUnit = 1;
        } else {
            grade = 'F';
            gradeUnit = 0;
        }
    }

    public void displayCourseInfo() {
        double gradePoints = getGradePoints();
        System.out.printf("%-20s | %-12s | %-5c | %-12d%n",
                courseName, courseUnit, grade, gradeUnit);
    }

    public double getGradePoints() {
        return gradeUnit * courseUnit;
    }

    public int getCourseUnit() {
        return courseUnit;
    }
}