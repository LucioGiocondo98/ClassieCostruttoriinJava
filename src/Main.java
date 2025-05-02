//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Libro reperunanotte = new Libro("Re per una notte", "Martin Scorsese", 100);
Libro rosemarysbaby = new Libro("Rosemary's Baby", "Roman Polanski", 207);
  reperunanotte.stampaDettagli();
  rosemarysbaby.stampaDettagli();

    ContoBancario diLucio = new ContoBancario("2777L367990008",0);
    ContoBancario diLucionona0 = new ContoBancario("284748938l73939", 56);

    diLucio.stampaSaldo();
            diLucio.depositoEPrelievoDenaro();
            diLucionona0.stampaSaldo();
            diLucionona0.depositoEPrelievoDenaro();
    }
    }
