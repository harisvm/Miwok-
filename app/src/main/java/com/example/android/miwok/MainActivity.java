
package com.example.android.miwok;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager =  findViewById(R.id.viewpager);


        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());


        viewPager.setAdapter(adapter);

        TabLayout tabLayout =findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    public void OnFragmentInteraction(Uri uri) {

    }
}
