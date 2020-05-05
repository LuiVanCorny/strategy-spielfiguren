package de.kohnlehome;

public class Schwertkampf implements Kampfart {
    @Override
    public void kaempfen() {
        System.out.println(this.getClass().getSimpleName());
    }
}
