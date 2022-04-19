package com.example.musicplus.MusicPlayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.MediaController;

import com.example.musicplus.MainActivity;

public class MusicController extends MediaController {

    public MusicController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MusicController(MainActivity context) {
        super(context);

    }

    public void hide(){}

}
