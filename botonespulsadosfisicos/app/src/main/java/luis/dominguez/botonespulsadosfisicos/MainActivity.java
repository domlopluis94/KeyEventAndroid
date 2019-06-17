package luis.dominguez.botonespulsadosfisicos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =findViewById(R.id.text);

    }



    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        text.setText(event.toString());
        if (keyCode == KeyEvent.KEYCODE_MENU) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                }
            }, 2000);
            // ...
            return true;
        } else {
            return super.onKeyUp(keyCode, event);
        }
    }
}
