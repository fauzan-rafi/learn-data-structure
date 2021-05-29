public class LinkQueue {
      private FirstLastList theList;

      public LinkQueue() {
            theList = new FirstLastList();
      }

      public boolean isEmpty() {
            return theList.isEmpty();
      }

      public void insert(double j) {
            theList.insertLast(j);
      }

      public double remove() {
            return theList.deleteFirst();
      }

      public void displayQueue() {
            theList.displayList();
      }

      public void clearQueue(){
            theList.removeList();
      }

      public void queueIngfo(){
            Link current = theList.getFirst();
            int total = 0;
            while (current != null) {
                  total++;
                  current = current.next;
            }
            System.out.println("Total data = "+ total);
      }
}
