package cn.com.yitong.ares.lianbiao;

/**
 * 进化版 新增内部类 禁止外部直接调用
 */
public class LinkPlus implements Links{

    private NodePlus nodePlus;


    private int count = 0;

    @Override
    public void add(Object object) {
        if(object == null){
            return;
        }
        NodePlus nodePlus = new NodePlus(object);
        if(this.nodePlus  == null){
            this.nodePlus = nodePlus;
        }else {
            this.nodePlus.addNode(nodePlus);
        }
        count ++;
    }

    @Override
    public int size() {
        return this.count;
    }

    private class NodePlus{
        private Object object;
        private  NodePlus next;

        public NodePlus(Object object){
            this.object = object;
        }

        public void addNode(NodePlus nodePlus){
            if(this.next == null){
                this.next = nodePlus;
            }else {
                this.next.addNode(nodePlus);
            };
        }
    }

    public static void main(String[] args) {
        Links links = new LinkPlus();
        links.add("1");
        links.add("2");
    }

}
