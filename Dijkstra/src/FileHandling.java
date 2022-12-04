import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

	ArrayList<Nodes> nodesArray=new ArrayList<Nodes>();

	public ArrayList<Nodes> getNodesArray() {
		return nodesArray;
	}

	public void setNodesArray(ArrayList<Nodes> nodesArray) {
		this.nodesArray = nodesArray;
	}
	
	public  void readfile(String filename) throws FileNotFoundException {	
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] items= data.trim().split("\\s+");
		    	 int sourceNode=Integer.parseInt(items[0]);
		    	 int connectedNode	=Integer.parseInt(items[1]);	 	    	
		    	 int weight=Integer.parseInt(items[2]);
		        Nodes node =new Nodes(sourceNode,connectedNode,weight);
		       // Nodes node =new Nodes(sourceNode,connectedNode,1);
		        nodesArray.add(node);
		       
     
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		}
	
	
 public void print() {
	 for(int i=0; i<nodesArray.size(); i++) {
	  System.out.println("node1 = " + nodesArray.get(i).getSourceNodes()+" node 2= "+nodesArray.get(i).getConnectedNodess()+" weight= "+nodesArray.get(i).getWeights());
	  
 }
	 
 }
	
	
}
