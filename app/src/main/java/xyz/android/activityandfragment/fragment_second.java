package xyz.android.activityandfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragment_second extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        textView = view.findViewById(R.id.text_view);
        return view;
    }


    // Método para actualizar el texto en el cuadro de texto
    public void updateText(String text) {
        textView.setText(text);
    }
}