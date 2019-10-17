package lab11_undirected;

import java.util.*;

//This class finds the length of the shortest path for a graph
public class ShortestPathLength extends BreadthFirstSearch {
	private HashMap<Vertex, Integer> levels = new HashMap<Vertex, Integer>();
	private Vertex startingVertex;

	public ShortestPathLength(Graph graph) {
		super(graph);
	}

	protected void processEdge(Edge e) {
		Vertex u = e.u;
		Vertex v = e.v;
		if (u == startingVertex) {
			// v is in level 1
			levels.put(v, 1);
		} else if (v == startingVertex) {
			// u is in level 1
			levels.put(u, 1);
		} else {
			// we're in deeper levels.
			// we need to get the level of the one closer to the startingVertex and
			// increment
			if (levels.containsKey(u)) {
				levels.put(v, levels.get(u) + 1);
			} else if (levels.containsKey(v)) {
				levels.put(u, levels.get(v) + 1);
			}
		}
	}

	public int computeShortestLength(Vertex u, Vertex v) {
		startingVertex = u;

		levels.put(startingVertex, 0);

		start(startingVertex);

		return levels.get(v);
	}

}
