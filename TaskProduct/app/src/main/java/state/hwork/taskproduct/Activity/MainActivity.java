package state.hwork.taskproduct.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import state.hwork.taskproduct.R;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText editemail,editpass;
    SharedPreferences pref;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();
        btnlogin = findViewById(R.id.btn_login);
        editemail = findViewById(R.id.edt_email);
        editpass = findViewById(R.id.edt_password);
        pref = getSharedPreferences("myfile", Context.MODE_PRIVATE);

        intent = new Intent(MainActivity.this, HomeActivity.class);
        if(pref.contains("emailaddress") && pref.contains("password")){
            startActivity(intent);
            finish();
        }
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = editemail.getText().toString();
                final String pass = editpass.getText().toString();
                if (!isValidEmailaddress(email)) {
                    editemail.setError("Invalid Email Address");
                }else if (!isValidPassword(pass)) {
                    editpass.setError("Invalid password");
                } else{
                    startActivity(intent);
                }
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("emailaddress",email);
                editor.putString("password",pass);
                editor.apply();
            }

            private boolean isValidEmailaddress(String email) {
                String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                Matcher matcher = pattern.matcher(email);
                return matcher.matches();
            }
            private boolean isValidPassword(String pass) {
                if (pass!= null && pass.length() > 7) {
                    return false;
                } else {
                    return true;
                }
            }
        });
    }
}