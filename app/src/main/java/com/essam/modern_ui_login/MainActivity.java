package com.essam.modern_ui_login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    private TextView sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up = findViewById(R.id.register);

        final EditText editText = findViewById(R.id.ue);
        final RelativeLayout e = findViewById(R.id.e1);
        final RelativeLayout e2 = findViewById(R.id.e2);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                e.setBackgroundColor(getColor(R.color.orignal));
                e2.setBackgroundColor(getColor(R.color.orignal));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Button button = findViewById(R.id.s_in);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {

                    e.setBackgroundColor(Color.RED);
                    e2.setBackgroundColor(Color.RED);
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(R.id.ue));
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(R.id.p));

                } else {
                    Toast.makeText(getApplicationContext(), "Welcome" + editText.getText().toString(), Toast.LENGTH_LONG).show();

                }
            }
        });


        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SIgnupActivity.class);
                startActivity(intent);
            }
        });
    }
}
