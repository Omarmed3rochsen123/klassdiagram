public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        author emil = new author("emil","emil.emilson",'M');
        System.out.println(emil.getName());
        System.out.println(emil);

        author hamood = new author("hamood", "hamood.habibi", 'M');
        System.out.println(hamood);
    }
}