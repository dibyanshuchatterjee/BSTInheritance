package week6;
/*
 * Test.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */
/**
 * This class works on being the driver class to perform the execution of tree.
 *
 * @author Muskan Mall
 * @author Dibyanshu
 */

public class Test {
    public static void testIt(Comparable[] toInsert) {
        /*
         * this function sends values to the SortedStorageSetWithNulls class
         *
         */

        SortedStorageSetWithNulls aStorage = new SortedStorageSetWithNulls();

        String answer = toInsert.getClass().getSimpleName();
        if (answer.equals("String[]")) { //checking if the received values are String type
            System.out.println("Received String type values to add into BST");
            for (Comparable item : toInsert)
                System.out.println("	add(" + item + "): " + aStorage.add((String) item));//adding elements
            for (Comparable value : toInsert)
                System.out.println("	find(" + value + "): " + aStorage.find((String) value));//finding elements
            System.out.println("	" + aStorage);//printing the tree
            System.out.println("---------------------------------------");
            for (Comparable comparable : toInsert)
                System.out.println("delete(" + comparable + "): " + aStorage.delete((String) comparable));//deleting the elements
            System.out.println("	" + aStorage);
            System.out.println("---------------------------------------");

        }
        if (answer.equals("Long[]")) { //checking if the received value is Long type
            System.out.println("Received Long type values to add into BST");
            for (Comparable comparable : toInsert)
                System.out.println("	add(" + comparable + "): " + aStorage.add((Long) comparable));
            for (Comparable comparable : toInsert)
                System.out.println("	find(" + comparable + "): " + aStorage.find((Long) comparable));
            System.out.println("	" + aStorage);
            System.out.println("---------------------------------------");
            for (Comparable comparable : toInsert)
                System.out.println("delete(" + comparable + "): " + aStorage.delete((Long) comparable));
            System.out.println("	" + aStorage);
            System.out.println("---------------------------------------");
        }
        if (answer.equals("Integer[]")) { //checking if the received value if Integer type
            System.out.println("Received Integer type values to add into BST");
            for (Comparable item : toInsert)
                System.out.println("	add(" + item + "): " + aStorage.add((Integer) item));
            for (Comparable value : toInsert)
                System.out.println("	find(" + value + "): " + aStorage.find((Integer) value));
            System.out.println("	" + aStorage);
            System.out.println("---------------------------------------");
            for (Comparable comparable : toInsert)
                System.out.println("delete(" + comparable + "): " + aStorage.delete((Integer) comparable));
            System.out.println("	" + aStorage);
            System.out.println("---------------------------------------");

        }
    }

    public static void main(String args[]) {
        /*
         * tMain function to specify the values
         *
         */
        String[] strings = {"3", "3", "2", "4", null, null};
        ;
        testIt(strings);
        Long[] longs = {3L, 3L, 2L, 4L, null, null};
        ;
        testIt(longs);
        Integer[] ints = {3, 3, 2, 4, null, null};
        ;
        testIt(ints);
    }
}
