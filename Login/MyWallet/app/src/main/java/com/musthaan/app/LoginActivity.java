package com.musthaan.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       addClickEventListnerOnLogin();

    }

    private void addClickEventListnerOnLogin() {
        Button btnLogin =(Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View viewLogin){
                EditText txtUserName = (EditText)  findViewById(R.id.txtUserName);
                EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

                TextView lblMessage  =(TextView) findViewById(R.id.lblMessage);
                String userName =txtUserName.getText().toString();
                String password = txtPassword.getText().toString();
                if (userName.equals( "mus") && password.equals( "123"))
                {
                    lblMessage.setText("Success");
                }
                else
                {
                    lblMessage.setText("Invalid User Name or Password!");

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
