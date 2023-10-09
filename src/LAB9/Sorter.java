package LAB9;

import java.util.Arrays;

public class Sorter {
    private Student[] Students;
    private int[] IDNumber;

    public Student[] getStudents() {
        return Students;
    }

    public void setStudents(Student[] Students) {
        this.Students = Students;
    }

    public Sorter(Student[] Students) {
        this.Students = Students;
    }

    public void createIDNumber() {
        IDNumber = new int[Students.length];
        for(int i = 0; i < Students.length; i++) {
            IDNumber[i] = Students[i].getStudent_id();
        }
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public Sorter() {
    }
    public void IDSorter(){
        int value;
        for (int left = 0; left < IDNumber.length; left++) {
            value = IDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < IDNumber[i]) {
                    IDNumber[i + 1] = IDNumber[i];
                } else {
                    break;
                }
            }
            IDNumber[i + 1] = value;
        }
    }

    @Override
    public String toString() {
        return "Sorter{" +
                "IDNumber=" + Arrays.toString(IDNumber) +
                '}';
    }
}
