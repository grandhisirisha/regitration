package com.example.mlrit.regitration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Firstname;
    EditText LastName;
    EditText PHNO;
    Button SUBMIT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firstname = (EditText) findViewById(R.id.editText);
        LastName = (EditText) findViewById(R.id.editText2);
        PHNO = (EditText) findViewById(R.id.editText3);
        SUBMIT = (Button) findViewById(R.id.button);


        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Firstname.getText().toString().equals(""))
                {
                    Firstname.setError("Enter Name");
                }
                else
                {
                    if (LastName.getText().toString().equals(""))
                    {
                        LastName.setError("Enter last name");
                    }
                    else
                    {
                        if (PHNO.getText().toString().equals(""))
                        {
                            PHNO.setError("123456789");
                        }
                        else
                        {

                            Toast.makeText(MainActivity.this,"Registered",Toast.LENGTH_SHORT).show();
                        }

                    }
                }


                    }


        });


    }
}