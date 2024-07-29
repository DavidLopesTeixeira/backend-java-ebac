package br.com.david.lopes;

import java.util.Scanner;

public class SolicitadorDeNotas {
    private static final int NOTAS_MINIMAS = 4;

    public int solicitaQuantidadeNotas(Scanner scanner) {
        int quantidadeNotas = 0;
        boolean entradaValida = false;
        System.out.println("Informe a quantidade de notas que deseja calcular (Mínimo 4)");

        while (!entradaValida) {
            if (scanner.hasNextInt()) {
                quantidadeNotas = scanner.nextInt();

                if(quantidadeNotas >= NOTAS_MINIMAS) {
                    entradaValida = true;
                } else {
                    System.out.println("A quantidade de notas aceita é 4. Tente novamente");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro");
                scanner.next();
            }
        }
        return quantidadeNotas;
    }
}
