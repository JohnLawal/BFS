package lab11_undirected;

public class PathExists extends BreadthFirstSearch {
	// private Vertex u;
	private Vertex v;
	private boolean hasPath = false;
	private boolean sameComponent = true;

	public PathExists(Graph graph) {
		super(graph);
	}

	// TO-DO
	public boolean pathExists(Vertex u, Vertex v) {
		// this.u = u;
		this.v = v;
		start(u);
		return this.hasPath;
	}

	protected void additionalProcessing() {
		// the end of the first component loop
		// since we started from u, if v was visited, they're in the same component and path exists
		if (sameComponent && hasBeenVisited(this.v)) {
			hasPath = true;
		}
		sameComponent = false;
	}
}
