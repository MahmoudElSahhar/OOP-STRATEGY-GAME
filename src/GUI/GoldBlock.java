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
 * @author Lenovo
 */
public class GoldBlock extends JPanel {
        
//    JPanel InfoBox=new JPanel();    
//    JPanel ActionBox=new JPanel(); 
    public strategygame.GoldBlock GB;
    
    public GoldBlock(strategygame.GoldBlock goldblock){
        GB = goldblock;
        setLayout(null);
        setBackground(Color.red);
        
//        InfoBox.setBounds((1365/3), 527, 1365/3, 240);

        setBounds(910, 527, 455, 240);
    }
}
