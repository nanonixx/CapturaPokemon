package com.example.capturapokemon;

public class SImuladorCaptura {

    public int Be_int;
    public int a;

    public static class Captura {
        public boolean Be_bool;
        public int PSmax;
        public int PSact;
        public int Rc;


        public Captura(int PSmax, int PSact, int rc, boolean be) {
            this.PSmax = PSmax;
            this.PSact = PSact;
            Rc = rc;
            Be_bool = Be_bool;
        }
    }

    public int calcular(Captura captura) {
        try {
            Thread.sleep(10000);   // simular operacion de larga duracion (10s)
        } catch (InterruptedException e) {}

        if (captura.Be_bool) Be_int=10;
        else Be_int=0;

        a = (3*captura.PSmax - 2*captura.PSact) * captura.Rc / (3*captura.PSmax) + Be_int;
        return (a*1/256*100);
    }

}
