public class book{

    private String title;
    private String author;

    public book(String title, String author){
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "write{" +
                "title='" + title + '\'' +
                "author= "+ author +
                '}';
    }
}
