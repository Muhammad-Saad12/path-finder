import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		long t_s=System.nanoTime();
		FileHandling file = new FileHandling();
		file.readfile("txt");
	//	file.print();
		
		int totalNodes = 5908;  

/*
 * representation of the connected edges using the adjacency list 
 * by declaration of the List class object   
 */
	  
		
		  
		// Declaring and object of the type List<Node>  
		List<List<Node> > adjacent = new ArrayList<List<Node> >();  
		  
		// Initialize list for every node  
		for (int i = 0; i < totalNodes; i++) {  
		    List<Node> itm = new ArrayList<Node>();  
		    adjacent.add(itm);  
		}  
		
		 for(int i=0;i<file.nodesArray.size();i++) {
			//adjacent.get(file.nodesArray.get(i).getSourceNodes()).add(new Node(file.nodesArray.get(i).getConnectedNodess(),file.nodesArray.get(i).getWeights()));
			 adjacent.get(file.nodesArray.get(i).getSourceNodes()).add(new Node(file.nodesArray.get(i).getConnectedNodess(),1));
		 }
		  
		 
		   

		// creating an object of the class DijkstraExample1  
		 Scanner input=new Scanner(System.in);
		 int sv;
		    
		    boolean flag=true;
		   
		    System.out.println("Enter the source vertex ");
		    do {
		    	
			     sv=input.nextInt();
			    if(sv<0||sv>5908) {
			    	System.out.println("Enter the source vertex in the range from 0 to 5908 ");
			    	flag=false;
			    }
			    else {
			    	flag=true;
			    }
		    	
		    }while(flag==false);

		DijkstraExample1 obj = new DijkstraExample1(totalNodes);  
		obj.dijkstra(adjacent, sv);  
		
		  
		// Printing the shortest path to all the nodes  
		// from the source node  
		FileWriter myWriter = new FileWriter("DikjstraOutput.txt");
		System.out.println("The shortest path from the node :");  

		
		 try {
			 int max=obj.distance[0];
			 for (int j = 0; j < obj.distance.length; j++)  
				{  
				    System.out.println(sv + " to " + j + " is " + obj.distance[j]);  
				    myWriter.write(sv + " to " + j + " is " + obj.distance[j]+"\n");
				    if(obj.distance[j]>max) {
				    	max=obj.distance[j];
				    }
				}
				 myWriter.close();
				 System.out.println("The diameter of Graph is: "+max);
			      System.out.println("Successfully wrote to the DikjstraOutput.txt");
		 } catch(Exception e){
			 System.out.println("An error occured while printing");
			 e.printStackTrace();
		 }
		
		
		 	long t_f=System.nanoTime();
		    long diff=t_f-t_s;
		    System.out.println("The execution time of a program is:  "+diff+" nanoseconds");
}  
	
	
}



