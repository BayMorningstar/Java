import java.security.KeyFactory;
import java.time.chrono.HijrahEra;

public class BinarySearchTree<T extends Comparable> {
    private TNode<T> root;

    public int findHeight(){
        return findHeight(root);
    }
    private int findHeight(TNode<T> currentRoot) {
    if(currentRoot != null){
        int left = findHeight(currentRoot.left);
        int right = findHeight(currentRoot.right);
        return(left > right ? left +1 : right +1);
    }
        return 0;
    }
    public boolean search(T val) {
        TNode<T> iterator = root;
        while (iterator != null) {
            if (iterator.right.value == val || iterator.left.value == val)
                return true;
            else if (val.compareTo(iterator.left.value) == -1)
                iterator = iterator.left;
            else
                iterator = iterator.right;
        }

        return false;
    }

    public boolean searchRecursivly(T val) {
        return searchRecursivly(root, val);
    }

    private boolean searchRecursivly(TNode<T> currentRoot, T val) {
        if (currentRoot == null)
            return false;
        else if (val.compareTo(currentRoot.value) == 1) {
            return searchRecursivly(currentRoot.right, val);
        } else if (val.compareTo(currentRoot.value) == -1) {
            return searchRecursivly(currentRoot.left, val);
        } else
            return true;

    }

    public void insert(T val) {
        TNode<T> newNode = new TNode<>(val);
        if (root == null)
            root = newNode;
        else {
            TNode<T> iterator = root;
            while (iterator != null) {
                if (val.compareTo(iterator.value) == 1) {
                    if (iterator.right == null) {
                        iterator.right = newNode;
                        return;
                    } else
                        iterator = iterator.right;
                } else if (val.compareTo(iterator.value) == -1) {
                    if (iterator.left == null) {
                        iterator.left = newNode;
                        return;
                    } else
                        iterator = iterator.left;
                } else {
                    System.out.println("Same value already exist");
                    return;
                }

            }
        }

    }

    public void inorder() {
        inorder(root);
        System.out.println("");
    }

    public void inorder(TNode<T> currentRoot) {
        if (currentRoot != null) {
            inorder(currentRoot.left);
            System.out.println(currentRoot.value);
            inorder(currentRoot.right);
        }

    }
}
