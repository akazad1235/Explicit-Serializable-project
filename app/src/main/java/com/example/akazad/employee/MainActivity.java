package com.example.akazad.employee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akazad.employee.employee.Contact;
import com.example.akazad.employee.employee.Employee;
import com.example.akazad.employee.utils.Validation;

public class MainActivity extends AppCompatActivity {
    private  EditText nameET, ageET, emailET, phoneET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET=findViewById(R.id.name_input);
        ageET=findViewById(R.id.age_input);
        emailET=findViewById(R.id.email_input);
        phoneET=findViewById(R.id.phone_input);





    }

    public void registerEmployee(View view) {
        String name=nameET.getText().toString();
        String age=ageET.getText().toString();
        String email=emailET.getText().toString();
        String phone=phoneET.getText().toString();


        boolean status= Validation.validate(name, age, email, phone);
        if (status){

            Contact c=new Contact(email, phone);
            Employee e=new Employee(name,Integer.parseInt(age), c );


            Intent intent=new Intent(MainActivity.this, EmployeeDeatilsActivity.class);
          /*  intent.putExtra("name", e.getName());
            intent.putExtra("age", e.getAge());
            intent.putExtra("email", e.getContact().getEmail());
            intent.putExtra("phone",e.getContact().getPhone());*/
          intent.putExtra("emp", e);

            startActivity(intent);

        }else{
            Toast.makeText(this, R.string.Empty_field_err_msg, Toast.LENGTH_SHORT).show();
        }


    }
}
