package tomer.edu.mycolorclicker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbRed;
    SeekBar sbGreen;
    SeekBar sbBlue;

    TextView tvRed;
    TextView tvGreen;
    TextView tvBlue;

    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_main);

        sbRed = (SeekBar) findViewById(R.id.sbRed);
        sbGreen = (SeekBar) findViewById(R.id.sbGreen);
        sbBlue = (SeekBar) findViewById(R.id.sbBlue);

        tvRed = (TextView) findViewById(R.id.tvRed);
        tvGreen = (TextView) findViewById(R.id.tvGreen);
        tvBlue = (TextView) findViewById(R.id.tvBlue);

        tvTotal = (TextView) findViewById(R.id.tvTotal);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        tvRed.setText(String.valueOf(sbRed.getProgress()));
        tvGreen.setText(String.valueOf(sbGreen.getProgress()));
        tvBlue.setText(String.valueOf(sbBlue.getProgress()));

        int color = Color.rgb(sbRed.getProgress(),sbGreen.getProgress(),sbBlue.getProgress());

        tvTotal.setBackgroundColor(color);

        tvTotal.setText(Integer.toHexString(color).toUpperCase());
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
