package edu.poniperro.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {

    //Atributos
    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    //Atributo
    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    // Métodos
    public List<Conductor> getPolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor(){
        Conductor conductor = new Conductor();
        Random conductorAleatorio = new Random();
        boolean estado = false;
        while (! estado == false){
            // posición 1 = Random(numaleatorio).nextInt(int con valores entre 0 y 232)
            // (getPolConductores (cogela lista).size()(dice el tamaño de ella)
            int i = conductorAleatorio.nextInt(getPolConductores().size());
            conductor = getPolConductores().get(i);

            if (!conductor.isOcupado()){
                conductor.setOcupado(true);
                estado = true;
            }
        }
        return conductor;
    }

}
