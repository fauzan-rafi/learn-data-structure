package primary;

public class Node {
      private Node next;
      private int value;

      public Node(int val) {
            value = val;
            next = null;
      }

      public int getValue() {
            return value;
      }

      public Node getNext() {
            return next;
      }

      public void setValue(int value) {
            this.value = value;
      }

      public void setNext(Node next) {
            this.next = next;
      }

      @Override
      public String toString() {
            return value + ", ";
      }
}