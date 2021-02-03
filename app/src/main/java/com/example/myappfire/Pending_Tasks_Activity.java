package com.example.myappfire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Data;
import androidx.work.WorkManager;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class Pending_Tasks_Activity extends AppCompatActivity {

    /*Button selecFecha, selecHora, btnGuardar, btnEliminar;
    TextView tvFecha, tvHora;

    Calendar actual = Calendar.getInstance();
    Calendar calendar = Calendar.getInstance();

    private int minutos, dia, hora, mes, anio;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending__tasks_);

//        selecFecha  = findViewById(R.id.btnFecha);
//        selecHora   = findViewById(R.id.btnHora);
//        tvFecha     = findViewById(R.id.tvFecha);
//        tvHora      = findViewById(R.id.tvHora);
//        btnGuardar  = findViewById(R.id.btnGuardar);
//        btnEliminar = findViewById(R.id.btnEliminar);
//
//
///*................EVENTO DE LOS BOTONES..........................*/
//        selecFecha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                /* DETECTA LA FECHA ACTUAL DEL DISPOSITIVO AL PRESIONAR SOBRE EL BOTON*/
//                anio = actual.get(Calendar.YEAR);
//                mes  = actual.get(Calendar.MONTH);
//                dia  = actual.get(Calendar.DAY_OF_MONTH);
//
//                DatePickerDialog datePickerDialog = new DatePickerDialog(v.getContext(), new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker view, int y, int m, int d) {
//                        calendar.set(Calendar.DAY_OF_MONTH, d);
//                        calendar.set(Calendar.MONTH, m);
//                        calendar.set(Calendar.YEAR, y);
//
///*......................FORMATO PARA LA FECHA EN DIAS MES Y AÑO.................*/
//                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//                        String strDate = format.format(calendar.getTime());
//                        tvFecha.setText(strDate);
//                    }
//                }, anio, mes, dia);
//                datePickerDialog.show();
//            }
//        });
//
//        selecHora.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hora    = actual.get(Calendar.HOUR_OF_DAY);
//                minutos = actual.get(Calendar.MINUTE);
//
//                TimePickerDialog timePickerDialog = new TimePickerDialog(v.getContext(), new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker view, int h, int m) {
//                        calendar.set(Calendar.HOUR_OF_DAY, h);
//                        calendar.set(Calendar.MINUTE, m);
//
//                        tvHora.setText(String.format("%02d:%02d", h, m));
//                    }
//                }, hora, minutos, true);
//                timePickerDialog.show();
//            }
//        });
//
//        btnGuardar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String tag = generateKey();
//                Long AlertTime = calendar.getTimeInMillis() - System.currentTimeMillis();
//                int random = (int)(Math.random() * 50 + 1);
//
//                Data data = GuardarData("Notificacion WorkManager", "prueba funcional", random);
//
//                WorkManagerNotifications.GuardarNotificaciones(AlertTime, data, tag);
//
//                Toast.makeText(Pending_Tasks_Activity.this, "Alarma Guardada!!", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        btnEliminar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                eliminarNoti("tag1");
//
//            }
//        });


    }

    private void eliminarNoti(String tag){
        WorkManager.getInstance(this).cancelAllWorkByTag(tag);
        Toast.makeText(Pending_Tasks_Activity.this, "Alarma Eliminada!!", Toast.LENGTH_LONG).show();

    }

    /*...GENERA UN NUMERO ALEATORIO...*/
    private String generateKey(){
        return UUID.randomUUID().toString();
    }

    /*..PASAR INFORMACION A TRAVES DEL DATA*/
    private Data GuardarData(String titulo, String detalle, int id_noti){

//se guarda la informacion para llevarla al workManagerNotifications
        return new Data.Builder()
                .putString("titulo", titulo)
                .putString("detalle", detalle)
                .putInt("id_noti", id_noti).build();
    }


}