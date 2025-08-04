About This Project:
This Java project models an electric circuit composed of resistors connected between nodes. The circuit is built using object-oriented principles and includes custom error handling using IllegalArgumentException to prevent invalid circuit configurations.

Key Components:

Node Class: Represents a circuit node with a unique, auto-incremented ID.

Resistor Class: Models a resistor connected between two nodes, with its own unique ID, a specified resistance value, and validation to ensure parameters are logical (e.g., resistance must be positive, and nodes must not be null or identical).

Circuit Class (Singleton): Manages the overall circuit as a singleton object that stores all resistors added to the circuit. Provides a toString() method that returns a formatted representation of the circuit.

Features:

Validates constructor arguments using IllegalArgumentException.

Automatically assigns unique IDs to nodes and resistors.

Uses an ArrayList to store all resistors in the circuit.

Follows clean object-oriented design practices.

How to Run:
- Open the project in NetBeans
- Compile and run the main method (if you have one)
- Or instantiate and test classes through the IDE

Example Output
R1 0 1 100  
R2 1 2 50
