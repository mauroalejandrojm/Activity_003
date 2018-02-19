package com.example.mauroalejandrojm.activity_003;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String Tag = "mensaje";
    LinearLayout main2;
    private double result, result_c, result_c2;
    public double op1, op2;
    public int op;
    public EditText display;
    public EditText display_00;
    public Button Button_00;
    public EditText EditText_00;
    public int count;
    ArrayList<Double> result_s = new ArrayList<Double>();
    public int i = 2;
    public int j = 0;
    Button add, subs, mult, div, del;
    LinearLayout main;
    ConstraintLayout main_0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //main = (LinearLayout) findViewById(R.id.mainLayout);
        main_0 = (ConstraintLayout) findViewById(R.id.constraintLayout);
        count = 1;
        display = findViewById(R.id.tv_00);
        add = findViewById(R.id.b_sum);
        subs = findViewById(R.id.b_res);
        mult = findViewById(R.id.b_mul);
        div = findViewById(R.id.b_igu);
        del = findViewById(R.id.b_del);

    }

    public void suma(View view) {
        try {
            String aux = display.getText().toString();
            op1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe) {
        }
        ;
        display.setText("");
        op = 1;
        saved();
    }

    public void resta(View view) {
        try {
            String aux = display.getText().toString();
            op1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe) {
        }
        ;
        display.setText("");
        op = 2;
        saved();
    }

    public void multi(View view) {
        try {
            String aux = display.getText().toString();
            op1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        op = 3;
    }

    public void divi(View view) {
        try {
            String aux = display.getText().toString();
            op1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe) {
        }
        ;
        display.setText("");
        op = 4;
    }

    public void igual(View view) {
        try {
            String aux2 = display.getText().toString();
            op2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        display.setText("");
        if (op == 1) {
            result = result_c + op2;
        } else if (op == 2) {
            result = result_c - op2;
        } else if (op == 3) {
            result = op1 * op2;
        } else if (op == 4) {
            if (op2 == 0) {
                display.setText("Error");
            } else {
                result = op1 / op2;
            }
        }
        result_c = result;
        display.setText("" + result);
        saved2();
    }

    public void clc(View view) {
        display.setText("");
        op1 = 0.0;
        op2 = 0.0;
        result = 0.0;
        result_c = 0.0;
    }

    public void clear(View view) {
        if (!display.getText().toString().equals("")) {
            display.setText(display.getText().subSequence(0, display.getText().length() - 1) + "");
        }
    }

    public void bt9(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "9";
        display.setText(cap);
    }

    public void bt8(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "8";
        display.setText(cap);
    }

    public void bt7(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "7";
        display.setText(cap);
    }

    public void bt6(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "6";
        display.setText(cap);
    }

    public void bt5(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "5";
        display.setText(cap);
    }

    public void bt4(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "4";
        display.setText(cap);
    }

    public void bt3(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "3";
        display.setText(cap);
    }

    public void bt2(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "2";
        display.setText(cap);
    }

    public void bt1(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "1";
        display.setText(cap);
    }

    public void bt0(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + "0";
        display.setText(cap);
    }

    public void btp(View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap = display.getText().toString();
        cap = cap + ".";
        display.setText(cap);
    }

    public void saved() {
        if (op == 1) {
            result_c = op1 + result_c;
        }
        if (op == 2) {
            result_c = op1 - result_c;
        }
    }

    public void saved2() {
        result_s.add(op1);
        result_s.add(op2);
        result_s.add(result_c);
    }

    public void activity2(View view) {
        Intent k = new Intent(this, Main2Activity.class);
        //String aux3 = display.getText().toString();
        //k.putExtra("val1", aux3);
        startActivity(k);
    }

}

