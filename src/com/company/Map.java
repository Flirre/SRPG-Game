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
}
/**
public void readMap(String filepath) throws IOException, NumberFormatException {
    File mapfile = new File(filepath);
    Scanner mapScan = new Scanner(mapfile);
    String mapChar;
    int mapInt = new Integer(0);
    int i = 1;
    int[] maprow = new int[10];
    mapScan.useDelimiter(" ");
    while (mapScan.hasNext()) {
        try {
            mapChar = mapScan.next();

            mapInt = Integer.parseInt(mapChar);
  //          if () {
                maprow[i] = mapInt;
                System.out.println((mapInt + i));
                System.out.println(Arrays.toString(maprow));
                i++;
    //        }
        } catch (NumberFormatException e) {
            System.out.println("Invalid character in file or empty file.");
        }
    }
    }
*/
