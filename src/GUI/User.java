///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package GUI;
//
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.HashMap;
//import javax.swing.*;
//
///**
// *
// * @author mahmo
// */
//public class User extends JFrame{
//    public strategygame.User U;
//    /////////////////////////////SIGNUP
////    public JButton Bsignup = new JButton("SignUp");
////    public JButton BsignUpback = new JButton("Back");
////    public JTextField Tname= new JTextField();
////    public JTextField Tusername= new JTextField();
////    public JPasswordField Ppassword = new JPasswordField();
////    public JPasswordField Prenter = new JPasswordField();
////    public JLabel Lname = new JLabel("Name:");
////    public JLabel Lusername = new JLabel("Username:");
////    public JLabel Lpassword = new JLabel("Password:");
////    public JLabel Lrepassword = new JLabel("Renter Password:");
////    public JLabel Limage = new JLabel();
////    public JPanel signUpPanel = new JPanel();
////    public JPanel JP = new JPanel();
////    public Container cp = getContentPane();
//    
//    ///////////////////////////////LOGIN
////    public JButton[] loginButtons= new JButton[2];
////    public JLabel[] loginLabels= new JLabel[2];
////    public JTextField TextFields= new JTextField();
////    public JPasswordField PasswordFields=new JPasswordField();
////    public JPanel loginPanel = new JPanel();
//    
//    //////////////////////////////NEWGAME
////    public JLabel Lmap = new JLabel("Map");
////    public JLabel Lcivilization = new JLabel("Civilization");
////    public JLabel Ldifficulty = new JLabel("Difficulty");
////    public JButton Bstart = new JButton("Start Game");
////    public JButton Breset = new JButton("Reset");
////    public JButton BnewGameback = new JButton("Back");
////    public JComboBox Cmap = new JComboBox(new String[]{"Map 1", "Map 2", "Map 3"});
////    public JComboBox Ccivilization = new JComboBox(new String[]{"Civi 1", "Civi 2", "Civi 3"});
////    public JComboBox Cdifficulty = new JComboBox(new String[]{"Easy", "Medium", "Hard"});
////    public JPanel newGamePanel = new JPanel();
//    
//    ////////////////////////////////CREDITS
////    public JLabel MB = new JLabel(" Made By : ");
////    public JLabel N1 = new JLabel(" FOAD OSAMA");
////    public JLabel N2 = new JLabel(" MAHMOUD HAZEM ");
////    public JLabel N3 = new JLabel(" MOHAMED ALAA ");
////    public JLabel N4 = new JLabel(" YOUSSEF TALAAT ");
////    public JButton creditBack =new JButton(" Back ");
////    public JPanel creditPanel = new JPanel();
//    
//    ////////////////////////////////HOMEPAGE
////    public JButton homepageLogIn =new JButton(" LogIn ");
////    public JButton homepageSignUp =new JButton(" SignUp ");
////    public JPanel homepagePanel = new JPanel();
//    
//    public JLabel imageLabel = new JLabel();
//    
////    HashMap<String, String> users = new HashMap<String, String>();
//    
//    public User(strategygame.User U) {
//        this.U = U;
//        ////////////////////////////////////BACKGROUND IMAGE
//        imageLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahmo\\Desktop\\OOP Project\\15OaI3O.png").getImage().getScaledInstance(1368,710, Image.SCALE_DEFAULT)));
//        imageLabel.setBounds(0, 0, 1368, 710);
//        
//        ////////////////////////////////////SIGNUP
////        setSize(1370 ,1536 );
////        setTitle("SignUp");
////        
////        signUpPanel.setLayout(null);
////        Lname.setBounds(510, 200, 70, 25);
////        Lusername.setBounds(Lname.getBounds().x, Lname.getBounds().y + 40, 70, 25);
////        Lpassword.setBounds(Lusername.getBounds().x, Lusername.getBounds().y + 40, 70, 25);
////        Lrepassword.setBounds(Lpassword.getBounds().x, Lpassword.getBounds().y + 40, 140, 25);
////        signUpPanel.add(Lname);
////        signUpPanel.add(Lusername);
////        signUpPanel.add(Lpassword);
////        signUpPanel.add(Lrepassword);
////        Tname.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lname.getBounds().y, 150, 25);
////        Tusername.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lusername.getBounds().y, 150, 25);
////        Ppassword.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lpassword.getBounds().y, 150, 25);
////        Prenter.setBounds(Lrepassword.getBounds().x + Lrepassword.getSize().width, Lrepassword.getBounds().y, 150, 25);
////        signUpPanel.add(Tname);
////        signUpPanel.add(Tusername);
////        signUpPanel.add(Ppassword);
////        signUpPanel.add(Prenter);
////        Bsignup.setBounds(Lrepassword.getBounds().x + 35, Lrepassword.getBounds().y + 50, 80, 30);
////        BsignUpback.setBounds(Bsignup.getBounds().x + 150, Bsignup.getBounds().y, 80, 30);
////        signUpPanel.add(Bsignup);
////        signUpPanel.add(BsignUpback);
////        signUpPanel.add(imageLabel);
////        Bsignup.addActionListener(new ButtonWatcher());
////        BsignUpback.addActionListener(new ButtonWatcher());
////
////        signUpPanel.setBackground(Color.LIGHT_GRAY);
//        //cp.add(signUpPanel);
//        
//        //////////////////////////////////////LOGIN
////        TextFields= new JTextField("");
////        loginPanel.setLayout(null);
////        loginButtons[0]=new JButton("Login");
////        loginButtons[1]=new JButton("Back");
////        loginLabels[0]=new JLabel("Username");
////        loginLabels[1]=new JLabel("Password");
////        PasswordFields=new JPasswordField("");
////        loginLabels[0].setBounds(550,200 , 60, 50);
////        loginLabels[1].setBounds(loginLabels[0].getBounds().x,loginLabels[0].getBounds().y+loginLabels[0].getBounds().height+10 , 60, 50);
////          
////      
////        loginButtons[0].setBounds(520,loginLabels[0].getBounds().y + 130, 100, 30);
////        loginButtons[1].setBounds(loginButtons[0].getBounds().x+loginButtons[0].getBounds().width+10, loginButtons[0].getBounds().y, 100, 30);
////        TextFields.setBounds(loginLabels[0].getBounds().x+loginLabels[0].getBounds().width+10, loginLabels[0].getBounds().y+10, 100, 25);
////        PasswordFields.setBounds(loginLabels[1].getBounds().x+loginLabels[1].getBounds().width+10, loginLabels[1].getBounds().y+10, 100, 25);
////        
////        loginPanel.add(PasswordFields,null);
////        loginPanel.add(loginLabels[0],null);
////        loginPanel.add(loginLabels[1],null);
////        loginPanel.add(loginButtons[0],null);
////        loginPanel.add(loginButtons[1],null);
////        loginPanel.add(TextFields,null);
////        loginPanel.add(imageLabel);
////        loginPanel.setBackground(Color.LIGHT_GRAY);
////        
////        loginButtons[0].addActionListener(new ButtonWatcher());
////        loginButtons[1].addActionListener(new ButtonWatcher());
//        
//        ////////////////////////////////////////NEWGAME
//        //setSize(700, 1000);
////        newGamePanel.setLayout(null);
////        
////        Lmap.setBounds(500, 200, 40, 30);
////        Lcivilization.setBounds(Lmap.getBounds().x + Lmap.getSize().width +100, Lmap.getBounds().y, 80, 30);
////        Ldifficulty.setBounds(Lcivilization.getBounds().x + Lcivilization.getSize().width + 100, Lmap.getBounds().y, 60, 30);
////        newGamePanel.add(Lmap);
////        newGamePanel.add(Lcivilization);
////        newGamePanel.add(Ldifficulty);
////        Cmap.setBounds(Lmap.getBounds().x - 30, Lmap.getBounds().y + 40, 100, 30);
////        Ccivilization.setBounds(Lcivilization.getBounds().x - 15, Lcivilization.getBounds().y + 40, 100, 30);
////        Cdifficulty.setBounds(Ldifficulty.getBounds().x - 20, Ldifficulty.getBounds().y + 40, 100, 30);
////        newGamePanel.add(Cmap);
////        newGamePanel.add(Ccivilization);
////        newGamePanel.add(Cdifficulty);
////        Bstart.setBounds(Lmap.getBounds().x + 10, Cmap.getBounds().y + 60, 130, 30);
////        Breset.setBounds(Bstart.getBounds().x + Bstart.getSize().width +30, Cmap.getBounds().y + 60, 80, 30);
////        BnewGameback.setBounds(Breset.getBounds().x + Breset.getSize().width +30, Cmap.getBounds().y + 60, 80, 30);
////        newGamePanel.add(Bstart);
////        newGamePanel.add(Breset);
////        newGamePanel.add(BnewGameback);
////        newGamePanel.setBackground(Color.LIGHT_GRAY);
////        newGamePanel.add(imageLabel);
////        
////        Bstart.addActionListener(new ButtonWatcher());
////        BnewGameback.addActionListener(new ButtonWatcher());
////        Breset.addActionListener(new ButtonWatcher());
////        
//        //////////////////////////////////////CREDITS
//        //setTitle("Criedts");
//         //ImageIcon icon=new ImageIcon("back_2.png");
////        creditBack.setFont(new Font("Calibri",Font.BOLD,38));
////
////        creditPanel.setLayout(null);
////        creditBack.setBounds(400,650,300,60);
////        creditBack.setBackground(Color.DARK_GRAY);
////        creditBack.setForeground(Color.yellow);
////
////        MB.setBounds(400,100,300,300);
////        N1.setBounds(400,200,300,300);
////        N2.setBounds(400,250,300,300);
////        N3.setBounds(400,300,300,300);
////        N4.setBounds(400,350,300,300);
////        N1.setForeground(Color.BLUE);
////        N2.setForeground(Color.BLUE);
////        N3.setForeground(Color.BLUE);
////        N4.setForeground(Color.BLUE);
////
////        MB.setFont(new Font("Serif",Font.BOLD,38));
////        N1.setFont(new Font("Calibri",Font.PLAIN,28));
////        N2.setFont(new Font("Calibri",Font.PLAIN,28));
////        N3.setFont(new Font("Calibri",Font.PLAIN,28));
////        N4.setFont(new Font("Calibri",Font.PLAIN,28));
////
////        creditPanel.add(MB);
////        creditPanel.add(N1);
////        creditPanel.add(N2);
////        creditPanel.add(N3);
////        creditPanel.add(N4);
////        creditPanel.add(creditBack);
////        creditPanel.add(imageLabel);
////        creditPanel.setBackground(Color.LIGHT_GRAY);
////        creditBack.addActionListener(new ButtonWatcher());
//        
//        ///////////////////////////////HOMEPAGE
//        //setTitle("Home Page");
//        //setSize(1000,1000);
////        homepageLogIn.setBounds(550,250,200,100);
////        homepageSignUp.setBounds(homepageLogIn.getBounds().x,400,200,100);
////        homepageLogIn.setFont(new Font("Calibri",Font.BOLD,38));
////        homepageSignUp.setFont(new Font("Calibri",Font.BOLD,38));
////
////        homepageLogIn.setBackground(Color.BLACK);
////        homepageSignUp.setForeground(Color.RED);
////        homepageSignUp.setBackground(Color.BLACK);
////        homepageLogIn.setForeground(Color.GREEN);
////        homepagePanel.setLayout(null);
////        homepagePanel.setBackground(Color.LIGHT_GRAY);
////    
////        homepagePanel.add(homepageLogIn);
////        homepagePanel.add(homepageSignUp);
////        
////        homepagePanel.add(imageLabel);
////        
////        homepageLogIn.addActionListener(new ButtonWatcher());
////        homepageSignUp.addActionListener(new ButtonWatcher());
////        cp.add(homepagePanel);
//    }
//    
//    private class ButtonWatcher implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            Object buttonPressed = ae.getSource();
//            if(buttonPressed.equals(Bsignup))
//            {
//                if(!"".equals(Tname.getText()) && !"".equals(Tusername.getText()) && !"".equals(Ppassword.getText()) && Ppassword.getText().equals(Prenter.getText()))
//                {
//                    U.signUp();                    
//                }
//                else
//                {
//                    if(Ppassword.getText().equals(Prenter.getText()))
//                    {
//                        JOptionPane.showMessageDialog(null, "Please fill all the required fields...");
//                        Ppassword.setText(null);
//                        Prenter.setText(null);
//                    }
//                    else
//                    {
//                        JOptionPane.showMessageDialog(null, "The 2 passwords doesnot match");
//                        Ppassword.setText(null);
//                        Prenter.setText(null);
//                    }
//                }
//            }
//            else if(buttonPressed.equals(BsignUpback))
//            {
//                signUpPanel.setVisible(false);
//                homepagePanel.setVisible(true);
////                U.signUp();
//                
//                cp.add(homepagePanel);
//            }
//            
//            //////////////////////////////////LOGIN
//            if(buttonPressed.equals(loginButtons[0]))
//            {
//                if(TextFields.getText() != null && PasswordFields.getText() != null && PasswordFields.getText().equals(strategygame.User.users.get(TextFields.getText())))
//                {
//                    //Main Menu
//                    //call function login here
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "Please fill all the required fields...");
//                }
//            }
//            else if(buttonPressed.equals(loginButtons[1]))
//            {
//                loginPanel.setVisible(false);
//                homepagePanel.setVisible(true);
//                cp.add(homepagePanel);
//            }
//            
//            ////////////////////////////////////NEWGAME
//            if(buttonPressed.equals(Bstart))
//            {
//                //start Gameplay
//            }
//            else if(buttonPressed.equals(BnewGameback))
//            {
//                newGamePanel.setVisible(false);
//                homepagePanel.setVisible(true);
//                cp.add(homepagePanel);
//            }
//            else if(buttonPressed.equals(Breset))
//            {
//                Cmap.setSelectedItem("Map 1");
//                Ccivilization.setSelectedItem("Civi 1");
//                Cdifficulty.setSelectedItem("Easy");
//            }
//            
//            //////////////////////////CREDIT
//            if(buttonPressed.equals(creditBack))
//            {
//                //Main Menu
//            }
//            
//            /////////////////////////////HOMEPAGE
//            if(buttonPressed.equals(homepageLogIn))
//            {
//                homepagePanel.setVisible(false);
//                loginPanel.setVisible(true);
//                cp.add(loginPanel);
//            }
//            else if(buttonPressed.equals(homepageSignUp))
//            {
//                homepagePanel.setVisible(false);
//                signUpPanel.setVisible(true);
//                cp.add(signUpPanel);
//            }
//        }
//    }
//    
//    
//    
//}
