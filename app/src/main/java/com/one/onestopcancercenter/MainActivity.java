package com.one.onestopcancercenter;

import android.app.Dialog;
import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        login();


    }

    public void login()
    {
       final Dialog loginDialog = new Dialog(MainActivity.this);
        loginDialog.setContentView(R.layout.loginview);
        loginDialog.setCancelable(false);

        final EditText textView_username = (EditText) loginDialog.findViewById(R.id.textView_username);
        final EditText password1 = (EditText) loginDialog.findViewById(R.id.password1);




        Button button_login= (Button) loginDialog.findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO send user name and pass to server in order to mach the cridentils
                sendLoginRequest(textView_username.getText().toString(),password1.getText().toString());

                //then if server return ok and get the user type also id
                loginDialog.cancel();
            }
        });

        Button sinup_bt = (Button) loginDialog.findViewById(R.id.sinup_bt);
        sinup_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinup();
            }
        });

        try
        {
            loginDialog.show();

        }catch (Exception ex)
        {

        }
    }

    void sendLoginRequest(String username,String userpass)
    {

    }

    public void sinup()
    {
        final Dialog signupDialog = new Dialog(MainActivity.this);
        signupDialog.setContentView(R.layout.signupview);
        signupDialog.setCancelable(false);

        final EditText editText_username = (EditText) signupDialog.findViewById(R.id.editText_username);
        final EditText pass = (EditText) signupDialog.findViewById(R.id.pass);
        final EditText re_pass = (EditText) signupDialog.findViewById(R.id.re_pass);
        final EditText email = (EditText) signupDialog.findViewById(R.id.email);
        final EditText mobile = (EditText) signupDialog.findViewById(R.id.mobile);

        Button button_signup= (Button) signupDialog.findViewById(R.id.signup_b);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO send user name and pass to server in order to mach the cridentils
                sendSignupRequest(editText_username.getText().toString(),pass.getText().toString(),
                        re_pass.getText().toString(),email.getText().toString(),mobile.getText().toString());

                //then if server return ok and get the user type also id
                signupDialog.cancel();
            }
        });

        try
        {
            signupDialog.show();

        }catch (Exception ex)
        {

        }
    }

    void sendSignupRequest(String username,String userpass, String repass, String mail, String phone)
    {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
