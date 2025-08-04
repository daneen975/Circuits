package coe318.lab6;

/**
 *
 * @author Daneen Ashaf
 */
public class testClass {  // Changed the class name to TestClass
    
    public static void main(String[] args) {
        Node node1 = new Node(); //assigned value 0
        Node node2 = new Node(); //assigned value 1
        Node node3 = new Node(); //assigned value 2
        Node node4 = new Node(); //assigned value 3
        
        Node[] arr;
        
        // Test exception statements. 
        // Resistor r1 = new Resistor(0, node1, node2);  // This line will throw an exception
        // Resistor r2 = new Resistor(50, null, node2);  // This line will also throw an exception
        Resistor r3 = new Resistor(50, node1, node2);
        Resistor r4 = new Resistor(100, node3, node4);
        
        System.out.println(r3);
        System.out.println(r4);
       
        arr = r4.getNodes();
        System.out.println(arr[0] + " " + arr[1]);
    }
}
