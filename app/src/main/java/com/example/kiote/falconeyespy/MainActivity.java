package com.example.kiote.falconeyespy;

import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;


public class MainActivity extends AppCompatActivity {
    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;

    public static Camera getCameraInstance(){
        Camera mCamera = null;
        try {
            mCamera = Camera.open();
        } catch (RuntimeException e) {
            Log.e("Camera", "failed with " + e.getMessage());
        }
        return mCamera;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Camera mCamera = getCameraInstance();

        mCamera.release();
        Log.i("Camera", "Done");
    }
}
