package br.com.david.lopes;

public class VerificadorDeSituacao {

    private static final double MEDIA_MINIMA_APROVACAO = 7.0;
    private static final double MEDIA_MINIMA_RECUPERACAO = 5.0;

    public String checarAprovado(double media) {
        int situacao;

        if (media >= MEDIA_MINIMA_APROVACAO) {
            situacao = 1;
        } else if (media >= MEDIA_MINIMA_RECUPERACAO) {
            situacao = 2;
        } else {
            situacao = 3;
        }

        switch (situacao) {
            case 1:
                return "Você foi aprovado";
            case 2:
                return  "Você ficou em recuperação";
            case 3:
                return "Você foi reprovado";
            default:
                return "Não sei oque dizer kk";
        }
    }
}
