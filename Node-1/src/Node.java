
/**

    节点实体表
    每个节点包含下一个节点名称
*/
public class Node {

    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;
        this.next = null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {

        this.next = next;
    }
}
