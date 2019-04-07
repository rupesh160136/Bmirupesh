package com.example.bmirupesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private EditText etheight,etweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etheight=findViewById(R.id.etheight);
        etweight=findViewById(R.id.etweight);
        btn1=findViewById(R.id.btnclick);
        btn1.setOnClickListener(this);

        double height= Double.parseDouble(etheight.getText().toString());
        double weight= Double.parseDouble(etweight.getText().toString());

    }
    @Override
    public void onClick(View v){



    }
}
