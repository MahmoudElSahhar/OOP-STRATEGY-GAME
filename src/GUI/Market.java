/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Youssef
 */
public class Market extends JPanel{
    public JButton buyFood = new JButton("F");
    public JButton buyStone = new JButton("S");
    public JButton buyWood = new JButton("W");
    public JButton sellFood = new JButton("F");
    public JButton sellStone = new JButton("S");
    public JButton sellWood = new JButton("W");
    public JButton trade = new JButton("TRADE");
    public JLabel buy = new JLabel("BUY");
    public JLabel sell = new JLabel("SELL");
    
    public strategygame.Market M;
    
    public Market(strategygame.Market market){
        M = market;
        setLayout(null);
        setBackground(Color.YELLOW);
        
        setBounds(911, 528, 455, 240);
        
        buy.setBounds(45,18,55,55);
        buyFood.setBounds(buy.getX()+buy.getWidth()+25, buy.getY(), buy.getWidth(), buy.getHeight());
        buyStone.setBounds(buyFood.getX()+buyFood.getWidth()+25, buyFood.getY(), buyFood.getWidth(), buyFood.getHeight());
        buyWood.setBounds(buyStone.getX()+buyStone.getWidth()+25, buyStone.getY(), buyStone.getWidth(), buyStone.getHeight());
        
        add(buy);
        add(buyFood);
        add(buyStone);
        add(buyWood);
        
        sell.setBounds(buy.getX(), buy.getY()+buy.getWidth()+21, buy.getWidth(), buy.getHeight());
        sellFood.setBounds(sell.getX()+sell.getWidth()+25, sell.getY(), sell.getWidth(), sell.getHeight());
        sellStone.setBounds(sellFood.getX()+sellFood.getWidth()+25, sellFood.getY(), sellFood.getWidth(), sellFood.getHeight());
        sellWood.setBounds(sellStone.getX()+sellStone.getWidth()+25, sellStone.getY(), sellStone.getWidth(), sellStone.getHeight());
        
        add(sell);
        add(sellFood);
        add(sellStone);
        add(sellWood);
        
        trade.setBounds(sell.getX(), sell.getY()+sell.getWidth()+21, sell.getWidth()*2, sell.getHeight());
        add(trade);
    }
    
    public class Trade implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == sellFood)
            {
                
            }
            if(e.getSource() == sellStone)
            {
                
            }
            if(e.getSource() == sellWood)
            {
                
            }
            if(e.getSource() == buyFood)
            {
                
            }
            if(e.getSource() == buyStone)
            {
                
            }
            if(e.getSource() == buyWood)
            {
                
            }
        }
    }
}
