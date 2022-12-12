public class Book {
    
    private static int copyCount = 0;
    private Author author;
    private String title;
    private int publicationYear;
    private String genere;
    private String ISBN;
    private int pages;
    private int currentPage;

    public Book(Author author, String title){
        this.author = author;
        this.title = title;
    }

    public static int getCopyCount() {
        return copyCount;
    }
    public static void setCopyCount(int copyCount) {
        Book.copyCount = copyCount;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void openOn(int page){
        this.currentPage = page;
    }

    public void close(){
        this.currentPage = 0;
    }

    public void nextPage(){
        if (this.currentPage < pages) {
            this.currentPage++;
        }
    }

    public void previousPage(){
        if (this.currentPage > 0) {
            this.currentPage--;
        }
    }
}
