package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <V>{
    private Map<V, List<V>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }
    public void AddVertex(V vertex){
        adjList.putIfAbsent(vertex, new ArrayList<V>());
    }
    public void remove(V vertex) {
        adjList.values().stream().forEach(list -> list.remove(vertex));
        adjList.remove(vertex);
    }
    public void AddEdge(V vertex1, V vertex2){
        adjList.get(vertex1).add(vertex2);
    }
}
