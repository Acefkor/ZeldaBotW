package com.acefkor.zeldabotw;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.acefkor.zeldabotw.util.ArrayCreation;
import com.acefkor.zeldabotw.util.MaterialUtil;
import com.acefkor.zeldabotw.util.Titular;

public class MaterialActivity extends AppCompatActivity {

    private TextView matName;
    private TextView descrip;
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
        descrip = (TextView) findViewById(R.id.descrip);
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

        Titular t = new ArrayCreation().getDatos(position);
        matName.setText(t.getTitulo());
        matName.setCompoundDrawablesWithIntrinsicBounds(t.getImg(),0,0,0);
        MaterialUtil u = new MaterialUtil(mat1L1, mat2L1, mat1L2, mat2L2, mat1L3, mat2L3, mat1L4, mat2L4, descrip);
        u.getMaterials(position);
    }
}
