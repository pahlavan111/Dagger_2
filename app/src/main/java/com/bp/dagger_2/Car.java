package com.bp.dagger_2;

import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    Engine engine= new Engine();
    Wheels wheels = new Wheels();

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    void drive(){
        Log.d(TAG,"this car is driving....");
    }
}
