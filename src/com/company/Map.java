package com.company;

import java.awt.*;
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
    public Map readMap(String filepath) {
        Scanner mapScan;
        Map foundMap = new Map();
        System.out.println((foundMap));
        try {
            mapScan = new Scanner(new File(filepath));
            String mapChar;
            mapScan.useDelimiter(" ");

            while(mapScan.hasNext()) {
                mapChar = mapScan.next();
                System.out.println(mapChar);
                //switch-statement, mapChar -> mapTile -> addTile(mapTile)
                switch (mapChar) {
                    case "G":
                        foundMap.map.add(new Tile(Tile.Type.GRASS));
                        break;
                    case "W":
                        foundMap.map.add(new Tile(Tile.Type.WATER));
                        break;
                    case "L":
                        foundMap.map.add(new Tile(Tile.Type.LAVA));
                        break;
                    case "S":
                        foundMap.map.add(new Tile(Tile.Type.STONE));
                        break;
                    case "D":
                        foundMap.map.add(new Tile(Tile.Type.DIRT));
                        break;
                }

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("No map was found.");
        }
        for (int i = 0; i<foundMap.map.size(); i++) {
            System.out.println(foundMap.map.get(i).getType());   
        }
        return foundMap;
    }

    public Tile getTile(int x, int y, int width) {
        Tile tile = this.map.get(x * width + y);
        //System.out.println(tile.getType());//For testing purposes
        return tile;
    }



}
