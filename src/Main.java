import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //    String a = "Pera";     //main je izvrsna metoda a ova varijabla je lokalna
        //zbog ovog ispod imamo prazan konstruktor tamo u klasi student

        Student student = new Student(); // new Sudent-----> je pokazivac na mesto u memoriji
        //pravimo objekat neke klase //Student() - konstruktor - ovo je prazan konstruktor Student()
        // Student - slozen tip podatka (koja je objekat), student - varijabla (u koju smo stavili nas objekat),
        student.ime = "Laza";  //objekat (student ovaj gore orvi) koji je pozvao varijablu
        student.prezime = "Lazic"; //objekat (student) koji je pozvao varijablu
        student.godine = 20;    //objekat (student) koji je pozvao varijablu
        System.out.println(student.ime + " " + student.prezime +" "+ student.godine);

        // pravimo preko onog konstruktora sto nije prazan:
        Student student1 = new Student("John", "Smith", 21);
        Student student2 = new Student("John", "Smith", 19);
        Student student3 = new Student("Zana","Arezina");
        Student student4 = new Student("Pera", "Peric", "117/08");
        System.out.println("proba: " + student1.toString());

        Student.godine =18;         //S veliko, klasa Student, godine static, vazi i setuje se za sve objekte te klase
        System.out.println("Ispisi preko petlje i niza: ");
        Student niz [] = new Student[] {student1,student2,student3,student4};
        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }

        System.out.println(student1);
        System.out.println(student4);
        student4.ispis2();
        System.out.println("ispisi metodom ispis 2: " + student4.ispis2());


        student1.zbirDvaBroja(5,6); // void pa ispise //ovo nema nikakve veze sa objektom student, nema smisla
        Student.zbirDvaBroja(9,9);
        Student.zbirDvaBroja(2,3); // zatrazim ispit preko klase Student a ne objekta student zato sto je static metoda
        Student.zbirDvaBroja2(3,6);  // nista ne ispise metoda nije void, nego vraca vrednost koju moramo da ubacimo u varijablu
        System.out.println(Student.zbirDvaBroja2(9,9));  //sad ispise

        int sum = student.zbirDvaBroja2(22,2); //nije void i stavljamo u varijablu

        System.out.println("zbir dva broja druga metoda: " + sum);

        student.ispis(); // ispise lepo posto je metoda ispis void

        student1.ispis2(); //ne ispise nista nije void, mora u varijablu da se smesti
        String ispis2 = student1.ispis2(); // nema void nego podatke koji su STRING moramo u varijablu da ubacimo
        System.out.println("Ispis2: " + ispis2); // i sad ispis varijablje koja ima vrednost





//        Scanner sc= new Scanner(System.in);
//        System.out.println("unesi broj godina: ");
//        int godine = sc.nextInt();
//        System.out.println("broj godina: " + godine);
//nesto
    }
}