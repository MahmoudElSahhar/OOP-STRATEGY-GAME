

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author foado
 */
public class Food extends JPanel {
    public  strategygame.Food F;
    static final int TheConst = 5; 
    
//     public JLabel ActionBox = new JLabel("ActionBox");
    
    public Food(strategygame.Food food) {
      
        F=food;
        setLayout(null);
        setBackground(Color.BLUE);
        setBounds(911, 528, 455, 240);
       
//         this.add(ActionBox);
    }            
}