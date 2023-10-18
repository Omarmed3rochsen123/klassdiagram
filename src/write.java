public class write{

    private String title;

    public write(String title){
        this.title = title;

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
                '}';
    }
}
