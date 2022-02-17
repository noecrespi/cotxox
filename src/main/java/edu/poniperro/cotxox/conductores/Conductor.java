package edu.poniperro.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

    //Atributos
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>() ;

    //Constructor
    public Conductor(){

    }

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    //Métodos
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }
    

    //Calcula la valoración média 
    private double calcularValoracionMedia(){
        int sumValoraciones =0;
        for (byte valoracion : this.valoraciones) {
            sumValoraciones = sumValoraciones + valoracion;
        }
        this.valoracionMedia = (double) sumValoraciones / this.valoraciones.size();
        return this.valoracionMedia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }
    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

    public boolean isOcupado() {
        return  this.ocupado;
    }
}
