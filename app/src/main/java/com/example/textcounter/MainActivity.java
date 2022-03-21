package com.example.textcounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.textcounter.utils.TextUtils;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner spOptionSelect;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.spOptionSelect = findViewById(R.id.spOptionSelect);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOptionSelect.setAdapter(adapter);

    }

    public void onCalculatebutton(View view) {
        if (txtMain.getText().toString().isEmpty()) {
            Toast.makeText(this, "Empty text", Toast.LENGTH_LONG).show();
        }
        else {
            if (this.spOptionSelect.getSelectedItem().toString().equalsIgnoreCase("Characters"))
                {
                    int charCount = TextUtils.getCharsCount(this.txtMain.getText().toString());
                    String charsCountstr = String.valueOf(charCount);
                    this.tvResult.setText(charsCountstr);
                }
        else{
            int wordsCount = TextUtils.getWordsCount(this.txtMain.getText().toString().split("\\s+" ));
            String wordsCountstr = String.valueOf(wordsCount);
            this.tvResult.setText(wordsCountstr);
/*           String content = this.txtMain.getText().toString();
           int charCount = content.length();
           String charsCountstr = String.valueOf(charCount);
            this.tvResult.setText(charsCountstr);*/
                }

            }
        }
    }
