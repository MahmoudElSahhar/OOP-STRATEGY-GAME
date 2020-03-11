/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Line;
import javax.swing.*;
import strategygame.Location;
import strategygame.MovingAttackingUnit;
/**
 *
 * @author Youssef
 */
public class Map extends JPanel implements MouseListener, MouseMotionListener
{
    public static int mapWidth = 4000;
    public static int mapHeight = 2500;
    
    public Object [][]Map = new Object[4000][2500];
    
    public JLabel lbl = new JLabel("testing");
//    public static JLabel image = new JLabel();
    public static int firstX = -2490, firstY = -1440;
    public static int intialX, intialY;
    
    ///////////////////////////////GroupSelect
    public static int numOfSelectedItems = 0;
    public static boolean isFound = false;
    public static int Xstart, Ystart;
    public static int Xend, Yend;
    public static int xToMove, yToMove;
    public static ArrayList<MovingAttackingUnit> selectedItems = new ArrayList<MovingAttackingUnit>();
    //public static ArrayList<Thread> Threads = new ArrayList<Thread>();
    //Thread t = new Thread();
       
    public ActionBox actionBox ;
    public InfoBox infoBox;
    
    public static ActionBox DAB = new ActionBox();
    public static InfoBox DIB = new InfoBox();
    public static MiniMap MiniMap;
    public static StatusBar statusBar = new StatusBar();
    
    public JPanel CurrentActionBox = DAB;
    public JPanel CurrentInfoBox = DIB;
    
    public Object SelectedObject = null;
    
    public JLabel realMap = new JLabel(); 
    public JPanel Test = new JPanel();
    
    public Map(String type){
        setLayout(null);
        setBackground(Color.PINK);
        setVisible(true);
        setBounds(0, 0, 1366, 768);
        
        //Test.setBounds(0, 40, 1366, 498);
        
        lbl.setBounds(50, 50, 200, 30);
        add(lbl);
        
        realMap.setIcon(new ImageIcon(new ImageIcon("Pics\\" + type + "Map.png").getImage().getScaledInstance(4000, 2500, Image.SCALE_DEFAULT)));
        realMap.setBounds(firstX, firstY, 4000, 2500);
        realMap.addMouseMotionListener(this);
        //Test.addMouseListener(this);
        realMap.addMouseListener(this);
        
//        add(image);
        
        MiniMap = new GUI.MiniMap(type);

        //Test.add(realMap);
        add(statusBar);
        add(DAB);
        add(DIB);
        add(MiniMap);
        add(realMap);
        
        addMouseMotionListener(this);
    }
    
    public void ADD(Component c){
        add(c);
        Map[c.getBounds().x][c.getBounds().y] = c;
        for(int i = c.getBounds().x ; i < c.getBounds().x + c.getBounds().width ; i++)
        {
            for(int j = c.getBounds().y ; j < c.getBounds().y + c.getBounds().height ; j++)
            {
                Map[i][j] = c;
            }
        }
    }
    
    public void beforePlaying(){
        int c_no;
//        strategygame.TownCenter TW2 = new strategygame.TownCenter();
//        Location x2 = new Location();
//        x2.xPosition = 600;
//        x2.yPosition = 200;
//        TW2.create(x2);
//        if(strategygame.Civilization.Civilization_no == 0)
//            c_no = 1;
//        else{
//            c_no = 0;
//        }
            
        strategygame.TownCenter TW1 = new strategygame.TownCenter();
        Location x1 = new Location();
        x1.xPosition = 3000;
        x1.yPosition = 1500;
        TW1.create(x1);
//
//        strategygame.TownCenter TW = new strategygame.TownCenter(1);
//        Location x = new Location();
//        x.xPosition = 300;
//        x.yPosition = 300;
//        TW.create(x);
        
        
        
        
        Location l = new Location();
        l.xPosition = 600;
        l.yPosition = 200;
        strategygame.Wood w = new strategygame.Wood(l);
        l.xPosition += 40;
        strategygame.GoldBlock g = new strategygame.GoldBlock(l);
        l.xPosition += 30;
        strategygame.StoneBlock s = new strategygame.StoneBlock(l);
        l.xPosition += 30;
        strategygame.Food f = new strategygame.Food(l);
        
        SelectedObject = null;
        CurrentActionBox.setVisible(false);
        CurrentInfoBox.setVisible(false);
        DAB.setVisible(true);
        DIB.setVisible(true);
        CurrentActionBox = DAB;
        CurrentInfoBox = DIB;
    }
    
    public void ADD(strategygame.Unit u , strategygame.Location l){
        u.shape.setBounds(l.xPosition, l.yPosition, u.width, u.height);
        Map[u.shape.getBounds().x][u.shape.getBounds().y] = u;
        realMap.add(u.shape);
        
        MiniMap.addDots(l.xPosition, l.yPosition, u);   //calls the function to add a dot on the miniMap for the unit created.
        
        if(u.name.equals("Archer"))
        {
            add(((strategygame.Archer)u).AB);
            add(((strategygame.Archer)u).IB);
        }
        else if(u.name.equals("Horseman"))
        {
            add(((strategygame.Horseman)u).AB);
            add(((strategygame.Horseman)u).IB);
        }
        else if(u.name.equals("Priest"))
        {
            add(((strategygame.Priest)u).AB);
            add(((strategygame.Priest)u).IB);
        }
        else if(u.name.equals("SiegeRam"))
        {
            add(((strategygame.SiegeRam)u).AB);
            add(((strategygame.SiegeRam)u).IB);
        }
        else if(u.name.equals("Soldier"))
        {
            add(((strategygame.Soldier)u).AB);
            add(((strategygame.Soldier)u).IB);
        }
        else if(u.name.equals("Worker"))
        {
            add(((strategygame.Worker)u).AB);
            add(((strategygame.Worker)u).IB);
        }
/////////////////////////////////////////////////////////////////////////////////////////.
        else if(u.name.equals("ArcheryRange"))
        {
            add(((strategygame.ArcheryRange)u).AB);
            add(((strategygame.ArcheryRange)u).IB);      
        }
        else if(u.name.equals("Barrack"))
        {
            add(((strategygame.Barrack)u).AB);
            add(((strategygame.Barrack)u).IB);
        }
        else if(u.name.equals("Gate"))
        {
            add(((strategygame.Gate)u).AB);
            add(((strategygame.Gate)u).IB);
        }
        else if(u.name.equals("House"))
        {
            add(((strategygame.House)u).AB);
            add(((strategygame.House)u).IB);
        }
        else if(u.name.equals("Market"))
        {
            add(((strategygame.Market)u).AB);
            add(((strategygame.Market)u).IB);
        }
        else if(u.name.equals("Monstary"))
        {
            add(((strategygame.Monstary)u).AB);
            add(((strategygame.Monstary)u).IB);
        }
        else if(u.name.equals("SiegeWorkshop"))
        {
            add(((strategygame.SiegeWorkshop)u).AB);
            add(((strategygame.SiegeWorkshop)u).IB);
        }
        else if(u.name.equals("Stable"))
        {
            add(((strategygame.Stable)u).AB);
            add(((strategygame.Stable)u).IB);
        }
        else if(u.name.equals("Tower"))
        {
            add(((strategygame.Tower)u).AB);
            add(((strategygame.Tower)u).IB);
        }
        else if(u.name.equals("TownCenter"))
        {
            add(((strategygame.TownCenter)u).AB);
            add(((strategygame.TownCenter)u).IB);
        }
        else if(u.name.equals("Wall"))
        {
            add(((strategygame.Wall)u).AB);
            add(((strategygame.Wall)u).IB);
        }
        
        for(int i = u.shape.getBounds().x ; i < u.shape.getBounds().x + u.shape.getBounds().width ; i++)
        {
            for(int j = u.shape.getBounds().y ; j < u.shape.getBounds().y + u.shape.getBounds().height ; j++)
            {
                Map[i][j] = u;
            }
        }
        add(realMap);
        repaint();
        //JOptionPane.showMessageDialog(null, "Done.");
    }
    
//    public void Paint(Graphics g, MouseEvent e){
//        super.paint(g);
//        Line l = new Line();
//        g.drawLine(((strategygame.Unit)SelectedObject).L.xPosition, ((strategygame.Unit)SelectedObject).L.yPosition, e.getX(), e.getY());
//        
//    }
    public void ADD(strategygame.Resource r , strategygame.Location l){
        r.shape.setBounds(l.xPosition, l.yPosition, r.width, r.height);
        Map[r.shape.getBounds().x][r.shape.getBounds().y] = r;
        realMap.add(r.shape);
        
//        Min.addDots(l.xPosition, l.yPosition, r);   //calls the function to add a dot on the miniMap for the unit created.
        
        if(r.name.equals("Food"))
        {
            add(((strategygame.Food)r).AB);
            add(((strategygame.Food)r).IB);
        }
        else if(r.name.equals("GoldBlock"))
        {
            add(((strategygame.GoldBlock)r).AB);
            add(((strategygame.GoldBlock)r).IB);
        }
        else if(r.name.equals("StoneBlock"))
        {
            add(((strategygame.StoneBlock)r).AB);
            add(((strategygame.StoneBlock)r).IB);
        }
        else if(r.name.equals("Wood"))
        {
            add(((strategygame.Wood)r).AB);
            add(((strategygame.Wood)r).IB);
        }

        for(int i = r.shape.getBounds().x ; i < r.shape.getBounds().x + r.shape.getBounds().width ; i++)
        {
            for(int j = r.shape.getBounds().y ; j < r.shape.getBounds().y + r.shape.getBounds().height ; j++)
            {
                Map[i][j] = r;
            }
        }
        add(realMap);
        repaint();
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    lbl.setText("" + Map[e.getX()][e.getY()]);
    
    if(SwingUtilities.isLeftMouseButton(e)){    //MouseListener for Left click
        if (Map[e.getX()][e.getY()] == null)
        {
            SelectedObject = null;
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            DAB.setVisible(true);
            DIB.setVisible(true);
            CurrentActionBox = DAB;
            CurrentInfoBox = DIB;
        }
//        else{
//            CurrentActionBox.setVisible(false);
//            CurrentInfoBox.setVisible(false);
//            ((strategygame.OBJECT)Map[e.getX()][e.getY()]).AB.setVisible(true);
//            ((strategygame.OBJECT)Map[e.getX()][e.getY()]).IB.setVisible(true);
//            CurrentActionBox = ((strategygame.OBJECT)Map[e.getX()][e.getY()]).AB;
//            CurrentInfoBox = ((strategygame.OBJECT)Map[e.getX()][e.getY()]).IB;
//            SelectedObject = ((strategygame.OBJECT)Map[e.getX()][e.getY()]);
//        }
/////////////////////////////////////////////////////////////////////////////////////////.
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Archer"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Archer)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Archer)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Archer)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Archer)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Archer)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Horseman"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Horseman)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Horseman)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Horseman)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Horseman)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Horseman)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Priest"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Priest)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Priest)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Priest)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Priest)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Priest)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("SiegeRam"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.SiegeRam)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.SiegeRam)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.SiegeRam)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.SiegeRam)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.SiegeRam)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Soldier"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Soldier)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Soldier)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Soldier)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Soldier)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Soldier)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Worker"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Worker)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Worker)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Worker)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Worker)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Worker)Map[e.getX()][e.getY()]);
        }
/////////////////////////////////////////////////////////////////////////////////////////.
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("ArcheryRange"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.ArcheryRange)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.ArcheryRange)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.ArcheryRange)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.ArcheryRange)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.ArcheryRange)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Barrack"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Barrack)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Barrack)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Barrack)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Barrack)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Barrack)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Gate"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Gate)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Gate)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Gate)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Gate)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Gate)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("House"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.House)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.House)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.House)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.House)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.House)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Market"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Market)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Market)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Market)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Market)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Market)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Monstary"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Monstary)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Monstary)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Monstary)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Monstary)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Monstary)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("SiegeWorkshop"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.SiegeWorkshop)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.SiegeWorkshop)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.SiegeWorkshop)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.SiegeWorkshop)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.SiegeWorkshop)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Stable"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Stable)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Stable)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Stable)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Stable)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Stable)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Tower"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Tower)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Tower)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Tower)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Tower)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Tower)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("TownCenter"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.TownCenter)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.TownCenter)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.TownCenter)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.TownCenter)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.TownCenter)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Wall"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Wall)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Wall)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Wall)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Wall)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Wall)Map[e.getX()][e.getY()]);
        }
//////////////////////////////////////////////////////////////////////////////////////////////////.
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Food"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Food)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Food)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Food)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Food)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Food)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("GoldBlock"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.GoldBlock)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.GoldBlock)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.GoldBlock)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.GoldBlock)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.GoldBlock)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("StoneBlock"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.StoneBlock)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.StoneBlock)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.StoneBlock)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.StoneBlock)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.StoneBlock)Map[e.getX()][e.getY()]);
        }
        else if(((strategygame.OBJECT)Map[e.getX()][e.getY()]).name.equals("Wood"))
        {
            CurrentActionBox.setVisible(false);
            CurrentInfoBox.setVisible(false);
            ((strategygame.Wood)Map[e.getX()][e.getY()]).AB.setVisible(true);
            ((strategygame.Wood)Map[e.getX()][e.getY()]).IB.setVisible(true);
            CurrentActionBox = ((strategygame.Wood)Map[e.getX()][e.getY()]).AB;
            CurrentInfoBox = ((strategygame.Wood)Map[e.getX()][e.getY()]).IB;
            SelectedObject = ((strategygame.Wood)Map[e.getX()][e.getY()]);
        }
//        else{
//            CurrentActionBox.setVisible(false);
//            CurrentInfoBox.setVisible(false);
//            strategygame.StrategyGame.f.DAB.setVisible(true);
//            strategygame.StrategyGame.f.DIB.setVisible(true);
//            CurrentActionBox = strategygame.StrategyGame.f.DAB;
//            CurrentInfoBox = strategygame.StrategyGame.f.DIB;
//            SelectedObject = null;
//        }
    }
    else if (SwingUtilities.isRightMouseButton(e)) {    //MouseListener for Right Click
        
        if(SelectedObject != null)
        {
            
            if(!selectedItems.isEmpty())
            {
                
//                for(int u=0;u<selectedItems.size();u++)
//                {
//                    
//                    Threads.add(t);
//                }
               
               Thread Threads = new Thread()
               {
                   public void run(){
                       
                       for(int i=0;i<selectedItems.size();i++)
                       {
                           Location loc = new Location();
                           xToMove = selectedItems.get(0).getL().xPosition - selectedItems.get(i).getL().xPosition;
                           yToMove = selectedItems.get(0).getL().yPosition - selectedItems.get(i).getL().yPosition;
                           loc.xPosition = e.getX() - xToMove;
                           loc.yPosition = e.getY() - yToMove;
                           if(Map[e.getX()][e.getY()] == null)
                            {
                                JOptionPane.showMessageDialog(null, "Select Moving");
                                JOptionPane.showMessageDialog(null, "Elements selected: " + selectedItems.size());
                                ((strategygame.MovingAttackingUnit)selectedItems.get(i)).move(loc);
                                JOptionPane.showMessageDialog(null, "in For Loop");
                            }
                           
                           //Threads.get(i).start();
                           JOptionPane.showMessageDialog(null, "After For Loop");
                       }
                       
                   }
               };
               Threads.start();
            }
            
            Thread mapThread = new Thread(){
            public void run() {
                if(((strategygame.Unit)SelectedObject).canMove == true  ) //(((strategygame.Unit)SelectedObject).canMove == true ) [foad]
                {
                    Location l = new Location();
                    l.xPosition = e.getX();
                    l.yPosition = e.getY();
                    if(Map[l.xPosition][l.yPosition] == null)
                    {
                        JOptionPane.showMessageDialog(null, "Moving");
                        
                        ((strategygame.MovingAttackingUnit)SelectedObject).move(l);
                        
                    }
                    else if (((strategygame.OBJECT)SelectedObject).name.equals("Worker") && ((strategygame.OBJECT)Map[l.xPosition][l.yPosition]).collectable == true)
                    {
                        JOptionPane.showMessageDialog(null, "Collecting Resources.");
                        try {
                            ((strategygame.Worker)SelectedObject).collectResource((strategygame.Resource)Map[l.xPosition][l.yPosition]);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        try {
                        ((strategygame.MovingAttackingUnit)SelectedObject).move(l);
                        ((strategygame.MovingAttackingUnit)SelectedObject).attack((strategygame.MovingAttackingUnit)Map[e.getX()][e.getY()]);
                        
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ////////////////////////Move then Attack
                        //((strategygame.Unit)(Map[l.xPosition][l.yPosition]))
                    }
                } 
//            SelectedObject = null;
            }
        };
        mapThread.start();
        }
        
    }
}

    @Override
    public void mousePressed(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, ""+e.getX() + " , "+ e.getY());
        Xstart = e.getX();
        Ystart = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Xend = e.getX();
        Yend = e.getY();
        if(Xstart != Xend && Ystart != Yend)
        {
            for(int i = Xstart; i < Xend; i++)
            {
                for(int j = Ystart; j < Yend; j++)
                {
                    if(Map[i][j] != null)
                    {
                        int counter = numOfSelectedItems;
                        isFound = false;
                        if(selectedItems.isEmpty())
                        {
                            selectedItems.add(((strategygame.MovingAttackingUnit)Map[i][j]));
                            numOfSelectedItems++;
                            counter = numOfSelectedItems;
                        }
                        else
                        {
                            for(int z=0;z<counter;z++)
                            {
                                if(((strategygame.MovingAttackingUnit)Map[i][j]) == selectedItems.get(z))
                                {
                                    isFound = true;
                                }
                            }
                            if(isFound == false)
                            {
                                selectedItems.add(((strategygame.MovingAttackingUnit)Map[i][j]));
                                numOfSelectedItems++;
                            }
                        }
                    }
                }
            }
        }        
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {

            intialX = me.getXOnScreen();
            intialY = me.getYOnScreen();
            //JOptionPane.showMessageDialog(null, "X: "+intialX + " Y: " + intialY);
            Thread mapThread = new Thread(){
                public void run()
                {
                    while(firstX < 0 && intialX == 0)
                    {                        
                        firstX++;
                        realMap.setLocation(firstX, firstY);
                        intialX = me.getXOnScreen();
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        repaint();
                    }

                    while(firstY  < 0 && intialY == 0)
                    {
                        firstY++;
                        realMap.setLocation(firstX, firstY);
                        intialY = me.getYOnScreen();
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        repaint();
                    } 
                    while(firstX > -2490 && intialX == 1365)
                    {
                        firstX--;
                        realMap.setLocation(firstX, firstY);
                        intialX = me.getXOnScreen();
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        repaint();
                    }
                    while(firstY > -1440 && intialY == 767)
                    {
                        firstY--;
                        realMap.setLocation(firstX, firstY);
                        intialY = me.getYOnScreen();
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        repaint();
                    }
                }
            };
            mapThread.start();
    }
    
}
