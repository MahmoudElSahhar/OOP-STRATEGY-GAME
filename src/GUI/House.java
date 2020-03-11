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
 * @author Youssef
 */
public class House extends JPanel{
    
    public strategygame.House H;
    
    public House(strategygame.House house){
        H = house;
        setLayout(null);
        setBackground(Color.RED);
        
        setBounds(911, 528, 455, 240);
        
    }
}
