package week6;
/*
 * Properties.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */
/**
 * This class works on setting vital properties to it's child class.
 *
 * @author Muskan Mall
 * @author Dibyanshu
 */

public class Properties {
    public Node getReplacementNode(Node replacedNode) {
        /*
         * this function works on getting the replacement after the deletion occurs
         *
         */

        Node replacementParent = replacedNode;
        Node replacement = replacedNode;

        Node focusNode = replacedNode.right;

        while (focusNode != null) {

            replacementParent = replacement;

            replacement = focusNode;

            focusNode = focusNode.left;

        }

        if (replacement != replacedNode.right) {

            replacementParent.left = replacement.right;
            replacement.right = replacedNode.right;

        }

        return replacement;

    }
public String inorder(Node ptr) {
    /*
     * this function performs an inorder traversal
     *
     */
    if (ptr == null)
        return null;

    return "\t( l: " + (ptr.left == null ? "null" : inorder(ptr.left))
            + " " + ptr.data + "/ r: " +
            (ptr.right == null ? "null" : inorder(ptr.right)) + " )";
}

}
