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

public class SIgnupActivity extends AppCompatActivity {

    private TextView log_in;
    private RelativeLayout b;
    private RelativeLayout b1;
    private RelativeLayout b2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_ignup);

        b = findViewById(R.id.name_b);
        b1 = findViewById(R.id.name_b1);
        b2 = findViewById(R.id.name_b2);
        editText = findViewById(R.id.uname);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                b.setBackgroundColor(getColor(R.color.orignal));
                b1.setBackgroundColor(getColor(R.color.orignal));
                b2.setBackgroundColor(getColor(R.color.orignal));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        log_in = findViewById(R.id.log_in);

        Button button = findViewById(R.id.sign);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    b.setBackgroundColor(Color.RED);
                    b1.setBackgroundColor(Color.RED);
                    b2.setBackgroundColor(Color.RED);
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(R.id.uname));
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(R.id.email_));
                    YoYo.with(Techniques.Swing)
                            .duration(700)
                            .repeat(1)
                            .playOn(findViewById(R.id.pass));
                } else {
                    Toast.makeText(getApplicationContext(), "Welcome" + editText.getText().toString(), Toast.LENGTH_LONG).show();

                }
            }
        });

        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SIgnupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
