package mvc.pkg28sep;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Mvc28sep {

    public static void main(String[] args) {
        Modelo mod1 = new Modelo();
        Vista vis1 = new Vista();
        Controlador con1 = new Controlador(vis1, mod1);
        con1.inicia();
        vis1.setVisible(true);
    }
    
}
