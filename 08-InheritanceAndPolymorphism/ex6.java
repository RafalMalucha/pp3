import java.util.ArrayList;

class ex6 {
    public static void main(String[] args) {
        Book b1 = new Book("book1", "author1");

        Book e1 = new Ebook("ebook1.file", "ebook1", "author2");

        Book a1 = new Audiobook("audiobook1", "author3", 12, 15);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(e1);
        books.add(a1);

        books.get(0).display();
        books.get(1).display();
        books.get(2).display();
    }
}