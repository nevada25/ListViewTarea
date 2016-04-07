package com.example.dotado.listview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    EditText etTexto2;
    Button btnOk2;
    ListView lvtexto2;
    ArrayList<String> al;
    GridView tabla_frutas;
    private static ExpandableListView expandableListView;
    private static ExpandableListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabla_frutas=(GridView)findViewById(R.id.Gvfrutas);
        lvtexto2=(ListView)findViewById(R.id.lvtexto);

        al=new ArrayList<String>();

        final String[] datos =
                new String[]{"HOLA","BIENVENIDOS","A TODOS","USTEDES","AHORA","A TODOS","USTEDES","AHORA"};
        ArrayAdapter aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);

        lvtexto2= (ListView)findViewById(R.id.lvtexto);
        tabla_frutas.setAdapter(aa);

        lvtexto2.setAdapter(aa);

    }
}