package sdu.cs58.wisit.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Explicit ประกาศตัวเเปร
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    //ผูกตัวเเปรบน java ให้รู้จักกับ elament XML
        nameEditText = findViewById(R.id.txtName);
        nameEditText = findViewById(R.id.txtUsername);
        nameEditText = findViewById(R.id.txtpassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
            }
        });

    }//end mettod onCreate
}//end class
