package br.com.joaocarloslima;

public class Morango {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento = 5;

    public void crescer(){
        tempoDeVida += 1;
        if (tempoDeVida == tempoDeCrescimento) {
            tamanho += 1;
            tempoDeCrescimento += 5;
        }
    }

    public boolean podeColher(){
        boolean validacao = false;
    if (tamanho == 4){validacao = true;}
    return validacao;
    }

    public String getImagem(){
        return "images/morango" + tamanho + ".png";
    }

}
