public class ContoBancario {
    public String numeroConto;
    public int saldo;

    public ContoBancario(String numeroConto, int saldo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }

    public void stampaSaldo() {
        System.out.println("il saldo attuale è : " + this.saldo);
    }

    public void depositoEPrelievoDenaro() {
        System.out.println("il numero di conto è : " + numeroConto);
        if (saldo != 0) {
            System.out.println("puoi prelevare");
        } else {
            System.out.println("non ci sono fondi da prelevare");
        }

    }
}