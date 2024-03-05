public class Student {
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
}
