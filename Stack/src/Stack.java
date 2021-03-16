package Stack.Stack.src;
public class Stack {
      private String[] data;
      private int max;
      private int top;

      public Stack(int size) {
            max = size;
            data = new String[max];
            top = -1;
      }

      public boolean push(String value){
            boolean result = false;
            top++;
            if (top < max) {
                  data[top] = value;
                  result = true;
            }
            return result;
      }

      public String pop() {
            String result = null;
            if(top >= 0){
                  result = data[top];
                  top--;
            }
            return result;
      }

      public String peek(){
            String result = null;
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

      public void printArr() {
            if(!isEmpty()){
                  System.out.print("[ ");
                  for (int i = 0; i >= data.length; i++) {
                        System.out.print(data[i] + " ");
                  }
                  System.out.println("]");
            }
      }
}