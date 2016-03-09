package com.company;

import java.util.Arrays;

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

}
