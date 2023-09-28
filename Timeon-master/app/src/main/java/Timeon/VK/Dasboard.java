package Timeon.VK;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dasboard extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
       // TextView text2=(TextView) findViewById(R.id.vedant);
    //    text2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text=(TextView) findViewById(R.id.mail);
           text.setMovementMethod(LinkMovementMethod.getInstance());
         TextView text1=(TextView) findViewById(R.id.location);
             text1.setMovementMethod(LinkMovementMethod.getInstance());

     //   TextView text=(TextView) findViewById(R.id.instagram);
      //  text.setMovementMethod(LinkMovementMethod.getInstance());

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.dashboard:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.block:
                        startActivity(new Intent(getApplicationContext(), Notifications.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }


            });
        }

}