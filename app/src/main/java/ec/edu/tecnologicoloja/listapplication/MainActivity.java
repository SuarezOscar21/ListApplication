package ec.edu.tecnologicoloja.listapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import ec.edu.tecnologicoloja.listapplication.adapter.ListAdapter;

public class MainActivity extends AppCompatActivity {

    private ListAdapter listItemAdapter;
    private ArrayList<String>  listadeNombres=new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.list);
        llenararreglo();

        listItemAdapter = new ListAdapter(this, listadeNombres);
        listView . setAdapter (listItemAdapter);
    }
    public  void  llenararreglo () {
        listadeNombres.add( " hola1 " );
        listadeNombres.add(" hola2 ");

    }


}