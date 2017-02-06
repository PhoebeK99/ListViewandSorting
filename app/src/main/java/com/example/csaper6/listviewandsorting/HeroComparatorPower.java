package com.example.csaper6.listviewandsorting;

import java.util.Comparator;

/**
 * Created by csaper6 on 1/23/17.
 */
public class HeroComparatorPower implements Comparator<Superhero> {
    @Override
    public int compare(Superhero hero1, Superhero hero2) {
        return hero1.getPower().length() - hero2.getPower().length();
    }
}
