public class Main {




    //  数据结构 链表
    public static void main(String[] args) {

        MyNode myNode = new MyNode();


        Node n1 = new Node("董事长");
        Node n2 = new Node("经理");
        myNode.add(n1);
        myNode.add(n2);


        // 打印所有节点
        myNode.display();


    }
}
