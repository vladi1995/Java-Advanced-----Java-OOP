public class Student {
    private String studentName;
    private int studentAge;
    private double studentGrade;

    public Student(String studentName, int studentAge, double studentGrade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old. %s", this.studentName, this.studentAge, gradeAsString(this.studentGrade));
    }

    private String gradeAsString(double grade) {
        if (grade >= 5.00) {
            return "Excellent student.";
        } else if (grade >= 3.50) {
            return "Average student.";
        } else {
            return "Very nice person.";
        }
    }
}
