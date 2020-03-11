///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package GUI;
//
//import static GUI.Map.firstX;
//import static GUI.Map.firstY;
//import static GUI.Map.image;
//import static GUI.Map.intialX;
//import static GUI.Map.intialY;
//import java.awt.Image;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionListener;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.*;
//import static strategygame.StrategyGame.MAP;
//
///**
// *
// * @author mahmo
// */
//public class MyFrame extends JFrame implements MouseMotionListener{
//    
//    public static int XonPanels, YonPanels;
//    public static ActionBox DAB = new ActionBox();
//    public static InfoBox DIB = new InfoBox();
//    public static MiniMap MiniMap = new MiniMap();
//    
//    public MyFrame(){
//        setLayout(null);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true);
//        add(MAP);
//        add(DAB);
//        add(DIB);
//        add(MiniMap);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        addMouseMotionListener(this);
//    }
//
//    @Override
//    public void mouseDragged(MouseEvent me) {
//
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent me) {
//        //JOptionPane.showMessageDialog(null, "X: "+intialX + " Y: "+intialY);
//        XonPanels = me.getXOnScreen();
//        YonPanels = me.getYOnScreen();
//        //JOptionPane.showMessageDialog(null, "X: "+XonPanels + " Y: "+YonPanels);
//        
//        Thread mapThread = new Thread(){
//        public void run()
//        {
//        
//            while(firstY  < 0 && YonPanels == 0)
//            {
//                YonPanels = me.getYOnScreen();
//                firstY++;
//                image.setLocation(firstX, firstY);
//                intialY = me.getYOnScreen();
//                try {
//                    Thread.sleep(150);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                repaint();
//            }
//            while(firstY > -100 && YonPanels == 767)
//            {
//                YonPanels = me.getYOnScreen();
//                firstY--;
//                image.setLocation(firstX, firstY);
//                intialY = me.getYOnScreen();
//                try {
//                    Thread.sleep(150);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                repaint();
//            }
//        }
//    };
//    mapThread.start();
//  }
//}
