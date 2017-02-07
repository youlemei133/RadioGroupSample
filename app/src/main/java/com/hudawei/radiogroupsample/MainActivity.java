package com.hudawei.radiogroupsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioGroup radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        RadioButton manButton=(RadioButton) findViewById(R.id.btnMan);
//        RadioButton woManButton=(RadioButton) findViewById(R.id.btnWoman);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        checkedChange();
    }

    private void checkedChange() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radioButton=(RadioButton)findViewById(checkedId);
                Toast.makeText(MainActivity.this,"选择："+radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void getSex(View view){
        int childNums=radioGroup.getChildCount();
        for(int i=0;i<childNums;i++){
            RadioButton button= (RadioButton) radioGroup.getChildAt(i);
            if(button.isChecked())
                Toast.makeText(MainActivity.this,"选择："+button.getText(),Toast.LENGTH_SHORT).show();
        }
    }

    public void getIntresting(View view){
        int childNums=radioGroup2.getChildCount();
        for(int i=0;i<childNums;i++){
            CheckBox button= (CheckBox) radioGroup2.getChildAt(i);
            if(button.isChecked())
                Toast.makeText(MainActivity.this,"选择："+button.getText(),Toast.LENGTH_SHORT).show();
        }
    }


}
