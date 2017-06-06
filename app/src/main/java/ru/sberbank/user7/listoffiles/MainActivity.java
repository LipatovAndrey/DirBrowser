package ru.sberbank.user7.listoffiles;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListOfDirectoryes;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListOfDirectoryes = (ListView) findViewById(R.id.listOfDirectoryes);
        mListOfDirectoryes.setAdapter(new DirectoryAdapter());
        getIntent();
    }

}
