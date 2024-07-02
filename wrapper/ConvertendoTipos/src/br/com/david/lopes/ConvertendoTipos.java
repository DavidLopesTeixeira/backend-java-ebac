package br.com.david.lopes;

import java.util.Scanner;

public class ConvertendoTipos {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número:");
            int num1 = scanner.nextInt();
            Integer num2 = Integer.valueOf(num1);
            System.out.println("O valor convertido é: " + num2);
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível fazer a conversão " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}
