package br.com.david.lopes;

import java.util.Scanner;

public class CalculadorDeMedia {

    public double calculaMedia(Scanner scanner, int quantidadeNotas) {
        double[] notas = new double[quantidadeNotas];
        System.out.println("Insira aqui as suas notas (use ponto como separador decimal)");

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Nota " + (i + 1) + ";");
            boolean notaValida = false;

            while (!notaValida) {
                String input = scanner.next();

                if (input.contains(",")) {
                    input = input.replace(",", ".");
                }

                try {
                    notas[i] = Double.parseDouble(input);
                    notaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("O tipo de dado informado é invalido. Por favor insira um número valido");
                }
            }

        }
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / quantidadeNotas;
    }

}
