public class BinaryTree {

    Node root;

    public void add(int value) {
        root = add(root, value);
    }

    public boolean containsNode(int value) {
        return containsNode(root, value);
    }

    public void delete(int value) {
        delete(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }


    private Node add(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = add(current.left, value);
        } else if(value > current.value) {
            current.right = add(current.right, value);
        } else {
            return current;
        }
        return current;
    }


    private boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value ? containsNode(current.left, value) : containsNode(current.right, value);
    }


    private Node delete(Node current, int value) {
        if(current == null) {
            return null;
        }

        if(value == current.value) {
            if(current.left == null && current.right == null) {
                return null;
            }
            if(current.right == null) {
                return current.left;
            }
            if(current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = delete(current.right, smallestValue);
            return current;
        }
        if(value < current.value) {
            current.left = delete(current.left, value);
            return current;
        } else if(value > current.value) {
            current.right = delete(current.right, value);
            return current;
        }
        return current;
    }


    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    static BinaryTree createTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

}
