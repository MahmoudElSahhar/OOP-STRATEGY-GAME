/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Youssef
 */
public class StatusBar extends JPanel implements MouseListener{
    public JLabel gold = new JLabel("GOLD");
    public JLabel currentGold = new JLabel("" + strategygame.Civilization.getMyGold());
    public JLabel stone = new JLabel("STONE");
    public JLabel currentStone = new JLabel("" + strategygame.Civilization.getMyStone());
    public JLabel food = new JLabel("FOOD");
    public JLabel currentFood = new JLabel("" + strategygame.Civilization.getMyFood());
    public JLabel wood = new JLabel("WOOD");
    public JLabel currentWood = new JLabel("" + strategygame.Civilization.getMyWood());
    public JLabel population = new JLabel("POPULATION");
    public JLabel currentPopulation = new JLabel("" + strategygame.Civilization.getPopulation()+" / ");
    public JLabel maxPopulation = new JLabel("" + strategygame.Civilization.getMaxPopulation());
    public JButton pause = new JButton("SAVE");
    
    
    public StatusBar(){
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        
        setBounds(0, 0, 1366, 40);
        pause.setBounds(1256, 5, 100, 30);
        gold.setBounds(150, 5, 50, 30);
        currentGold.setBounds(gold.getX() + 50, gold.getY(), gold.getWidth(), gold.getHeight());
        stone.setBounds(currentGold.getX() + 150, currentGold.getY(), currentGold.getWidth(), currentGold.getHeight());
        currentStone.setBounds(stone.getX() + 50, stone.getY(), stone.getWidth(), stone.getHeight());
        food.setBounds(currentStone.getX() + 150, currentStone.getY(), currentStone.getWidth(), currentStone.getHeight());
        currentFood.setBounds(food.getX() + 50, food.getY(), food.getWidth(), food.getHeight());
        wood.setBounds(currentFood.getX() + 150, currentFood.getY(), currentFood.getWidth(), currentFood.getHeight());
        currentWood.setBounds(wood.getX() + 50, wood.getY(), wood.getWidth(), wood.getHeight());
        
        population.setBounds(currentWood.getX() + 150, currentWood.getY(), 200, currentWood.getHeight());
        currentPopulation.setBounds(population.getX() + 100, population.getY(), population.getWidth(), population.getHeight());
        maxPopulation.setBounds(currentPopulation.getX() + 20, currentPopulation.getY(), currentPopulation.getWidth(), currentPopulation.getHeight());
     
        add(pause);
        add(gold);
        add(currentGold);
        add(stone);
        add(currentStone);
        add(food);
        add(currentFood);
        add(wood);
        add(currentWood);
        add(population);
        add(currentPopulation);
        add(maxPopulation);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource().equals(pause))
        {
            try {
                MyFrame2.U.saveFiles();
            } catch (IOException ex) {
                Logger.getLogger(StatusBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
