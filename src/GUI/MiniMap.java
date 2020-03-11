/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import strategygame.Unit;

/**
 *
 * @author mahmo
 */
public class MiniMap extends JPanel{
    
    public static JLabel mini = new JLabel();
    public static JLabel dot = new JLabel();
    
    public MiniMap(String type){
        setLayout(null);
        setBackground(Color.BLUE);
        setBounds(0, 527, 1365/3, 240);
        mini.setBounds(10, 10, (1365/3) - 20, 220);
        mini.setIcon(new ImageIcon(new ImageIcon("Pics\\" + type + "Map.png").getImage().getScaledInstance((1365/3) - 20, 220, Image.SCALE_DEFAULT)));
        add(mini);
    }
    
    public void addDots(int xLoc, int yLoc, Unit u){        //Adds a dot on the miniMap to represent this unit.
        
        u.Dot.setBounds(xLoc/9, yLoc/9, 10, 10);
        mini.add(u.Dot);
    }
    
}
