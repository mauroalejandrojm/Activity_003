package com.example.mauroalejandrojm.activity_003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String Tag = "mensaje";
    private double result;
    public double op1,op2;
    public int op;
    public EditText display;
    Button add, subs, mult, div, del;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tv_00);
        add = findViewById(R.id.b_sum);
        subs = findViewById(R.id.b_res);
        mult = findViewById(R.id.b_mul);
        div = findViewById(R.id.b_igu);
        del = findViewById(R.id.b_del);

    }
    public void suma (View view){
        try{
            String aux = display.getText().toString();
            op1=Double.parseDouble(aux);
        }
        catch (NumberFormatException nfe){};
        display.setText("");
        op=1;
    }
    public void resta (View view){
        try{
            String aux = display.getText().toString();
            op1=Double.parseDouble(aux);
        }
        catch (NumberFormatException nfe){};
        display.setText("");
        op=2;
    }
    public void multi (View view){
        try{
            String aux = display.getText().toString();
            op1=Double.parseDouble(aux);
        }
        catch (NumberFormatException nfe){};
        display.setText("");
        op=3;
    }
    public void divi (View view){
        try{
            String aux = display.getText().toString();
            op1=Double.parseDouble(aux);
        }
        catch (NumberFormatException nfe){};
        display.setText("");
        op=4;
    }
    public void igual (View view){
        try {
            String aux2=display.getText().toString();
            op2=Double.parseDouble(aux2);
        }
        catch(NumberFormatException nfe){}
        display.setText("");
        if (op ==1) {
            result= op1+op2;
        }
        else if(op==2){
            result=op1-op2;
        }
        else if(op==3){
            result=op1*op2;
        }
        else if (op==4){
            if (op2==0){
                display.setText("Error");
            }
            else{
            result=op1/op2;
            }
        }
        display.setText(""+result);
        op1=result;
    }
    public void clc (View view) {
        display.setText("");
        op1=0.0;
        op2=0.0;
        result=0.0;
    }
    public void clear (View view){
        if (!display.getText().toString().equals("")){
            display.setText(display.getText().subSequence(0, display.getText().length() - 1)+"");
        }
    }
    public void bt9 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"9";
        display.setText(cap);
    }
    public void bt8 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"8";
        display.setText(cap);
    }
    public void bt7 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"7";
        display.setText(cap);
    }
    public void bt6 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"6";
        display.setText(cap);
    }
    public void bt5 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"5";
        display.setText(cap);
    }
    public void bt4 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"4";
        display.setText(cap);
    }
    public void bt3 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"3";
        display.setText(cap);
    }
    public void bt2 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"2";
        display.setText(cap);
    }
    public void bt1 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"1";
        display.setText(cap);
    }
    public void bt0 (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+"0";
        display.setText(cap);
    }
    public void btp (View view) {
        //Toast.makeText(this,"Click en el boton",Toast.LENGTH_SHORT).show();
        //Log.d(Tag, "Click en el boton");
        String cap=display.getText().toString();
        cap=cap+".";
        display.setText(cap);
    }


}
