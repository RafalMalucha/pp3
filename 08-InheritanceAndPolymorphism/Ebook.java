public class Ebook extends Book{

    private String fileName;

    public Ebook(String fileName, String title, String author) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display(){
        System.out.println(getAuthor() + " " + getTitle());
        System.out.println(fileName);
    }

}