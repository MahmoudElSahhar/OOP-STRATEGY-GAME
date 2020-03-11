/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Youssef
 */
public class Worker extends JPanel{
    public JButton buildTownCenter = new JButton("TC");
    public JButton buildHouse = new JButton("H");
    public JButton buildArcheryRange = new JButton();
    public JButton buildBarrack = new JButton();
    public JButton buildStable = new JButton();
    public JButton buildSiegeWorkshop = new JButton();
    public JButton buildMonstary = new JButton();
    public JButton buildMarket = new JButton("MA");
    public JButton buildTower = new JButton("T");
    public JButton buildGate = new JButton("G");
    public JButton buildWall = new JButton();
    
    public strategygame.Worker W;
    
    public Worker(strategygame.Worker worker){
        W = worker;
        
        setLayout(null);
        setBackground(Color.YELLOW);
        
        setBounds(910, 527, 455, 240);
        
        buildTownCenter.setBounds(42,18,55,55);
        buildHouse.setBounds(buildTownCenter.getX()+buildTownCenter.getWidth()+25, buildTownCenter.getY(), buildTownCenter.getWidth(), buildTownCenter.getHeight());
        buildArcheryRange.setBounds(buildHouse.getX()+buildHouse.getWidth()+25, buildHouse.getY(), buildHouse.getWidth(), buildHouse.getHeight());
        buildBarrack.setBounds(buildArcheryRange.getX()+buildArcheryRange.getWidth()+25, buildArcheryRange.getY(), buildArcheryRange.getWidth(), buildArcheryRange.getHeight());
        buildStable.setBounds(buildBarrack.getX()+buildBarrack.getWidth()+25, buildBarrack.getY(), buildBarrack.getWidth(), buildBarrack.getHeight());
        
        buildArcheryRange.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\Game Images\\Building Units\\Archery Range\\icon.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        buildBarrack.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\Game Images\\Building Units\\Barrack\\icon.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        buildMonstary.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\Game Images\\Building Units\\Monstary\\icon.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        buildSiegeWorkshop.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\Game Images\\Building Units\\SiegeWorkshop\\icon.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        buildStable.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\Game Images\\Building Units\\Stable\\icon.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        buildWall.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\Game Images\\Building Units\\Wall\\icon.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH)));
        
        add(buildTownCenter);
        add(buildHouse);
        add(buildArcheryRange);
        add(buildBarrack);
        add(buildStable);
        
        buildSiegeWorkshop.setBounds(buildTownCenter.getX(), buildTownCenter.getY()+buildTownCenter.getWidth()+21, buildTownCenter.getWidth(), buildTownCenter.getHeight());
        buildMonstary.setBounds(buildSiegeWorkshop.getX()+buildSiegeWorkshop.getWidth()+25, buildSiegeWorkshop.getY(), buildSiegeWorkshop.getWidth(), buildSiegeWorkshop.getHeight());
        buildMarket.setBounds(buildMonstary.getX()+buildMonstary.getWidth()+25, buildMonstary.getY(), buildMonstary.getWidth(), buildMonstary.getHeight());
        buildGate.setBounds(buildMarket.getX()+buildMarket.getWidth()+25, buildMarket.getY(), buildMarket.getWidth(), buildMarket.getHeight());
        buildWall.setBounds(buildGate.getX()+buildGate.getWidth()+25, buildGate.getY(), buildGate.getWidth(), buildGate.getHeight());

        add(buildSiegeWorkshop);
        add(buildMonstary);
        add(buildMarket);
        add(buildGate);
        add(buildWall);
        
        buildTower.setBounds(buildSiegeWorkshop.getX(), buildSiegeWorkshop.getY()+buildSiegeWorkshop.getWidth()+21, buildSiegeWorkshop.getWidth(), buildSiegeWorkshop.getHeight());

        add(buildTower);
        
        buildTownCenter.addActionListener(new Build());
        buildHouse.addActionListener(new Build());
        buildArcheryRange.addActionListener(new Build());
        buildBarrack.addActionListener(new Build());
        buildStable.addActionListener(new Build());
        buildSiegeWorkshop.addActionListener(new Build());
        buildMonstary.addActionListener(new Build());
        buildMarket.addActionListener(new Build());
        buildGate.addActionListener(new Build());
        buildWall.addActionListener(new Build());
        buildTower.addActionListener(new Build());
    }
    
    public class Build implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource() == buildTownCenter)
                {
                    W.buildTownCenter();   
                }
                if(e.getSource() == buildHouse)
                {
                    W.buildHouse();
                }
                if(e.getSource() == buildArcheryRange)
                {
                    W.buildArcheryRange();   
                }
                if(e.getSource() == buildBarrack)
                {
                    W.buildBarrack();   
                }
                if(e.getSource() == buildStable)
                {
                    W.buildStable();   
                }
                if(e.getSource() == buildSiegeWorkshop)
                {
                    W.buildSiegeWorkshop();   
                }
                if(e.getSource() == buildMonstary)
                {
                    W.buildMonstary();   
                }
                if(e.getSource() == buildMarket)
                {
                    W.buildMarket();   
                }
                if(e.getSource() == buildGate)
                {
                    W.buildGate();   
                }
                if(e.getSource() == buildWall)
                {
                    W.buildWall();   
                }
                if(e.getSource() == buildTower)
                {
                    W.buildTower();   
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
}
