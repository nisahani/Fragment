package id.ac.polinema.fragment.activities;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import id.ac.polinema.fragment.R;
import id.ac.polinema.fragment.fragments.RedFragment;
import id.ac.polinema.fragment.fragments.BlueFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handlerClickLoadRedFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        RedFragment fragmentRed = (RedFragment) getSupportFragmentManager().findFragmentByTag("RED FRAGMENT");

        if(fragmentRed != null && fragmentRed.isVisible())
        {
            // kosong
        }
        else
        {
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambahkan efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);

            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new RedFragment(),"RED FRAGMENT");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();
        }
    }

    public void handleClickLoadBlueFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueFragment fragmentBlue = (BlueFragment) getSupportFragmentManager().findFragmentByTag("BLUE FRAGMENT");

        if(fragmentBlue != null && fragmentBlue.isVisible())
        {
            // kosong
        }
        else
        {
            // Menambah efek animasi
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new BlueFragment(), "BLUE FRAGMENT");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();
        }
    }
}
