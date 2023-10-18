import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        String mail;
        char gend;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Skriv in ditt namn: ");
        name = keyboard.nextLine();
        System.out.print("Skriv in din mail: ");
        mail = keyboard.nextLine();
        System.out.print("Skriv in ditt kön, M elr F: ");



        System.out.println("Hello world!");

        author user1 = new author(name,mail,'M');
        System.out.println(user1);

        author hamood = new author("hamood", "hamood.habibi", 'M');
        System.out.println(hamood);

        write abc = new write("abc");
        System.out.println(abc);
    }
}