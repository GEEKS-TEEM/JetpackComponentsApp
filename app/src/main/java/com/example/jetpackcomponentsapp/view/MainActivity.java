package com.example.jetpackcomponentsapp.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.jetpackcomponentsapp.MainViewModel;
import com.example.jetpackcomponentsapp.R;
import com.example.jetpackcomponentsapp.view.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            callMainFragment();
            viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.setItems();
    }

    private void callMainFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow();
    }

    public void callAddFragment() {
        Toast.makeText(this,"callAddFragment()", Toast.LENGTH_SHORT).show();
    }

    public void  callUpdateFragment() {
        Toast.makeText(this,"callUpdateFragment()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            super.onBackPressed();
        }
        else {
            getSupportFragmentManager().popBackStack();
        }
    }
}
