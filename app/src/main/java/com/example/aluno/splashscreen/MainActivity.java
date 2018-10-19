package com.example.aluno.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade = (TextView) findViewById(R.id.camposIdadeId);
        curso = (Spinner) findViewById(R.id.camposCursoId);
        sexo = (Spinner) findViewById(R.id.spnSexoId);
        nome = (TextView) findViewById(R.id.campoNomeId);
        chkIngles = (CheckBox) findViewById(R.id.chkInglesId);
        chkDesign = (CheckBox) findViewById(R.id.chkDesignId);
        cadastrar =  (Button) findViewById(R.id.cadastrarId);
        imgfoto = (ImageView) findViewById(R.id.imageView);

        cadastrar.setOnClickListener(this);

        listaSexo = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,textosSpinner);
        sexo.setAdapter(listaSexo);




    }

}
