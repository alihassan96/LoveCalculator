package com.example.ali_pc.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    EditText m, f;
    Button btn;
    String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

       public void Percenatge(View view){
           m = (EditText) findViewById(R.id.et1);
           f = (EditText) findViewById(R.id.et2);
           tv = (TextView) findViewById(R.id.tv1);
           String f1 = f.getText().toString();
           String m1 = m.getText().toString();
           String Add= m1+f1;
           int val = Add.hashCode();
           Random random = new Random(val);
           ans = (random.nextInt(100)+1)+" %";
           if(f1.equals("") || m1.equals("")){

               Toast.makeText(MainActivity.this,"Please Enter Name", Toast.LENGTH_SHORT).show();
           }
           else {
               tv.setText(ans);
           }

       }


}
