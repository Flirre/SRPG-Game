package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by flirre on 2016-03-07.
 */
public class Map {
    static ArrayList<ArrayList<Integer>> totalMap;
    static ArrayList<Integer> innerMap;
    int x, y;

    public Map (ArrayList<Integer> x, ArrayList<ArrayList<Integer>> y) {
        this.totalMap = new ArrayList<ArrayList<Integer>> (y);
        this.innerMap = new ArrayList<Integer>(x);


    }

    public void printy(){
        System.out.println(totalMap.toString() );
    }

public void printMap() {
        System.out.println(totalMap.toArray().toString());
    }

public void readMap(String filepath) throws IOException, NumberFormatException {
    File mapfile = new File(filepath);
    Scanner mapScan = new Scanner(mapfile);
    String mapChar;
    int mapInt = new Integer(0);
    int i = 1;
    ArrayList<Integer> maprow = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
    mapScan.useDelimiter(" ");
    while (mapScan.hasNext()) {
        try {
            mapChar = mapScan.next();
            if (mapChar.equals("|")) {
                map.add(maprow);
                maprow = new ArrayList<Integer>();
                maprow.clear();
            }
            else {
                mapInt = Integer.parseInt(mapChar);
                maprow.add(mapInt);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid character in file or empty file.");
        }
    }
    map.remove(0);
    System.out.println(map.toString());

}
}