package com.example.leo.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Leo on 15/11/29.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static  CrimeLab sCrimeLab;
    private Context mAppContext;
    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for (int i = 0; i<100 ; i++){
            Crime c = new Crime();
            c.setmTitle("Crime #"+i);
            //Every other one
            c.setmSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }
    public static CrimeLab get(Context c){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public Crime getCrime(UUID id){
        for(Crime c: mCrimes){
            if(c.getmId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
