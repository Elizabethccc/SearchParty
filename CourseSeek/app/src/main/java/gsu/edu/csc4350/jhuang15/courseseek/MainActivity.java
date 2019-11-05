package gsu.edu.csc4350.jhuang15.courseseek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    /*
    **********************************************************************************

    This will be the very first activity the user will see when opening up the app.
    It will display general information about the app, what it does, etc. The info will be
    Only two buttons, Login and Sign up account

    ***********************************************************************************
     */

    private Button login;
    private Button signup;
    private TextView fillText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("CourseSeek");

        login = (Button) findViewById(R.id.loginbtn);
        //Clicking the login button will redirect user to next activity page
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,VideoActivity.class));
            }
        });

        signup = (Button) findViewById(R.id.registerbtn);
        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Signup.class));
            }
        });

        fillText=(TextView)findViewById(R.id.textview_info);
        fillText.setText("Welcome to CourseSeek, an online course search engine available for anyone and everyone. " +
                "You can search for educational related videos and exercises " +
                "Exercises and videos are related, so you can make a specific api call to find out about an exercise like the Absolute Value Exercise and find the exercise's related videos.\n" +
                "\n" +
                "You can use these unauthenticated api calls to get information about nearly all of the Khan Academy's library organized by topic, or as individual videos or exercises. In addition, you can also retrieve information about the Badges we award via the exercise dashboard.\n" +
                "\n"+
                "Authenticated api calls will give you information about the logged in user (either a student or a coach/parent), such as videos seen, exercises completed, playlist progress and so forth. This repository's README includes helpful instructions (and a python script) for authenticated api calls. Try it out! ");

    }



}
