package com.ous50.cpt111.week10.lecture;

/**
 *
 * @author Erick.Purwanto
 */
public class DemonSlayerCorps {

//    private Swordsman[] swordsmanTroop;
//
//    public DemonSlayerCorps() {
//
//    }

    public static void main(String[] args) {
        // Swordsman tanjiro = new Swordsman("Tanjiro");
        //tanjiro.name = "Inosuke";

//        Swordsman[] swordsmanTroop = new Swordsman[2];
//        swordsmanTroop[0] = new Swordsman("Tanjiro");
//        swordsmanTroop[1] = new Swordsman("Zenitsu", 1);
//
//        for (int i = 0; i < swordsmanTroop.length; i++) {
//            System.out.println(swordsmanTroop[i]);
//        }

        Swordsman[] swordsmanTroop = new Swordsman[3];
        swordsmanTroop[0] = new Swordsman("Tanjiro");
        swordsmanTroop[1] = new Pillar("Kyojuro", 10000, "Fire");
        swordsmanTroop[2] = new Successor("Kanao", "Shinobu");

        for (int i = 0; i < swordsmanTroop.length; i++) {
            System.out.println(swordsmanTroop[i]);
        }


    }
}
