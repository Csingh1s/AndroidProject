package com.csing1s.wonders.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.csing1s.wonders.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
      @BindView(R.id.StartButton) Button mStartButton;
    //  @BindView(R.id.NameEditText) EditText mEditText;
    public static final  String NAME="NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.StartButton)
    public void startActivity(View v)
    {
        Intent intent= new Intent(this,Main2Activity.class);
      //  String name = mEditText.getText().toString();
      //  intent.putExtra("name", name);
        String welcomename = "welcome to 7 wonders of the world";
            Toast.makeText(this, welcomename, Toast.LENGTH_LONG).show();
            startActivity(intent);

    }
}
