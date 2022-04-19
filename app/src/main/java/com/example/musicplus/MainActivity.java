package com.example.musicplus;

import android.os.Bundle;

import com.example.musicplus.MusicPlayer.MusicController;
import com.example.musicplus.MusicPlayer.MusicPlayerFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.musicplus.ui.main.SectionsPagerAdapter;
import com.example.musicplus.databinding.ActivityMainBinding;
import android.widget.MediaController.MediaPlayerControl;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.PlayerFragment, MusicPlayerFragment.class, null)
                .commit();
    }

}