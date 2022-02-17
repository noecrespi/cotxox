package edu.poniperro.cotxox.tarifa;

import edu.poniperro.cotxox.carrera.Carrera;

public class Tarifa {

    //Atributos
    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5.00;
    final static byte PORCENTAJE_COMISION = 20;


    //Constructor
    public Tarifa (){
    }

    // Métodos
    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int minutos) {
        return minutos * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera){
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        if (costeTotal > COSTE_MINIMO){
            costeTotal = COSTE_MINIMO;
        }
        return costeTotal;
    }
}
