package com.example.cours_groupe2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class CalculActivity extends AppCompatActivity {
    private TextView textViewCalcul;
    private Button boutonPlus;
    private Button boutonDivide;
    private Button boutonSubstract;
    private Button boutonMultiply;
    private Button bouton1;
    private Button bouton2;
    private Button bouton3;
    private Button bouton4;
    private Button bouton5;
    private Button bouton6;
    private Button bouton7;
    private Button bouton8;
    private Button bouton9;
    private Button bouton0;


    private String calcul ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        textViewCalcul = findViewById(R.id.textViewCalcul);
        boutonDivide = findViewById(R.id.button_divide);
        boutonDivide.setOnClickListener(view -> {
            ajouteCharactere(" / ");
        });
        boutonPlus = findViewById(R.id.button_plus);
        boutonPlus.setOnClickListener(view -> {
            ajouteCharactere(" + ");
        });
        boutonPlus = findViewById(R.id.button_plus);
        boutonPlus.setOnClickListener(view -> {
            ajouteCharactere(" + ");
        });
        bouton0 = findViewById(R.id.buttonZero);
        bouton0.setOnClickListener(view -> {
            ajouteCharactere("0");
        });
        bouton1 = findViewById(R.id.button_1);
        bouton1.setOnClickListener(view -> {
            ajouteCharactere("1");
        });
        bouton2 = findViewById(R.id.button_2);
        bouton2.setOnClickListener(view -> {
            ajouteCharactere("2");
        });
        bouton3 = findViewById(R.id.button_3);
        bouton3.setOnClickListener(view -> {
            ajouteCharactere("3");
        });
        bouton4 = findViewById(R.id.button_4);
        bouton4.setOnClickListener(view -> {
            ajouteCharactere("4");
        });
        bouton5 = findViewById(R.id.button_5);
        bouton5.setOnClickListener(view -> {
            ajouteCharactere("5");
        });
        bouton6 = findViewById(R.id.button_6);
        bouton6.setOnClickListener(view -> {
            ajouteCharactere("6");
        });
        bouton7 = findViewById(R.id.button_7);
        bouton7.setOnClickListener(view -> {
            ajouteCharactere("7");
        });
        bouton8 = findViewById(R.id.button_8);
        bouton8.setOnClickListener(view -> {
            ajouteCharactere("8");
        });
        bouton9 = findViewById(R.id.button_9);
        bouton9.setOnClickListener(view -> {
            ajouteCharactere("9");
        });
        boutonSubstract = findViewById(R.id.button_substract);
        boutonSubstract.setOnClickListener(view -> {
            ajouteCharactere(" - ");
        });
        boutonMultiply = findViewById(R.id.button_multiply);
        boutonMultiply.setOnClickListener(view -> {
            ajouteCharactere(" x ");
        });

    }

    private void ajouteCharactere(String character){
        calcul+=character;
        textViewCalcul.setText(calcul);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar,menu);
        MenuItem boutonNettoyer = menu.findItem(R.id.toolbar_clear);
        boutonNettoyer.setOnMenuItemClickListener(view -> {
            textViewCalcul.setText("");
            calcul="";
            return true;
        });

        return super.onCreateOptionsMenu(menu);
    }
}