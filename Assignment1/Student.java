package Assignment1;

class Student extends Person {
    private String StudentGrade;

    public Student(String Name, String Email, String StudentID, String StudentGrade) {
        super(Name, Email, StudentID);
        this.StudentGrade = StudentGrade;
    }

    public String toString() {
        return super.toString() + ". Grade: " + this.StudentGrade;
    }
}