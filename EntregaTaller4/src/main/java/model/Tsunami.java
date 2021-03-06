package model;

import java.util.ArrayList;

public class Tsunami extends Desastre{
    private String magnitud;
    public Tsunami(String año, String tipo, String ubicacion, String numeroAfectados, String impactoEconomico,
                     String magnitud, ArrayList<Persona> desaparecidos){
        super(año,tipo,ubicacion,numeroAfectados,impactoEconomico,desaparecidos);
        this.magnitud = magnitud;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }
    public String[] detalleDesastreTsunami() {
        String año = this.año;
        String tipo = this.tipo;
        String pais = this.ubicacionPais;
        String numeroAfectados = this.numeroAfectados;
        String impactoEconomico = this.impactoEconomico;
        String magnitud = this.magnitud;
        return new String[]{año,tipo,pais,numeroAfectados,impactoEconomico,magnitud};
    }
}
