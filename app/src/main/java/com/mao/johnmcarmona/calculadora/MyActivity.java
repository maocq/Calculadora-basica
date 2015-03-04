package com.mao.johnmcarmona.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MyActivity extends Activity {

    private EditText txt1, txt2;
    private int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        txt1 = (EditText) findViewById(R.id.editText3);
        txt2 = (EditText) findViewById(R.id.editText4);

    }

    public void suma(View v){
        try {
            getValues();
            result = num1 + num2;
            Toast.makeText(getApplicationContext(), "El resultado es: " + Integer.toString(result), Toast.LENGTH_SHORT).show();
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error "+e, Toast.LENGTH_SHORT).show();
        }
    }

    public void restar(View v){
        try {
            getValues();
            result = num1 - num2;
            Toast.makeText(getApplicationContext(), "El resultado es: " + Integer.toString(result), Toast.LENGTH_SHORT).show();
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error "+e, Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar(View v){
        try {
            getValues();
            result = num1 * num2;
            Toast.makeText(getApplicationContext(), "El resultado es: " + Integer.toString(result), Toast.LENGTH_SHORT).show();
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error "+e, Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir(View v){
        try {
            getValues();
            result = num1 / num2;
            Toast.makeText(getApplicationContext(), "El resultado es: " + Integer.toString(result), Toast.LENGTH_SHORT).show();
        }catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error "+e, Toast.LENGTH_SHORT).show();
        }
    }


    private void getValues(){
        num1 = Integer.parseInt(txt1.getText().toString());
        num2 = Integer.parseInt(txt2.getText().toString());
    }


    public void newActivity(View v){
        Toast.makeText(getApplicationContext(), "Cambiando de Actividad", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(), AcercaDe.class);
        startActivity(i);
    }

}
