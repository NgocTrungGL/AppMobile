package com.finalmobile.app_sell;

import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
=======
import android.widget.ListView;
import android.widget.Toolbar;
>>>>>>> 16699cfb6bc1baa34e5f2fbde78ccede0760af33
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
=======
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
>>>>>>> 16699cfb6bc1baa34e5f2fbde78ccede0760af33

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerViewMainPage;
    NavigationView navigationView;
    ListView lvMainPage;
    DrawerLayout drawerLayout;

    private Toolbar toolbar;
    private ListView listViewmain;
    private ViewFlipper viewFlipper;
    private RecyclerView recyclerView;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionBar();
        ActionViewFlipper();
    }

    private void ActionBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
<<<<<<< HEAD

    private void ActionViewFlipper() {
        List<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("");
        mangquangcao.add("");
        mangquangcao.add("");
        for (int i = 0; i < mangquangcao.size(); i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        Animation slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(slide_in);
        viewFlipper.setOutAnimation(slide_out);
    }

    private void Anhxa(){
        toolbar = findViewById(R.id.toolbar);
        viewFlipper = findViewById(R.id.viewLipper);
        recyclerViewMainPage = findViewById(R.id.recyclerView);
        lvMainPage = findViewById(R.id.lvMainPage);
        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawerlayout);
=======
    public void Anhxa()
    {
        toolbar.findViewById(R.id.toolbarmainpage);
        listViewmain.findViewById(R.id.lvmainpage);
        viewFlipper.findViewById(R.id.viewlipper);
        recyclerView.findViewById(R.id.recyclerview);
        navigationView.findViewById(R.id.naviview);
>>>>>>> 16699cfb6bc1baa34e5f2fbde78ccede0760af33
    }
}