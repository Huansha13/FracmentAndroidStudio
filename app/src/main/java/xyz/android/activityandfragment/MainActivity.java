package xyz.android.activityandfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragment_first.OnButtonClick {
    private fragment_second secondFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Cargar el primer fragmento
        fragment_first firstFragment = new fragment_first();
        fragmentTransaction.add(R.id.fragment_container, firstFragment);
        fragmentTransaction.commit();

        // Cargar el segundo fragmento
        secondFragment = new fragment_second();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container2, secondFragment);
        fragmentTransaction.commit();

    }

    // Método que se llama cuando se presiona el botón en el primer fragmento

    @Override
    public void onButtonClick() {
        secondFragment.updateText("Se presionó el botón");
    }
}