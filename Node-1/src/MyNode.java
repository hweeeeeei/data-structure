public class MyNode {

    private Node head; // 头节点


    // 构造方法
    public MyNode() {

        // 头节点不存放数据
        head = new Node(null);
    }


    // 添加节点  找到链表最后一个节点， 并将新节点插入
    public void add(Node n) {


        // p引用了head节点
        Node p = head;

        // 找出链表最末的节点
        // 判断下一个节点是否不为空
        while (p.getNext() != null) {

            p = p.getNext();

        }
        p.setNext(n);

    }


    //现实所有节点
    public void display() {

        // p引用了head节点
        Node p = head.getNext();


        // 判断下一节点是否为空
        while (p != null) {

            System.out.println(p.getName());

            // p引用下一个节点
            p = p.getNext();
        }


    }


}
