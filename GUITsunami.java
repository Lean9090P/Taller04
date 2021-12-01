package gui;

import model.Persona;
import model.Tsunami;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GUITsunami extends JFrame {
    private JPanel panel1;
    private JTable desaparecidosTsunami;

    public GUITsunami(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setTitle("Desaparecidos Tsunami");
        this.setVisible(true);

        Object [] columnas = {"Nombre","Edad","Pais","Sexo","Lugar"};
        desaparecidosTsunami.setModel(new DefaultTableModel(null,columnas));

        ArrayList<Persona> desaparecidos = new ArrayList<Persona>();
        Tsunami tsunami = new Tsunami("1960","Tsunami","Chile","6000","$20000000","25 metros",desaparecidos);
        Persona joaquin = new Persona("Joaquín","Chile","22","Masculino","Valdivia");
        Persona leandro = new Persona("Leandro","Chile","20","Masculino","Valdivia");
        tsunami.agregarDesaparecidos(joaquin);
        tsunami.agregarDesaparecidos(leandro);
        listaDesaparecidos(desaparecidos);

    }

    public void listaDesaparecidos(ArrayList<Persona> desaparecidos){
        for (Persona desaparecido:desaparecidos){
            DefaultTableModel modelo = (DefaultTableModel) desaparecidosTsunami.getModel();
            String[] datos = desaparecido.arreglo();
            modelo.addRow(datos);
        }
    }
}
