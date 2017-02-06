package com.example.csaper6.listviewandsorting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by csaper6 on 1/19/17.
 */
public class HeroAdapter extends ArrayAdapter<Superhero> {
    public HeroAdapter(Context context, List<Superhero> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //if not given a vew, we need to make one
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_hero, null);
        }
        Superhero hero = getItem(position);
        TextView nameText = (TextView) convertView.findViewById(R.id.text_name);
        TextView namePower = (TextView) convertView.findViewById(R.id.text_power);
        TextView nameRank = (TextView) convertView.findViewById(R.id.text_rank);

        nameText.setText(hero.getName());
        namePower.setText(hero.getPower());
        nameRank.setText("" + hero.getRanking());

        return convertView;
    }
}
