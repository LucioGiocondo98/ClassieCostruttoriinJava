public class Libro {
    public String titolo;
    public String autore;
    public int numeroPagine;

    public Libro(String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public void stampaDettagli(){
        System.out.println("Titolo: " + this.titolo);
        System.out.println("Autore: " + this.autore);
        System.out.println("numeroPagine: "+ this.numeroPagine);
    }
}


