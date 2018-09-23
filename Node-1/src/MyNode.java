public class MyNode {

    private Node head; // 头节点

    public MyNode() {

        // 头节点不存放数据
        head = new Node(null);
    }


    public void add(Node n) {

        Node p = head;

        // 找出链表最末的节点
        while (p.getNext() != null) {

            p = p.getNext();

        }
        p.setNext(n);

    }


    public void display() {

        Node p = head.getNext();

        while (p != null) {

            System.out.println(p.getName());

            // 指向下一个节点
            p = p.getNext();
        }


    }


}
