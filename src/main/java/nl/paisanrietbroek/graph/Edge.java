package nl.paisanrietbroek.graph;

/**
 * Created by paisanrietbroek on 11/10/2017.
 */
public class Edge {
    private int weight;
    private Vertex one;
    private Vertex two;

    public Edge(int weight, Vertex one, Vertex two) {
        this.weight = weight;
        this.one = one;
        this.two = two;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", one=" + one +
                ", two=" + two +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getTwo() {
        return two;
    }
}
