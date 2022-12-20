PROGRAM:
CALCULATOR:

XML ACTIVITY_MAIN.XML:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/editTextNumber3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="180dp"
        android:layout_marginTop="81dp"
        android:ems="10"
        android:inputType="number" />

    <EditText
        android:id="@+id/editTextNumber4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="185dp"
        android:layout_marginEnd="18dp"
        android:ems="10"
        android:inputType="number" />

    <EditText
        android:id="@+id/editTextNumber5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="269dp"
        android:layout_marginEnd="15dp"
        android:ems="10"
        android:inputType="number" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="61dp"
        android:layout_marginTop="102dp"
        android:text="FIRSTNUMBER" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="56dp"
        android:layout_marginTop="202dp"
        android:text="SECONDNUMBER" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_marginStart="95dp"
        android:layout_marginTop="286dp"
        android:text="RESULT" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="103dp"
        android:layout_marginBottom="293dp"
        android:text="ADD" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="84dp"
        android:layout_marginBottom="294dp"
        android:text="SUB" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="239dp"
        android:layout_marginBottom="219dp"
        android:text="MUL" />

    <Button
        android:id="@+id/button4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="108dp"
        android:layout_marginBottom="219dp"
        android:text="DIV" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginEnd="131dp"
        android:layout_marginBottom="104dp"
        android:text="RESET" />
</RelativeLayout>

MAINACTIVITY.JAVA:
package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText FIRSTNUMBER;
    private EditText SECONDNUMBER;
    private Button ADD;
    private Button SUB;
    private Button MUL;
    private Button DIV;
    private Button RESET;
    private TextView RESULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FIRSTNUMBER = (EditText) findViewById(R.id.editTextNumber3);
        SECONDNUMBER = (EditText) findViewById(R.id.editTextNumber4);
        ADD = (Button) findViewById(R.id.button);
        SUB = (Button) findViewById(R.id.button2);
        MUL = (Button) findViewById(R.id.button3);
        DIV = (Button) findViewById(R.id.button4);
        RESET = (Button) findViewById(R.id.button5);
        RESULT = (TextView) findViewById(R.id.editTextNumber5);
        // Addition
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((FIRSTNUMBER.getText().length() > 0) && (SECONDNUMBER.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(FIRSTNUMBER.getText().toString());
                    double oper2 = Double.parseDouble(SECONDNUMBER.getText().toString());
                    double result = oper1 + oper2;
                    RESULT.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //Subtraction
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((FIRSTNUMBER.getText().length() > 0) && (SECONDNUMBER.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(FIRSTNUMBER.getText().toString());
                    double oper2 = Double.parseDouble(SECONDNUMBER.getText().toString());
                    double result = oper1 - oper2;
                    RESULT.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        // Multiplication
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((FIRSTNUMBER.getText().length() > 0) && (SECONDNUMBER.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(FIRSTNUMBER.getText().toString());
                    double oper2 = Double.parseDouble(SECONDNUMBER.getText().toString());
                    double result = oper1 * oper2;
                    RESULT.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        // Division
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((FIRSTNUMBER.getText().length() > 0) && (SECONDNUMBER.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(FIRSTNUMBER.getText().toString());
                    double oper2 = Double.parseDouble(SECONDNUMBER.getText().toString());
                    double result = oper1 / oper2;
                    RESULT.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
// Reset Feilds
        RESET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FIRSTNUMBER.setText("");
                SECONDNUMBER.setText("");
                RESULT.setText("0.00");
                FIRSTNUMBER.requestFocus();
            }
        });
    }}
