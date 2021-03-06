package sg.edu.np.mad.madapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private final static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "On Start!");
    }

    protected void onResume() {
        Intent receivedData = getIntent();
        int user_pos = receivedData.getIntExtra("User position",0);
        User user = userlist.get(user_pos);
        Button button = findViewById(R.id.button3);
        TextView hello =findViewById(R.id.hello);
        TextView des = findViewById(R.id.textView);
        des.setText(user.getDescription());
        hello.setText("Hello " + user.getName() + user.getId());
        Log.v(TAG, toString().valueOf(user.isFollowed()));

        if (user.isFollowed() == false){
            button.setText("Follow");
        }
        else{
            button.setText("Unfollow");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.isFollowed() == false){
                    Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_LONG).show();
                    button.setText("Unfollow");
                    user.setFollowed(true);
                    Log.v(TAG, "Followed toast dialog");
                    Log.v(TAG, toString().valueOf(user.isFollowed()));
                }
                else{
                    Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_LONG).show();
                    button.setText("Follow");
                    user.setFollowed(false);
                    Log.v(TAG, "Unfollowed toast dialog");
                    Log.v(TAG, toString().valueOf(user.isFollowed()));
                }
            }
        });
        super.onResume();
        Log.v(TAG, "On Resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "On Pause!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "On Stop!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "On Destroy!");
    }

}