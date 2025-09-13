package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 15;
    private int qtdeBatatas;
    private int qtdeMorangos;
    private int qtdeCenouras;

    public void armazenarBatata (){
        boolean verificacao = celeiroCheiro();

        if (verificacao == false){
            qtdeBatatas += 2;
        } else {
            throw new RuntimeException("Celeiro cheio");
        }
    }
    public void armazenarMorango (){
        boolean verificacao = celeiroCheiro();

        if (verificacao == false){
            qtdeMorangos += 2;
        } else {
            throw new RuntimeException("Celeiro cheio");
        }
    }
    public void armazenarCenoura (){
        boolean verificacao = celeiroCheiro();

        if (verificacao == false){
            qtdeCenouras += 2;
        } else {
            throw new RuntimeException("Celeiro cheio");
        }
    }

    public void consumirBatata () {
        if (qtdeBatatas > 0) {
            qtdeBatatas -= 1;
        }else {
            throw new RuntimeException("Sem batatas para consumir");
        }
    }
    public void consumirMorango () {
        if (qtdeMorangos > 0) {
            qtdeMorangos -= 1;
        }else {
            throw new RuntimeException("Sem morangos para consumir");
        }
    }
    public void consumirCenoura () {
        if (qtdeCenouras > 0) {
            qtdeCenouras -= 1;
        }else {
            throw new RuntimeException("Sem cenouras para consumir");
        }
    }

    public int getEspacoDisponivel (){
        int espacoDisp = (qtdeBatatas + qtdeMorangos + qtdeCenouras) - capacidade;
        return espacoDisp;
    }

    public double getOcupacao (){
        double espacoOcup = (qtdeBatatas + qtdeCenouras + qtdeMorangos) / capacidade;
        return espacoOcup;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public boolean celeiroCheiro(){
        boolean celeiroMaximo = false;

        if (getEspacoDisponivel() == 0) {celeiroMaximo = true;}
        return celeiroMaximo;
    }
}
