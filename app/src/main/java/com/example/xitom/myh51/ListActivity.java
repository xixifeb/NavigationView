package com.example.xitom.myh51;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by xitom on 2017/1/9.
 */

public class ListActivity extends AppCompatActivity implements View.OnClickListener{

    ListView lv1;
    MyListAdapter adapter;
    Button btnShow;
    View rootView;
    DrawerLayout mDrawerlayout;
    NavigationView mNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testpage);



        initView();
        initAdapter();
    }

    private void initView(){
//        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
//
//        final ActionBar ab = getActionBar();
//        ab.setHomeAsUpIndicator(R.drawable.abc_ic_menu_copy_mtrl_am_alpha);
//        ab.setDisplayHomeAsUpEnabled(true);
        mDrawerlayout = (DrawerLayout)findViewById(R.id.nav_page);
        if(mDrawerlayout!=null){
            Toast.makeText(getApplicationContext(), "Yes", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "null", Toast.LENGTH_SHORT).show();
        }
        mNavigationView = (NavigationView)findViewById(R.id.nav_view);
        if (mNavigationView != null) {
            mNavigationView.setNavigationItemSelectedListener(
                    new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem menuItem) {
                    //切换相应 Fragment 等操作


                    Snackbar.make(rootView, "hear", Snackbar.LENGTH_LONG)
                            .setAction("确定", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(getApplicationContext(), "确定", Toast.LENGTH_SHORT).show();
                                }
                            }).show();


                    menuItem.setChecked(true);
                    mDrawerlayout.closeDrawers();
                    return true;
                }
            });
        }


        rootView = getWindow().getDecorView();
        lv1 = (ListView)findViewById(R.id.lv1);
        btnShow = (Button)findViewById(R.id.btnShow);

        btnShow.setOnClickListener(this);
    }

    private void initAdapter(){
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnShow:

                mDrawerlayout.openDrawer(GravityCompat.START);


                break;
            default:
                break;
        }
    }
}
