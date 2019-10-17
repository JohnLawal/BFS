package lab11_undirected;

import java.util.ArrayList;

public class HasCycle extends BreadthFirstSearch {

	public HasCycle(Graph graph) {
		super(graph);
	}

	// TO-DO
	public boolean hasCycle() {
		// get the number of edges, get the spanning tree and it's number of edges and
		// compare
		int totalEdgesCount = this.graph.edges.size();
		int spanningTreeEdgesCount = this.graph.getSpanningTree().edges.size();
		return totalEdgesCount > spanningTreeEdgesCount;
	}

}
