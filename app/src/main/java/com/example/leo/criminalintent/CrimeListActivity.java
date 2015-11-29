package com.example.leo.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Leo on 15/11/30.
 */
public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
