package com.example.leo.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Leo on 15/11/30.
 */
public abstract class SingleFragmentActivity extends FragmentActivity{
    protected abstract Fragment createFragment();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        //如果资源不存在，则创建新的fragment（横屏时）
        if(fragment == null){
            fragment = createFragment();
            //fragment 事务被用来添加，移除，附加，分离或者替换队列中的fragment ,管理着fragment 事务的回退栈
            //创建一个fragment 事务，加入一个添加操作，然后提交该事务
            fm.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
        }
    }
}
