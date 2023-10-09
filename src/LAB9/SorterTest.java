package LAB9;

public class SorterTest {
    public static void main(String[] args){
        Student[] Students = new Student[]{new Student(16232, 4.5), new Student(45670, 5.0), new Student(23455, 3.2),
                new Student(32676, 4.7), new Student(78875, 4.8), new Student(12732, 3.7),
                new Student(76583, 4.2), new Student(65643, 3.7), new Student(73453, 4.3)};
        Sorter sortForStudents = new Sorter(Students);
        sortForStudents.createIDNumber();
        sortForStudents.IDSorter();
        System.out.println(sortForStudents.toString());
        SortingStudentsByGPA testSortForStudents = new SortingStudentsByGPA();
        Students = testSortForStudents.quickSort(Students);
        for(int i = 0; i < Students.length; i++){
            System.out.println(Students[i].getStudentGPA() + " StudentID: " + Students[i].getStudent_id());
        }
    }
}
