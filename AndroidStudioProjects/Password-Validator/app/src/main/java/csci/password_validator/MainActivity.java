    package csci.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    public void passwordChanger(View view)
    {
        String passwordHold =  password.getText().toString();
        int verify = PasswordVerify(passwordHold);
        if (verify != 2)
            edit.setText("Not a Strong Password");
        else
            edit.setText("This password is fine.");
    }


    public int PasswordVerify(String verified)
    {
        int count = 0;
        if (!verified.equals("password"))
        {
            count++;
        }
        if (!(verified.length() <8))
        {
            count ++;
        }

        return count;
    }

}
