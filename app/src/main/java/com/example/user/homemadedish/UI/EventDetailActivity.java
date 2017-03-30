package com.example.user.homemadedish.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.homemadedish.R;

public class EventDetailActivity extends AppCompatActivity implements View.OnClickListener{

    Button button_return, button_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        Bundle bundle = getIntent().getBundleExtra("EXTRA");


        ((TextView)findViewById(R.id.text_title_event_detail)).setText(bundle.getString("TITLE"));
        ((TextView)findViewById(R.id.text_venue_event_detail)).setText(bundle.getString("VENUE"));
        ((TextView)findViewById(R.id.text_time_event_detail)).setText(bundle.getString("TIME"));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_join_event_detail:
                //TODO Method to handle event after the user press the join button
                break;
            case R.id.button_return_event_detail:
                finish();
                break;
        }

    }
}
