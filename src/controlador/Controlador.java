package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btSuma.addActionListener(this);        
        this.view.btResta.addActionListener(this);
        this.view.btMulti.addActionListener(this);
        this.view.btDivision.addActionListener(this);
    }
    
    public void inicia(){
        view.setTitle("Calculadora");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent er){

        if (view.jv1.getText().equals("") || view.jv2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
            view.jr1.setText(String.valueOf(""));
        }else{
            if (er.getActionCommand().equals("SUMA")) {
                model.setV1(Integer.parseInt(view.jv1.getText()));
                model.setV2(Integer.parseInt(view.jv2.getText()));
                model.suma();
                view.jr1.setText(String.valueOf(model.getR1()));
            }else if (er.getActionCommand().equals("RESTA")) {
                model.setV1(Integer.parseInt(view.jv1.getText()));
                model.setV2(Integer.parseInt(view.jv2.getText()));
                model.restas();
                view.jr1.setText(String.valueOf(model.getR1()));
            }else if (er.getActionCommand().equals("MULTIPLICACION")){
                model.setV1(Integer.parseInt(view.jv1.getText()));
                model.setV2(Integer.parseInt(view.jv2.getText()));
                model.multiplicacion();
                view.jr1.setText(String.valueOf(model.getR1()));
            }else if (er.getActionCommand().equals("DIVISION")){
                if (view.jv1.getText().equals("0") || view.jv2.getText().equals("0")) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                    view.jr1.setText(String.valueOf(""));
                    view.jv1.setText(String.valueOf(""));
                    view.jv2.setText(String.valueOf(""));
                }else{
                    model.setVd1(Integer.parseInt(view.jv1.getText()));
                    model.setVd2(Integer.parseInt(view.jv2.getText()));
                    model.division();
                    view.jr1.setText(String.valueOf(model.getR2()));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione alguna de las operaciones");
            }
        }        
    }
}
