package sg.edu.np.mad.madapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    private final static String TAG = "List Activity";
    public static ArrayList<User> userlist = new ArrayList<User>();
    static {
        userlist.add(new User("Reiner", "Student", random_number_gen(), false));
        userlist.add(new User("Luna", "Staff", random_number_gen(), false));
        userlist.add(new User("Josef", "Admin", random_number_gen(), true));
        userlist.add(new User("Jeff", "Lecturer", random_number_gen(), true));
        userlist.add(new User("David", "Student", random_number_gen(), false));
        userlist.add(new User("ghost", "Student", random_number_gen(), false));
        userlist.add(new User("Hazard", "Admin", random_number_gen(), false));
        userlist.add(new User("Sonya", "Student", random_number_gen(), true));
        userlist.add(new User("Apple", "Staff", random_number_gen(), false));
        userlist.add(new User("Fason", "Student", random_number_gen(), true));
        userlist.add(new User("Mitch", "Lecturer", random_number_gen(), true));
        userlist.add(new User("Ern", "Lecturer", random_number_gen(), true));
        userlist.add(new User("Lam", "Staff", random_number_gen(), false));
        userlist.add(new User("Ed", "Student", random_number_gen(), true));
        userlist.add(new User("Ted", "Admin", random_number_gen(), false));
        userlist.add(new User("Mary", "Student", random_number_gen(), false));
        userlist.add(new User("Blade", "Student", random_number_gen(), false));
        userlist.add(new User("Hale", "Staff", random_number_gen(), false));
        userlist.add(new User("raze", "Student", random_number_gen(), false));
        userlist.add(new User("Galde", "Staff", random_number_gen(), false));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.v(TAG, "On Create list activity!");



        RecyclerView recyclerView = findViewById(R.id.RecycleView);
        BrandsAdaptor mAdapter = new BrandsAdaptor(userlist,this);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "On Start list activity!");
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "On Pause list activity!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "On Stop list activity!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "On Destroy list activity!");
    }
    public static int random_number_gen(){
        return (int) Math.floor(Math.random() * 1000000);
    }

}
