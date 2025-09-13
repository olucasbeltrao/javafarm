package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos = new ArrayList<>();
    private Celeiro celeiro;

    public Fazenda() {

        for (int x = 1;x <= 13;x++){
            int y = 1;
            Terreno terreno = new Terreno(x,y);
            y++;
            terrenos.add(terreno);
        }
    }
    public int plantarBatata(int x, int y){
    if (celeiro.getQtdeBatatas() > 0)
    }
    public int plantarCenoura(int x, int y){

    }
    public int plantarMorango(int x, int y){

    }

    public Terreno getTerreno(int x, int y){

    }

    public colher(int x, int y){

    }

    public Celeiro getCeleiro() {
        return Celeiro;
    }
}

