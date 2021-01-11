package cn.com.yitong.ares.lianbiao;

/**
 * 链表操作类
 */
public class Link {

    private Node root;//根元素

    public void add(Object object){//向链表中添加数据
        Node node = new Node(object);
        if(this.root == null){
            this.root = node;
        }else {
            this.root.addNode(node);
        }

    }

    public void print(){//输出链表的全部数据
        if(this.root != null){
            this.root.printNode();
        }
    }

    public static void main(String[] args) {

    }
}
