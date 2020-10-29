package com.example.capturapokemon;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.example.capturapokemon.databinding.FragmentCapturaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */

public class CapturaFragment extends Fragment {
    private FragmentCapturaBinding binding;

    MainActivity main = new MainActivity();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentCapturaBinding.inflate(inflater, container, false)).getRoot();
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final CapturaViewModel capturaViewModel = new ViewModelProvider(this).get(CapturaViewModel.class);

        binding.Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int PSmax = Integer.parseInt(binding.PSMax.getText().toString());
                int PSAct = Integer.parseInt(binding.PSAct.getText().toString());
                int Rc = Integer.parseInt(binding.Rc.getText().toString());

                int Be;
                if (main.isChecked) Be = 10;
                else Be = 0;

                capturaViewModel.calcular(PSmax, PSAct, Rc, Be);
            }
        });

        capturaViewModel.probabilidad.observe(getViewLifecycleOwner(), new Observer<Double>() {
            @Override
            public void onChanged(Double probs) {
                binding.probs.setText(String.format("La probabilidad de que atrapes el Pokémon es de %.2f ",probs));

            }
        });




    }
}