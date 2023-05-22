package sg.edu.rp.c346.id22012433.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer2 = findViewById(R.id.textView2);
        Intent intentReceived2 = getIntent();
        String questionSelected2 = intentReceived2.getStringExtra("Question");
        tvAnswer2.setText(questionSelected2 + " answer is: Gone");

    }
}