package model;

import java.util.ArrayList;

public class Desastre {
    private static long ID_COUNT = 1;
    private long id;
    protected String numeroAfectados;
    protected String impactoEconomico;
    protected String tipo;
    protected ArrayList<Persona> desaparecidos;
    protected String ubicacionPais;
    protected String año;

    public Desastre(String año, String tipo, String ubicacion, String numeroAfectados, String impactoEconomico,
                    ArrayList<Persona> desaparecidos){
        this.id = ID_COUNT++;
        this.año = año;
        this.tipo = tipo;
        this.ubicacionPais = ubicacion;
        this.numeroAfectados = numeroAfectados;
        this.impactoEconomico = impactoEconomico;
        this.desaparecidos = desaparecidos;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNumeroAfectados() {
        return numeroAfectados;
    }
    public void setNumeroAfectados(String numeroAfectados) {
        this.numeroAfectados = numeroAfectados;
    }
    public String getImpactoEconomico() {
        return impactoEconomico;
    }
    public void setImpactoEconomico(String impactoEconomico) {
        this.impactoEconomico = impactoEconomico;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<Persona> getDesaparecidos() {
        return desaparecidos;
    }
    public void setDesaparecidos(ArrayList<Persona> desaparecidos) {
        this.desaparecidos = desaparecidos;
    }
    public String getUbicacionPais() {
        return ubicacionPais;
    }
    public void setUbicacionPais(String ubicacionPais) {
        this.ubicacionPais = ubicacionPais;
    }
    public String getAño() {
        return año;
    }
    public void setAño(String año) {
        this.año = año;
    }

    public void agregarDesaparecidos(Persona persona){
        this.desaparecidos.add(persona);
    }

    public String[] toTableRow(){
        String[] row = {
                String.valueOf(this.id),
                this.año,
                this.tipo,
                this.ubicacionPais,
                this.numeroAfectados,
                this.impactoEconomico,
        };
        return row;
    }
    @Override
    public String toString() {
        return "Desastre{" +
                "id=" + id +
                ", año='" + año + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ubicacion='" + ubicacionPais + '\'' +
                ", numeroAfectados='" + numeroAfectados + '\'' +
                ", impactoEconomico='" + impactoEconomico + '\'' +
                '}';
    }
}
