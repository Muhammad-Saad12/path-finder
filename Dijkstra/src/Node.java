import java.util.Comparator;

public class Node  implements Comparator<Node> {
	public int n;  
	public int price;  
	  
	// Constructors of this class  
	  
	// Constructor 1  
	public Node()   
	{  
	      
	}  
	  
	// Constructor 2  
	public Node(int n, int price)  
	{  
	this.n = n;  
	this.price = price;  
	}  
	  
	@Override   
	public int compare(Node n1, Node n2)  
	{  
	  
	if (n1.price < n2.price)
	{  
		return -1;  
		}  
		if (n1.price > n2.price)  
		{  
		return 1;  
		}  
		  
		return 0;  
		}  
}
