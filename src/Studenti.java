public class Studenti {
    public String nome;
    public String cognome;
    public int []listaVoti;
      public Studenti(String nome,String cognome){
          this.nome= nome;
          this.cognome= cognome;
          this.listaVoti= new int[5];

      }
      public void stampaDettagli(){
          System.out.println("lo studente : " + this.nome + " " + this.cognome );
          System.out.print("Voti: ");
          for (int voto : listaVoti) {
              System.out.print(voto + " ");
          }
          System.out.println();
          System.out.println("media voti:" + calcolaMedia());
      }
public int calcolaMedia(){
          int somma = 0;
          int count = 0;
    for (int voto : listaVoti) {
        if (voto != 0) {
            somma += voto;
            count++;
        }
    }
    if (count == 0) {
        return 0;
    }
    return somma / count;
}

}



