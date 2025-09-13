package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;


    public void plantar(Batata batata) {
    this.batata = batata;
    }
    public void plantar(Cenoura cenoura) {
    this.cenoura = cenoura;
    }
    public void plantar(Morango morango) {
    this.morango = morango;
    }


    public void colher (Celeiro celeiro){

    }

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
