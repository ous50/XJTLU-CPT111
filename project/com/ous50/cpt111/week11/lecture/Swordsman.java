package com.ous50.cpt111.week11.lecture;

/**
 *
 * @author Erick.Purwanto
 */
public class Swordsman {

    private String name;
    private boolean alive;
    private int numDemonsKilled;
    private double healthPoint;

    private static int numSwordsman = 0;

    public Swordsman(String name) {
        this.name = name;
        alive = true;
        numDemonsKilled = 0;
        numSwordsman++;
        healthPoint = 100.0;
    }

    public Swordsman(String name, double healthPoint) {
        this(name);
        this.healthPoint = healthPoint;
    }

    public Swordsman(String name, int numDemonsKilled) {
        this(name);
        this.numDemonsKilled = numDemonsKilled;
    }

    public Swordsman() {
        this("Nameless");
    }

    public static int getNumSwordsman() {
        return numSwordsman;
    }

    public int getNumSwordsmanInst() {
        return numSwordsman;
    }

    public int getNumDemonsKilled() {
        return numDemonsKilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void killsDemon() {
        numDemonsKilled++;
    }

    public void killsDemon(int demonsKilled) {
        numDemonsKilled += demonsKilled;
    }

    public String toString() {
        String alive;
        if (this.alive) alive = "alive";
        else            alive = "dead";
        return "Swordsman " + name + " is " + alive + " and has killed " +
                numDemonsKilled + " demons";
    }

    public static boolean sameNumDemonsKilled(Swordsman s1, Swordsman s2) {
        return s1.numDemonsKilled == s2.numDemonsKilled;
    }

    public int attackDamage() {
        return 10 + 5 * numDemonsKilled;
    }

    public double receiveDamage(double damagePoint) {

        if (damagePoint <= 0.0)
            throw new IllegalArgumentException();

        healthPoint = healthPoint - damagePoint;
        if (healthPoint <= 0.0) {
            healthPoint = 0.0;
            alive = false;
        }
        return healthPoint;
    }

    public double receiveDamage() {
        return receiveDamage(0.1 * healthPoint);
    }

    public static void main(String[] args) {
        Swordsman tanjiro = new Swordsman("Tanjiro");
        tanjiro.killsDemon();
        // System.out.println(tanjiro);

        Swordsman zenitsu = new Swordsman("Zenitsu", 1);
        boolean sameKills = sameNumDemonsKilled(tanjiro, zenitsu);
        System.out.println(sameKills);

        //int numSwordsmanCreated = numSwordsman();
        //System.out.println(numSwordsmanCreated);

        System.out.println(getNumSwordsman());
        System.out.println(tanjiro.getNumSwordsmanInst());

    }
}
