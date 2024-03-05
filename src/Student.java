import java.util.Scanner;

public class Student
{
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    public void addExtraActivity(int index, String activity) {
        if (index >= 0 && index < extraActivities.length) {
            extraActivities[index] = activity;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Student Name: ").append(studentName).append("\n");
        sb.append("Extra Activities:\n");
        for (int i = 0; i < extraActivities.length; i++) {
            sb.append(i + 1).append(". ").append(extraActivities[i]).append("\n");
        }
        return sb.toString();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Details Entry System!");

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1));
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the number of extra activities: ");
            int numExtraActivities = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Student student = new Student(studentID, studentName, numExtraActivities);

            for (int j = 0; j < numExtraActivities; j++) {
                System.out.print("Enter extra activity " + (j + 1) + ": ");
                String activity = scanner.nextLine();
                student.addExtraActivity(j, activity);
            }

            students[i] = student;
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":\n" + students[i]);
        }
    }
}
