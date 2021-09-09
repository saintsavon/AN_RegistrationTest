package tech.savon.registrationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view) {
        TextView txtUserFirstName = findViewById(R.id.txtUserFirstName);
        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        txtUserFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());

        TextView txtUserLastName = findViewById(R.id.txtUserLastName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        txtUserLastName.setText("Last Name: " + edtTxtLastName.getText().toString());

        TextView txtUserEmail = findViewById(R.id.txtUserEmail);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);
        txtUserEmail.setText("Email: " + edtTxtEmail.getText().toString());

    }
}