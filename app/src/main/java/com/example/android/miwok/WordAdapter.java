package com.example.android.miwok;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourseId = -1;
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> words,int color) {
        super(context,0, words);
        mColorResourseId = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;

        if (listitemView== null){

            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView englishWord = (TextView) listitemView.findViewById(R.id.english);
        TextView miwokWord = (TextView) listitemView.findViewById(R.id.miwok);
        ImageView imageView = (ImageView) listitemView.findViewById(R.id.imag);

        englishWord.setText(currentWord.getmDefaultTranslation());
        miwokWord.setText(currentWord.getmMiwokTranslation());


        if(currentWord.hasImage()){

            imageView.setImageResource(currentWord.getmImageResourseId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listitemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourseId);
        textContainer.setBackgroundColor(color);
        return listitemView;
    }
}
