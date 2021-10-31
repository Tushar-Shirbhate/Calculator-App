package com.tusharcode.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button add, sub, mul, div, canc;
  //  ListView listView;
    double ans =0.0;
    //String []op = {"+", "-", "*", "/"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        canc = findViewById(R.id.canc);
        //listView = findViewById(R.id.listView);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, op );
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                switch(position){
//                    case 0 :
//                        double add1 = Integer.parseInt(editText.getText().toString());
//                        ans += add1;
//                        textView.setText(""+ ans);
//                        break;
//                         case 1 :
//                        double sub1 = Integer.parseInt(editText.getText().toString());
//                        ans += sub1;
//                        textView.setText(""+ ans);
//                        break;
//                         case 2 :
//                        double mul1 = Integer.parseInt(editText.getText().toString());
//                        ans += mul1;
//                        textView.setText(""+ ans);
//                        break;
//                         case 3 :
//                        double div1 = Integer.parseInt(editText.getText().toString());
//                        ans += div1;
//                        textView.setText(""+ ans);
//                        break;
//
//                    default:
//                }
//            }
//        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double add1 = Integer.parseInt(editText.getText().toString());
                ans += add1;
                textView.setText(""+ ans);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sub1 = Integer.parseInt(editText.getText().toString());
                ans -= sub1;
                textView.setText(""+ ans);
            }
        });mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mul1 = Integer.parseInt(editText.getText().toString());
                ans *= mul1;
                textView.setText(""+ ans);
            }
        });div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double div1 = Integer.parseInt(editText.getText().toString());
                ans /= div1;
                textView.setText(""+ ans);
            }
        });canc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });
    }
}







