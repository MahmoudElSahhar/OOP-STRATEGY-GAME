/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Youssef
 */
public class MyFrame2 extends JFrame{
    public static Form_Credits form_Credits = new Form_Credits();
    public static Form_HomePage form_HomePage = new Form_HomePage();
    public static Form_LogIn form_LogIn = new Form_LogIn();
    public static Form_MainMenu form_MainMenu = new Form_MainMenu();
    public static Form_NewGame form_NewGame = new Form_NewGame();
    public static Form_SignUp form_SignUp = new Form_SignUp();
    
    public static GUI.Map MAP;
    
    public static strategygame.User U = new strategygame.User();
            
    public MyFrame2(){
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setTitle("Game");
        setVisible(true);
//        strategygame.StrategyGame.LOAD();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        strategygame.User.SAVE();
        add(form_Credits);
        add(form_LogIn);
        add(form_MainMenu);
        add(form_NewGame);
        add(form_SignUp);
        add(form_HomePage);
        
        form_HomePage.setVisible(true);
    }
    
    public void createMap(String type){
        MAP = new GUI.Map(type);
        add(MAP);
    }
}
