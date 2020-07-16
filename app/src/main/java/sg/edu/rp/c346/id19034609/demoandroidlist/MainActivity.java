package sg.edu.rp.c346.id19034609.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> alAndroidList;
//    ArrayAdapter<AndroidVersion> aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);
        alAndroidList = new ArrayList();

        alAndroidList.add(new AndroidVersion("Pie", "9.0"));
        alAndroidList.add(new AndroidVersion("Oreo", " 8.0 - 8.1"));
        alAndroidList.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroidList.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAndroidList.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroidList.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroidList.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));

//        aaAndroid = new ArrayAdapter(this, android.R.layout.simple_list_item_1, alAndroidList);
        adapter = new CustomAdapter(this, R.layout.row, alAndroidList);
        lvAndroid.setAdapter(adapter);
    }
}
