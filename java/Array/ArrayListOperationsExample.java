
import java.util.*;

public class ArrayListOperationsExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
z
        arrayList.add("Apple");
        arrayList.add("Banana");
        
        arrayList.add("Cherry");
        arrayList.add("Date");
        System.out.println("ArrayList after adding elements: " + arrayList);

        arrayList.add(2, "Blueberry");
        System.out.println("ArrayList after adding 'Blueberry' at index 2: " + arrayList);

        System.out.println("Element at index 1: " + arrayList.get(1));

        arrayList.set(1, "Blackberry");
        System.out.println("ArrayList after updating index 1: " + arrayList);

        arrayList.remove(2);
        System.out.println("ArrayList after removing index 2: " + arrayList);

        arrayList.remove("Date");
        System.out.println("ArrayList after removing 'Date': " + arrayList);

        System.out.println("Contains 'Apple'? " + arrayList.contains("Apple"));

        System.out.println("Index of 'Blackberry': " + arrayList.indexOf("Blackberry"));

        arrayList.add("Apple");
        System.out.println("Last index of 'Apple': " + arrayList.lastIndexOf("Apple"));

        System.out.println("Size of ArrayList: " + arrayList.size());

        System.out.print("Iterating using for-each: ");
        for (String item : arrayList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        Collections.reverse(arrayList);
        System.out.println("ArrayList after reversing: " + arrayList);

        Collections.shuffle(arrayList);
        System.out.println("ArrayList after shuffling: " + arrayList);

        List<String> subList = arrayList.subList(1, 3);
        System.out.println("Sublist (index 1 to 3): " + subList);

        List<String> copiedArrayList = new ArrayList<>(arrayList);
        System.out.println("Copied ArrayList: " + copiedArrayList);

        Collections.replaceAll(arrayList, "Apple", "Mango");
        System.out.println("ArrayList after replacing 'Apple' with 'Mango': " + arrayList);

        System.out.println("Is the ArrayList empty? " + arrayList.isEmpty());

        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);

        System.out.println("Is the ArrayList empty after clearing? " + arrayList.isEmpty());

        Collections.addAll(arrayList, "Pineapple", "Grapes", "Orange");
        System.out.println("ArrayList after adding multiple elements: " + arrayList);

        arrayList.removeIf(item -> item.startsWith("G"));
        System.out.println("ArrayList after removing elements starting with 'G': " + arrayList);

        String[] array = arrayList.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(array));

        ArrayList<String> arrayListFromArr = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted ArrayList from Array: " + arrayListFromArr);

        List<String> unmodifiableArrayList = Collections.unmodifiableList(arrayListFromArr);
        System.out.println("Unmodifiable ArrayList: " + unmodifiableArrayList);

        System.out.println("Are ArrayLists equal? " + arrayList.equals(arrayListFromArr));

        Collections.fill(arrayList, "Peach");
        System.out.println("ArrayList after filling with 'Peach': " + arrayList);

        System.out.println("Is ArrayList empty using Collections: " + arrayList.equals(Collections.emptyList()));

        arrayList.clear();
        Collections.addAll(arrayList, "Red", "Green", "Blue", "Yellow");
        arrayList.retainAll(Arrays.asList("Green", "Blue"));
        System.out.println("ArrayList after retaining 'Green' and 'Blue': " + arrayList);

        arrayList.ensureCapacity(100);
        System.out.println("ArrayList after ensuring capacity: " + arrayList);

        ArrayList<String> clonedArrayList = (ArrayList<String>) arrayList.clone();
        System.out.println("Cloned ArrayList: " + clonedArrayList);
    }
}