import java.util.Scanner;


public class Main {
    static char gender;
    static String subGend;

    public static void main(String[] args) {


        String name;
        String mail;
        String gend;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Skriv in ditt namn: ");
        name = keyboard.nextLine();
        System.out.print("Skriv in din mail: ");
        mail = keyboard.nextLine();
        System.out.print("Skriv in ditt kön, M elr F: ");
        gend = keyboard.nextLine();


        System.out.println("Hello world!");

        author user1 = new author(name,mail,gender);
        System.out.println(user1);

        author hamood = new author("hamood", "hamood.habibi", 'M');
        System.out.println(hamood);

        write abc = new write("abc");
        System.out.println(abc);
    }

    public char toChar(String gend){
        if (gend.length() > 1){
            System.out.println("Input för lång, endast en bokstav");
            return 'ö';
        } else {
            subGend = String.valueOf(gend.indexOf(0,0));

            return gender;
        }
    }
}