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

      public int pool(){
            int result = 0;
            if (size > 0) {
                  result = data[size];
                  for (int i = 1; i < size; i++) {
                        data[i-1] = data[i];
                  }
                  size--;
            }
            return result;
      }

      // to read head in queue
      public int peek(){
            int result = 0;
            if (size > 0) {
                  result = data[size];
            }
            return result;
      }
      // to return size
      public int getSize() {
            return size;
      }

      public boolean isEmpty(){
            boolean result = false;
            if( size <= 0){
                  result = true;
            }
            return result;
      }

      public boolean isFull() {
            boolean result = false;
            if(size >= max){
                  result = true;
            }
            return result;
      }
//////////////////////////////////////////////////////////
      public void queueIngfo() {
            System.out.println("Queue info");
            System.out.println("Capacity : " + max);
            System.out.println("Filled : " + (getSize()));
      }

      public void printArr() {
            if (!isEmpty()) {
                  for (int i = size; i >= 0; i--) {
                        if (i == size) {
                              System.out.println(data[i] + " <<<  ekor data");
                        }else if( i == 0){
                              System.out.println(data[i] + " <<< kepala data");
                        }else {
                              System.out.println(data[i] + " ");
                        }
                  }
            }
      }
}