package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        graphsMain();
    }

    public static void graphsMain(){
        int V = 5;
        Graphs graphs = new Graphs();

        ArrayList<ArrayList<Integer>>  adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        graphs.addEdge(adj, 0, 1);
        graphs.addEdge(adj, 0, 4);
        graphs.addEdge(adj, 1, 2);
        graphs.addEdge(adj, 1, 3);
        graphs.addEdge(adj, 1, 4);
        graphs.addEdge(adj, 2, 3);
        graphs.addEdge(adj, 3, 4);

       graphs.printG(adj);

    }


}
