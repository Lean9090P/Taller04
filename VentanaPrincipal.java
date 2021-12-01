package ventana;

import gui.GUIHuracan;
import gui.GUITerremotos;
import gui.GUITsunami;


import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventana{
    private JLabel bienvenida;
    private JButton botonTerremoto;
    private JButton botonTsunami;
    private JButton botonHuracan;
    private JButton botonSalida;

    public VentanaPrincipal(){
        super("Desastres Naturales",500,340);
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        generarMensajeBienvenida();
        generarBotonTerremoto();
        generarBotonTsunami();
        generarBotonHuracan();
        generarBotonSalir();
    }
    private void generarMensajeBienvenida(){
        String textoBienvenida = "Seleccione el tipo de desastre natural.";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida,20,30,500,30);
    }
    private void generarBotonTerremoto(){
        String textoBoton = "Terremotos";
        this.botonTerremoto = super.generarBoton(textoBoton,175,80,150,40);
        this.add(this.botonTerremoto);
        this.botonTerremoto.addActionListener(this);
    }
    private void generarBotonTsunami(){
        String textoBoton = "Tsunamis";
        this.botonTsunami = super.generarBoton(textoBoton,175,160,150,40);
        this.add(this.botonTsunami);
        this.botonTsunami.addActionListener(this);
    }
    private void generarBotonHuracan(){
        String textoBoton = "Huracanes";
        this.botonHuracan = super.generarBoton(textoBoton,175,240,150,40);
        this.add(this.botonHuracan);
        this.botonHuracan.addActionListener(this);
    }
    private void generarBotonSalir(){
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton,175,320,150,40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.botonTerremoto){
           GUITerremotos gui = new GUITerremotos();
            this.dispose();
        }
        if(e.getSource() == this.botonTsunami){
            GUITsunami gui = new GUITsunami();
            this.dispose();
        }
        if(e.getSource() == this.botonHuracan){
            GUIHuracan gui = new GUIHuracan();
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }
}
