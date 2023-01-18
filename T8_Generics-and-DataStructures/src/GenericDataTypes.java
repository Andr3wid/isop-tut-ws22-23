import java.util.ArrayList;
import java.util.LinkedList;

public class GenericDataTypes {
    public static ArrayList<String> getDuplicates(ArrayList<String> ar1, ArrayList<String> ar2) {
        ArrayList<String> foundDuplicatesList = new ArrayList<>();

        for(int i = 0; i < ar1.size(); i++) {
            if(ar2.contains(ar1.get(i))) {
                foundDuplicatesList.add(ar1.get(i));
            }
        }

        return foundDuplicatesList;
    }

    public static void main(String[] args) {

        // ARRAY
        String[] myArr = new String[5];
        myArr[0] = "ASDF";

        // LinkedList<DataType>
        LinkedList<String> llFruit = new LinkedList<>();
        ArrayList<String> llFruit2 = new ArrayList<>();

        // adding items to the list
        llFruit.add("Banana");
        llFruit.add("Apple");
        llFruit.add("Lemon");

        // receiving / printing items
        System.out.println(llFruit.get(1));

        // delete
        llFruit.remove("Apple");
        System.out.println(llFruit.get(1));

        // checking if an item exists
        System.out.println("Banana exists in the list: " + llFruit.contains("Banana"));
        System.out.println("Mango exists in the list: " + llFruit.contains("Mango"));

        // count how many are in the list
        llFruit.add("Banana");

        int bananaCounter = 0;
        for(int i = 0; i < llFruit.size(); i++) {
            if(llFruit.get(i).equals("Banana")) {
                bananaCounter++;
            }
        }
        System.out.println("There are " + bananaCounter + " bananas in your fruit list");

        // check where an item is
        int lemonIndex = llFruit.indexOf("Coconut");
        System.out.println("Coconut exists on index " + lemonIndex);

        // clear whole list
        llFruit.clear();

        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("banana");
        fruits1.add("coconut");
        fruits1.add("apple");


        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("coconut");

        ArrayList<String> duplicates = getDuplicates(fruits1, fruits2);

        System.out.println("");

    }
}
