package com.afa;

public class Entrenador extends IntegranteSeleccion {
    private String nacionalidad;
    public Entrenador(String pNom,String pApe,int pH,String pNacio,double pSB){
        super(pNom,pApe,pSB);
        setHijos(pH);
        setNacionalidad(pNacio);
    }
    
    public Entrenador(String pNom,String pApe,double pSB,String pNacio){
        super(pNom,pApe,pSB);
    }
    public String rolEntrenamiento(){
        String n="";
        return n;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String pNacio){
        nacionalidad=pNacio;
    }
    @Override
    public double sueldoNeto(){
        double sueldoNeto=getSB();
        if(getPremio()==true){
            sueldoNeto=sueldoNeto+(sueldoNeto*0.3);
        }
        if(getNacionalidad()!="Argentino"){
            sueldoNeto=sueldoNeto+10000;
        }
        if(getHijos()>0){
            sueldoNeto=sueldoNeto+(5000*getHijos());
        }
        sueldoNeto=sueldoNeto*0.925;
        return sueldoNeto;
    }

    public void mostrarDatos(){}
}
