package com.example.android.miwok;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    ListView gridView;


    public ColorsFragment() {

    }


    public static ColorsFragment newInstance(String param1, String param2) {
        ColorsFragment fragment = new ColorsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_general, container, false);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti",R.drawable.color_black));
        words.add(new Word("two","ottiko",R.drawable.color_brown));
        words.add(new Word("three","toolosku",R.drawable.color_dusty_yellow));
        words.add(new Word("four","oyyisa",R.drawable.color_gray));
        words.add(new Word("five","massoka",R.drawable.color_green));
        words.add(new Word("six","temmokka",R.drawable.color_mustard_yellow));
        words.add(new Word("seven","kenekaku",R.drawable.color_red));
        words.add(new Word("eight","kawinta",R.drawable.color_white));
        words.add(new Word("nine","wo'e",R.drawable.color_brown));
        words.add(new Word("ten","na'aacha",R.drawable.color_brown));

        WordAdapter wordAdapter = new WordAdapter(getActivity(),words,R.color.category_numbers);
        gridView = (ListView) rootView.findViewById(R.id.list);
        gridView.setAdapter(wordAdapter);

        return rootView;
    }


}
