package gsu.edu.csc4350.jhuang15.courseseek;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class UserAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);

        getSupportActionBar().setTitle("Account Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
