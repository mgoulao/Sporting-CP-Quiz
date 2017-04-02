package com.mgoulao.sportingcpquiz;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    int numQuestionOneChecked;
    int numQuestionTwoChecked;
    int numQuestionThreeChecked;
    int numQuestionFourChecked;
    int numQuestionFiveChecked;
    int numQuestionSixChecked;
    int numQuestionSevenChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        if(Build.VERSION.SDK_INT <= 19) {
            ScrollView quiz_scroll = (ScrollView) findViewById(R.id.quiz_scroll_view);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) quiz_scroll.getLayoutParams();

            layoutParams.topMargin = 285;
            quiz_scroll.setLayoutParams(layoutParams);
            LinearLayout quizHeader = (LinearLayout) findViewById(R.id.quiz_header);
            quizHeader.setBackgroundResource(R.drawable.quiz_header_api_19);

        }
    }
    // The following methods handles the click event for both radio buttons, and store the number of the question selected
    public void firstQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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
        }
    }
    public void secondQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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
        }
    }
    public void thirdQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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
        }
    }
    public void fourthQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.button_q_four_1:
                if (checked) {
                    numQuestionFourChecked = 1;
                }
                break;
            case R.id.button_q_four_2:
                if (checked) {
                    numQuestionFourChecked = 2;
                }
                break;
            case R.id.button_q_four_3:
                if (checked) {
                    numQuestionFourChecked = 3;
                }
                break;
            case R.id.button_q_four_4:
                if (checked) {
                    numQuestionFourChecked = 4;
                }
                break;
        }
    }
    public void fifthQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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
        }
    }
    public void sixthQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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
        }
    }
    public void seventhQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
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
        if (numQuestionFourChecked == 2) {
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
        // Calculate percentage using double and transform it to an integer
        double scorePerc = correctAnswers / 7 * 100;
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
