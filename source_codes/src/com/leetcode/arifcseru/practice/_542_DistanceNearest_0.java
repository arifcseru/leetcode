/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.arifcseru.practice;

/**
 *
 * @author Arifur Rahman
 */
public class _542_DistanceNearest_0 {

    public int[][] mass;
    public int[][] visited;

    public int[][] updateMatrixOld(int[][] grid) {
        mass = grid;

        visited = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            visited[i] = new int[grid[i].length];
        }
        System.out.println();
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                System.out.print(" " + visited[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n=====\n");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    visited[i][j] = -1;
                    dfs(i, j, 0);
                }
            }
        }

        return visited;
    }

    public void dfs(int i, int j, int time) {
        if ((i >= mass.length || i < 0) || (j >= mass[i].length || j < 0)) {
            return;
        }

        if (mass[i][j] == 0) {
            if (visited[i][j] == 0) {
                return;
            } else {
                visited[i][j] = 0;
            }
        }

        if (visited[i][j] != 0) {
            if (visited[i][j] <= time) {
                return;
            }
        }

        visited[i][j] = time;

        dfs(i, j - 1, time + 1);
        dfs(i, j + 1, time + 1);
        dfs(i - 1, j, time + 1);
        dfs(i + 1, j, time + 1);

        return;
    }

    /*
    [
    [0,1,0,1,1],
    [1,1,0,0,1],
    [0,0,0,1,0],
    [1,0,1,1,1],
    [1,0,0,0,1]
    ]
[
    [0,1,0,1,2],
    [1,1,0,0,1],
    [0,0,0,1,0],
    [1,0,1,1,1],
    [2,0,0,0,1]]

    [
    [0,1,0,1,2],
    [1,1,0,0,1],
    [0,0,0,1,0],
    [1,0,1,1,1],
    [1,0,0,0,1]
    ]

     */
    public int[][] updateMatrix(int[][] grid) {
        int[][] distances = new int[grid.length][grid[0].length];
        int maxPossibleDistance = grid.length - 1 + grid[0].length - 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    int upCell = i > 0 ? distances[i - 1][j] : maxPossibleDistance;
                    int leftCell = j > 0 ? distances[i][j - 1] : maxPossibleDistance;
                    distances[i][j] = Math.min(upCell, leftCell) + 1;
                }
            }
        }
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] != 0) {
                    int downCell = (i < grid.length - 1) ? distances[i + 1][j] : maxPossibleDistance;
                    int rightCell = (j < grid[i].length - 1) ? distances[i][j + 1] : maxPossibleDistance;
                    distances[i][j] = Math.min(Math.min(downCell, rightCell) + 1, distances[i][j]);

                }
            }
        }
        return distances;
    }

    /*
0 0 0 0
0 1 0 1
1 2 1 0
0 1 0 1
     */
    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 0, 0},
            {0, 1, 0, 1},
            {1, 1, 1, 0},
            {0, 1, 0, 1}
        };
        mat = new _542_DistanceNearest_0().updateMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }
}
