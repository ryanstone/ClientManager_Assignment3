package com.stoneryan.android.clientmanager;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.DisplayUsernameFragment;

public class BillingInfoActivity extends AppCompatActivity implements DisplayUsernameFragment.OnFragmentInteractionListener  {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_info);

        setTitle("Enter Billing Info");

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
        fragment = new DisplayUsernameFragment();
        fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
