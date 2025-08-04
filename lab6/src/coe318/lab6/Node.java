package coe318.lab6;
/**
 *
 * @author Daneen Ashaf
*/
public class Node {
    private static int nodeCount = 0; //starts the node Counter at 0 because Ids start at 0
    
    //instance variables
    int id; //the id of a  node object
    String strId; //the string repersentation of above 
    public Node () {
        
        this.id = nodeCount; //sets the id as the node count which starts at 0
        nodeCount++; //increases the nodecount by 1 for the next created node to have that id 
        
        strId = String.valueOf(this.id);
        
   

    }
    
    
    @Override
    public String toString() {

        return strId;
    
    }
    
}
