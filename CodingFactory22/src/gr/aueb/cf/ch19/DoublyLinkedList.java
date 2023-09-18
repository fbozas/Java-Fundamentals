package gr.aueb.cf.ch19;

public class DoublyLinkedList<T> {
    private NodeGeneric<T> head;
    private NodeGeneric<T> tail;

    public DoublyLinkedList(){
        head = tail = null;
    }

    public void insertFront(T t){
        NodeGeneric<T> tmp = new NodeGeneric<>();
        tmp.setValue(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        head = tmp;
        if(tmp.getNext() == null){
            tail = tmp;
        }else {
            tmp.getNext().setPrev(tmp);
        }
    }
}
