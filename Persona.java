package model;

public class Persona {
    private String nombre;
    private String pais;
    private String edad;
    private String sexo;
    private String nombreDesastre;

    public Persona(String nombre, String pais, String edad, String sexo, String nombreDesastre) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.sexo = sexo;
        this.nombreDesastre = nombreDesastre;
    }

    public String[] arreglo() {
        String nombre = this.nombre;
        String edad = this.edad;
        String pais = this.pais;
        String sexo = this.sexo;
        String nombreDesastre  = this.nombreDesastre;
        return new String[]{nombre,edad,pais,sexo,nombreDesastre};

    }





}
