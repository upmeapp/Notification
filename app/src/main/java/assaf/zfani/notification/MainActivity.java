package assaf.zfani.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Button button = (Button)findViewById(R.id.notification);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification SimpleNotification = new NotificationCompat.Builder(MainActivity.this)
                       .setColor(Color.RED)
                       .setContentTitle("This is the title")
                       .setContentText("this is the content of the notification")
                       .setSmallIcon(android.R.drawable.sym_def_app_icon)
                       .build();
                notificationManager.notify(5,SimpleNotification);
            }
        });
    }
}
