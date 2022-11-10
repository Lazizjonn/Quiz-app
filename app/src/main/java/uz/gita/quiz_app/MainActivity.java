package uz.gita.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.utils.widget.MotionButton;

import java.util.ArrayList;
import java.util.List;

import uz.gita.quiz_app.controller.AppController;
import uz.gita.quiz_app.model.TestData;

public class MainActivity extends AppCompatActivity {

    private int position;
    private final int size = 7;
    private int selectRadioPosition = -1;
    private int wrongAnswers;
    private int correctAnswers;
    private AppCompatTextView textOfQuestion;
    private List<RadioButton> radios = new ArrayList<>();
    private AppController controller = AppController.getInstance();
    private List<TestData> dataList;
    private TestData currentData;
    private AppCompatButton btnNext;
    private AppCompatTextView title;
    private String textOfTitle;
    View view;
    TextView text1, text2, count;
    MotionButton motion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int code = getIntent().getIntExtra("CODE", 0);
        getData(code);
        loadView();
        loadData();


    }

    private void loadView() {
        title = findViewById(R.id.main_info);
        textOfQuestion = findViewById(R.id.text_of_question);
        radios.add(findViewById(R.id.radio_1));
        radios.add(findViewById(R.id.radio_2));
        radios.add(findViewById(R.id.radio_3));
        radios.add(findViewById(R.id.radio_4));
        count = findViewById(R.id.sort);
        findViewById(R.id.back).setOnClickListener(v -> {
            super.onBackPressed();
        });
        btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(view -> {
            check();
            loadData();
            btnNext.setEnabled(false);
            clearChecks(-1);
        });
        clickRadio();
    }

    private void loadData() {
        if (position == size) {
            finishTest();
            return;
        }
        currentData = dataList.get(position++);
        title.setText(textOfTitle);
        textOfQuestion.setText(currentData.getQuestion());
        radios.get(0).setText(currentData.getVariant_1());
        radios.get(1).setText(currentData.getVariant_2());
        radios.get(2).setText(currentData.getVariant_3());
        radios.get(3).setText(currentData.getVariant_4());
        count.setText(String.format("Question %d / 7", position));
    }

    private void clickRadio() {
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setTag(i);
            radios.get(i).setOnClickListener(view -> {
                btnNext.setEnabled(true);
                clearChecks((Integer) view.getTag());
                selectRadioPosition = (Integer) view.getTag();
            });
        }

    }

    private void clearChecks(int current) {
        if (selectRadioPosition > -1 && selectRadioPosition != current) {
            radios.get(selectRadioPosition).setChecked(false);
        }
    }

    private void finishTest() {
        dialog(correctAnswers, wrongAnswers);
    }

    private void check() {
        String answer = currentData.getAnswer();
        String myAnswer;
        switch (selectRadioPosition) {
            case 0: {
                myAnswer = currentData.getVariant_1();
                break;
            }
            case 1: {
                myAnswer = currentData.getVariant_2();
                break;
            }
            case 2: {
                myAnswer = currentData.getVariant_3();
                break;
            }
            default: {
                myAnswer = currentData.getVariant_4();
                break;
            }
        }
        if (myAnswer.equals(answer)) correctAnswers++;
        else wrongAnswers++;

    }

    private void getData(int code) {
        switch (code) {
            case 1: {
                dataList = AppController.get_1_C_Plus(getResources());
                textOfTitle = "C++ programming";
                break;
            }
            case 2: {
                dataList = AppController.get_2_Computer_communication(getResources());
                textOfTitle = "Computer communication";
                break;
            }
            case 3: {
                dataList = AppController.get_3_Computer_fundamental(getResources());
                textOfTitle = "Computer fundamental";
                break;
            }
            case 4: {
                dataList = AppController.get_4_Computer_instructor(getResources());
                textOfTitle = "Computer instructor";
                break;
            }
            case 5: {
                dataList = AppController.get_5_Computer_internet(getResources());
                textOfTitle = "Computer and internet";
                break;
            }
            case 6: {
                dataList = AppController.get_6_Computer_memory(getResources());
                textOfTitle = "Computer memory";
                break;
            }
            case 7: {
                dataList = AppController.get_7_Computer_msq(getResources());
                textOfTitle = "Computer architecture";
                break;
            }
            case 8: {
                dataList = AppController.get_8_Computer_networks(getResources());
                textOfTitle = "Computer networks";
                break;
            }
            case 9: {
                dataList = AppController.get_9_Computer_organization(getResources());
                textOfTitle = "Computer organization";
                break;
            }
            case 10: {
                dataList = AppController.get_10_data_communications(getResources());
                textOfTitle = "Data communications";
                break;
            }
            case 11: {
                dataList = AppController.get_11_data_processing(getResources());
                textOfTitle = "Data processing";
                break;
            }
            case 12: {
                dataList = AppController.get_12_data_structure(getResources());
                textOfTitle = "Data structure";
                break;
            }
            case 13: {
                dataList = AppController.get_13_internet_technology(getResources());
                textOfTitle = "Internet technology";
                break;
            }
            case 14: {
                dataList = AppController.get_14_IT(getResources());
                textOfTitle = "Information Technology";
                break;
            }
            case 15: {
                dataList = AppController.get_15_operating_system(getResources());
                textOfTitle = "Operating system";
                break;
            }
            default: {
                dataList = AppController.get_16_artificial_intelligence(getResources());
                textOfTitle = "Artificial intelligence";
                break;
            }
        }
    }

    private void dialog(int correct, int wrong) {
        view = LayoutInflater.from(this).inflate(R.layout.sample_my_view, null);

        text1 = view.findViewById(R.id.correct);
        text1.setText("Correct answers : " + correct);

        text2 = view.findViewById(R.id.incorrect);
        text2.setText("Incorrect answers : " + wrong);

        motion = view.findViewById(R.id.homeButton);

        motion.setOnClickListener(v -> {
            super.onBackPressed();
        });

        AlertDialog dialog1 = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        dialog1.show();
    }

    @Override
    public void onBackPressed() {
        // dialog
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Do you want to exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialogInterface, i) -> {
                    super.onBackPressed();
                    finish();
                })
                .setNegativeButton("No", (d, position) -> {
                })
                .create();
        dialog.show();
    }

    private void openCategoryActivity() {
        Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
        startActivity(intent);
    }


}
