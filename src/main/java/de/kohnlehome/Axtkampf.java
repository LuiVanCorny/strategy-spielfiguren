package de.kohnlehome;

public class Axtkampf implements Kampfart {


    @Override
    public void kaempfen() {
        System.out.println(this.getClass().getSimpleName());
    }
}
