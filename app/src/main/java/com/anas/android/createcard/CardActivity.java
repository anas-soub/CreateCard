package com.anas.android.createcard;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Locale;

/**
 * Craeted by Anas
 */
public class CardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        //Get references for  the TextViews
        TextView textViewTo = (TextView) CardActivity.this.findViewById(R.id.text_view_to);
        TextView textViewFrom = (TextView) CardActivity.this.findViewById(R.id.text_view_from);

        //Get the current local language of the system
        String lang = Locale.getDefault().getLanguage();
        Typeface typeface;//used to assign fontType to the TextViews
//        The font is selected from the assets based on the detected language
        if (lang.equals("ar")){ //if arabic
            typeface = Typeface.createFromAsset(getAssets(),"diwani_bent.ttf");
        }
        else{ //non arabic
            typeface = Typeface.createFromAsset(getAssets(),"itcblkad.ttf");
        }

        //set the typeface to the TextViews
        textViewFrom.setTypeface(typeface);
        textViewTo.setTypeface(typeface);
        //Get the names entered im MainActivity
        String toName = getIntent().getStringExtra("EXTRA_NAME_TO");
        String fromName = getIntent().getStringExtra("EXTRA_NAME_FROM");

        //set the text of TextViews
        textViewTo.setText(getString(R.string.happy_anniversary, toName));
        textViewFrom.setText(getString(R.string.from, fromName));


    }

}
