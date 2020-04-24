package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtNome;
    Button btnAdd;
    ListView listView;
    ArrayList<String> pessoas = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = (EditText)findViewById(R.id.txtNome);
        btnAdd = (Button)findViewById(R.id.btnAdd);

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pessoas);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

    }

    public void addPessoas(View view){
        if(txtNome.getText().toString().length()>0){
            pessoas.add(txtNome.getText().toString());
            arrayAdapter.notifyDataSetChanged();
        }
    }

}
