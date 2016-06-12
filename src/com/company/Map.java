package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by flirre on 09/06/16.
 */
public class Map {
    ArrayList<Tile> map = new ArrayList<Tile>();

    /**
     * The Map object and what it consists of.
     * @param map - An ArrayList where all the Tiles will be stored.
     */
    public Map (ArrayList<Tile> map) {
        this.map = map;
    }

    /**
     * Create a map of just one tile.
     * @param tile
     */
    public Map (Tile tile){
        this.map.add(tile);
    }

    public Map (){
    }

    /**
     * readMap reads a file and generates a Map object.
     * @param filepath - The path to the map file.
     * @return - A Map object.
     */
    public ArrayList readMap(String filepath) {
        Scanner mapScan;
        ArrayList map = new ArrayList();
        System.out.println((map));
        try {
            mapScan = new Scanner(new File(filepath));
            String mapChar;
            mapScan.useDelimiter(" ");

            while(mapScan.hasNext()) {
                mapChar = mapScan.next();
                System.out.println(mapChar);
                try {
                    map.add(Integer.parseInt(mapChar));
                }
                catch (NumberFormatException e) {
                    //System.out.println("Map read error.");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("No map was found.");
        }
        System.out.println(map);
        return map;
    }

    public Tile getTile(int x, int y, int width) {
        Tile tile = this.map.get(x * width + y);
        //System.out.println(tile.getType());//For testing purposes
        return tile;
    }




}
