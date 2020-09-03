package com.pruebas.examen.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.pruebas.examen.R;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    public Button btnAgregarColaborador;
    public Button btnColaboradores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colaboradores);

        mAuth = FirebaseAuth.getInstance();

        btnAgregarColaborador = (Button)findViewById(R.id.btnAgregarColaborador);
        btnColaboradores = (Button)findViewById(R.id.btnColaboradores);

        btnAgregarColaborador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AgregarColaboradorActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }




}
