
public class Nodes {
	private int sourceNodes;
	private int connectedNodes;
	private int weights;


	public Nodes(int sourceNodes, int connectedNodes, int weights) {
		super();
		this.sourceNodes = sourceNodes;
		this.connectedNodes = connectedNodes;
		this.weights = weights;
	}


	public int getSourceNodes() {
		return sourceNodes;
	}


	public void setSourceNodes(int sourceNodes) {
		this.sourceNodes = sourceNodes;
	}


	public int getConnectedNodess() {
		return connectedNodes;
	}


	public void setConnectedNodes(int connectedNodes) {
		this.connectedNodes = connectedNodes;
	}


	public int getWeights() {
		return weights;
	}


	public void setWeights(int weights) {
		this.weights = weights;
	}



}
