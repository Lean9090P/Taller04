package model;

import java.util.ArrayList;

public class Terremoto extends Desastre{
    private String magnitudRichter;
    private String magnitudMercalli;
    public Terremoto(String año, String tipo, String ubicacion, String numeroAfectados, String impactoEconomico,
                     String richter, String mercalli, ArrayList<Persona> desaparecidos){
        super(año,tipo,ubicacion,numeroAfectados,impactoEconomico,desaparecidos);
        this.magnitudRichter = richter;
        this.magnitudMercalli = mercalli;
    }


    public String getMagnitudRichter() {
        return magnitudRichter;
    }
    public void setMagnitudRichter(String magnitudRichter) {
        this.magnitudRichter = magnitudRichter;
    }
    public String getMagnitudMercalli() {
        return magnitudMercalli;
    }
    public void setMagnitudMercalli(String magnitudMercalli) {
        this.magnitudMercalli = magnitudMercalli;
    }
    public String[] detalleDesastreTerremoto() {
        String año = this.año;
        String tipo = this.tipo;
        String pais = this.ubicacionPais;
        String numeroAfectados = this.numeroAfectados;
        String impactoEconomico = this.impactoEconomico;
        String magnitudR = this.magnitudRichter;
        String magnitudE = this.magnitudMercalli;
        return new String[]{año,tipo,pais,numeroAfectados,impactoEconomico,magnitudR,magnitudE};
    }
}