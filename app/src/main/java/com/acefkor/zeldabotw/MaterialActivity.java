package com.acefkor.zeldabotw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.acefkor.zeldabotw.util.Util;

public class MaterialActivity extends AppCompatActivity {

    private TextView matName;
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
        setContentView(R.layout.activity_material);

        //Controls localize

        matName = (TextView) findViewById(R.id.matName);
        mat1L1 = (TextView) findViewById(R.id.mat1L1);
        mat2L1 = (TextView) findViewById(R.id.mat2L1);
        mat1L2 = (TextView) findViewById(R.id.mat1L2);
        mat2L2 = (TextView) findViewById(R.id.mat2L2);
        mat1L3 = (TextView) findViewById(R.id.mat1L3);
        mat2L3 = (TextView) findViewById(R.id.mat2L3);
        mat1L4 = (TextView) findViewById(R.id.mat1L4);
        mat2L4 = (TextView) findViewById(R.id.mat2L4);

        Bundle b = this.getIntent().getExtras();
        Integer position = b.getInt("position");

        matName.setText(b.getString("equipo"));
        Util u = new Util(mat1L1,mat2L1,mat1L2,mat2L2,mat1L3,mat2L3,mat1L4,mat2L4);
        u.getMaterials(position);
    }
}
