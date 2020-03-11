/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author mahmo
 */
public class Wall extends JPanel {
    
    public strategygame.Wall W;
    public Wall(strategygame.Wall wall)
    {
        W = wall;
        setLayout(null);
        setBackground(Color.yellow);
        setBounds((1365/3)*2, 527, 1365/3, 240);
        
    }
    
}
