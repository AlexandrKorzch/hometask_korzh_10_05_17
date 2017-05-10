package com.korzh.hometask.hometask_korzh_10_05_17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mQualityTv;
    private SeekBar mQualitySb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initSeekBarListener();
    }

    private void initViews() {
        mQualityTv = (TextView)findViewById(R.id.text_view_quality);
        mQualitySb = (SeekBar)findViewById(R.id.seekbar_quality);
    }

    private void initSeekBarListener() {
        mQualitySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                mQualityTv.setText(String.valueOf(progresValue));
            }
        });
    }
}
