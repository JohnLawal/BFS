package lab11_undirected;

import java.util.*;

//This class finds the length of the shortest path for a graph
public class ShortestPathLength extends BreadthFirstSearch {
	// private ArrayList<Edge> tree = new ArrayList<Edge>();

	public ShortestPathLength(Graph graph) {
		super(graph);
	}

	public int computeShortestLength(Vertex u, Vertex v) {
		start(u);		
	}

}
