package com.anas.android.createcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get a reference to "Create Card" button
        buttonCreateCardClick();
        showHelpClick();
        hideHelpClick();


    }

    private void buttonCreateCardClick() {
        Button createCardButton=(Button) findViewById(R.id.button_create_card);
        //Button OnClickListener
        createCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get a reference to EditTexts
                EditText editTextTo = (EditText) findViewById(R.id.edit_text_to);
                EditText editTextFrom = (EditText) findViewById(R.id.edit_text_from);
                //Get the input names
                String toName = editTextTo.getText().toString();
                String fromName = editTextFrom.getText().toString();
                //Create an explicit intent to open the CardActivity
                Intent intent = new Intent(getBaseContext(), CardActivity.class);
                //send the input names as extra data
                intent.putExtra("EXTRA_NAME_TO", toName);
                intent.putExtra("EXTRA_NAME_FROM", fromName);

                //start the CardActivity
                startActivity(intent);
            }
        });
    }
    private void showHelpClick() {
        TextView showHelpTextView = (TextView) findViewById(R.id.text_view_show_help);
        // OnClickListener
        showHelpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView usageTextView = (TextView) findViewById(R.id.text_view_explain_usage);
                usageTextView.setVisibility(View.VISIBLE);
                v.setVisibility(View.GONE);
            }});

    }

    private void hideHelpClick() {
        TextView hideHelpTextView = (TextView) findViewById(R.id.text_view_hide_help);
        // OnClickListener
        hideHelpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView usageTextView = (TextView) findViewById(R.id.text_view_explain_usage);
                usageTextView.setVisibility(View.GONE);
                TextView showHelpTextView = (TextView) findViewById(R.id.text_view_show_help);
                showHelpTextView.setVisibility(View.VISIBLE);
            }});

    }


}


