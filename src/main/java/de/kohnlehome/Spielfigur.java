package de.kohnlehome;

public class Spielfigur {
    private Kampfart kampfart;

    public void setKampfart(Kampfart kampfart) {
        this.kampfart = kampfart;
    }

    public void tuwas(){
        kampfart.kaempfen();
    }
}
