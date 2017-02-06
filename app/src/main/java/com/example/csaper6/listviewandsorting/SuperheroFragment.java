package com.example.csaper6.listviewandsorting;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by csaper6 on 1/19/17.
 */
public class SuperheroFragment extends ListFragment {
    private List<Superhero> heroes;
    public static final String EXTRA_NAME = "superhero name";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        //create our list of heroes
        heroes = new ArrayList<>();
        populateList();
        Collections.sort((List<Comparable>) new HeroComparatorPower());

        //fill the custom adapter
        HeroAdapter adapter = new HeroAdapter(getActivity(), heroes);

        //set the liesView's adapter
        setListAdapter(adapter);

        return rootView;
    }


    private void populateList() {
        heroes.add(new Superhero("Stapleman", "Can staple anything", 10));
        heroes.add(new Superhero("Stapleremoverman", "Can remove any staple", 205));
        heroes.add(new Superhero("Captain Sloth", "Can have algae grow on them during the wet season", 7));
        heroes.add(new Superhero("Nobel Prize Fixer", "They can go back in time and award the physics nobel prizes to the women who" +
                "deserved them but were denied them because sexism", 48));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Superhero s = (Superhero)l.getItemAtPosition(position);
        String name = s.getName();
        String power = s.getPower();
        int ranking = s.getRanking();
        Intent i = new Intent(getActivity(), SuperHeroActivity.class);
        i.putExtra(EXTRA_NAME, name);
    }
}
