package coe318.lab6;

/**
 *
 * @author Daneen Ashaf
 */
import java.util.ArrayList; 
public class Circuit {
  //variables
private static Circuit instance = null; //the single object of the class, thats why its static 

ArrayList cirElements = new ArrayList<>();

//gets the single instance of the class circuit
/**
 * This method returns the singular circuit object of the class 
 * @return the single circuit object of the class 
 */
public static Circuit getInstance() {
    if (instance == null)  { 
    instance = new Circuit(); //if the only circuit object hasnt been initialized yet, initialize it
    }
    return instance;
}


/**
 * adds a circuit element (whether a resistor voltage source) to the arraylist of the circuit object 
 * @param e circuit element to be added 
 */
public void add(Object e) { //adds a circuit element to the circuit, can be either resistor or source 
    cirElements.add(e); //add the element ot the arraylist
}

 /**
 * This is the overridden message of toString which displays all circuit elements 
 * @return returns a string that has each component of the circuit in a formatted way 
 */
  @Override
    public String toString() {
         
        String message = ""; //initalizes the message variable
        for (Object e: cirElements) { //this loops goes thru the entire arraylist, ands add the strings of each element to one long string 
            message = message + e + "\n";
        }
        return message; //returns the string 
   
    }
    
}