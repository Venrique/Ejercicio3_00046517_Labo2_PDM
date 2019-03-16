package com.example.ejercicio3_labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    private TextView PanelR;
    private TextView PanelV;
    private TextView PanelA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PanelR = findViewById(R.id.rojo);
        PanelV = findViewById(R.id.verde);
        PanelA = findViewById(R.id.azul);

        final ArrayList<Integer> rojos = new ArrayList<>();

        rojos.add(R.color.r0);
        rojos.add(R.color.r1);
        rojos.add(R.color.r2);
        rojos.add(R.color.r3);
        rojos.add(R.color.r4);
        rojos.add(R.color.r5);

        final ArrayList<Integer> verdes = new ArrayList<>();

        verdes.add(R.color.v1);
        verdes.add(R.color.v2);
        verdes.add(R.color.v3);
        verdes.add(R.color.v4);
        verdes.add(R.color.v5);
        verdes.add(R.color.v6);

        final ArrayList<Integer> azules = new ArrayList<>();

        azules.add(R.color.a1);
        azules.add(R.color.a2);
        azules.add(R.color.a3);
        azules.add(R.color.a4);
        azules.add(R.color.a5);
        azules.add(R.color.a6);


        PanelR.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 PanelR.setBackgroundColor(getResources().getColor(rojos.get(new Random().nextInt(6))));
             }
        });

        PanelV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanelV.setBackgroundColor(getResources().getColor(verdes.get(new Random().nextInt(6))));
            }
        });

        PanelA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PanelA.setBackgroundColor(getResources().getColor(azules.get(new Random().nextInt(6))));
            }
        });
    }
}
