package de.kohnlehome;

public class Main {

    public static void main(String[] args) {
        Spielfigur spielfigur = new Spielfigur();
        spielfigur.setKampfart(new Axtkampf());
        spielfigur.tuwas();

        spielfigur.setKampfart(new Mentalkampf());
        spielfigur.tuwas();

        spielfigur.setKampfart(new Schwertkampf());
        spielfigur.tuwas();
    }
}
