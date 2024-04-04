import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //    String a = "Pera";
        //zbog ovog ispod imamo prazan konstruktor tamo u klasi student

        Student student = new Student(); // new Sudent-----> je pokazivac na mesto u memoriji
        //pravimo objekat neke klase //Student() - konstruktor - ovo je prazan konstruktor Student()
        // Student - slozen tip podatka (koja je objekat), student - varijabla (u koju smo stavili nas objekat),

        student.ime = "Laza";
        student.prezime = "Lazic";
        student.godine = 20;
        System.out.println(student.ime + " " + student.prezime +" "+ student.godine);

        // pravimo preko onog konstruktora sto nije prazan:
        Student student1 = new Student("John", "Smith", 21);
        Student student2 = new Student("John", "Smith", 19);
        Student student3 = new Student("Zana","Arezina");
        Student student4 = new Student("Pera", "Peric", "117/08");
        System.out.println(student1);
        System.out.println(student4);
        student4.ispis2();
        System.out.println("ispisi metodom ispis 2: " + student4.ispis2());


        student.zbirDvaBroja(2,3);
        student1.zbirDvaBroja(5,6);


        int sum = student.zbirDvaBroja2(22,2);
        System.out.println("zbir dva broja druga metoda: " + sum);


        student.ispis(); // ispise lepo posto je metoda ispis void

        student1.ispis2(); //ne ispise nista nije void
        String ispis2 = student1.ispis2(); // nema void nego podatke koji su STRING moramo u varijablu da ubacimo
        System.out.println("Ispis2: " + ispis2); // i sad ispis varijablje koja ima vrednost





//        Scanner sc= new Scanner(System.in);
//        System.out.println("unesi broj godina: ");
//        int godine = sc.nextInt();
//        System.out.println("broj godina: " + godine);
//nesto
    }
}