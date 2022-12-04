import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class main {

	public static void main(String[] args) throws IOException {
		long t_s=System.nanoTime();
		
	
		Scanner input=new Scanner(System.in);
		
		
		FileHandling file = new FileHandling();
		file.readfile("txt");
	
		int V = 5908; // Total vertices
	    int E = 41729; // Total Edges
//	    int V=5;
//	   int E=8;
	    
	    CreateGraph graph = new CreateGraph(V, E);
	    for(int i=0;i<file.nodesArray.size();i++) {
	    	graph.edge[i].s=file.nodesArray.get(i).getSourceNode();
	    	graph.edge[i].d=file.nodesArray.get(i).getConnectedNode();
	    	graph.edge[i].w=file.nodesArray.get(i).getWeight();

	    	
	    }
/*
 * A small data set that can be used for tracing and storing it in file
 */
	   //  edge 0 --> 1
//	    graph.edge[0].s = 0;
//	    graph.edge[0].d = 1;
//	    graph.edge[0].w = 5;
//
//	    // edge 0 --> 2
//	    graph.edge[1].s = 0;
//	    graph.edge[1].d = 2;
//	    graph.edge[1].w = 4;
//
//	    // edge 1 --> 3
//	    graph.edge[2].s = 1;
//	    graph.edge[2].d = 3;
//	    graph.edge[2].w = 3;
//
//	    // edge 2 --> 1
//	    graph.edge[3].s = 2;
//	    graph.edge[3].d = 1;
//	    graph.edge[3].w = 6;
//
//	    // edge 3 --> 2
//	    graph.edge[4].s = 3;
//	    graph.edge[4].d = 2;
//	    graph.edge[4].w = 2;
	    
	   
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

	    graph.BellmanFord(graph, sv); // 0 is the source vertex
	    long t_f=System.nanoTime();
	    long diff=t_f-t_s;
	    System.out.println("The execution time of a program is:  "+diff+" nanoseconds");
	    
	    
	   
		

	}

}
