
/**
 * queue
 */
public class Myqueue {
	private int[] data;
    private int max;
    private int size;

    public Myqueue(int maxi) {
          max = maxi;
          data = new int[max];
          size = 0;
    }

    public boolean add(int value){
          boolean result = false;
          if (size < max) {
                data[size] = value;
                size++;
                result = true;
          }
          return result;
    }

    public int poll(){
          int result = 0;
          if (size > 0) {
                result = data[0];
                for (int i = 1; i < size; i++) {
                      data[i-1] = data[i];
                }
                size--;
          }
          return result;
    }
    
   public boolean isEmpty () {
	   boolean result =  false;
	   if (size <= 0) {
		   result = true;
	   }
	   return result;
   }
   
   public boolean isFull () {
	   boolean result = false;
	   if (size >= max) {
		   result = true;
	   }
	   return result;
   }
   
   public void clean() {
       size = 0;
 }
   
   public void queueIngfo() {
       System.out.println("Queue info");
       System.out.println("Capacity : " + max);
       System.out.println("Filled : " + (size));
 }

 public void printArr() {
       if (!isEmpty()) {
             for (int i = 0; i < size; i++) {
                   if (i == 0) {
                         System.out.println(data[i] + " <<< data paling depan ");
                         
                   } else {
                         System.out.println(data[i] + " ");
                   }
             }
       }
 }
}












