package com.example.ak92790.musicplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String _path0 =  Environment.getExternalStorageDirectory().toString()+"/Music/Kalimba.mp3";
            File f = new File(_path0);

            FileInputStream fileInputStream = new FileInputStream(f);

            //FileDescriptor fd = fileInputStream.getFD();



            MediaPlayer mediaPlayer = new MediaPlayer();
            //mediaPlayer.setDataSource(fd);
            mediaPlayer.prepare();
            mediaPlayer.start();

        }
        catch(Exception e)
        {
            System.out.println("echec");
        }

    }

}
