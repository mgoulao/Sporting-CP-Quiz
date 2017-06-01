package com.mgoulao.sportingcpquiz;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    int numQuestionOneChecked;
    int numQuestionTwoChecked;
    int numQuestionThreeChecked;
    ArrayList<Integer> numQuestionFourChecked = new ArrayList<>();
    int numQuestionFiveChecked;
    int numQuestionSixChecked;
    int numQuestionSevenChecked;
    static final String Q_ONE = "question one";
    static final String Q_TWO = "question two";
    static final String Q_THREE = "question three";
    static final String Q_FOUR = "question four";
    static final String Q_FIVE = "question five";
    static final String Q_SIX = "question six";
    static final String Q_SEVEN = "question seven";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        for (int i = 0; i < 4; i++) {
            numQuestionFourChecked.add(0);
        }
        if (Build.VERSION.SDK_INT <= 19) {
            ScrollView quiz_scroll = (ScrollView) findViewById(R.id.quiz_scroll_view);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) quiz_scroll.getLayoutParams();
            layoutParams.topMargin = 285;
            quiz_scroll.setLayoutParams(layoutParams);
            LinearLayout quizHeader = (LinearLayout) findViewById(R.id.quiz_header);
            quizHeader.setBackgroundResource(R.drawable.quiz_header_api_19);

        }
        if (savedInstanceState != null) {
            // Restore the question values from saved state
            numQuestionOneChecked = savedInstanceState.getInt(Q_ONE);
            numQuestionTwoChecked = savedInstanceState.getInt(Q_TWO);
            numQuestionThreeChecked = savedInstanceState.getInt(Q_THREE);
            numQuestionFourChecked = savedInstanceState.getIntegerArrayList(Q_FOUR);
            numQuestionFiveChecked = savedInstanceState.getInt(Q_FIVE);
            numQuestionSixChecked = savedInstanceState.getInt(Q_SIX);
            numQuestionSevenChecked = savedInstanceState.getInt(Q_SEVEN);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(Q_ONE, numQuestionOneChecked);
        savedInstanceState.putInt(Q_TWO, numQuestionTwoChecked);
        savedInstanceState.putInt(Q_THREE, numQuestionThreeChecked);
        savedInstanceState.putIntegerArrayList(Q_FOUR, numQuestionFourChecked);
        savedInstanceState.putInt(Q_FIVE, numQuestionFiveChecked);
        savedInstanceState.putInt(Q_SIX, numQuestionSixChecked);
        savedInstanceState.putInt(Q_SEVEN, numQuestionSevenChecked);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore the question values from saved state
        numQuestionOneChecked = savedInstanceState.getInt(Q_ONE);
        numQuestionTwoChecked = savedInstanceState.getInt(Q_TWO);
        numQuestionThreeChecked = savedInstanceState.getInt(Q_THREE);
        numQuestionFourChecked = savedInstanceState.getIntegerArrayList(Q_FOUR);
        numQuestionFiveChecked = savedInstanceState.getInt(Q_FIVE);
        numQuestionSixChecked = savedInstanceState.getInt(Q_SIX);
        numQuestionSevenChecked = savedInstanceState.getInt(Q_SEVEN);

    }

    // The following method handles the click event for radio buttons, and store the number of the question selected
    public void radioQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.button_q_one_1:
                if (checked) {
                    numQuestionOneChecked = 1;
                }
                break;
            case R.id.button_q_one_2:
                if (checked) {
                    numQuestionOneChecked = 2;
                }
                break;
            case R.id.button_q_one_3:
                if (checked) {
                    numQuestionOneChecked = 3;
                }
                break;
            case R.id.button_q_one_4:
                if (checked) {
                    numQuestionOneChecked = 4;
                }
                break;
            case R.id.button_q_two_1:
                if (checked) {
                    numQuestionTwoChecked = 1;
                }
                break;
            case R.id.button_q_two_2:
                if (checked) {
                    numQuestionTwoChecked = 2;
                }
                break;
            case R.id.button_q_two_3:
                if (checked) {
                    numQuestionTwoChecked = 3;
                }
                break;
            case R.id.button_q_two_4:
                if (checked) {
                    numQuestionTwoChecked = 4;
                }
                break;
            case R.id.button_q_three_1:
                if (checked) {
                    numQuestionThreeChecked = 1;
                }
                break;
            case R.id.button_q_three_2:
                if (checked) {
                    numQuestionThreeChecked = 2;
                }
                break;
            case R.id.button_q_three_3:
                if (checked) {
                    numQuestionThreeChecked = 3;
                }
                break;
            case R.id.button_q_three_4:
                if (checked) {
                    numQuestionThreeChecked = 4;
                }
                break;
            case R.id.button_q_five_1:
                if (checked) {
                    numQuestionFiveChecked = 1;
                }
                break;
            case R.id.button_q_five_2:
                if (checked) {
                    numQuestionFiveChecked = 2;
                }
                break;
            case R.id.button_q_five_3:
                if (checked) {
                    numQuestionFiveChecked = 3;
                }
                break;
            case R.id.button_q_five_4:
                if (checked) {
                    numQuestionFiveChecked = 4;
                }
                break;
            case R.id.button_q_six_1:
                if (checked) {
                    numQuestionSixChecked = 1;
                }
                break;
            case R.id.button_q_six_2:
                if (checked) {
                    numQuestionSixChecked = 2;
                }
                break;
            case R.id.button_q_six_3:
                if (checked) {
                    numQuestionSixChecked = 3;
                }
                break;
            case R.id.button_q_six_4:
                if (checked) {
                    numQuestionSixChecked = 4;
                }
                break;
            case R.id.button_q_seven_1:
                if (checked) {
                    numQuestionSevenChecked = 1;
                }
                break;
            case R.id.button_q_seven_2:
                if (checked) {
                    numQuestionSevenChecked = 2;
                }
                break;
            case R.id.button_q_seven_3:
                if (checked) {
                    numQuestionSevenChecked = 3;
                }
                break;
            case R.id.button_q_seven_4:
                if (checked) {
                    numQuestionSevenChecked = 4;
                }
                break;
        }
    }

    // The following method handles the click event for checkbox, and store in the ArrayList the selected options
    public void checkboxQuestion(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.button_q_four_1:
                if (checked) {
                    numQuestionFourChecked.set(0, 1);
                } else {
                    numQuestionFourChecked.set(0, 0);
                }
                break;
            case R.id.button_q_four_2:
                if (checked) {
                    numQuestionFourChecked.set(1, 1);
                } else {
                    numQuestionFourChecked.set(1, 0);
                }
                break;
            case R.id.button_q_four_3:
                if (checked) {
                    numQuestionFourChecked.set(2, 1);
                } else {
                    numQuestionFourChecked.set(2, 0);
                }
                break;
            case R.id.button_q_four_4:
                if (checked) {
                    numQuestionFourChecked.set(3, 1);
                } else {
                    numQuestionFourChecked.set(3, 0);
                }
                break;
        }
    }

    // Calculates the score and shows a Toast
    public void score(View view) {
        double correctAnswers = 0;
        if (numQuestionOneChecked == 1) {
            correctAnswers++;
        }
        if (numQuestionTwoChecked == 3) {
            correctAnswers++;
        }
        if (numQuestionThreeChecked == 4) {
            correctAnswers++;
        }
        if (numQuestionFourChecked.get(0) == 1 && numQuestionFourChecked.get(1) == 1 && numQuestionFourChecked.get(2) == 0
                && numQuestionFourChecked.get(3) == 0) {
            correctAnswers++;
        }
        if (numQuestionFiveChecked == 3) {
            correctAnswers++;
        }
        if (numQuestionSixChecked == 4) {
            correctAnswers++;
        }
        if (numQuestionSevenChecked == 1) {
            correctAnswers++;
        }
        EditText answerEight = (EditText) findViewById(R.id.answer_eight);
        String strAnswerEight = answerEight.getText().toString();
        Log.d("Resposta 8", strAnswerEight.toUpperCase().replaceAll("\\s+", ""));
        if (strAnswerEight.toUpperCase().replaceAll("\\s+", "").equals("SPORTINGCLUBEDEPORTUGAL")) {
            correctAnswers++;
            Log.d("Resposta 8", "Checked");

        }
        // Calculate percentage using double and transform it to an integer
        double scorePerc = correctAnswers / 8 * 100;
        int intScorePerc = (int) Math.round(scorePerc);
        String scorePerText = Integer.toString(intScorePerc);
        // Create a toast with the final score
        Context context = getApplicationContext();
        CharSequence scoreText = "Your Score is: " + scorePerText + " %";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, scoreText, duration);
        toast.show();
    }
}
