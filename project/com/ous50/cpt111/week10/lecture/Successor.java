package com.ous50.cpt111.week10.lecture;


/**
 *
 * @author Erick.Purwanto
 */
public class Successor extends Swordsman {

    private String apprenticedTo;

    public Successor(String name, String apprenticedTo) {
        super(name);
        this.apprenticedTo = apprenticedTo;
    }

    @Override
    public String toString() {
        return "Successor " + getName() + " apprenticed to " + apprenticedTo +
                " has killed " + getNumDemonsKilled() + " demons";
    }

}
