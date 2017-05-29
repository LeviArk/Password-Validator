    package csci.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

    TextView edit;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit =  (TextView) findViewById(R.id.Displayer);
        password = (EditText) findViewById(R.id.passwordText);
    }

    public void passwordChange()
    {
        String passwordHold =  password.getText().toString();
        edit.setText(passwordHold);
    }
}
