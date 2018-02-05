package com.example.mauroalejandrojm.activity_003;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private String Tag = "mensaje";
    private double result,result_c;
    public double op1,op2;
    public int op;
    public EditText display;
    public EditText display_00;
    public Button Button_00;
    public EditText EditText_00;
    public int count;
    Button add, subs, mult, div, del;
    LinearLayout main;
    ConstraintLayout main_0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (LinearLayout) findViewById(R.id.LinearTest);
        main_0 = (ConstraintLayout) findViewById(R.id.constraintLayout);
        count = 1;
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
            result_c= op1+op2;
        }
        else if(op==2){
            result_c=op1-op2;
        }
        else if(op==3){
            result_c=op1*op2;
        }
        else if (op==4){
            if (op2==0){
                display.setText("Error");
            }
            else{
            result_c=op1/op2;
            }
        }
        result=result_c;
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
    public void Temporal(View view){
        Log.d("TAG","hasta aquí bien"+1);
        //Editor();
        GenerateLayout();
    }
    public void Editor() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
    }
    public void GenerateLayout() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
        EditText EditText_0 = new EditText(this);
        TextView display_0 = new TextView(this);
        Button Button_0 = new Button(this);
        EditText_0.setId(count);
        Button_0.setTag(count);
        Button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = (int) view.getTag();
                EditText E = (EditText) findViewById(id);
                Log.d("LayoutGeneratorLog","El boton "+E.getText());
            }
        });
        display_0.setText("Test_0");
        newLayout.addView(display_00);
        newLayout.addView(EditText_00);
        newLayout.addView(Button_00);
        main.addView(newLayout);
        count++;
    }

}
