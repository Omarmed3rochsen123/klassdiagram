
import java.util.Scanner;

public class Main {

    static char[] genderArray = new char[1];
    static char gender;
    public static void main(String[] args) {


        int val = 9;

        String name;
        String mail;
        String genderInput;
        String title;
        String author;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Skriv in ditt namn: ");
        name = keyboard.nextLine();

        System.out.print("Skriv in din mail: ");
        mail = keyboard.nextLine();

        System.out.print("Skriv in ditt kön, M elr F: ");
        genderInput = keyboard.nextLine();
        toChar(genderInput);

        author user1 = new author(name,mail,gender);
        System.out.println(user1);


        System.out.println("Vad vill du göra nu?");
        while(val != 0){
            System.out.println("Skriv 1 för att skriva en ny bok");
            System.out.println("2 för att plugga programering");
            System.out.println("0 för att avsluta");
        switch (val){

            case 1 -> {
                System.out.print("Vad ska boken heta: ");
                title = keyboard.nextLine();

                book ett = new book(title, user1.getName());
            }
            case 0 -> {
                System.out.println("Hejdå");
            }
        }

        }


        author hamood = new author("hamood", "hamood.habibi", 'M');
        System.out.println(hamood);

        book okok = new book("okok", "hamood");
        System.out.println(okok);

        book abc = new book("abc", name);
        System.out.println(abc);
    }

    public static void toChar(String genderInput){

        if (genderInput.length() > 1){
            System.out.println("Input för lång, endast en bokstav");

        } else if (genderInput.equalsIgnoreCase("m") || genderInput.equalsIgnoreCase("f")) {

            genderArray[0] = genderInput.charAt(0);
            gender = genderArray[0];

        }
        else {
            System.out.println("Skriv endast M eller F");
        }
    }
}