package tk.urbantaxi.dtxi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.MapFragment;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Session extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }
    public void goToMap (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
