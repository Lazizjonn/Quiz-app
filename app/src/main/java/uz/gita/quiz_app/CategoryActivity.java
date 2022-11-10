package uz.gita.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        findViewById(R.id.first).setOnClickListener(view -> {
            openMainActivity(1);
        });
        findViewById(R.id.second).setOnClickListener(view -> {
            openMainActivity(2);
        });
        findViewById(R.id.third).setOnClickListener(view -> {
            openMainActivity(3);
        });
        findViewById(R.id.fourth).setOnClickListener(view -> {
            openMainActivity(4);
        });
        findViewById(R.id.fifth).setOnClickListener(view -> {
            openMainActivity(5);
        });
        findViewById(R.id.sixth).setOnClickListener(view -> {
            openMainActivity(6);
        });
        findViewById(R.id.seventh).setOnClickListener(view -> {
            openMainActivity(7);
        });
        findViewById(R.id.eighth).setOnClickListener(view -> {
            openMainActivity(8);
        });
        findViewById(R.id.ninth).setOnClickListener(view -> {
            openMainActivity(9);
        });
        findViewById(R.id.tenth).setOnClickListener(view -> {
            openMainActivity(10);
        });
        findViewById(R.id.eleventh).setOnClickListener(view -> {
            openMainActivity(11);
        });
        findViewById(R.id.twelfth).setOnClickListener(view -> {
            openMainActivity(12);
        });
        findViewById(R.id.thirteenth).setOnClickListener(view -> {
            openMainActivity(13);
        });
        findViewById(R.id.fourteenth).setOnClickListener(view -> {
            openMainActivity(14);
        });
        findViewById(R.id.fifteenth).setOnClickListener(view -> {
            openMainActivity(15);
        });
        findViewById(R.id.sixteenth).setOnClickListener(view -> {
            openMainActivity(16);
        });

        findViewById(R.id.two).setOnClickListener(v -> {

            String link1 = "<a href=\"https://meritnotes.com\">https://meritnotes.com/</a>";
            String message = "\tThis is app developed by Lazizjon Suyunov, who is studying in GITA academy and this is my third app in third week. I used web site " + link1 + "  for making questions." +
                    "\nLevel up your coding skills";
            Spanned myMessage = Html.fromHtml(message);

            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setTitle("About app")
                    .setMessage(myMessage)
                    .setCancelable(false)
                    .setPositiveButton("Ok", (dialogInterface, i) -> {
                    })
                    .create();
            dialog.show();
            TextView msgTxt = (TextView) dialog.findViewById(android.R.id.message);
            msgTxt.setMovementMethod(LinkMovementMethod.getInstance());
        });
    }


    // static method, go to info activity with code;
    private void openMainActivity(int code) {
        Intent intent = new Intent(CategoryActivity.this, MainActivity.class);
        intent.putExtra("CODE", code);
        startActivity(intent);
    }
}