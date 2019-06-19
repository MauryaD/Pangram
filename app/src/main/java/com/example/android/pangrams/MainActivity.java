package com.example.android.pangrams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         et = findViewById(R.id.enter);
         tv = findViewById(R.id.show);
         btn =  findViewById(R.id.Button);

    }

    boolean checkPangram(String Strng){
        boolean[] mark= new boolean[26];
        int index=0;
        for (int i=0;i<Strng.length();i++)
        {
            if('A'<=Strng.charAt(i) && Strng.charAt(i)<='Z')
                index=Strng.charAt(i) - 'A';
            else if ('a'<=Strng.charAt(i)&& Strng.charAt(i)<='z')
                index=Strng.charAt(i) - 'a';

            mark[index]=true;
        }
        for(int i=0;i<26;i++)
            if(!mark[i])
                return false;

        return true;

    }
    public void Detect(View view){
        String st=et.getText().toString();

        if(checkPangram(st)) {
            tv.setText(st + " is a Pangram");
            Toast.makeText(MainActivity.this,"Yiippeee!!",Toast.LENGTH_SHORT).show();
        }
        else{
            tv.setText(st+ " is not a Pangram");
            Toast.makeText(MainActivity.this,"Try Again!!",Toast.LENGTH_SHORT).show();}
    }



}
