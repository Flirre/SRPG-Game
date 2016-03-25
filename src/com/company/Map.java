package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by flirre on 2016-03-07.
 */
public class Map {
    static int[][] map;

    public Map (int x, int y) {
        this.map = new int[x][y];
    }

public void printMap() {
    for (int[] row: map) {
        System.out.println(Arrays.toString(row));
    }
}

public void readMap(String filepath) throws IOException {
    File mapfile = new File(filepath);
    Scanner mapScan = new Scanner(mapfile);
    int mapChar = 0;
    //mapScan.useDelimiter("|");
    while (mapScan.hasNext()) {
                  System.out.println((mapScan.next()));
        }
    }


}
