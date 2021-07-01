package com.company;

import java.util.ArrayList;

public class Graphs {


    public void addEdge(ArrayList<ArrayList<Integer>> adj, int v , int u){

        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printG(ArrayList<ArrayList<Integer>> adj){
        for (int i = 0; i < adj.size();i++){
            System.out.print(i);
            for (int j = 0; j < adj.get(i).size();j++){
                System.out.printf(" -> %d", adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
