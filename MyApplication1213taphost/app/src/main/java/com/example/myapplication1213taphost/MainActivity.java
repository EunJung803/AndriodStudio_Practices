package com.example.myapplication1213taphost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSong = tabHost.newTabSpec("Song");
        tabSong.setIndicator("음악별");
        tabSong.setContent(R.id.tabSong);
        tabHost.addTab(tabSong);

        TabHost.TabSpec tabArtist = tabHost.newTabSpec("Artist");
        tabArtist.setIndicator("가수별");
        tabArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabArtist);

        TabHost.TabSpec tabAlbum = tabHost.newTabSpec("Album");
        tabAlbum.setIndicator("앨범별");
        tabAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabAlbum);

        tabHost.setCurrentTab(0);


    }
}