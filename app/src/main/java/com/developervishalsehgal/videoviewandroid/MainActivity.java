package com.developervishalsehgal.videoviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    Button playPauseBtn;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.video_view);
        videoView.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4");

        playPauseBtn = findViewById(R.id.btn);
        playPauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPlaying){
                    videoView.start();
                    playPauseBtn.setText(R.string.pause);
                    isPlaying = true;
                }else{
                    videoView.pause();
                    playPauseBtn.setText(R.string.play);
                    isPlaying  = false;
                }

            }
        });


    }
}
