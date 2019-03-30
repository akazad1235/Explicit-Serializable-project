package com.example.akazad.employee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.akazad.employee.employee.Employee;

public class EmployeeDeatilsActivity extends AppCompatActivity {

     private TextView nameTV, ageTV, emailTV, phoneTV;
     private Employee e;
     public  static final String TAG=EmployeeDeatilsActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_deatils);
            nameTV=findViewById(R.id.tab_name_value);
            ageTV=findViewById(R.id.tab_age_value);
            emailTV=findViewById(R.id.tab_email_value);
            phoneTV=findViewById(R.id.tab_phone_value);

        Intent intent=getIntent();
      /* String name= intent.getStringExtra("name");
       String age= intent.getStringExtra("age");
       String email=intent.getStringExtra("email");
       String phone=intent.getStringExtra("phone");*/
      e= (Employee) intent.getSerializableExtra("emp");


        /*nameTV.setText(name);
        ageTV.setText(age);
        emailTV.setText(email);
        phoneTV.setText(phone);*/

        /*Log.e(TAG, "onCreate: Name"+name);
        Log.e(TAG, "onCreate: age"+age);
        Log.e(TAG, "onCreate: Email"+email);
        Log.e(TAG, "onCreate: phone"+phone);*/

        nameTV.setText(e.getName());
        ageTV.setText(String.valueOf(e.getAge()));
        emailTV.setText(e.getContact().getEmail());
        phoneTV.setText(e.getContact().getPhone());
    }
}
