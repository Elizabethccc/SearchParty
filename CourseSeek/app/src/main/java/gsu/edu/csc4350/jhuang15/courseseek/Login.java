package gsu.edu.csc4350.jhuang15.courseseek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    /*
    ***********************************************************************************************

    Clicking the login button should call the database and check if the username and password match
    if not then a toast message should pop up and say "Invalid User/password"

    ***********************************************************************************************
    */


    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        login = (Button) findViewById(R.id.loginbtn);

        EditText e1 = (EditText)findViewById(R.id.etusername);
        EditText e2 = (EditText)findViewById(R.id.etpassword);

        String user=e1.getText().toString();
        String password=e2.getText().toString();

        e2.setText(e2.getText());

        if(user.equals(password)){

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Login.this,VideoActivity.class));
                }
            });

        }

    }
}
