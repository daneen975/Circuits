package coe318.lab6;

/**
 *
 * @author Daneen Ashaf
 */
public class Resistor {
    //starts the counter at 1 cause resistor id starts at 1 
     static int resistorCount = 1; 
    //instance variables for constructor
     double  resistance; 
     Node node1, node2;
     int resistorId; 
    
    public Resistor(double resistance, Node node1, Node node2) {
        
        //catch statement
        if (resistance <= 0) { //if the resistance is 0 or negative (not possible)
           throw new IllegalArgumentException("Resistance cant be negative "); //thows exception if resistance is negative
        }
        else if (node1 == null || node2 == null) { //if either of the nodes are null (not possible)
             throw new IllegalArgumentException("Node isn't defined! "); //throws error if node isnt set 
        }
        //assigning values 
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistorId = resistorCount; //sets the id of the resistor as the count 
        resistorCount++; //adding 1 to the resistor count.
        
        Circuit.getInstance().add(this); //adds the newly created resistor the single circuit object 

    }
    

    
    public Node[]  getNodes() {
        
        //Creating array for nodes to return
        Node[] nodeArr = {node1, node2}; 
        
        return nodeArr; //returns array of nodes which contain the nodes that the resistor is placed on 
    }
    
      @Override
    public String toString() {

            return ("R" + resistorId + " " + node1 + " " + node2 + " " + this.resistance);
    }
    
}