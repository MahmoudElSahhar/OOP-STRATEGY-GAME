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
public class Form_SignUp extends JPanel{
    public JButton Bsignup = new JButton("SignUp");
    public JButton BsignUpback = new JButton("Back");
    public JTextField Tname= new JTextField();
    public JTextField Tusername= new JTextField();
    public JPasswordField Ppassword = new JPasswordField();
    public JPasswordField Prenter = new JPasswordField();
    public JLabel Lname = new JLabel("Name:");
    public JLabel Lusername = new JLabel("Username:");
    public JLabel Lpassword = new JLabel("Password:");
    public JLabel Lrepassword = new JLabel("Renter Password:");
    public JLabel Background = new JLabel();
    
    public Form_SignUp(){
        setSize(1370 ,1536);
        
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("Pics\\GameBackground.jpg").getImage().getScaledInstance(1365, 767, Image.SCALE_DEFAULT)));
        Background.setBounds(0, 0, 1365, 767);
        
        Lname.setBounds(510, 200, 100, 25);
        Lusername.setBounds(Lname.getBounds().x, Lname.getBounds().y + 40, 100, 25);
        Lpassword.setBounds(Lusername.getBounds().x, Lusername.getBounds().y + 40, 100, 25);
        Lrepassword.setBounds(Lpassword.getBounds().x, Lpassword.getBounds().y + 40, 160, 25);
        
        Lname.setFont(new Font("Serif", Font.PLAIN, 20));
        Lusername.setFont(new Font("Serif", Font.PLAIN, 20));
        Lpassword.setFont(new Font("Serif", Font.PLAIN, 20));
        Lrepassword.setFont(new Font("Serif", Font.PLAIN, 20));
        Lname.setForeground(Color.WHITE);
        Lusername.setForeground(Color.WHITE);
        Lpassword.setForeground(Color.WHITE);
        Lrepassword.setForeground(Color.WHITE);
        
        add(Lname);
        add(Lusername);
        add(Lpassword);
        add(Lrepassword);
        
        
        Tname.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lname.getBounds().y, 150, 25);
        Tusername.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lusername.getBounds().y, 150, 25);
        Ppassword.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lpassword.getBounds().y, 150, 25);
        Prenter.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lrepassword.getBounds().y, 150, 25);
        
        add(Tname);
        add(Tusername);
        add(Ppassword);
        add(Prenter);
        
        Bsignup.setBounds(Lrepassword.getBounds().x + 35, Lrepassword.getBounds().y + 50, 80, 30);
        BsignUpback.setBounds(Bsignup.getBounds().x + 150, Bsignup.getBounds().y, 80, 30);
        add(Bsignup);
        add(BsignUpback);
        add(Background);
        
        Bsignup.addActionListener(new ButtonWatcher());
        BsignUpback.addActionListener(new ButtonWatcher());
    }
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if(buttonPressed.equals(Bsignup))
            {
                if(!"".equals(Tname.getText()) && !"".equals(Tusername.getText()) && !"".equals(Ppassword.getText()) && Ppassword.getText().equals(Prenter.getText()))
                {
                    MyFrame2.U = new strategygame.User();
                    MyFrame2.U.signUp();

                    MyFrame2.form_SignUp.Tusername.setText(null);
                    MyFrame2.form_SignUp.Tname.setText(null);
                    MyFrame2.form_SignUp.Ppassword.setText(null);
                    MyFrame2.form_SignUp.Prenter.setText(null);

                    try {
                        strategygame.User.SAVE();
                    } catch (IOException ex) {
                        Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form_SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    MyFrame2.form_SignUp.setVisible(false);
                    MyFrame2.form_HomePage.setVisible(false);
                    MyFrame2.form_NewGame.setVisible(true);
                }
                else
                {
                    if(Ppassword.getText().equals(Prenter.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "Please fill all the required fields...");
                        Ppassword.setText(null);
                        Prenter.setText(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "The 2 passwords doesnot match");
                        Ppassword.setText(null);
                        Prenter.setText(null);
                    }
                }
            }
            else if(buttonPressed.equals(BsignUpback))
            {
                MyFrame2.form_SignUp.setVisible(false);
                MyFrame2.form_HomePage.setVisible(true);
            }
        }
        
    }
}
