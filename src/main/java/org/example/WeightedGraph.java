package org.example;

import java.util.*;

public class WeightedGraph {
    List<Vertex> vertices ;

    public WeightedGraph(){
        vertices = new ArrayList<>();
    }
    public void AddVertex(Vertex vertex){
        vertices.add(vertex);
    }
    public double exchange(Vertex v1, Vertex v2, double amount) {
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visitedVertices = new LinkedHashSet<>();
        stack.push(v1);
        int rate = 1;
        while(!stack.isEmpty()) {
            Vertex currenVertex = stack.pop();
            if(!visitedVertices.contains(currenVertex)) {
                visitedVertices.add(currenVertex);
                for(Edge v : currenVertex.adjacencies){

                }
            }

        }
        return rate*amount;
    }
    static class Vertex {
        private String name;
        List<Edge> adjacencies;
        public Vertex (String name){
            this.name = name;
            adjacencies = new ArrayList<>();
        }
        public String getName(){ return this.name; }
        public void addEdge(Vertex destination, double rate){
            Edge edge = new Edge(this.name, destination.getName(),rate);
            this.adjacencies.add(edge);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Vertex)) return false;
            Vertex vertex = (Vertex) o;
            return getName().equals(vertex.getName()) && adjacencies.equals(vertex.adjacencies);
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), adjacencies);
        }
    }
    static class Edge{
        private String source;
        private String destination;
        private double rate;

        public Edge(){}
        public Edge(String source, String destination, double rate){
            this.source = source;
            this.destination = destination;
            this.rate = rate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Edge)) return false;
            Edge edge = (Edge) o;
            return Double.compare(edge.rate, rate) == 0 && source.equals(edge.source) && destination.equals(edge.destination);
        }

        @Override
        public int hashCode() {
            return Objects.hash(source, destination, rate);
        }
    }
}
