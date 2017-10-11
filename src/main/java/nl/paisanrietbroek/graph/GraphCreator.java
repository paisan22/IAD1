package nl.paisanrietbroek.graph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by paisanrietbroek on 11/10/2017.
 */
public class GraphCreator {

    public GraphCreator() {

        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");

        a.addEdge(new Edge(3, a, b));
        a.addEdge(new Edge(3, a, d));
        a.addEdge(new Edge(6, a, f));

        b.addEdge(new Edge(3, b, a));
        b.addEdge(new Edge(3, b, e));
        b.addEdge(new Edge(1, b, d));

        c.addEdge(new Edge(2, c, e));
        c.addEdge(new Edge(3, c, f));

        d.addEdge(new Edge(3, d, a));
        d.addEdge(new Edge(1, d, b));
        d.addEdge(new Edge(1, d, e));
        d.addEdge(new Edge(2, d, f));

        e.addEdge(new Edge(3, e, b));
        e.addEdge(new Edge(1, e, d));
        e.addEdge(new Edge(5, e, f));
        e.addEdge(new Edge(2, e, c));

        f.addEdge(new Edge(6, f, a));
        f.addEdge(new Edge(2, f, d));
        f.addEdge(new Edge(5, f, e));
        f.addEdge(new Edge(3, f, c));


        int i = dijkstraAlgoritm(a, c);
        System.out.println("Result Dijkstra: " + i);
    }


    public int dijkstraAlgoritm(Vertex a, Vertex b) {

        return getShortestPath(a, b);
    }

    public int getShortestPath(Vertex a, Vertex b) {

        if (a.equals(b)) {
            return 0;
        }

        Vertex nextVertex = a;
        Edge smallestEdge = a.getEdge(0);

        for (int i = 0; i < a.getEdges().size() -1; i++) {

            if (a.getEdge(i).getWeight() < a.getEdge(i + 1).getWeight()) {
                smallestEdge = a.getEdge(i);
                nextVertex = a.getEdge(i).getTwo();
            } else {
                smallestEdge = a.getEdge(i + 1);
            }
        }

        getShortestPath(nextVertex, b);

        return smallestEdge.getWeight();
    }

}
