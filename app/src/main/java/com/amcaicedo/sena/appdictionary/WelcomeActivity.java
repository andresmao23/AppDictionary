package com.amcaicedo.sena.appdictionary;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvBienvenido;
    TextInputEditText etNombre, etApellido;
    Button btnAceptar, btnAnimales, btnColores, btnFrutas, btnSaludos;

    Intent intent;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvBienvenido = (TextView) findViewById(R.id.tvBienvenido);

        etNombre = (TextInputEditText) findViewById(R.id.etNombre);
        etApellido = (TextInputEditText) findViewById(R.id.etApellido);

        btnAceptar = (Button) findViewById(R.id.btnAceptar);
        btnAnimales = (Button) findViewById(R.id.btnAnimales);
        btnColores = (Button) findViewById(R.id.btnColores);
        btnFrutas = (Button) findViewById(R.id.btnFrutas);
        btnSaludos = (Button) findViewById(R.id.btnSaludos);

        btnAceptar.setOnClickListener(this);
        btnAnimales.setOnClickListener(this);
        btnColores.setOnClickListener(this);
        btnFrutas.setOnClickListener(this);
        btnSaludos.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAceptar:
                tvBienvenido.setText(tvBienvenido.getText() + " " + etNombre.getText() + " " + etApellido.getText());
                etNombre.setText("");
                etApellido.setText("");
                break;
            case R.id.btnAnimales:
                if(btnAnimales.getText().equals("Animales")){
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.cow);
                    extras.putInt("IMGS2", R.drawable.dog);
                    extras.putInt("IMGS3", R.drawable.cat);
                    extras.putString("TITULO", "Animales");
                    extras.putString("TEXTOUNOS1", "Vaca");
                    extras.putString("TEXTOUNOS2", "Perro");
                    extras.putString("TEXTOUNOS3", "Gato");
                    intent.putExtras(extras);
                    startActivity(intent);
                }else{
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.cow);
                    extras.putInt("IMGS2", R.drawable.dog);
                    extras.putInt("IMGS3", R.drawable.cat);
                    extras.putString("TITULO", "Animals");
                    extras.putString("TEXTOUNOS1", "Cow");
                    extras.putString("TEXTOUNOS2", "Dog");
                    extras.putString("TEXTOUNOS3", "Cat");
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                break;
            case R.id.btnColores:
                if(btnAnimales.getText().equals("Animales")) {
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.red);
                    extras.putInt("IMGS2", R.drawable.green);
                    extras.putInt("IMGS3", R.drawable.blue);
                    extras.putString("TITULO", "Colores");
                    extras.putString("TEXTOUNOS1", "Rojo");
                    extras.putString("TEXTOUNOS2", "Verde");
                    extras.putString("TEXTOUNOS3", "Azul");
                    intent.putExtras(extras);
                    startActivity(intent);
                }else{
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.cow);
                    extras.putInt("IMGS2", R.drawable.dog);
                    extras.putInt("IMGS3", R.drawable.cat);
                    extras.putString("TITULO", "Colors");
                    extras.putString("TEXTOUNOS1", "Red");
                    extras.putString("TEXTOUNOS2", "Green");
                    extras.putString("TEXTOUNOS3", "Blue");
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                break;
            case R.id.btnFrutas:
                if(btnAnimales.getText().equals("Animales")) {
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.grape);
                    extras.putInt("IMGS2", R.drawable.banana);
                    extras.putInt("IMGS3", R.drawable.pear);
                    extras.putString("TITULO", "Frutas");
                    extras.putString("TEXTOUNOS1", "Uvas");
                    extras.putString("TEXTOUNOS2", "Banano");
                    extras.putString("TEXTOUNOS3", "Pera");
                    intent.putExtras(extras);
                    startActivity(intent);
                }else {
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.cow);
                    extras.putInt("IMGS2", R.drawable.dog);
                    extras.putInt("IMGS3", R.drawable.cat);
                    extras.putString("TITULO", "Fruits");
                    extras.putString("TEXTOUNOS1", "Grapes");
                    extras.putString("TEXTOUNOS2", "Banana");
                    extras.putString("TEXTOUNOS3", "Pear");
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                break;
            case R.id.btnSaludos:
                if(btnAnimales.getText().equals("Animales")) {
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.hand);
                    extras.putInt("IMGS2", R.drawable.sun);
                    extras.putInt("IMGS3", R.drawable.moon);
                    extras.putString("TITULO", "Saludos");
                    extras.putString("TEXTOUNOS1", "Hola");
                    extras.putString("TEXTOUNOS2", "Días");
                    extras.putString("TEXTOUNOS3", "Noches");
                    intent.putExtras(extras);
                    startActivity(intent);
                }else {
                    intent = new Intent(WelcomeActivity.this, PlantillaActivity.class);
                    extras = new Bundle();
                    extras.putInt("IMGS1", R.drawable.cow);
                    extras.putInt("IMGS2", R.drawable.dog);
                    extras.putInt("IMGS3", R.drawable.cat);
                    extras.putString("TITULO", "Greetings");
                    extras.putString("TEXTOUNOS1", "Hi!");
                    extras.putString("TEXTOUNOS2", "Morning");
                    extras.putString("TEXTOUNOS3", "Evening");
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                break;
        }
    }
}
