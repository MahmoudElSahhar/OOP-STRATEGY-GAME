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
import static strategygame.User.users;
/**
 *
 * @author Youssef
 */
public class Form_LogIn extends JPanel{
    public JButton Login;
    public JButton Back;
    public JLabel Username;
    public JLabel Password;
    public JTextField un;
    public JPasswordField pw;
    public JLabel Background = new JLabel();
    
    public Form_LogIn(){
        setSize(1370 ,1536);
        
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setVisible(false);
        
        Background.setIcon(new ImageIcon(new ImageIcon("Pics\\GameBackground.jpg").getImage().getScaledInstance(1365, 767, Image.SCALE_DEFAULT)));
        Background.setBounds(0, 0, 1365, 767);
        
        Login = new JButton("Login");
        Back = new JButton("Back");
        Username = new JLabel("Username");
        Password = new JLabel("Password");
        un = new JTextField("");
        pw = new JPasswordField("");
        
        Username.setBounds(600,300 , 100, 50);
        Password.setBounds(Username.getBounds().x,Username.getBounds().y + Username.getBounds().height + 10 , 100, 50);
        Username.setFont(new Font("Serif", Font.PLAIN, 20));
        Password.setFont(new Font("Serif", Font.PLAIN, 20));
        Username.setForeground(Color.WHITE);
        Password.setForeground(Color.WHITE);
      
        Login.setBounds(610,Username.getBounds().y + 130, 100, 30);
        Back.setBounds(Login.getBounds().x + Login.getBounds().width + 10, Login.getBounds().y, 100, 30);
        un.setBounds(Username.getBounds().x + Username.getBounds().width + 10, Username.getBounds().y + 10, 100, 25);
        pw.setBounds(Password.getBounds().x + Password.getBounds().width + 10, Password.getBounds().y + 10, 100, 25);
        
        add(Login);
        add(Back);
        add(Username);
        add(Password);
        add(un);
        add(pw);
        add(Background);
        
        Login.addActionListener(new ButtonWatcher());
        Back.addActionListener(new ButtonWatcher());
    }
    public class ButtonWatcher implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonPressed = e.getSource();
            if(buttonPressed.equals(Login))
            {
//                MyFrame2.U = new strategygame.User();
                
                if(users.get(un.getText()).equals(pw.getText()))
                {
                    try {
                        MyFrame2.U = null;
                        MyFrame2.U = new strategygame.User();
                        MyFrame2.U.Username = un.getText();
                        MyFrame2.U.setPassword(pw.getText());
                        MyFrame2.U.login();
                    } catch (IOException ex) {
                        Logger.getLogger(Form_LogIn.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Form_LogIn.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    MyFrame2.form_LogIn.setVisible(false);
                    MyFrame2.form_MainMenu.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password, please try again");
                    un.setText(null);
                    pw.setText(null);
                }
            }
            else if(buttonPressed.equals(Back))
            {
                MyFrame2.form_LogIn.setVisible(false);
                MyFrame2.form_HomePage.setVisible(true);
            }
        }
        
    }
}
