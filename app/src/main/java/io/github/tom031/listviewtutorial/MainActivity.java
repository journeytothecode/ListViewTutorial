package io.github.tom031.listviewtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextActivity(View view){
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("Image View"))
        {
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
        else if (button_text.equals("List View"))
        {
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }


    }
}
