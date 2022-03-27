public class List <T>{
    private class Node<T>{
        public Node<T> previousNode;
        public Node<T> nextNode;
        T data;
        {
            previousNode=null;
            nextNode=null;
        }
        Node(T data, Node<T> previous, Node<T> next){
            this.data=data;
            this.previousNode=previous;
            this.nextNode=next;
        }
        Node<T> addAfterNode(T newElement){
            nextNode=new Node<T>(newElement, this, nextNode);
            return nextNode;
        }
        Node<T> addBeforeNode(T newElement){
            previousNode=new Node<T>(newElement, previousNode,this);
            return previousNode;
        }
    }
    private Node<T> firstElement;
    private Node<T> lastElement;
    private int length;
    {
        firstElement=null;
        lastElement =null;
        length=0;
    }
    void addToEnd(T element){
        lastElement = lastElement.addAfterNode(element);
        length++;
    }
    void addToBegin(T element){
        firstElement= firstElement.addBeforeNode(element);
        length++;
    }
    void add(int index, T element){
        Node<T> nextNode=getNode(index), prevNode=nextNode.previousNode;
        prevNode.nextNode=new Node<T>(element, prevNode, nextNode);
        nextNode.previousNode=prevNode.nextNode;
    }
    int size(){
        return length;
    }
    int indexof(T element){
        Node<T> it=firstElement;
        int index=0;
        while(it!=null){
            if(it.data==element){
                return index;
            }
            it=it.nextNode;
            index++;
        }
        return -1;
    }
    int lastIndexOf(T element){
        Node<T> it=lastElement;
        int index=length-1;
        while (it!=null){
            if(it.data!=element){
                return index;
            }
            it=it.previousNode;
            index--;
        }
        return -1;
    }
    private Node<T> getNode(int index){
        Node<T> it=firstElement;
        for(int i=0; i<index+1; i++) {
            it=it.nextNode;
        }
        return it;
    }
    T get(int index){
        return getNode(index).data;
    }
    T remove(int index){
        Node<T> removingNode=getNode(index), prevNode=removingNode.previousNode, nextNode=removingNode.nextNode;
        prevNode.nextNode=nextNode;
        nextNode.previousNode=prevNode;
        return removingNode.data;
    }
    T set(int index, T element){
        Node<T> node=getNode(index);
        T oldStatement=node.data;
        node.data=element;
        return oldStatement;
    }
}
