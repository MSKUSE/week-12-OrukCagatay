public class StackLinkedList<T> implements Stack<T>{

    StackItem<T> top;
    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        StackItem<T> previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop() throws MyEmptyStackException {
        if(this.top == null){
            throw new MyEmptyStackException("Stack is empty!! You can't pop anything from an empty stack!!");
        }
        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }
}
