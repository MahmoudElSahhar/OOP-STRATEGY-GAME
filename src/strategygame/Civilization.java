/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Youssef
 */
public class Civilization {
    private String name;
    private static int myGold, myStone, myFood, myWood;
    private static int population, maxPopulation;
    private static int upgradeLevel;
    public static int Civilization_no;
    
    public static ArrayList<Archer> myArchers;
    public static ArrayList<ArcheryRange> myArcheryRanges;
    public static ArrayList<Barrack> myBarracks;
    public static ArrayList<Gate> myGates;
    public static ArrayList<Horseman> myHorsemen;
    public static ArrayList<House> myHouses;
    public static ArrayList<Market> myMarkets;
    public static ArrayList<Monstary> myMonstarys;
    public static ArrayList<Priest> myPriests;
    public static ArrayList<SiegeRam> mySiegeRams;
    public static ArrayList<SiegeWorkshop> mySiegeWorkshops;
    public static ArrayList<Soldier> mySoldiers;
    public static ArrayList<Stable> myStables;
    public static ArrayList<Tower> myTowers;
    public static ArrayList<TownCenter> myTownCenters;
    public static ArrayList<Wall> myWalls;
    public static ArrayList<Worker> myWorkers;
    public static ArrayList<User> myUser;
    public static String mapType;
    
    //Constructor : 
    public Civilization(int C_no){
        myArchers = new ArrayList<>();
        myArcheryRanges = new ArrayList<>();
        myBarracks = new ArrayList<>();
        myGates = new ArrayList<>();
        myHorsemen = new ArrayList<>();
        myHouses = new ArrayList<>();
        myMarkets = new ArrayList<>();
        myMonstarys = new ArrayList<>();
        myPriests = new ArrayList<>();
        mySiegeRams = new ArrayList<>();
        mySiegeWorkshops = new ArrayList<>();
        mySoldiers = new ArrayList<>();
        myStables = new ArrayList<>();
        myTowers = new ArrayList<>();
        myTownCenters = new ArrayList<>();
        myWalls = new ArrayList<>();
        myWorkers = new ArrayList<>();
        myUser = new ArrayList<>();
        myGold = 10000;
        myFood = 20000;
        myWood = 15000;
        myStone = 5000;
        Civilization_no = C_no;
        
    }
    
    //Setters : 
    public void setName(String name) {
        this.name = name;
    }

    public static void setMyGold(int myGold) {
        Civilization.myGold = myGold;
    }

    public static void setMyStone(int myStone) {
        Civilization.myStone = myStone;
    }

    public static void setMyFood(int myFood) {
        Civilization.myFood = myFood;
    }

    public static void setMyWood(int myWood) {
        Civilization.myWood = myWood;
    }

    public static void setPopulation(int population) {
        Civilization.population = population;
    }

    public static void setMaxPopulation(int maxPopulation) {
        Civilization.maxPopulation = maxPopulation;
    }

    //Getters : 
    public String getName() {
        return name;
    }

    public static int getMyGold() {
        return myGold;
    }

    public static int getMyStone() {
        return myStone;
    }

    public static int getMyFood() {
        return myFood;
    }

    public static int getMyWood() {
        return myWood;
    }

    public static int getPopulation() {
        return population;
    }

    public static int getMaxPopulation() {
        return maxPopulation;
    }

    public static int getUpgradeLevel() {
        return upgradeLevel;
    }
    
    //Functions : 
    public static boolean checkPopulation() {
        return(population < maxPopulation);
    }
    public static void saveGame() throws IOException{
        FileOutputStream F = new FileOutputStream("C:\\Users\\mahmo\\Desktop\\_MIU\\Data.txt");
        ObjectOutputStream out = new ObjectOutputStream(F);
        out.writeObject(Civilization.myArchers);
        out.writeObject(Civilization.myArcheryRanges);
        out.writeObject(Civilization.myBarracks); 
        out.writeObject(Civilization.myGates); 
        out.writeObject(Civilization.myHorsemen); 
        out.writeObject(Civilization.myHouses); 
        out.writeObject(Civilization.myMarkets); 
        out.writeObject(Civilization.myMonstarys); 
        out.writeObject(Civilization.myPriests); 
        out.writeObject(Civilization.mySiegeRams); 
        out.writeObject(Civilization.mySiegeWorkshops); 
        out.writeObject(Civilization.mySoldiers); 
        out.writeObject(Civilization.myStables); 
        out.writeObject(Civilization.myTowers); 
        out.writeObject(Civilization.myTownCenters); 
        out.writeObject(Civilization.myWalls); 
        out.writeObject(Civilization.myWorkers);
        F.close();
    }
    public static void loadGame() throws IOException, ClassNotFoundException{
        FileInputStream F = new FileInputStream("C:\\Users\\mahmo\\Desktop\\_MIU\\Data.txt");
            ObjectInputStream in = new ObjectInputStream(F);
            Civilization.myArchers = (ArrayList<Archer>)in.readObject();
            Civilization.myArcheryRanges = (ArrayList<ArcheryRange>)in.readObject();
            Civilization.myBarracks = (ArrayList<Barrack>)in.readObject();
            Civilization.myGates = (ArrayList<Gate>)in.readObject();
            Civilization.myHorsemen = (ArrayList<Horseman>)in.readObject();
            Civilization.myHouses = (ArrayList<House>)in.readObject();
            Civilization.myMarkets = (ArrayList<Market>)in.readObject();
            Civilization.myMonstarys = (ArrayList<Monstary>)in.readObject();
            Civilization.myPriests = (ArrayList<Priest>)in.readObject();
            Civilization.mySiegeRams = (ArrayList<SiegeRam>)in.readObject();
            Civilization.mySiegeWorkshops = (ArrayList<SiegeWorkshop>)in.readObject();
            Civilization.mySoldiers = (ArrayList<Soldier>)in.readObject();
            Civilization.myStables = (ArrayList<Stable>)in.readObject();
            Civilization.myTowers = (ArrayList<Tower>)in.readObject();
            Civilization.myTownCenters = (ArrayList<TownCenter>)in.readObject();
            Civilization.myWalls = (ArrayList<Wall>)in.readObject();
            Civilization.myWorkers = (ArrayList<Worker>)in.readObject();
            F.close();
    }
}
