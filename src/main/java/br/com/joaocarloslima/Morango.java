package br.com.joaocarloslima;

public class Morango {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento = 4;

    public void crescer(){
        tempoDeVida += 1;
        if (tempoDeVida == tempoDeCrescimento){
            tamanho += 1;
            tempoDeCrescimento += 4;
        }

    }

    public boolean podeColher(){
        if (tamanho == 4){
            return true;
        }
        return false;
    }

    public String getImagem(){
        return "imagem/morango" + tamanho +".png";
    }

}
