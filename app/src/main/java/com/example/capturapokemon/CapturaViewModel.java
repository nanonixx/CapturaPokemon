package com.example.capturapokemon;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CapturaViewModel extends AndroidViewModel {
        Executor executor;

        SImuladorCaptura simulador;

        MutableLiveData<Double> probabilidad = new MutableLiveData<>();

        public CapturaViewModel(@NonNull Application application) {
            super(application);

            executor = Executors.newSingleThreadExecutor();
            simulador = new SImuladorCaptura();
        }

        public void calcular(int PSmax, int PSact, int Rc, int Be_bool) {

            final SImuladorCaptura.Captura captura = new SImuladorCaptura.Captura(PSmax, PSact, Rc, Be_bool);

            executor.execute(new Runnable() {
                @Override
                public void run() {
                    double prob = simulador.calcular(captura);
                    probabilidad.postValue(prob);
                }
            });
        }
    }