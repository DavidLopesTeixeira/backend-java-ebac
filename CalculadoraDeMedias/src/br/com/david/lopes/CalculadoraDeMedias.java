package br.com.david.lopes;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SolicitadorDeNotas solicitadorDeNotas = new SolicitadorDeNotas();
        int quantidadeNotas = solicitadorDeNotas.solicitaQuantidadeNotas(scanner);

        CalculadorDeMedia calculadorDeMedia = new CalculadorDeMedia();
        double media = calculadorDeMedia.calculaMedia(scanner, quantidadeNotas);

        VerificadorDeSituacao verificadorDeSituacao = new VerificadorDeSituacao();
        String situacao = verificadorDeSituacao.checarAprovado(media);

        System.out.println("A media entre as suas notas foi " + media + ". " + situacao);
        scanner.close();
    }

}
