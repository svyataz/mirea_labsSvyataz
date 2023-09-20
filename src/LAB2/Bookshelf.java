package LAB2;
import java.util.Arrays;
import java.util.Comparator;
public class Bookshelf {
    private Book[] shelf;

    public Bookshelf( Book[] shelf) {
        this.shelf = shelf;
    }

    public Book[] getShelf() {
        return shelf;
    }

    public void shelf_sort(){
        Arrays.sort(shelf, Comparator.comparing(Book::getYear));
    }

    public Book MaxShelf() {
        int max = shelf[0].getYear();
        Book buff = shelf[0];
        for (int i = 0; i < shelf.length; i++) {
            if (max < shelf[i].getYear()){
                max = shelf[i].getYear();
                buff = shelf[i];
            }
        }
        return buff;
    }

    public Book MinShelf() {
        int min = shelf[0].getYear();
        Book buff = shelf[0];
        for (int i = 0; i < shelf.length; i++) {
            if (min > shelf[i].getYear()){
                min = shelf[i].getYear();
                buff = shelf[i];
            }
        }
        return buff;
    }
}
