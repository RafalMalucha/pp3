public class test {
    public static void main(String[] args) {
        Author a1 = new Author("borys", "karton");
        Book b1 = new Book(a1, "aaaa");
        System.out.println(b1.getAuthor().getName());
        System.out.println(b1.getAuthor().getSurname());
        System.out.println(b1.getTitle());
    }
}
