
/*
 * This class creates graph and apply BellmanFord algorithm to it
 */
import java.io.FileWriter;
import java.io.IOException;

public class CreateGraph {
	// CreateGraph - it consists of edges
	  class CreateEdge {
	    int s, d, w;

	    CreateEdge() {
	      s = d = w = 0;
	    }
	  };

	  int V, E;
	  CreateEdge edge[];

	  // Creates a graph with V vertices and E edges
	  CreateGraph(int v, int e) {
	    V = v;
	    E = e;
	    edge = new CreateEdge[e];
	    for (int i = 0; i < e; ++i) {
	      edge[i] = new CreateEdge();

	      }
	  }
	  
	  void BellmanFord(CreateGraph graph, int s) throws IOException  {
	    int V = graph.V, E = graph.E;
	    int dist[] = new int[V];

	    // Step 1: fill the distance array and predecessor array
	    for (int i = 0; i < V; ++i)
	      dist[i] = Integer.MAX_VALUE;

	    // Mark the source vertex
	    dist[s] = 0;

	    // Step 2: relax edges |V| - 1 times
	    
	  //  FileWriter myWriter = new FileWriter("BellmanTrace.txt");
	   
	    int i;
	    
	    for (i = 1; i < V; ++i) {
	      for (int j = 0; j < E; ++j) {
	    	 
	        // Get the edge data
	        int u = graph.edge[j].s;
	        int v = graph.edge[j].d;
	        int w = graph.edge[j].w;
	        if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
	          dist[v] = dist[u] + w;
	          }
	        
	//        myWriter.write(u+"\t\t"+v+"\t\t"+w+"\n");

	      }
	    }
	   
//	   myWriter.close();
//	      System.out.println("Successfully wrote to the Bellman Trace file.");
	    
	    /*
	     * Step 3: detect negative cycle
	     * if value changes then we have a negative cycle in the graph
	     * and we cannot find the shortest distances
	     */

	 
	    for (int j = 0; j < E; ++j) {
	      int u = graph.edge[j].s;
	      int v = graph.edge[j].d;
	      int w = graph.edge[j].w;
	      if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
	        System.out.println("CreateGraph contains negative  cycle");
	        return;
	      }
	    }
	    
	    /*
	     * No negative w cycle found Print the distance and predecessor array 
	     */

	  
	    printSolution(dist, V);
	    findDiameter(dist, V);
	    fileWrite(dist,V);
	  }




	  // Print the solution
	  void printSolution(int dist[], int V) {
	    System.out.println("Vertex Distance from Source");
	    System.out.println("Vertex"+"\t\t"+"Shortest Distance");
	    int max=dist[0];
	    int c=0;
	    int i;
	    for ( i = 0; i < V; ++i) {
	      System.out.println(i + "\t\t" + dist[i]);
	      }
	   
	  }
	  
	  void findDiameter(int dist[], int V) {
		 
		    int max=dist[0];
		  
		    int i;
		    for ( i = 0; i < V; ++i) {
		 
		       if(dist[i]>=max) {
		    		  max=dist[i];
		    		 
		    	  }
		      
		      }
		    System.out.println("Diameter is "+max);
		
		  }
		  
	  
	  
	  void fileWrite(int dist[], int V) {
		  try {
		      FileWriter myWriter = new FileWriter("BellmanOutput.txt");
		      for (int i = 0; i < V; ++i) {
		    	  myWriter.write(i + "\t\t" + dist[i]+"\n");
		    	  }
		      
		     
		      myWriter.close();
		      System.out.println("Successfully wrote to the Bellman Output file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	  }


}
