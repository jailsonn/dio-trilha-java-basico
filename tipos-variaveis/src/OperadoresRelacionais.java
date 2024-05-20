/**
 * OperadoresRelacionais
 */
public class OperadoresRelacionais {

    // Operadores Relacionais, retornando um valor booleano(true ou false)
    // (==) Igual
    // (!=) Diferente
    // (>) Maior quer
    // (>=) Maior ou igual
    // (<) Menor quer
    // (<=) Menor ou igual

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 5;

        // String resultado = "";

        if (numero1 != numero2) {
            System.out.println("verdadeiro");
        }else {
            System.out.println("falso");
        }

        // Obs. para objetos usa o equals
        String nomeUm = "Jailson";
        // String nomeDois = "Jailson";
        String nomeDois = new String("Jailson");
        // System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
}