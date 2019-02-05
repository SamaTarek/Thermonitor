package com.example.sama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Email ;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setviews();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= Email.getText().toString();
                String pass= Password.getText().toString();


                valid(email,pass);

            }
        });

    }
    private void setviews(){
        Email=(EditText)findViewById(R.id.editText);
        Password=(EditText)findViewById(R.id.editPass);
        Login=(Button) findViewById(R.id.button_login);

    }
private void valid (String email,String pass){

        Intent intent=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
}

}
