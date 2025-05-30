import java.util.ArrayList;
public class StackArray<T> implements Stack<T>{


    private  ArrayList<T> stack =
            new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(0,item);
    }
    @Override
    public T pop() throws MyEmptyStackException {
        if(this.isEmpty()){
            throw new MyEmptyStackException("Stack is empty");
        }
        return stack.remove(0);
    }
    @Override
    public void peek() {
        System.out.println("The top is "
        + stack.get(0));
    }
    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }


    public void displayStack(){
        if(this.top == null){
            System.out.println("This stack is empty!");
        }else{
          Stackitem<T> tempNode = top;
          while (tempNode != null){
              System.out.println(tempNode.getData());
              tempNode = tempNode.getNext();

          }
        }

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "StackArray{" +
                "stack=" + stack +
                '}';
    }
}
