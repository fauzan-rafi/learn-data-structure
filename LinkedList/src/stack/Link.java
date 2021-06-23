package stack;

public class Link {
      public double dData;
      public Link next;

      public Link(Double dd){
            dData = dd;
      }

      public void displayLink(){
            System.out.println(dData);
      }
}