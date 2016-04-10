package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
            //System.out.println(mapChar);
            if (mapChar.equals("|")) {
                map.add(maprow);
                maprow.clear();
            }
            else {
                mapInt = Integer.parseInt(mapChar);
                maprow.add(mapInt);
//                System.out.println((mapInt + i));
//                System.out.println(maprow.toString());
//                i++;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid character in file or empty file.");
        }
    }
    System.out.println(map.toString());

}
}