public class Student {
    //polja
    String ime;
    String prezime;
    int godine;
    String indexNum;

    //konstruktori - mehanizam za kreiranje objekata (uvek nosi isto ime kao klasa)
    public Student(){        //prazan konstruktor da bi kreirao Student() tamo u primeru za student (uvek nosi isto ime kao klasa)
        System.out.println("Poziv  praznog konstruktora: ");
    }  //prazan konstruktor Student()
    public Student(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        System.out.println("Poziv konstruktora sa 3 parametra: " + ime +" "+ prezime+ " " + godine);
    }
    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        System.out.println("Poziv konstruktora sa 2 parametra: " + ime +" "+ prezime);
    }

    // metode (funkcije) - ono sto objekat moze da radi, odnosno izvrsava
    public void ispis(){
        System.out.println("Ispis iz klase Student.");
    }

    public String ispis2(){
        return "Student{" + "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", indexNum='" + indexNum + '\'' +
                '}';
    }
    public void zbirDvaBroja (int a, int b){            //zbog void mogu da isprintam reziltat ali ne mogu da ga smestim u varijablu
        System.out.println("Zbir dva broja: " + (a + b));
    }

    public int zbirDvaBroja2  (int a, int b) {      //ovo mogu da spakujem u varijablu sum
        return a + b;
        }
    public Student(String ime, String prezime, String indexNum) {
        this.ime = ime;
        this.prezime = prezime;
        this.indexNum = indexNum;
        System.out.println("Poziv konstruktora sa 3 parametra: " + ime +" "+ prezime + " " + indexNum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", indexNum='" + indexNum + '\'' +
                '}';
    }

}

