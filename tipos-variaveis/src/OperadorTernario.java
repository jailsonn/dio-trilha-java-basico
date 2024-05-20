public class OperadorTernario {
    // Operador Ternario
    // <lógica> ? verdade : falso

    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        // String resultado = "";
        // Condicional
        /*
         * if (a <= 6) {
         * resultado = "verdadeiro";
         * } else
         * resultado = "falso";
         */

        // ternario
        String resultado = a != b ? "verdadeira" : "falso";

        System.out.println(resultado);
    }
}
