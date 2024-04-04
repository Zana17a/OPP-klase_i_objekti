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

        student.zbirDvaBroja(2,3);
        student.ispis();
        student1.ispis();
        student1.zbirDvaBroja(5,6);


//        Scanner sc= new Scanner(System.in);
//        System.out.println("unesi broj godina: ");
//        int godine = sc.nextInt();
//        System.out.println("broj godina: " + godine);
//nesto
    }
}