package edu.jailson.operadores;
public class OperadoresLogicos {
    // Operadores lógicos
    // (e, End, &&) Todos os valores precisam serem verdadeiros
    // (OU, OR, ||) Apenas um ou mais de um, (porem nao toddos), valor precisa ser
    // verdadeiro
    // (Not !) Operador de negação, inverte o valor da operação

    // Babela verdade dos Operadores Lógicos
    // E ou && Todas as opções precisam serem verdadeiras para saida verdade
    // v | V | V
    // v | F | F
    // F | V | F
    // F | F | F

    // OU ou || Apenas uma precisa ser verdadeira, para saida verdade
    // V | V | V
    // V | F | V
    // F | V | V
    // F | F | F

    // Not ou ! Invert o valor.
    // V | F
    // F | V

    // Operador de Atribuição
    // (=)

    public static void main(String[] args) {
        int nota = 10;
        // int trabalho = 7;

        if (nota >= 6 && nota <= 10) {
            System.out.println("Aluno: Aprovado");
        } else if (nota > 10 || nota < 0) {
            System.out.println("Esta Nota não Existe");
        } else {
            System.out.println("Aluno: Reprovado");
        }
    }
}
