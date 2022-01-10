package week6;
/*
 * HelperInterface.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */
/**
 * An Interface that describes the architecture of the BST to be created.
 *
 * @author Muskan Mall
 * @author Dibyanshu
 */

public interface HelperInterface {
    boolean add(Long val);                 // true, if it was successfully added, false otherwise

    boolean add(Integer val);              // true, if it was successfully added, false otherwise

    boolean add(String val);               // true, if it was successfully added, false otherwise

    boolean find(Long x);             // true, if x could be found, false otherwise

    boolean find(Integer x);          // true, if x could be found, false otherwise

    boolean find(String x);           // true, if x could be found, false otherwise

    boolean includesNull();           // true, if the storage include a null element, false otherwise

    boolean delete(Long x);           // true, if it was successfully deleted, false otherwise

    boolean delete(Integer x);        // true, if it was successfully deleted, false otherwise

    boolean delete(String x);         // true, if it was successfully deleted, false otherwise

}
