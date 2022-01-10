package week6;
/*
 * SortedStorageSetWithNulls.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */
/**
 * This class works on implementing a BST and performing all it's functionality.
 *
 * @author Muskan Mall
 * @author Dibyanshu
 */

public class SortedStorageSetWithNulls extends Properties implements HelperInterface  {
    int counter = 0;
    private Node root;

    public SortedStorageSetWithNulls() {
        root = null; //initializing root to null in constructor

    }

    @Override
    public boolean add(Long val) {
        /*
         * this function adds values to the tree to make it a BST
         *
         */
        Node temp, ptr;
        temp = new Node(); //creating new node
        temp.data = val; //assinging values
        temp.left = null;
        temp.right = null;
        if (val != null) { //checking if the tree is empty
            if (root == null) {
                root = temp;
                return true;
            } else { //if not going ahead and adding by the rules of BST
                ptr = root;
                while (true) { //infinite loop to add nodes until null is reached
                    int obj = Long.compare(val, (Long) ptr.data);
                    if (obj > 0) {
                        if (ptr.right == null) {
                            ptr.right = temp; //assinging to the right subtree
                            return true;
                        } else
                            ptr = ptr.right;
                    } else if (obj < 0) {
                        if (ptr.left == null) {
                            ptr.left = temp; //assinging to the left subtree
                            return true;
                        } else
                            ptr = ptr.left;
                    } else {
                        return false;
                    }
                }
            }
        } else { //checking for null input value
            counter++;
            return true;
        }

    }

    @Override
    public boolean add(Integer val) {
        /*
         * this function adds values to the tree to make it a BST
         *
         */
        Node temp, ptr;
        temp = new Node(); //creating new node
        temp.data = val; //assinging values
        temp.left = null;
        temp.right = null;
        if (val != null) { //checking if the tree is empty
            if (root == null) {
                root = temp;
                return true;
            } else { //if not going ahead and adding by the rules of BST
                ptr = root;
                while (true) { //infinite loop to add nodes until null is reached
                    if (val.compareTo((Integer) ptr.data) > 0) {
                        if (ptr.right == null) {
                            ptr.right = temp; //assinging to the right subtree
                            return true;
                        } else
                            ptr = ptr.right;
                    } else if (val.compareTo((Integer) ptr.data) < 0) {
                        if (ptr.left == null) {
                            ptr.left = temp; //assinging to the left subtree
                            return true;
                        } else
                            ptr = ptr.left;
                    } else {
                        return false;
                    }
                }
            }
        } else { //checking for null input value
            counter++;
            return true;
        }

    }

    @Override
    public boolean add(String val) {
        /*
         * this function adds values to the tree to make it a BST
         *
         */
        Node temp, ptr;
        temp = new Node(); //creating new node
        temp.data = val; //assinging values
        temp.left = null;
        temp.right = null;
        if (val != null) { //checking if the tree is empty
            if (root == null) {
                root = temp;
                return true;
            } else { //if not going ahead and adding by the rules of BST
                ptr = root;
                while (true) { //infinite loop to add nodes until null is reached
                    if (Integer.parseInt(val) > Integer.parseInt((String) ptr.data)) {
                        if (ptr.right == null) {
                            ptr.right = temp; //assinging to the right subtree
                            return true;
                        } else
                            ptr = ptr.right;
                    } else if (Integer.parseInt(val) < Integer.parseInt((String) ptr.data)) {
                        if (ptr.left == null) {
                            ptr.left = temp; //assinging to the left subtree
                            return true;
                        } else
                            ptr = ptr.left;
                    } else {
                        return false;
                    }
                }
            }
        } else { //checking for null input value
            counter++;
            return true;
        }
    }

    public Node myParent;
    public Node currentNode; //stores current node
    public Node prevNode; //stores previous node

    @Override
    public boolean find(Long x) {
        int temp = counter;
        if (x != null) {
            currentNode = root;
            prevNode = root;
            while (currentNode != null) { //iterating until null is found
                int obj = Long.compare(x, (Long) currentNode.data);
                if (obj == 0) {
                    myParent = prevNode;
                    return true;
                } else if (obj < 0) {
                    prevNode = currentNode;
                    currentNode = currentNode.left;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.right;
                }
            }
            myParent = prevNode; //assinging value to parent node
            return false;
        } else {
            return temp != 0;

        }
    }

    @Override
    public boolean find(Integer x) {
        int temp = counter;
        if (x != null) {
            currentNode = root;
            prevNode = root;
            while (currentNode != null) { //iterating until null is found
                int obj = x.compareTo((Integer) currentNode.data);
                if (obj == 0) {
                    myParent = prevNode;
                    return true;
                } else if (obj < 0) {
                    prevNode = currentNode;
                    currentNode = currentNode.left;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.right;
                }
            }
            myParent = prevNode; //assinging value to parent node
            return false;
        } else {
            return temp != 0;

        }
    }

    @Override
    public boolean find(String x) {
        int temp = counter;
        if (x != null) {
            currentNode = root;
            prevNode = root;

            while (currentNode != null) { //iterating until null is found
                int obj = x.compareTo((String) currentNode.data);
                if (obj == 0) {
                    myParent = prevNode;
                    return true;
                } else if (obj < 0) {
                    prevNode = currentNode;
                    currentNode = currentNode.left;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.right;
                }
            }
            myParent = prevNode; //assinging value to parent node
            return false;
        } else {
            return temp != 0;

        }
    }

    @Override
    public boolean includesNull() {
        //checking if null was added
        return counter > 0;
    }

    @Override
    public boolean delete(Long key) {
        Node focusNode = root;
        Node parent = root;
        if (key != null) {
            boolean isItALeftChild = true; //flag value to check the node to be deleted
            while (key != focusNode.data) {

                parent = focusNode;
                if (key < (Long) focusNode.data) {

                    isItALeftChild = true;
                    focusNode = focusNode.left;

                } else {
                    isItALeftChild = false;
                    focusNode = focusNode.right;

                }
                if (focusNode == null)
                    return false;

            }
            if (focusNode.left == null && focusNode.right == null) { //if both left and right child are missing
                if (focusNode == root) {
                    root = null;
                    return true;
                } else if (isItALeftChild) {
                    parent.left = null;
                    return true;
                } else {
                    parent.right = null;
                    return true;
                }
            } else if (focusNode.right == null) {

                if (focusNode == root)
                    root = focusNode.left;
                else if (isItALeftChild)
                    parent.left = focusNode.left;

                else
                    parent.right = focusNode.left;

            } else if (focusNode.left == null) {

                if (focusNode == root)
                    root = focusNode.right;
                else if (isItALeftChild)
                    parent.left = focusNode.right;
                else
                    parent.right = focusNode.right;

            } else {

                Node replacement = getReplacementNode(focusNode); //replacing the nodes
                if (focusNode == root)
                    root = replacement;

                else if (isItALeftChild)
                    parent.left = replacement;

                else
                    parent.right = replacement;

                replacement.left = focusNode.left;

            }

            return true;
        } else {
            if (counter != 0) {
                counter = counter - 1;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean delete(Integer key) {
        Node focusNode = root;
        Node parent = root;
        if (key != null) {
            boolean isItALeftChild = true; //flag value to check the node to be deleted
            while (key.compareTo((Integer) focusNode.data) != 0) {

                parent = focusNode;
                if (key.compareTo((Integer) focusNode.data) < 0) {

                    isItALeftChild = true;
                    focusNode = focusNode.left;

                } else {
                    isItALeftChild = false;
                    focusNode = focusNode.right;

                }
                if (focusNode == null)
                    return false;

            }
            if (focusNode.left == null && focusNode.right == null) { //if both left and right child are missing
                if (focusNode == root) {
                    root = null;
                    return true;
                } else if (isItALeftChild) {
                    parent.left = null;
                    return true;
                } else {
                    parent.right = null;
                    return true;
                }
            } else if (focusNode.right == null) {

                if (focusNode == root)
                    root = focusNode.left;
                else if (isItALeftChild)
                    parent.left = focusNode.left;

                else
                    parent.right = focusNode.left;

            } else if (focusNode.left == null) {

                if (focusNode == root)
                    root = focusNode.right;
                else if (isItALeftChild)
                    parent.left = focusNode.right;
                else
                    parent.right = focusNode.right;

            } else {

                Node replacement = getReplacementNode(focusNode); //replacing the nodes
                if (focusNode == root)
                    root = replacement;

                else if (isItALeftChild)
                    parent.left = replacement;

                else
                    parent.right = replacement;

                replacement.left = focusNode.left;

            }

            return true;
        } else {
            if (counter != 0) {
                counter = counter - 1;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean delete(String key) {
        Node focusNode = root;
        Node parent = root;
        if (key != null) {
            boolean isItALeftChild = true; //flag value to check the node to be deleted
            while (key.compareTo((String) focusNode.data) != 0) {

                parent = focusNode;
                if (key.compareTo((String) focusNode.data) < 0) {

                    isItALeftChild = true;
                    focusNode = focusNode.left;

                } else {
                    isItALeftChild = false;
                    focusNode = focusNode.right;

                }
                if (focusNode == null)
                    return false;

            }
            if (focusNode.left == null && focusNode.right == null) { //if both left and right child are missing
                if (focusNode == root) {
                    root = null;
                    return true;
                } else if (isItALeftChild) {
                    parent.left = null;
                    return true;
                } else {
                    parent.right = null;
                    return true;
                }
            } else if (focusNode.right == null) {

                if (focusNode == root)
                    root = focusNode.left;
                else if (isItALeftChild)
                    parent.left = focusNode.left;

                else
                    parent.right = focusNode.left;

            } else if (focusNode.left == null) {

                if (focusNode == root)
                    root = focusNode.right;
                else if (isItALeftChild)
                    parent.left = focusNode.right;
                else
                    parent.right = focusNode.right;

            } else {

                Node replacement = getReplacementNode(focusNode); //replacing the nodes
                if (focusNode == root)
                    root = replacement;

                else if (isItALeftChild)
                    parent.left = replacement;

                else
                    parent.right = replacement;

                replacement.left = focusNode.left;

            }

            return true;
        } else {
            if (counter != 0) {
                counter = counter - 1;
                return true;
            } else {
                return false;
            }

        }
    }

    public String toString() {//overriding toString function
        System.out.println();
        return "So many null values = " + counter + inorder(root);

    }
}
