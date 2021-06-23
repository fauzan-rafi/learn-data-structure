package stack;

public class LinkList {
      private Link first;

      public LinkList(){
            first = null;
      }

      public boolean isEmpty(){
            return (first == null );
      }

      public void insertFirst(double dd){
            Link newLink = new Link(dd);
            newLink.next = first;
            first = newLink;
      }

      public double deleteFirst(){
            Link temp = first;
            first  = first.next;
            return temp.dData;
      }

      public void displayList(){
            Link current = first;
            while (current != null) {
                  current.displayLink();
                  current = current.next;
            }
            System.out.println("");
      }

      public void removeList(){
            first = null;
      }

      /**
       * @return the first
       */
      public Link getFirst() {
            return first;
      }

}