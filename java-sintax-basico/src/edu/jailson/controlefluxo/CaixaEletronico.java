public class CaixaEletronico {
    public static void main(String[] args) {
        // Controle de fluxo simples, apenas verdade
        // apenas o if, ou sim ou não
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

        }
        System.out.println(saldo);
    }
}
