import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Test {

    public static void main(String[] args){

        //DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        //LinkedList<Integer> myList=new LinkedList<>();
        // CircularLinkedList<Integer> myList=new CircularLinkedList<>();
        //  myList.addToFront(10);
        //  myList.addToFront(11);
        //  myList.addToFront(12);
        //  myList.addToFront(13);
        //  myList.selectionSort();
        //  myList.display();
          // BinarySearchTree <Integer> myTree = new BinarySearchTree<>();
          // myTree.insert(8);
          // myTree.insert(5);
          // myTree.insert(12);
          // myTree.insert(10);
          // myTree.insert(20);
          // myTree.insert(3);
          // System.out.println(myTree.search(10));
          // myTree.inorder();
          // myTree.searchRecursivly(20);


         Graph<Integer> mygGraph = new Graph<Integer>();
         mygGraph.addVertex(1); 
         mygGraph.addVertex(2); 
         mygGraph.addVertex(3); 
         mygGraph.addVertex(4); 
         mygGraph.addVertex(5);
         mygGraph.addEdge(1, 3); 
         mygGraph.addEdge(1, 5); 
         mygGraph.addEdge(3, 4); 
         mygGraph.addEdge(3, 5); 
         mygGraph.addEdge(4, 5); 
         mygGraph.addEdge(2, 3); 
         mygGraph.display();


        //        Queue<Integer> q1=new Queue(Integer.class,5);
//        q1.enqueue(5);
//        q1.enqueue(15);
//        q1.enqueue(3);
//        q1.enqueue(4);
//        q1.dequeue();
//        q1.display();
//        GenericStackOps<Integer> sops=new GenericStackOps<>();
//        System.out.println(sops.isPalindrome("kapaks"));

//        GenericStack<Integer> gs=new GenericStack<>(Integer.class, 5);
//        //GenericStack<Student> gs2=new GenericStack<>(Student.class, 5);
//        gs.push(5);
//        gs.push(6);
//        gs.push(2);
//        gs.display();
//        GenericStackOps<Integer> sops=new GenericStackOps<>();
//        System.out.println(sops.findMax(gs));
        //        Stack s=new Stack(5);
//        s.push(5);
//        s.push(6);
//        s.push(2);
//        //s.pop();
//
//        s.display();
//        System.out.println(StackOperations.search(s,67));
//        s.display();



    }

}
