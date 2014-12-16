/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display;
import edu.fcps.Digit; 
import javax.swing.JOptionPane;

public class Lab11 {
	 
	 public static void main(String[] args) {
    String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(42, 37);
    
    Digit one;
    Digit two;
    Digit three;
    Digit four;
    Digit five;
    Digit six;
    
    String number1 = JOptionPane.showInputDialog("Enter first digit (in numerical form):");   
    if (number1.equals("one")){
    Digit one = new One(1,9);
    }
    else if (number1.equals("two")){
    one = new Two(1,9);
    }
    else if (number1.equals("three")){
    one = new Three(1,9);
    }
    else if (number1.equals("four")){
    one = new Four(1,9);
    }
    else if (number1.equals("five")){
    one = new Five(1,9);
    }
    else if (number1.equals("six")){
    one = new Six(1,9);
    }
    else if (number1.equals("seven")){
    one = new Seven(1,9);
    }
    else if (number1.equals("eight")){
    one = new Eight(1,9);
    }
    else if (number1.equals("nine")){
    one = new Nine(1,9);
    }
    else if (number1.equals("zero")){
    one = new Zero(1,9);
    }
    
    String number2 = JOptionPane.showInputDialog("Enter second digit (in numerical form):");   
     if (number2.equals("one")){
    two = new One(7,9);
    }
    else if (number2.equals("two")){
    two = new Two(7,9);
    }
    else if (number2.equals("three")){
    two = new Three(7,9);
    }
    else if (number2.equals("four")){
    two = new Four(7,9);
    }
    else if (number2.equals("five")){
    two = new Five(7,9);
    }
    else if (number2.equals("six")){
    two = new Six(7,9);
    }
    else if (number2.equals("seven")){
    two = new Seven(7,9);
    }
    else if (number2.equals("eight")){
    two = new Eight(7,9);
    }
    else if (number2.equals("nine")){
    two = new Nine(7,9);
    }
    else if (number2.equals("zero")){
    two = new Zero(7,9);
    }
    String number3 = JOptionPane.showInputDialog("Enter third digit (in numerical form):");   
     if (number3.equals("one")){
    three = new One(13,9);
    }
    else if (number3.equals("two")){
    three = new Two(13,9);
    }
    else if (number3.equals("three")){
    three = new Three(13,9);
    }
    else if (number3.equals("four")){
    three = new Four(13,9);
    }
    else if (number3.equals("five")){
    three = new Five(13,9);
    }
    else if (number3.equals("six")){
    three = new Six(13,9);
    }
    else if (number3.equals("seven")){
    three = new Seven(13,9);
    }
    else if (number3.equals("eight")){
    three = new Eight(13,9);
    }
    else if (number3.equals("nine")){
    three = new Nine(13,9);
    }
    else if (number3.equals("zero")){
    three = new Zero(13,9);
    }
    String number4 = JOptionPane.showInputDialog("Enter fourth digit (in numerical form):");   
     if (number4.equals("one")){
    four = new One(19,9);
    }
    else if (number4.equals("two")){
    four = new Two(19,9);
    }
    else if (number4.equals("three")){
    four = new Three(19,9);
    }
    else if (number4.equals("four")){
    four = new Four(19,9);
    }
    else if (number4.equals("five")){
    four = new Five(19,9);
    }
    else if (number4.equals("six")){
    four = new Six(19,9);
    }
    else if (number4.equals("seven")){
    four = new Seven(19,9);
    }
    else if (number4.equals("eight")){
    four = new Eight(19,9);
    }
    else if (number4.equals("nine")){
    four = new Nine(19,9);
    }
    else if (number4.equals("zero")){
    four = new Zero(19,9);
    }
    String number5 = JOptionPane.showInputDialog("Enter fifth digit (in numerical form):");   
     if (number5.equals("one")){
    five = new One(25,9);
    }
    else if (number5.equals("two")){
    five = new Two(25,9);
    }
    else if (number5.equals("three")){
    five = new Three(25,9);
    }
    else if (number5.equals("four")){
    five = new Four(25,9);
    }
    else if (number5.equals("five")){
    five = new Five(25,9);
    }
    else if (number5.equals("six")){
    five = new Six(25,9);
    }
    else if (number5.equals("seven")){
    five = new Seven(25,9);
    }
    else if (number5.equals("eight")){
    five = new Eight(25,9);
    }
    else if (number5.equals("nine")){
    five = new Nine(25,9);
    }
    else if (number5.equals("zero")){
    five = new Zero(25,9);
    }
    String number6 = JOptionPane.showInputDialog("Enter sixth digit (in numerical form):");   
     if (number6.equals("one")){
    six = new One(31,9);
    }
    else if (number6.equals("two")){
    six = new Two(31,9);
    }
    else if (number6.equals("three")){
    six = new Three(31,9);
    }
    else if (number6.equals("four")){
    six = new Four(31,9);
    }
    else if (number6.equals("five")){
    six = new Five(31,9);
    }
    else if (number6.equals("six")){
    six = new Six(31,9);
    }
    else if (number6.equals("seven")){
    six = new Seven(31,9);
    }
    else if (number6.equals("eight")){
    six = new Eight(31,9);
    }
    else if (number6.equals("nine")){
    six = new Nine(31,9);
    }
    else if (number6.equals("zero")){
    six = new Zero(31,9);
    }	
	 }
	 Digit one.display();
    Digit two.display();
    Digit three.display();
    Digit four.display();
    Digit five.display();
    Digit six.display();
 }
