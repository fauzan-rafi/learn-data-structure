public class Stack {
      private int[] data;
      private int max;
      private int top;

      public Stack(int size) {
            max = size;
            data = new int[max];
            top = -1;
      }

      public boolean push(int value){
            boolean result = false;
            top++;
            if (top < max) {
                  data[top] = value;
                  result = true;
            }
            return result;
      }

      public int pop() {
            int result = 0;
            if(top >= 0){
                  result = data[top];
                  top--;
            }
            return result;
      }

      public int peek(){
            int result = 0;
            if(top >= 0){
                  result = data[top];
            }
            return result;
      }

      public boolean isEmpty() {
            boolean result = false;
            if(top < 0){
                  result = true;
            }
            return result;
      }

      public boolean isFull() {
            boolean result = false;
            if(top >= max-1){
                  result = true;
            }
            return result;
      }

      public void clean(){
            top = -1;
      }

      public void stackIngfo() {
            System.out.println("Stack info");
            System.out.println("Capacity : " + max);
            System.out.println("Filled : " + (top + 1));
      }
      public void printArr() {
            if(!isEmpty()){
                  for (int i = top; i >= 0; i--) {
                        if( i == top){
                              System.out.println(data[i] + " <<< data paling atas ");
                        }else{
                              System.out.println(data[i] + " ");
                        }
                  }
            }
      }
}