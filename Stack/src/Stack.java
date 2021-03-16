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
}