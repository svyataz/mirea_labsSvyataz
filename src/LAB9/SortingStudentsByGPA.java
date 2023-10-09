package LAB9;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getStudentGPA() > o2.getStudentGPA()){
            return 1;
        } else if (o1.getStudentGPA() < o2.getStudentGPA()) {
            return -1;
        }
        return 0;
    }
    public Student[] quickSort(Student[] GPA_list, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = GPA_list[(leftMarker + rightMarker) / 2];
        do {
            //элемент больше pivot
            while (compare(GPA_list[leftMarker], pivot) > 0) {
                leftMarker++;
            }
            //элемент меньше pivot
            while (compare(GPA_list[rightMarker], pivot) < 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = GPA_list[leftMarker];
                    GPA_list[leftMarker] = GPA_list[rightMarker];
                    GPA_list[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(GPA_list, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(GPA_list, leftBorder, rightMarker);
        }
        return GPA_list;
    }
    public Student[] quickSort(Student[] GPA_list){
        return quickSort(GPA_list, 0, GPA_list.length - 1);
    }
}
