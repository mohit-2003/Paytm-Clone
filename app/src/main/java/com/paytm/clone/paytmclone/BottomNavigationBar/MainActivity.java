package com.paytm.clone.paytmclone.BottomNavigationBar;

import android.os.Bundle;

import com.paytm.clone.paytmclone.BankFragment.BankFragment;
import com.paytm.clone.paytmclone.HomeFragment.HomeFragment;
import com.paytm.clone.paytmclone.InboxFragment.InboxFragment;
import com.paytm.clone.paytmclone.MallFragment.MallFragment;
import com.paytm.clone.paytmclone.R;
import com.paytm.clone.paytmclone.ScanFragment.ScanFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
//    BottomNavigationView bottomNavigationView;
//    ViewPager viewPager;
//    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);


        loadFragment(new HomeFragment());


    }

    private boolean loadFragment(Fragment fragment) {

        if (fragment != null) {

            getSupportFragmentManager().
                    beginTransaction().
                    replace(R.id.fragment_container, fragment).
                    commit();


            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_mall:
                fragment = new MallFragment();
                break;

            case R.id.navigation_scan:
                fragment = new ScanFragment();
                break;

            case R.id.navigation_bank:
                fragment = new BankFragment();
                break;

            case R.id.navigation_inbox:
                fragment = new InboxFragment();
                break;

        }
        return loadFragment(fragment);
    }

}
