package model;

import java.util.ArrayList;

public class Huracan extends Desastre{
    private String velocidadViento;
    public Huracan(String año, String tipo, String ubicacion, String numeroAfectados, String impactoEconomico,
                   String velocidad, ArrayList<Persona> desaparecidos){
        super(año,tipo,ubicacion,numeroAfectados,impactoEconomico,desaparecidos);
        this.velocidadViento = velocidad;
    }

    public String getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(String velocidadViento) {
        this.velocidadViento = velocidadViento;
    }
}
