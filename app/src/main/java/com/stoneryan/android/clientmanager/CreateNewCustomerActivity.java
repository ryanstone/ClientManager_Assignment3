package com.stoneryan.android.clientmanager;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.DisplayUsernameFragment;

public class CreateNewCustomerActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_customer);

        setTitle("Add Customer");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new DisplayUsernameFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
}
