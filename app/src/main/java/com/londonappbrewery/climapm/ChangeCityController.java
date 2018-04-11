package com.londonappbrewery.climapm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);

        final EditText editTextField = findViewById(R.id.queryET);
        ImageButton backButton = findViewById(R.id.backButton);
        Button okButton = (Button) findViewById(R.id.okButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        editTextField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//
//                String newCity = editTextField.getText().toString();
//                Intent newCityIntent = new Intent(ChangeCityController.this, WeatherController.class);
//
//                // Adds what was entered in the EditText as an extra to the intent.
//                newCityIntent.putExtra("City", newCity);
//
//                // We started this activity for a result, so now we are setting the result.
//                setResult(Activity.RESULT_OK, newCityIntent);
//
//                // This destroys the ChangeCityController.
//                finish();
//                return true;
//            }
//        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newCity = editTextField.getText().toString();
                Intent newCityIntent = new Intent(ChangeCityController.this, WeatherController.class);

                // Adds what was entered in the EditText as an extra to the intent.
                newCityIntent.putExtra("City", newCity);

                // We started this activity for a result, so now we are setting the result.
                setResult(Activity.RESULT_OK, newCityIntent);

                // This destroys the ChangeCityController.
                finish();
            }
        });
    }
}
