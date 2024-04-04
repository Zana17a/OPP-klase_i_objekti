public class Student {
    //polja
    String ime;
    String prezime;
    int godine;

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
    public void zbirDvaBroja (int a, int b){
        System.out.println("Zbir dva broja: " + (a + b));
    }

}

