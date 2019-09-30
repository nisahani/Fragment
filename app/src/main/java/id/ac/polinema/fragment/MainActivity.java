package id.ac.polinema.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.fragment.activities.DynamicActivity;
import id.ac.polinema.fragment.activities.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleStaticFragment(View view) {
        Intent intent =  new Intent(this, StaticActivity.class);
        startActivity(intent);
    }

    public void handleDynamicFragment(View view) {
        Intent intent =  new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }

    public void handlePraktikumFragment(View view) {
    }
}
