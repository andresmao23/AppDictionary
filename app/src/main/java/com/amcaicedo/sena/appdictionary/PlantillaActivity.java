package com.amcaicedo.sena.appdictionary;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PlantillaActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvTitulo, tvTextoUnoS1, tvTextoUnoS2, tvTextoUnoS3, tvTextoDosS1, tvTextoDosS2, tvTextoDosS3;
    ImageView imgS1, imgS2, imgS3;
    Button btnTraducirS1, btnTraducirS2, btnTraducirS3;

    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla);

        extras = getIntent().getExtras();

        imgS1 = (ImageView) findViewById(R.id.imgS1);
        imgS2 = (ImageView) findViewById(R.id.imgS2);
        imgS3 = (ImageView) findViewById(R.id.imgS3);


        Picasso.with(this).load(extras.getInt("IMGS1")).into(imgS1);
        Picasso.with(this).load(extras.getInt("IMGS2")).into(imgS2);
        Picasso.with(this).load(extras.getInt("IMGS3")).into(imgS3);


        btnTraducirS1 = (Button) findViewById(R.id.btnTraducirS1);
        btnTraducirS2 = (Button) findViewById(R.id.btnTraducirS2);
        btnTraducirS3 = (Button) findViewById(R.id.btnTraducirS3);

        btnTraducirS1.setOnClickListener(this);
        btnTraducirS2.setOnClickListener(this);
        btnTraducirS3.setOnClickListener(this);


        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        tvTextoUnoS1 = (TextView) findViewById(R.id.tvTextoUnoS1);
        tvTextoUnoS2 = (TextView) findViewById(R.id.tvTextoUnoS2);
        tvTextoUnoS3 = (TextView) findViewById(R.id.tvTextoUnoS3);

        tvTextoDosS1 = (TextView) findViewById(R.id.tvTextoDosS1);
        tvTextoDosS2 = (TextView) findViewById(R.id.tvTextoDosS2);
        tvTextoDosS3 = (TextView) findViewById(R.id.tvTextoDosS3);

        tvTitulo.setText(extras.getString("TITULO"));
        tvTextoUnoS1.setText(extras.getString("TEXTOUNOS1"));
        tvTextoUnoS2.setText(extras.getString("TEXTOUNOS2"));
        tvTextoUnoS3.setText(extras.getString("TEXTOUNOS3"));

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnTraducirS1:
                //if (tvTitulo.getText().equals("Animales")){
                    if (tvTitulo.getText().equals("Animales")){
                        tvTextoDosS1.setText(getResources().getString(R.string.cow));
                    }else if(tvTitulo.getText().equals("Colores")){
                        tvTextoDosS1.setText(getResources().getString(R.string.red));
                    }else if (tvTitulo.getText().equals("Frutas")){
                        tvTextoDosS1.setText(getResources().getString(R.string.grapes));
                    }else {
                        tvTextoDosS1.setText(getResources().getString(R.string.hi));
                    }
                /*}else{
                    if (tvTitulo.getText().equals("Animals")){
                        tvTextoDosS1.setText(getResources().getString(R.string.cow));
                    }else if(tvTitulo.getText().equals("Colors")){
                        tvTextoDosS1.setText(getResources().getString(R.string.red));
                    }else if (tvTitulo.getText().equals("Fruits")){
                        tvTextoDosS1.setText(getResources().getString(R.string.grapes));
                    }else {
                        tvTextoDosS1.setText(getResources().getString(R.string.hi));
                    }
                }*/
                break;
            case R.id.btnTraducirS2:
                //if (tvTitulo.getText().equals("Colores")){
                    if (tvTitulo.getText().equals("Animales")){
                        tvTextoDosS2.setText(getResources().getString(R.string.dog));
                    }else if(tvTitulo.getText().equals("Colores")){
                        tvTextoDosS2.setText(getResources().getString(R.string.green));
                    }else if (tvTitulo.getText().equals("Frutas")){
                        tvTextoDosS2.setText(getResources().getString(R.string.banana));
                    }else {
                        tvTextoDosS2.setText(getResources().getString(R.string.morning));
                    }
                /*}else{
                    if (tvTitulo.getText().equals("Animals")){
                        tvTextoDosS2.setText(getResources().getString(R.string.dog));
                    }else if(tvTitulo.getText().equals("Colors")){
                        tvTextoDosS2.setText(getResources().getString(R.string.green));
                    }else if (tvTitulo.getText().equals("Fruits")){
                        tvTextoDosS2.setText(getResources().getString(R.string.banana));
                    }else {
                        tvTextoDosS2.setText(getResources().getString(R.string.morning));
                    }
                }*/
                break;
            case R.id.btnTraducirS3:
                //if (tvTitulo.getText().equals("Frutas")){
                    if (tvTitulo.getText().equals("Animales")){
                        tvTextoDosS3.setText(getResources().getString(R.string.cat));
                    }else if(tvTitulo.getText().equals("Colores")){
                        tvTextoDosS3.setText(getResources().getString(R.string.blue));
                    }else if (tvTitulo.getText().equals("Frutas")){
                        tvTextoDosS3.setText(getResources().getString(R.string.pear));
                    }else {
                        tvTextoDosS3.setText(getResources().getString(R.string.evening));
                    }
                /*}else{
                    if (tvTitulo.getText().equals("Animals")){
                        tvTextoDosS3.setText(getResources().getString(R.string.cat));
                    }else if(tvTitulo.getText().equals("Colors")){
                        tvTextoDosS3.setText(getResources().getString(R.string.blue));
                    }else if (tvTitulo.getText().equals("Fruits")){
                        tvTextoDosS3.setText(getResources().getString(R.string.pear));
                    }else {
                        tvTextoDosS3.setText(getResources().getString(R.string.evening));
                    }
                }*/
                break;
        }

    }
}
