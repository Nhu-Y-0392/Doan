package com.example.doan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    Button btnlogin, btnregister, btnforgotpass;
    private FirebaseAuth mAuth;
    EditText STK, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



         STK = findViewById(R.id.STK);
         Pass= findViewById(R.id.Pass);

         Pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

         btnlogin = findViewById(R.id.btnlogin);
         btnlogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (STK.getText().toString().trim().isEmpty() || Pass.getText().toString().trim().isEmpty()) {
                     Toast.makeText(Login.this, "Please input your username and password!",
                             Toast.LENGTH_LONG).show();

                     return;
                 }
                 mAuth = FirebaseAuth.getInstance();
                 String email = STK.getText().toString();
                 String pass = Pass.getText().toString();
                 mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if(task.isSuccessful()){
                             Toast.makeText(Login.this,"login successful", Toast.LENGTH_SHORT).show();
                             Intent i = new Intent(Login.this, MainActivity.class);
                             i.putExtra("username", STK.getText());
                             i.putExtra("password", Pass.getText());
                             startActivity(i);
                         }
                         else {
                             Toast.makeText(Login.this,"login unsuccessful", Toast.LENGTH_SHORT).show();
                         }
                     }
                 });


             }
         });

         btnregister = findViewById(R.id.btnregister);
         btnregister.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Login.this, register.class);
                 startActivity(intent);
             }
         });

    }
}