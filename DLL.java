/**
 * DLL
 * 
 * This class was modified using the GeeksforGeeks code provided in the HW
 * assignment. It defines a Doubly Linked List and how to construct one.
 * 
 * @author sDantzler, rathbhupendra
 */

public class DLL<T> extends Node<T> {

   // instance variable
   Node<T> head; // head of list

   DLL(T data) {
      super(data);

   }// end parameterized constructor

   <T> DLL() {
      head = null;
   }// end default constructor

   /**
    * This method prints inserts a node at the beginning of a linked list
    */
   public void push(T new_data) {
      // 1. allocate node
      // 2. put in the data
      Node<T> new_Node = new Node<T>(new_data);

      // 3. Make next of new node as head and previous as NULL
      new_Node.setNext(head);
      new_Node.setPrev(null);

      // 4. change prev of head node to new node
      if (head != null) {
         head.setPrev(new_Node);
      }

      // 5. move the head to point to the new node
      head = new_Node;
   }// end push method

   /**
    * This method prints inserts a node after the given previous node
    */
   public void InsertAfter(Node<T> prev_Node, T new_data) {

      // 1. check if the given prev_node is NULL
      if (prev_Node == null) {
         System.out.println("The given previous node cannot be NULL ");
         return;
      }

      // 2. allocate node
      // 3. put in the data
      Node<T> new_node = new Node<T>(new_data);

      // 4. Make next of new node as next of prev_node
      new_node.setNext(prev_Node.getNext());

      // 5. Make the next of prev_node as new_node
      prev_Node.setNext(new_node);

      // 6. Make prev_node as previous of new_node
      new_node.setPrev(prev_Node);

      // 7. Change previous of new_node's next node
      if (new_node.getNext() != null) {
         new_node.getNext().setPrev(new_node);
      }
   }// end InsertAfter method

   /**
    * This method prints adds a node at the end of a linked list
    */
   public void append(T new_data) {
      // 1. allocate node
      // 2. put in the data
      Node<T> new_node = new Node<T>(new_data);

      Node<T> last = head; // used in step 5

      // 3. This new node is going to be the last node, so make next of it as
      // NULL
      new_node.setNext(null);

      // 4. If the Linked List is empty, then make the new node as head
      if (head == null) {
         new_node.setPrev(null);
         head = new_node;
         return;
      }

      // 5. Else traverse till the last node
      while (last.getNext() != null) {
         last = last.getNext();
      }

      // 6. Change the next of last node
      last.setNext(new_node);

      // 7. Make last node as previous of new node
      new_node.setPrev(last);
   }// end append method

   /**
    * This method prints the contents of a linked list starting from the given
    * node
    */
   public void printlist(Node<T> node) {
      Node<T> last = null;
      System.out.println("Traversal in forward Direction");
      while (node != null) {
         System.out.print(node.getData() + " ");
         last = node;
         node = node.getNext();
      }
      System.out.println();
      System.out.println("Traversal in reverse direction");
      while (last != null) {
         System.out.print(last.getData() + " ");
         last = last.getPrev();
      }
   }// end printlist method

}// end class DLL
