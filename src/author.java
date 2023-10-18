public class author {
    private String name;
    private String email;
    private char gender;


    public author(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public char getGender() { return gender; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
