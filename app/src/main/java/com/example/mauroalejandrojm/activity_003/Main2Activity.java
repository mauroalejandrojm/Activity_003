package com.example.mauroalejandrojm.activity_003;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private String TAG = "test_00";
    LinearLayout main2;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        main2 = (LinearLayout) findViewById(R.id.other_Layout);
        count = 1;
        FloatingActionButton button_plus_00 = findViewById(R.id.Button_plus);
        button_plus_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateLayout3();
                //test();
            }
        });
    }
    private void generateLayout() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(this);
        EditText et = new EditText(this);
        Button bt = new Button(this);
        bt.setText("Button "+count);
        bt.setTag(count);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LayoutGeneratorLog","El boton "+view.getTag());
            }
        });
        tv.setText("el tv");

        newLayout.addView(tv);
        newLayout.addView(et);
        newLayout.addView(bt);
        main2.addView(newLayout);
        count++;
    }
    private void generateLayout2() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(this);
        EditText et = new EditText(this);
        //Edi.setId(count);
        Button bt = new Button(this);
        bt.setText("Button "+count);
        bt.setTag(count);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = (int) view.getTag();
                EditText e = (EditText) findViewById(id);
                Log.d("LayoutGeneratorLog","El boton "+e.getText());
            }
        });
        tv.setText("el tv");

        newLayout.addView(tv);
        newLayout.addView(et);
        newLayout.addView(bt);
        main2.addView(newLayout);

        count++;
    }
    private void generateLayout3() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view_00 = inflater.inflate(R.layout.inside_layout, newLayout, false);
        Button button_00 = (Button) view_00.findViewById(R.id.button_a);
        final EditText editText_00 = (EditText) view_00.findViewById(R.id.editText_a);
        button_00.setText("Edit "+count);
        button_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LayoutGeneratorLog","El boton "+editText_00.getText());
            }
        });
        newLayout.addView(view_00);
        main2.addView(newLayout);
        count++;
    }
    public void test(){
        Toast.makeText(this,"nothing",Toast.LENGTH_SHORT);
    }
}
