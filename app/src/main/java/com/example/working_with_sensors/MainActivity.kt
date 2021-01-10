package com.example.working_with_sensors

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sensorManager=getSystemService<SensorManager>()
        if(sensorManager==null)
            Toast.makeText(this,"No sensors Forund",Toast.LENGTH_LONG)
        else
        {
            val allSensorList=sensorManager.getSensorList(Sensor.TYPE_ALL)
            allSensorList.forEach{
                Log.d("sens","""
                    ${it.name} | ${it.vendor} """.trimIndent())
            }
        }
    }
}