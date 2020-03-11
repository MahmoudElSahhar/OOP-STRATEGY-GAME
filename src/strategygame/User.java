/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import GUI.Form_NewGame;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;


/**
 *
 * @author Youssef
 */
public class User implements Serializable{
    public String Username;
    public static String UnitsID;
    private String name;
    private String Password;
    public GUI.MyFrame2 MF = strategygame.StrategyGame.Frame;
   
    
    public static HashMap<String, String> users = new HashMap<String, String>();
    public static ArrayList<User> myUsers = new ArrayList<>();
    
    public static Civilization C;
    
    public User() {
        this.Username = "";
        this.Password = "";
        this.name = "";
        UnitsID = Username;
    }
    
    
    public void signUp () {
        if(users.get(MF.form_SignUp.Tusername.getText()) == null)  //checking if username is taken
        {
//            User US = new User();
//            MF.U = US;
            users.put(MF.form_SignUp.Tusername.getText(),MF.form_SignUp.Ppassword.getText());
            MF.U.Username = MF.form_SignUp.Tusername.getText();
            MF.U.name = MF.form_SignUp.Tname.getText();
            MF.U.Password = MF.form_SignUp.Ppassword.getText();
            //Civilization.myUser.add(US);
            
            myUsers.add(MF.U);
            new File("DATA\\" + MF.U.Username).mkdir();
//            MF.form_SignUp.setVisible(false);
//            MF.form_NewGame.setVisible(true);
//            MF.add(MF.form_NewGame);
            JOptionPane.showMessageDialog(null, "Done.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This username is taken, please try again");
            MF.form_SignUp.Tusername.setText(null);
            MF.form_SignUp.Ppassword.setText(null);
            MF.form_SignUp.Prenter.setText(null);
            MF.form_SignUp.setVisible(false);
            MF.form_HomePage.setVisible(true);
            MF.add(MF.form_HomePage);
        }
    }
    
   public void login() throws FileNotFoundException, IOException, ClassNotFoundException {
       
       JOptionPane.showMessageDialog(null, MF.U.Username);
        FileInputStream F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Archers.txt");
        ObjectInputStream in = new ObjectInputStream(F);
        Civilization.myArchers = (ArrayList<Archer>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\ArcheryRanges.txt");
        in = new ObjectInputStream(F);
        Civilization.myArcheryRanges = (ArrayList<ArcheryRange>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Barracks.txt");
        in = new ObjectInputStream(F);
        Civilization.myBarracks = (ArrayList<Barrack>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Gates.txt");
        in = new ObjectInputStream(F);
        Civilization.myGates = (ArrayList<Gate>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Horsemen.txt");
        in = new ObjectInputStream(F);
        Civilization.myHorsemen = (ArrayList<Horseman>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Houses.txt");
        in = new ObjectInputStream(F);
        Civilization.myHouses = (ArrayList<House>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Markets.txt");
        in = new ObjectInputStream(F);
        Civilization.myMarkets = (ArrayList<Market>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Monstarys.txt");
        in = new ObjectInputStream(F);
        Civilization.myMonstarys = (ArrayList<Monstary>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Priests.txt");
        in = new ObjectInputStream(F);
        Civilization.myPriests = (ArrayList<Priest>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\SiegeRams.txt");
        in = new ObjectInputStream(F);
        Civilization.mySiegeRams = (ArrayList<SiegeRam>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\SiegeWorkshops.txt");
        in = new ObjectInputStream(F);
        Civilization.mySiegeWorkshops = (ArrayList<SiegeWorkshop>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Soldiers.txt");
        in = new ObjectInputStream(F);
        Civilization.mySoldiers = (ArrayList<Soldier>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Stables.txt");
        in = new ObjectInputStream(F);
        Civilization.myStables = (ArrayList<Stable>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Towers.txt");
        in = new ObjectInputStream(F);
        Civilization.myTowers = (ArrayList<Tower>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\TownCenters.txt");
        in = new ObjectInputStream(F);
        Civilization.myTownCenters = (ArrayList<TownCenter>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Walls.txt");
        in = new ObjectInputStream(F);
        Civilization.myWalls = (ArrayList<Wall>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Workers.txt");
        in = new ObjectInputStream(F);
        Civilization.myWorkers = (ArrayList<Worker>)in.readObject();

        F = new FileInputStream("DATA\\"+ MF.U.Username +"\\Map.txt");
        in = new ObjectInputStream(F);
        Civilization.mapType = (String)in.readObject();
        
        F.close();
        JOptionPane.showMessageDialog(null, "Files loaded successfully.");
    }
    
    public void saveFiles() throws FileNotFoundException, IOException {
        //save all data from arrayList to files
        FileOutputStream F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Archers.txt");
        ObjectOutputStream out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myArchers);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\ArcheryRanges.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myArcheryRanges);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Barracks.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myBarracks);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Gates.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myGates); 
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Horsemen.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myHorsemen); 
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Houses.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myHouses);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Markets.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myMarkets);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Monstarys.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myMonstarys);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Priests.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myPriests); 
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\SiegeRams.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.mySiegeRams); 
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\SiegeWorkshops.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.mySiegeWorkshops);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Soldiers.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.mySoldiers);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Stables.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myStables); 
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Towers.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myTowers);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\TownCenters.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myTownCenters);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Walls.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myWalls);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Workers.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myWorkers);
        
        F = new FileOutputStream("DATA\\"+ MF.U.Username +"\\Map.txt");
        out = new ObjectOutputStream(F);
        out.writeObject(GUI.Form_NewGame.Cmap.getSelectedItem());
        
        F.close();
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public HashMap<String, String> getUsers() {
        return users;
    }
    
    // we need a function 'saveGame' and 'loadGame' to read from and write to the binary file.
    
    public static void SAVE() throws FileNotFoundException, IOException, ClassNotFoundException{
        JOptionPane.showMessageDialog(null, "Save() Entered");
        FileOutputStream F = new FileOutputStream("users.txt");
        ObjectOutputStream out = new ObjectOutputStream(F);
        out.writeObject(myUsers);
        JOptionPane.showMessageDialog(null, ""+myUsers.get(0).getUsername()+" , "+myUsers.get(0).getPassword());
        F.close();
        JOptionPane.showMessageDialog(null, "Saved successfully.");
//        return JFrame.EXIT_ON_CLOSE;
    }
    
    public static void LOAD() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream F = new FileInputStream("users.txt");
        ObjectInputStream in = new ObjectInputStream(F);
        
        myUsers = (ArrayList<User>)in.readObject();
        for(int i = 0; i < myUsers.size() ; i++)
        {
            JOptionPane.showMessageDialog(null, ""+myUsers.get(i).getUsername()+" , "+myUsers.get(i).getPassword());
            users.put(myUsers.get(i).getUsername(), myUsers.get(i).getPassword());
        }
        F.close();
        JOptionPane.showMessageDialog(null, "Loaded successfully.");
    }
}
