/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Youssef
 */
public class Form_NewGame extends JPanel{
    public JLabel Lmap = new JLabel("Map");
    public JLabel Lcivilization = new JLabel("Civilization");
    public JLabel Ldifficulty = new JLabel("Difficulty");
    public JButton Bstart = new JButton("Start Game");
    public JButton Breset = new JButton("Reset");
    public JButton BnewGameback = new JButton("Back");
    public static JComboBox Cmap = new JComboBox(new String[]{"Grass", "Sand", "Snow"});
    public JComboBox Ccivilization = new JComboBox(new String[]{"Civi 1", "Civi 2", "Civi 3"});
    public JComboBox Cdifficulty = new JComboBox(new String[]{"Easy", "Medium", "Hard"});
    public JLabel Background = new JLabel();
    
    public Form_NewGame(){
        setSize(1370 ,768);
        
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("Pics\\GameBackground.jpg").getImage().getScaledInstance(1365, 767, Image.SCALE_DEFAULT)));
        Background.setBounds(0, 0, 1365, 767);
        
        Lmap.setBounds(500, 200, 40, 30);
        Lcivilization.setBounds(Lmap.getBounds().x + Lmap.getSize().width +100, Lmap.getBounds().y, 80, 30);
        Ldifficulty.setBounds(Lcivilization.getBounds().x + Lcivilization.getSize().width + 100, Lmap.getBounds().y, 60, 30);
        add(Lmap);
        add(Lcivilization);
        add(Ldifficulty);
        Cmap.setBounds(Lmap.getBounds().x - 30, Lmap.getBounds().y + 40, 100, 30);
        Ccivilization.setBounds(Lcivilization.getBounds().x - 15, Lcivilization.getBounds().y + 40, 100, 30);
        Cdifficulty.setBounds(Ldifficulty.getBounds().x - 20, Ldifficulty.getBounds().y + 40, 100, 30);
        add(Cmap);
        add(Ccivilization);
        add(Cdifficulty);
        Bstart.setBounds(Lmap.getBounds().x + 10, Cmap.getBounds().y + 60, 130, 30);
        Breset.setBounds(Bstart.getBounds().x + Bstart.getSize().width +30, Cmap.getBounds().y + 60, 80, 30);
        BnewGameback.setBounds(Breset.getBounds().x + Breset.getSize().width +30, Cmap.getBounds().y + 60, 80, 30);
        add(Bstart);
        add(Breset);
        add(BnewGameback);
        add(Background);
        
        Bstart.addActionListener(new ButtonWatcher());
        BnewGameback.addActionListener(new ButtonWatcher());
        Breset.addActionListener(new ButtonWatcher());
    }
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if(buttonPressed.equals(Bstart))
            {
                strategygame.StrategyGame.Frame.createMap((String)Cmap.getSelectedItem());
                MyFrame2.form_NewGame.setVisible(false);
                
                MyFrame2.U.C = new strategygame.Civilization(Ccivilization.getSelectedIndex());
                MyFrame2.MAP.beforePlaying();
                MyFrame2.MAP.setVisible(true);
                try {
                    // create files for this user
                    MyFrame2.U.saveFiles();
                } catch (IOException ex) {
                    Logger.getLogger(Form_NewGame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(buttonPressed.equals(BnewGameback))
            {
                MyFrame2.form_NewGame.setVisible(false);
                MyFrame2.form_HomePage.setVisible(true);
            }
            else if(buttonPressed.equals(Breset))
            {
                Cmap.setSelectedItem("Map 1");
                Ccivilization.setSelectedItem("Civi 1");
                Cdifficulty.setSelectedItem("Easy");
            }
        }
        
    }
}
