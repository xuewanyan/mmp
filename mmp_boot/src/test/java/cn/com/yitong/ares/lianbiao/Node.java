package cn.com.yitong.ares.lianbiao;

/**
 * 链表
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }

    public Object getData() {
        return data;
    }

    public void addNode(Node node){
        if(this.next == null){
            this.next = node;
        }else {
            this.next.addNode(node);
        }
    }

    public void printNode(){
        System.out.println(this.data);
        if(this.next != null){
            this.next.printNode();
        }
    }
}
