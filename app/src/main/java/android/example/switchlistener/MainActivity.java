package android.example.switchlistener;

import android.example.switchlistener.R;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the widgets reference from XML layout
        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        Switch switch_button = (Switch) findViewById(R.id.switch_button);

        // Set a checked change listener for switch button
        switch_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    // If the switch button is on
                    rl.setBackgroundColor(Color.parseColor("#FF000000"));

                    // Show the switch button checked status as toast message
                    Toast.makeText(getApplicationContext(),
                            "Dark Theme is on", Toast.LENGTH_LONG).show();
                }
                else {
                    // If the switch button is off
                    rl.setBackgroundColor(Color.parseColor("#FFFFFF"));

                    // Show the switch button checked status as toast message
                    Toast.makeText(getApplicationContext(),
                            "Dark Theme is off", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}