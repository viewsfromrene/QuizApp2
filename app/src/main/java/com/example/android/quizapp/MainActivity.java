package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view) {
        score = 0;

        display(0);

        EditText nameCollect = findViewById(R.id.name);
        nameCollect.getText().clear();

        RadioGroup question2 = findViewById(R.id.radiogroup2);
        question2.clearCheck();

        RadioGroup question3 = findViewById(R.id.radiogroup3);
        question3.clearCheck();

        RadioGroup question4 = findViewById(R.id.radiogroup4);
        question4.clearCheck();

        RadioGroup question5 = findViewById(R.id.radiogroup5);
        question5.clearCheck();

        CheckBox questiona6 = findViewById(R.id.a6);
        questiona6.setChecked(false);

        CheckBox questionb6 = findViewById(R.id.b6);
        questionb6.setChecked(false);

        CheckBox questionc6 = findViewById(R.id.c6);
        questionc6.setChecked(false);

        CheckBox questiond6 = findViewById(R.id.d6);
        questiond6.setChecked(false);

        CheckBox questione6 = findViewById(R.id.e6);
        questione6.setChecked(false);

        CheckBox questionf6 = findViewById(R.id.f6);
        questionf6.setChecked(false);

        RadioGroup question7 = findViewById(R.id.radiogroup7);
        question7.clearCheck();

        RadioGroup question8 = findViewById(R.id.radiogroup8);
        question8.clearCheck();

        RadioGroup question9 = findViewById(R.id.radiogroup9);
        question9.clearCheck();

        RadioGroup question10 = findViewById(R.id.radiogroup10);
        question10.clearCheck();

    }

    public void submit(View view) {

        EditText nameCollect = findViewById(R.id.name);
        String name = nameCollect.getText().toString();

        RadioGroup question2 = findViewById(R.id.radiogroup2);
        int q2 = question2.getCheckedRadioButtonId();
        //Perform an action based on the option chosen
        if (q2 == R.id.a2) {
            getScore(0);
        } else if (q2 == R.id.b2) {
            getScore(1);
        } else if (q2 == R.id.c2) {
            getScore(0);
        }

        RadioGroup question3 = findViewById(R.id.radiogroup3);
        int q3 = question3.getCheckedRadioButtonId();

        if (q3 == R.id.a3) {
            getScore(1);
        } else if (q3 == R.id.b3) {
            getScore(0);
        } else if (q3 == R.id.c3) {
            getScore(0);
        }

        RadioGroup question4 = findViewById(R.id.radiogroup4);
        int q4 = question4.getCheckedRadioButtonId();

        if (q4 == R.id.a4) {
            getScore(0);
        } else if (q4 == R.id.b4) {
            getScore(1);
        } else if (q4 == R.id.c4) {
            getScore(0);
        }

        RadioGroup question5 = findViewById(R.id.radiogroup5);
        int q5 = question5.getCheckedRadioButtonId();

        if (q5 == R.id.a5) {
            getScore(0);
        } else if (q5 == R.id.b5) {
            getScore(1);
        } else if (q5 == R.id.c5) {
            getScore(0);
        }

        CheckBox questiona6 = findViewById(R.id.a6);
        boolean a6 = questiona6.isChecked();

        if (a6) {
            getScore(1);
        }

        CheckBox questionb6 = findViewById(R.id.b6);
        boolean b6 = questionb6.isChecked();

        if (b6) {
            getScore(0);
        }

        CheckBox questionc6 = findViewById(R.id.c6);
        boolean c6 = questionc6.isChecked();

        if (c6) {
            getScore(1);
        }

        CheckBox questiond6 = findViewById(R.id.d6);
        boolean d6 = questiond6.isChecked();

        if (d6) {
            getScore(1);
        }

        CheckBox questione6 = findViewById(R.id.e6);
        boolean e6 = questione6.isChecked();

        if (e6) {
            getScore(0);
        }

        CheckBox questionf6 = findViewById(R.id.f6);
        boolean f6 = questionf6.isChecked();
        if (f6) {
            getScore(0);
        }

        RadioGroup question7 = findViewById(R.id.radiogroup7);
        int q7 = question7.getCheckedRadioButtonId();

        if (q7 == R.id.a7) {
            getScore(0);
        } else if (q7 == R.id.b7) {
            getScore(0);
        } else if (q7 == R.id.c7) {
            getScore(1);
        }

        RadioGroup question8 = findViewById(R.id.radiogroup8);
        int q8 = question8.getCheckedRadioButtonId();

        if (q8 == R.id.a8) {
            getScore(0);
        } else if (q8 == R.id.b8) {
            getScore(1);
        } else if (q8 == R.id.c8) {
            getScore(0);
        }

        RadioGroup question9 = findViewById(R.id.radiogroup9);
        int q9 = question9.getCheckedRadioButtonId();

        if (q9 == R.id.a9) {
            getScore(0);
        } else if (q9 == R.id.b9) {
            getScore(0);
        } else if (q9 == R.id.c9) {
            getScore(1);
        }

        RadioGroup question10 = findViewById(R.id.radiogroup10);
        int q10 = question10.getCheckedRadioButtonId();

        if (q10 == R.id.a10) {
            Toast.makeText(this, "We Would Love to Have You: " + name, Toast.LENGTH_SHORT).show();

        } else if (q10 == R.id.b10) {
            Toast.makeText(this, "We Hope You Reconsider: " + name, Toast.LENGTH_LONG).show();
        }

        display(score);

        displayMessage(score);

    }

    private void getScore(int current_score) {
        score += current_score;
    }

    private void display(int number) {
        TextView scoreTextView = findViewById(R.id.display);
        scoreTextView.setText("" + number);
    }

    private void displayMessage(int number) {
        TextView messageTextView = findViewById(R.id.thanks);
        if (number == 10) {
            messageTextView.setText("Wow, You got 10 out of 10 you are a true Nigerian");
        } else {
            messageTextView.setText("Try again, You can do better");
        }
    }

}

