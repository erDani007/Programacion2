package com.usc.UI;

import java.awt.Color;
import javax.swing.*;

public class PanelLogo extends JPanel
{
    JLabel textoLogo;
            
    public PanelLogo()
    {
        textoLogo = new JLabel();
        textoLogo.setText("Aqui va el logo");
        add(textoLogo);
        this.setBackground(Color.yellow);
        

        
    }
    
}
