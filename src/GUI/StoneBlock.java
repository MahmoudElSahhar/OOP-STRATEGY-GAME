/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author mahmo
 */
public class StoneBlock extends JPanel{
    
    public strategygame.StoneBlock SB;
    
    public StoneBlock(strategygame.StoneBlock StoneBlock)
    {
        SB = StoneBlock;
        setLayout(null);
                
        setBounds((1365/3)*2, 527, 1365/3, 240);
        setBackground(Color.yellow);
        
    }
    
}
