package graph;

public class MainDijkstra {
    public static void main(String[] args) {
        int[][] graph = new int[][] {
                { 0, 4, 8, 0, 0 },
                { 4, 0, 2, 5, 0 },
                { 8, 2, 0, 5, 9},
                { 0, 5, 5, 0, 4 },
                { 0, 0, 9, 4, 0 } };
        Dijkstra.dijkstra(graph, 0);
    }
}