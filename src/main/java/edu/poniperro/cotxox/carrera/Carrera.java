package edu.poniperro.cotxox.carrera;

import edu.poniperro.cotxox.conductores.Conductor;
import edu.poniperro.cotxox.conductores.PoolConductores;
import edu.poniperro.cotxox.tarifa.Tarifa;

public class Carrera {

    //Atributos
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private int costeTotal = 0;
    private int propina = 0;
    private Conductor conductor = null ;

    //Constructor
    public Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    //Métodos

    // no devuelve nada , SET
    // public/private + void + set...+ (tipoDato + dato)

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperadoMinutos) {
        this.tiempoEsperado = tiempoEsperadoMinutos;
    }

    public void setTiempoCarrera(int tiempoCarrera){
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor){
        this.conductor = conductor;
    }

    //devuelve algo
    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getDestino(){
        return this.destino = destino;
    }

    public double getDistancia(){
        return this.distancia = distancia;
    }

    public String getOrigen() {
        return this.origen = origen;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductor.asignarConductor);
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public int getTiempoCarrera(){
        return tiempoCarrera;
    }


    public void realizarPago(double costeEsperado) {
        this.costeTotal= costeEsperado ();
    }
}
