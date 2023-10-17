package com.afa;

public abstract class IntegranteSeleccion {
    private String nombre;
    private String apellido;
    private int hijos;
    private double sueldoBasico;
    private Boolean premio = false;
    public abstract String rolEntrenamiento();
    public IntegranteSeleccion(String pNom,String pApe,double pSB){
        setApellido(pApe);
        setNombre(pNom);
        setSB(pSB);
    }
    
    public IntegranteSeleccion(String pNom,String pApe,int pH,double pSB){
    }
    public void setHijos(int pHijos){
        hijos=pHijos;
    }
    public int getHijos(){
        return hijos;
    }
    public Boolean getPremio(){
        return premio;
    }
    public void setNombre(String pNom){
        nombre=pNom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSB(double pSB){
        sueldoBasico=pSB;
    }
    public double getSB(){
        return sueldoBasico;
    }
    public void setApellido(String pApe){
        nombre=pApe;
    }
    public String getApelido(){
        return apellido;
    }
    private double adicionalHijos(){
        double n=0;
        return n;
    }
    public void mostrarDatos(){}
    private String apeYnom(){
        String n="";
        return n;
    }
    private double aportes(){
        double n=0;
        return 0;
    }
    public double sueldoNeto(){
        double n=0;
        return n;
    }
    
}
