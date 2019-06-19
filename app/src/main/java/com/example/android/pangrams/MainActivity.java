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

   /* //public void Detect(View view){
        //TextView tv=findViewById(R.id.show);
        int flag=0;
        String st=et.getText().toString();          //string entered by user.
        char[] inputtedStringToChar = st.toCharArray();
        //tv.setText(inputtedStringToChar[2]);          display string   ok
        for (int i=0;i<st.length();i++)
        {
            int asciivalueofchar=(int)inputtedStringToChar[i];
            if((asciivalueofchar>=97 && asciivalueofchar<=122) || (asciivalueofchar>=65 && asciivalueofchar<=90))
            {
                flag++;
            }
            else if(asciivalueofchar==32)
                continue;
            else
            {
                flag--;
            }

        }

        if(flag>0)
        {
            tv.setText("it is a pangram");
        }
        else
            tv.setText("it is not a pangram.");
    }*/

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
