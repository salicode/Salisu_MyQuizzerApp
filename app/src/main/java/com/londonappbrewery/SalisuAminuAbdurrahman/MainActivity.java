package com.londonappbrewery.SalisuAminuAbdurrahman;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here
    Button mtruebutton;
    Button mfalsebutton;
    TextView mQuationTextview;
    int mIndex;
    int mQuation;


    // TODO: Declare member variables here:


    // TODO: Uncomment to create question bank
    private TrueFalse[] mQuestionBank = new TrueFalse[] {
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13,true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtruebutton=(Button)findViewById(R.id.true_button);
        mfalsebutton=(Button)findViewById(R.id.false_button);
        mQuationTextview=(TextView)findViewById(R.id.question_text_view);
        mQuation=mQuestionBank[mIndex].getQuationId();

        mtruebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quizzler","True button was Pressed");
                Toast.makeText(getApplicationContext(),"True Button Was Clickde",Toast.LENGTH_SHORT).show();
            }
        });
         mfalsebutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d("Quizzler","False Button was Clicked");
                 Toast.makeText(getApplicationContext(),"False Button was clicked",Toast.LENGTH_SHORT).show();
             }
         });

    }
}
