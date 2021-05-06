public class LinkStack {
      private LinkList theList;

      public LinkStack(){
            theList = new LinkList();
      }

      public void push(double j){
            theList.insertFirst(j);
      }

      public double pop(){
            return theList.deleteFirst(); 
      }

      public boolean isEmpty(){
            return ( theList.isEmpty());
      }

      public void displayStack(){
            System.out.println("Tumpukan datanya adalah: ");
            theList.displayList();
      }

      public void clearStack(){
            theList.removeList();
      }

      public void stackIngfo(){
            Link current = theList.getFirst();
            int total = 0;
            while (current != null) {
                  total++;
                  current = current.next;
            }
            System.out.println("Total data = "+ total);
      }

      public double peek(){
            return theList.getFirst().dData;
      }
}