/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Form_NewGame.Cmap;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import strategygame.Civilization;
/**
 *
 * @author Youssef
 */
public class Form_MainMenu extends JPanel{
    public JButton Continue = new JButton("Continue");
    public JButton NewGame = new JButton("New Game");
    public JButton Option = new JButton("Option");
    public JButton Credits = new JButton("Credits");
    public JButton Exit = new JButton("Exit");
    public JLabel Background = new JLabel();
    
    public Form_MainMenu(){
        setSize(1370 ,1536);
        
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("Pics\\GameBackground.jpg").getImage().getScaledInstance(1365, 767, Image.SCALE_DEFAULT)));
        Background.setBounds(0, 0, 1365, 767);
        
        Continue.setBounds(617, 190, 160, 40);
        NewGame.setBounds(617, Continue.getBounds().y + 60, 160, 40);
        Option.setBounds(617, NewGame.getBounds().y + 60, 160, 40);
        Credits.setBounds(617, Option.getBounds().y + 60, 160, 40);
        Exit.setBounds(617, Credits.getBounds().y + 60, 160, 40);
        
        add(Continue);
        add(NewGame);
        add(Option);
        add(Credits);
        add(Exit);
        add(Background);
        
        Continue.addActionListener(new ButtonWatcher());
        NewGame.addActionListener(new ButtonWatcher());
        Option.addActionListener(new ButtonWatcher());
        Credits.addActionListener(new ButtonWatcher());
        Exit.addActionListener(new ButtonWatcher());
    }
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if(buttonPressed.equals(Continue))
            {
                strategygame.StrategyGame.Frame.createMap((String)Cmap.getSelectedItem());
                for(int i=0;i<strategygame.Civilization.myWorkers.size();i++)
                {
                    MyFrame2.MAP.ADD(Civilization.myWorkers.get(i), Civilization.myWorkers.get(i).getL());
                }
                MyFrame2.form_MainMenu.setVisible(false);
                MyFrame2.MAP.setVisible(true);
            }
            else if(buttonPressed.equals(NewGame))
            {
                strategygame.StrategyGame.Frame.createMap((String)Cmap.getSelectedItem());
                MyFrame2.form_NewGame.setVisible(false);
                
                MyFrame2.U.C = new strategygame.Civilization(MyFrame2.form_NewGame.Ccivilization.getSelectedIndex());
                MyFrame2.form_MainMenu.setVisible(false);
                MyFrame2.MAP.beforePlaying();
                MyFrame2.MAP.setVisible(true);
                try {
                    // create files for this user
                    MyFrame2.U.saveFiles();
                } catch (IOException ex) {
                    Logger.getLogger(Form_MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(buttonPressed.equals(Option))
            {
                //Open Option panel."we will create it"
            }
            else if(buttonPressed.equals(Credits))
            {
                MyFrame2.form_MainMenu.setVisible(false);
                MyFrame2.form_Credits.setVisible(true);
            }
            else if(buttonPressed.equals(Exit))
            {
                System.exit(0);
            }
        }
        
    }
}
