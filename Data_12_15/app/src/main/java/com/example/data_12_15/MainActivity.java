package com.example.data_12_15;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.data_12_15.factory3.ThreadPoolFactory;

import com.example.data_12_15.factory4.IThreadPoolFactory;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        but = (Button) findViewById(R.id.but);

        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
//                Phone mPhone = PhoneFactory.getInstance("MPhone");
//                mPhone.asdd();
//                Phone iPhone = PhoneFactory.getInstance("IPhone");
//                iPhone.asdd();

//                SunmPhoneFactory sunmPhoneFactory = new SunmPhoneFactory();
//                Phone phone = sunmPhoneFactory.createPhone();
//                phone.asdd();
//
//                HuaWeiPhoneFactory huaWeiPhoneFactory = new HuaWeiPhoneFactory();
//                Phone phone1 = huaWeiPhoneFactory.createPhone();
//                phone1.asdd();
//
//                ThreadPoolFactory.getExecutor(ThreadPoolFactory.FIXED_THREADPOOL).executeTask(new Runnable() {
//                    @Override
//                    public void run() {
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                //TODO
//                                Toast.makeText(MainActivity.this, "qwedf", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                    }
//                });

                ThreadPoolFactory.getExecutor(IThreadPoolFactory.SCHDULE_THREADPOOL).executeTask(new Runnable() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "asdqwe", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
                break;
        }
    }
}