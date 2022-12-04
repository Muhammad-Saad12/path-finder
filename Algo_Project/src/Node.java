
public class Node {
private int sourceNode;
private int connectedNode;
private int weight;


public Node(int sourceNode, int connectedNode, int weight) {
	super();
	this.sourceNode = sourceNode;
	this.connectedNode = connectedNode;
	this.weight = weight;
}


public int getSourceNode() {
	return sourceNode;
}


public void setSourceNode(int sourceNode) {
	this.sourceNode = sourceNode;
}


public int getConnectedNode() {
	return connectedNode;
}


public void setConnectedNode(int connectedNode) {
	this.connectedNode = connectedNode;
}


public int getWeight() {
	return weight;
}


public void setWeight(int weight) {
	this.weight = weight;
}


}
