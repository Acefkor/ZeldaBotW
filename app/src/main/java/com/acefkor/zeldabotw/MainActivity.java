package com.acefkor.zeldabotw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.acefkor.zeldabotw.util.ArrayCreation;
import com.acefkor.zeldabotw.util.Titular;

public class MainActivity extends AppCompatActivity {

    private Titular[] datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Controls localize
        datos = new ArrayCreation().getDatos();
        ListView lstOpc = (ListView) findViewById(R.id.lstOpciones);

        //initialize list with values
        AdaptadorTitulares adapter =
                new AdaptadorTitulares(this, datos);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        //        R.array.equipo, android.R.layout.simple_list_item_1);

        lstOpc.setAdapter(adapter);

        //set onSelect item
        lstOpc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MaterialActivity.class);
                Bundle b = new Bundle();
                b.putInt("position", position);
                b.putString("equipo", ((Titular) a.getItemAtPosition(position)).getTitulo());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    static class ViewHolder {
        TextView titulo;
        ImageView img;
    }

    class AdaptadorTitulares extends ArrayAdapter<Titular> {

        AdaptadorTitulares(Context context, Titular[] datos) {
            super(context, R.layout.listitem_titular, datos);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            ViewHolder holder;
            if (view == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                view = inflater.inflate(R.layout.listitem_titular, null, true);
                holder = new ViewHolder();
                holder.titulo = (TextView) view.findViewById(R.id.titulo);
                holder.img = (ImageView) view.findViewById(R.id.img);
                view.setTag(holder);
            } else {
                holder = (ViewHolder) view.getTag();
            }

            holder.titulo.setText(datos[position].getTitulo());
            holder.img.setImageResource(datos[position].getImg());
            return (view);
        }
    }
}
