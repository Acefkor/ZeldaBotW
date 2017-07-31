package com.acefkor.zeldabotw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner cmbOpciones;
    private TextView mat1L1;
    private TextView mat2L1;
    private TextView mat1L2;
    private TextView mat2L2;
    private TextView mat1L3;
    private TextView mat2L3;
    private TextView mat1L4;
    private TextView mat2L4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Controls localize
        cmbOpciones = (Spinner)findViewById(R.id.CmbOpciones);
        mat1L1 = (TextView)findViewById(R.id.mat1L1);
        mat2L1 = (TextView)findViewById(R.id.mat2L1);
        mat1L2 = (TextView)findViewById(R.id.mat1L2);
        mat2L2 = (TextView)findViewById(R.id.mat2L2);
        mat1L3 = (TextView)findViewById(R.id.mat1L3);
        mat2L3 = (TextView)findViewById(R.id.mat2L3);
        mat1L4 = (TextView)findViewById(R.id.mat1L4);
        mat2L4 = (TextView)findViewById(R.id.mat2L4);
        //initialize spinner with values
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.equipo,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        cmbOpciones.setAdapter(adapter);

        //set onSelect item
        cmbOpciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Util u = new Util(mat1L1,mat2L1,mat1L2,mat2L2,mat1L3,mat2L3,mat1L4,mat2L4);
                u.setMaterials(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
