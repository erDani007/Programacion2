package com.usc.UI;

import java.awt.Color;
import javax.swing.*;
        
public class VentanaPrincipal extends JFrame {
    
    PanelLogo LogoTriqui;
    PanelTablero etiquetaPrueba;
    PanelPuntaje etiquetaPuntaje;
    
    public static void main(String[] args) 
    {
        
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);
            
    }
    
    public VentanaPrincipal()
    {

        this.setTitle("mi primer ventana");
        this.setBackground(Color.BLACK);
        this.setSize(800,600);
        this.setResizable(false);
        
        LogoTriqui = new PanelLogo();
        this.add(LogoTriqui);
        
        
        etiquetaPrueba = new PanelTablero();
        this.add(etiquetaPrueba);
        
        etiquetaPuntaje = new PanelPuntaje();
        this.add(etiquetaPuntaje);
        

        
    }
}
