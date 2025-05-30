public class StackItem<T> {

    private T data;
    private StackItem<T> next;
    public StackItem(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackItem<> getNext() {
        return next;
    }

    public void setNext(StackItem<> next) {
        this.next = next;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "StackItem{" +
                "data=" + data +
                '}';
    }
}
