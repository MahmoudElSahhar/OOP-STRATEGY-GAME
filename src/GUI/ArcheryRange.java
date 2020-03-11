/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class ArcheryRange extends JPanel{
    
//    JPanel InfoBox = new JPanel();    
//    JPanel ActionBox = new JPanel();  
    public JButton createArcher = new JButton("CA");  
    public strategygame.ArcheryRange AR;
     
    
    public ArcheryRange(strategygame.ArcheryRange archeryrange){
        AR = archeryrange;
        setLayout(null);
//        setBackground(Color.red);
        
        setBounds((1365/3)*2, 527, 1365/3, 240);
        
        createArcher.setBounds(42,18,55,55);
        createArcher.addActionListener(new ButtonWatcher());
        
        add(createArcher);
    }
    
    public class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                AR.createArcher();
            } catch (InterruptedException ex) {
                Logger.getLogger(ArcheryRange.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
}


