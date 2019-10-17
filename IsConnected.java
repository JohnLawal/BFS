package lab11_undirected;

public class IsConnected extends BreadthFirstSearch {
	private int componentsCount = 0;

	public IsConnected(Graph graph) {
		super(graph);
	}

	// TO-DO
	public boolean isConnected() {
		return (getConnectedComponentsCountIfAny() == 1);
	}

	public int getConnectedComponentsCountIfAny() {
		start();
		return componentsCount;
	}

	protected void additionalProcessing() {
		// the end of a component loop
		componentsCount++;
	}
}
