package xyz.android.activityandfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment_first extends Fragment {

    private OnButtonClick onButtonClick;

    public interface OnButtonClick {
        void onButtonClick();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        // Verificar que la actividad principal implemente la interfaz OnButtonClick
        try {
            onButtonClick = (OnButtonClick) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "debe implementar OnButtonClick");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Configurar el botón para llamar a la actividad principal cuando se presione
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick.onButtonClick();
            }
        });

        return view;
    }
}