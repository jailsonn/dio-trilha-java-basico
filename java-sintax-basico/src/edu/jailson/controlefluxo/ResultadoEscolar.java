public class ResultadoEscolar {

    public static void main(String[] args) {
        // Controle de fluxo composto
        // if e else
        // ou if else encadeados
        int nota = 10;

        // Não sei pq ele colocou o bloco condicional sem chaves
        if (nota >= 7) {
            System.out.println("Aprovado");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");

        } else {

            System.out.println("Reprovado");
        }
    }
}
