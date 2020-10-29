package com.example.capturapokemon;

public class SImuladorCaptura {

    public int a;

    public static class Captura {
        public int Be;
        public int PSmax;
        public int PSact;
        public int Rc;


        public Captura(int PSmax, int PSact, int Rc, int Be) {
            this.PSmax = PSmax;
            this.PSact = PSact;
            this.Rc = Rc;
            this.Be = Be;
        }
    }

    public int calcular(Captura captura) {
        try {
            Thread.sleep(4000);   // simular operacion de larga duracion
        } catch (InterruptedException e) {}

        a = (3*captura.PSmax - 2*captura.PSact) * captura.Rc / (3*captura.PSmax) + captura.Be;
        return (a*1/256*100);
    }

}
