package LAB2;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[]{new Book("Сергей Лукьяненко", "Ночной дозор", "фэнтези", "-" , 1998),
                 new Book("Маркус Зусзак", "Книжный вор", "роман", "роман воспитание" , 2005),
                 new Book("Владимир Набоков", "Приглашение на казнь", "роман", "-" , 1935)};
        Bookshelf bookshelf = new Bookshelf(books);
        System.out.println(bookshelf.MaxShelf().getYear());
        System.out.println(bookshelf.MinShelf().getYear());
        bookshelf.shelf_sort();
        System.out.println(bookshelf.getShelf()[0].getYear());
    }
}
