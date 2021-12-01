package gui;

import model.Huracan;
import model.Persona;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GUIHuracan extends JFrame {
    private JPanel panel1;
    private JTable desaparecidosHuracan;

    public GUIHuracan(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setTitle("Desaparecidos Huracan");
        this.setVisible(true);
        Object [] columnas = {"Nombre","Edad","Pais","Sexo","Nombre"};
        desaparecidosHuracan.setModel(new DefaultTableModel(null,columnas));
        ArrayList<Persona> desaparecidos = new ArrayList<Persona>();
        Huracan huracan = new Huracan("2020","Huracan","Chile","10000",
                "$15000000000","sonic",desaparecidos);
        Persona joaquin = new Persona("Joaquín","Chile","22","Masculino","Katrina");
        Persona leandro = new Persona("Leandro","Chile","20","Masculino","Katrina");
        huracan.agregarDesaparecidos(joaquin);
        huracan.agregarDesaparecidos(leandro);
        listaDesaparecidos(desaparecidos);
    }

    public void listaDesaparecidos(ArrayList<Persona> desaparecidos){
        for (Persona desaparecido:desaparecidos){
            DefaultTableModel modelo = (DefaultTableModel) desaparecidosHuracan.getModel();
            String[] datos = desaparecido.arreglo();
            modelo.addRow(datos);
        }
    }
}
