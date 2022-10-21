public class book {
    
    //attributes
    String title;
    String author;
    String category;
    int pages;
    int currentPage;

    //methods
    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Category: "+category);
        System.out.println("Pages: "+pages);
        System.out.println("Current page: "+currentPage);
    };
    public void nextPage(){
        currentPage++;
    };
    public void previousPage(){
        currentPage--;
    };
    public static void main(String[] args) {
        book b1 = new book();
        b1.title = "ksiazka 1";
        b1.author = "autor 1";
        b1.category = "kategoria 1";
        b1.pages = 300;
        b1.currentPage = 0;

        book b2 = new book();
        b2.title = "ksiazka 2";
        b2.author = "autor 2";
        b2.category = "kategoria 2";
        b2.pages = 20;
        b2.currentPage = 0;

        b1.displayInfo();

        b2.displayInfo();

        b1.nextPage();
        b1.nextPage();
        b1.nextPage();

        b1.displayInfo();

        b1.previousPage();

        b1.displayInfo();
    }
}
