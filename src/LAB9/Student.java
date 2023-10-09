package LAB9;
public class Student implements Comparable<Student>{
    private int student_id;
    private double studentGPA;
    public int getStudent_id() {
        return student_id;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Student(int student_id, double studentGPA) {
        this.student_id = student_id;
        this.studentGPA = studentGPA;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        return this.student_id - o.student_id;
    }

}
