package gui;

import model.Terremoto;
import model.Persona;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GUITerremotos extends JFrame {
    private JPanel panel1;
    private JTable desaparecidosTerremoto;

    public GUITerremotos(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setTitle("Desaparecidos Terremoto");
        this.setVisible(true);
        Object [] columnas = {"Nombre","Edad","Pais","Sexo","Nombre del terremoto"};
        desaparecidosTerremoto.setModel(new DefaultTableModel(null,columnas));
        ArrayList<Persona> desaparecidos = new ArrayList<Persona>();
        Terremoto terremoto = new Terremoto("1999","Terremoto","Chile","1",
                "10","7.0","5",desaparecidos);
        Persona joaquin = new Persona("Joaquín","Chile","22","Masculino","Terremoto de Valdivia");
        Persona leandro = new Persona("Leandro","Chile","20","Masculino","Terremoto de Valdivia");
        Persona juanito = new Persona("Juanito","Chile","15","Masculino","Terremoto de Valdivia");
        terremoto.agregarDesaparecidos(joaquin);
        terremoto.agregarDesaparecidos(leandro);
        terremoto.agregarDesaparecidos(juanito);
        listaDesaparecidos(desaparecidos);
    }

    public void listaDesaparecidos(ArrayList<Persona> desaparecidos){
        for (Persona desaparecido:desaparecidos){
            DefaultTableModel modelo = (DefaultTableModel) desaparecidosTerremoto.getModel();
            String[] datos = desaparecido.arreglo();
            modelo.addRow(datos);
        }
    }
}
