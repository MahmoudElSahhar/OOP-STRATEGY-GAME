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
public class Tower  extends JPanel{
    
    public strategygame.Tower T;
    
    public Tower(strategygame.Tower tower){
        T = tower;
        setLayout(null);
        setBackground(Color.YELLOW);
        
        setBounds(911, 528, 455, 240);
        
    }
}
