package nl.paisanrietbroek.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paisanrietbroek on 11/10/2017.
 */
public class Vertex {
    private String label;
    private List<Edge> edges;

    public Vertex(String label) {
        this.label = label;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }

    public boolean containsEdge(Edge other) {
        for (Edge edge:this.edges) {
            if (edge.equals(other)) {
                return true;
            }
        }
        return false;
    }

    public Edge getEdge(int index) {

        return this.edges.get(index);

    }

    public Edge removeEdge(int index) {
        return  this.edges.remove(index);
    }

    public int getEdgeCount() {
        return this.edges.size();
    }

    public ArrayList<Edge> getEdges() {
        return (ArrayList<Edge>) this.edges;
    }

    public String getLabel() {
        return this.label;
    }

}
