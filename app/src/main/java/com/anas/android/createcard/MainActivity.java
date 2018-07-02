package com.anas.android.createcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createCardButton=(Button) findViewById(R.id.button_create_card);

        createCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextTo = (EditText) findViewById(R.id.edit_text_to);
                String toName = editTextTo.getText().toString();
                EditText editTextFrom = (EditText) findViewById(R.id.edit_text_from);
                String fromName = editTextFrom.getText().toString();

                Intent intent = new Intent(getBaseContext(), CardActivity.class);
                intent.putExtra("EXTRA_NAME_TO",toName);
                intent.putExtra("EXTRA_NAME_FROM",fromName);
                startActivity(intent);


            }
        });


    }

}


