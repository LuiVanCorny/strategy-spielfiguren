package de.kohnlehome;

public class Mentalkampf implements Kampfart {
    @Override
    public void kaempfen() {
        System.out.println(this.getClass().getSimpleName());
    }
}
