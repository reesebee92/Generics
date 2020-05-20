/**
 * DLLDemo
 * 
 * This class will show the upgrades of the Doubly Linked List from Non-Generic
 * into the transformed Generic class!
 * 
 * @author sDantzler
 */
public class DLLDemo {

   public static void main(String[] args) {

      // Start with three empty lists
      DLL<Integer> idll = new DLL<Integer>();
      DLL<Double> ddll = new DLL<Double>();
      DLL<String> sdll = new DLL<String>();

      // Add Integer list values
      idll.push(1);
      idll.append(10);
      idll.InsertAfter(idll.head, 5);
      
      // Print Integer list values
      System.out.println("Created Integer Doubly Linked List: ");
      idll.printlist(idll.head);
      System.out.println("\n");
      
      // Add Double list values
      ddll.push(2.0);
      ddll.append(12.0);
      ddll.InsertAfter(ddll.head, 6.0);
      
      // Print Double list values
      System.out.println("Created Double Doubly Linked List: ");
      ddll.printlist(ddll.head);
      System.out.println("\n");
      
      // Add String list values
      sdll.push("Dog");
      sdll.append("Horse");
      sdll.InsertAfter(sdll.head, "Cat");
      
      // Print String list values
      System.out.println("Created String Doubly Linked List: ");
      sdll.printlist(sdll.head);
      System.out.println();
   }// end main method

}// end DLLDemo class
