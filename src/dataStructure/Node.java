package dataStructure;
public class Node {                            // 每一个链表实际上就是由多个节点组成的
    private String data;                    // 要保存的数据
    private Node next;                    // 要保存的下一个节点

    /**
     * 每一个Node类对象都必须保存有相应的数据
     *
     * @param data 要通过节点包装的数据
     */
    public Node(String data) {                // 必须有数据才有Node
        this.data = data;
    }

    /**
     * 设置下一个节点关系
     *
     * @param next 保存下一个Node类引用
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * 取得当前节点的下一个节点
     *
     * @return 当前节点的下一个节点引用
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * 设置或修改当前节点包装的数据
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 取得包装的数据
     *
     * @return
     */
    public String getData() {
        return this.data;
    }
}