package com.longtrang.vinid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class PinCode extends AppCompatActivity {
    Button buttonNext;
    EditText editTextPin1, editTextPin2, editTextPin3, editTextPin4,editTextPin5, editTextPin6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
        mappingView();
        editTextPin1.requestFocus();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        Intent intent = getIntent();
        controlCursor();
    }

    public void mappingView(){
        editTextPin1    = findViewById(R.id.edt_PIN1);
        editTextPin2    = findViewById(R.id.edt_PIN2);
        editTextPin3    = findViewById(R.id.edt_PIN3);
        editTextPin4    = findViewById(R.id.edt_PIN4);
        editTextPin5    = findViewById(R.id.edt_PIN5);
        editTextPin6    = findViewById(R.id.edt_PIN6);
        buttonNext      = findViewById(R.id.btn_next_PIN_code);
    }

    public void goToPersonalInfomation(View view) {
        if(editTextPin1.length() >0 && editTextPin2.length() > 0 && editTextPin3.length() > 0 && editTextPin4.length() > 0 && editTextPin5.length() > 0 && editTextPin6.length() > 0){
            startActivity(new Intent(PinCode.this,PersonalInformation.class));
        }
        else {
            Toast.makeText(this, getResources().getString(R.string.pin_code_warning), Toast.LENGTH_LONG).show();
        }
    }
    public void backToConfirmOTP(View view) {
        startActivity(new Intent(PinCode.this,ConfirmOTP.class));
    }
    public void controlCursor(){
        editTextPin1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0){
                    editTextPin2.requestFocus();
                }
            }
        });
        editTextPin2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0){
                    editTextPin3.requestFocus();
                }
            }
        });
        editTextPin3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0){
                    editTextPin4.requestFocus();
                }
            }
        });
        editTextPin4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0){
                    editTextPin5.requestFocus();
                }
            }
        });
        editTextPin5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                if(s.length() > 0){
                    editTextPin6.requestFocus();
                }
            }
        });
    }

}