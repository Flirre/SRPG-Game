package com.company;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by flirre on 2016-03-07.
 */
public class Map {
    static ArrayList<ArrayList<Integer>> map;

    public Map (ArrayList<Integer> x, ArrayList<Integer> y) {
        this.map = new ArrayList<ArrayList<Integer>>();
    }

public void printMap() {
    for (int[] row: map) {
        System.out.println(Arrays.toString(row));
    }
}

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


}
