public class FirstLastList {
      private Link first;
      private Link last;

      public FirstLastList() {
            first = null;
            last = null;
      }

      public boolean isEmpty() {
            boolean result = false;
            if (first == null) {
                  result = true;
            }
            return result;
      }

      public void insertLast(double dd) // insert at end of list
      {
            Link newLink = new Link(dd); // make new link
            if( isEmpty() ) // if empty list,
            {
                  first = newLink; // first --> newLink
            }
            else{
                  last.next = newLink; // old last --> newLink
                  newLink = last;// newLink <-- last
                  // last.next = newLink;
            }
      }

      public double deleteFirst() // delete first link
      { // (assumes non-empty list)
            double temp = first.dData;
            if(first.next == null) // if only one item
            {
                  last = null; // null <-- last
                  first = first.next; // first --> old next
            }
            return temp;
      }

      public void displayList()
      {
            Link current = first; // start at beginning
            while(current != null) // until end of list,
            {
                  current.displayLink(); // print data
                  current = current.next; // move to next link
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
