/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Youssef
 */
public class Form_Credits extends JPanel{
    public JLabel MB = new JLabel(" Made By : ");
    public JLabel N1 = new JLabel(" FOAD OSAMA");
    public JLabel N2 = new JLabel(" MAHMOUD HAZEM ");
    public JLabel N3 = new JLabel(" MOHAMED ALAA ");
    public JLabel N4 = new JLabel(" YOUSSEF TALAAT ");
    public JButton Back =new JButton(" Back ");
    public JLabel Background = new JLabel();
    
    public Form_Credits(){
        Back.setFont(new Font("Calibri",Font.BOLD,38));

        setSize(1370 ,1536);
        
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("Pics\\GameBackground.jpg").getImage().getScaledInstance(1365, 767, Image.SCALE_DEFAULT)));
        Background.setBounds(0, 0, 1365, 767);
        
        Back.setBounds(400,650,300,60);
        Back.setBackground(Color.DARK_GRAY);
        Back.setForeground(Color.yellow);

        MB.setBounds(400,100,300,300);
        N1.setBounds(400,200,300,300);
        N2.setBounds(400,250,300,300);
        N3.setBounds(400,300,300,300);
        N4.setBounds(400,350,300,300);
        N1.setForeground(Color.BLUE);
        N2.setForeground(Color.BLUE);
        N3.setForeground(Color.BLUE);
        N4.setForeground(Color.BLUE);

        MB.setFont(new Font("Serif",Font.BOLD,38));
        N1.setFont(new Font("Calibri",Font.PLAIN,28));
        N2.setFont(new Font("Calibri",Font.PLAIN,28));
        N3.setFont(new Font("Calibri",Font.PLAIN,28));
        N4.setFont(new Font("Calibri",Font.PLAIN,28));

        add(MB);
        add(N1);
        add(N2);
        add(N3);
        add(N4);
        add(Back);
        add(Background);
        
        Back.addActionListener(new ButtonWatcher());
    }
    
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MyFrame2.form_Credits.setVisible(false);
            MyFrame2.form_MainMenu.setVisible(true);
            
        }
    }
}
