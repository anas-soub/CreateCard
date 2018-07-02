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

        TextView textViewTo = (TextView) CardActivity.this.findViewById(R.id.text_view_to);
        TextView textViewFrom = (TextView) CardActivity.this.findViewById(R.id.text_view_from);
        String lang = Locale.getDefault().getLanguage();
        Log.v("CardActivity", "Language:" + lang);
        Typeface typeface;
        if (lang.equals("ar")){
            typeface = Typeface.createFromAsset(getAssets(),"diwani_bent.ttf");
        }
        else{
            typeface = Typeface.createFromAsset(getAssets(),"itcblkad.ttf");
        }
        textViewFrom.setTypeface(typeface);
        textViewTo.setTypeface(typeface);

        String toName = getIntent().getStringExtra("EXTRA_NAME_TO");
        String fromName = getIntent().getStringExtra("EXTRA_NAME_FROM");
        textViewTo.setText(getString(R.string.happy_anniversary, toName));
        textViewFrom.setText(getString(R.string.from, fromName));


    }

}
