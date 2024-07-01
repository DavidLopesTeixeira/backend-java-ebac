package br.com.david.lopes;

import java.util.Scanner;

public class CalculadoraMedias {

    public static void main(String[] args) {
        int quantidadeNotas =  quantNotas();
        double media = calcularMedia(quantidadeNotas);

        System.out.println("A média entre suas notas é " + media);

    }

    private static int quantNotas() {
        int quantidadeNotas;
        System.out.println("Informe a quantidade de notas que deseja calcular.");
        Scanner scanner = new Scanner(System.in);
        quantidadeNotas = scanner.nextInt();
        System.out.println(quantidadeNotas);

        while (quantidadeNotas < 4) {
            System.out.println("A quantidade mínima aceita é 4. Informe novamente.");
            quantidadeNotas = scanner.nextInt();
        }

        return quantidadeNotas;
    }

    private static double calcularMedia(int quantidadeNotas) {
        double[] notas = new double[quantidadeNotas];
        System.out.println("Insira as suas notas");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quantidadeNotas; i++){
            System.out.println("Nota: " + (i + 1));
            String input = scanner.next();

            if(input.contains(",")) {
                input = input.replace(",", ".");
                System.out.println("Nota corrigida" + input);
            }

            try {
                notas[i] = Double.parseDouble(input);
            }catch (NumberFormatException e) {
                System.out.println("Formato invalido, insira um número válido");
                i--;
            }

        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        scanner.close();
        return soma /quantidadeNotas;
    }

}
