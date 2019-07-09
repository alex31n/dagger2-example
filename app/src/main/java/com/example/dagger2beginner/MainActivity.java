package com.example.dagger2beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2beginner.di.ActivityComponent;
import com.example.dagger2beginner.di.DieselEngineModule;
import com.example.dagger2beginner.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((MyApplication) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
