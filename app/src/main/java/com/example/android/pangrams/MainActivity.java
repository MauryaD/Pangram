package com.example.android.pangrams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    public void Detect(View view){
        //TextView tv=findViewById(R.id.show);
        int flag=1;
        String st=et.getText().toString();          //string entered by user.
        char[] inputtedStringToChar = st.toCharArray();
        //tv.setText(inputtedStringToChar[2]);          display string   ok
        for (int i=0;i<st.length();i++)
        {
            int asciivalueofchar=(int)inputtedStringToChar[i];
            if((asciivalueofchar>97 && asciivalueofchar<122) || (asciivalueofchar>65 && asciivalueofchar<90))
            {
                continue;
            }
            else
            {
                flag--;
            }

        }

        if(flag==1)
        {
            tv.setText("it is pangram");
        }
        else
            tv.setText("it is not a pangram.");
    }



}
