/**
 * Node
 * 
 * This class was modified using the GeeksforGeeks code provided in the HW
 * assignment. It defines a Node required for a linked list representation.
 * 
 * @author sDantzler, rathbhupendra
 */

public class Node<T> {
   // instance variables
   private T data;
   private Node<T> prev;
   private Node<T> next;

   // Constructor to create a new node
   // next and prev is by default initialized as null
   protected Node(T data) {
      this.data = data;
   }// end constructor
   
   Node(){
      this.data = null;
   }// default constructor

   /**
    * @return Node data
    */
   public T getData() {
      return this.data;
   }// end getData

   /**
    * sets the Node data
    */
   public void setData(T data) {
      this.data = data;
   }// end setData method

   /**
    * @return prev Node
    */
   public Node<T> getPrev() {
      return this.prev;
   }// end getPrev method

   /**
    * sets the prev Node
    */
   public void setPrev(Node<T> prev) {
      this.prev = prev;
   }// end setPrev method

   /**
    * @return next Node
    */
   public Node<T> getNext() {
      return this.next;
   }// end getNext method

   /**
    * sets the next Node
    */
   public void setNext(Node<T> next) {
      this.next = next;
   }// end setNext method

}// end class Node
