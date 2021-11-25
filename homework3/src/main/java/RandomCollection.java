import java.util.*;

public class RandomCollection {

    public static void randomCollection(){
        Random rand = new Random();
        int randint = rand.nextInt(3);

        HashMap<Integer, CollectionNames> collectionsMap = new HashMap<>();
        collectionsMap.put(0, CollectionNames.LIST);
        collectionsMap.put(1, CollectionNames.MAP);
        collectionsMap.put(2, CollectionNames.SET);

        CollectionNames randCollection = collectionsMap.get(randint);

        System.out.println(randCollection.toString());

        switch (randCollection){
            case LIST:
                ArrayList<Character> charList = new ArrayList<>();
                charList.addAll(Arrays.asList('a', 'z', 'q', 'p', 'j', 'k', 'x', 'm'));
                charList.forEach(System.out::println);
                break;
            case MAP:
                HashMap<Integer, String> digits = new HashMap<>();
                digits.put(1, "ერთი");
                digits.put(2, "ორი");
                digits.put(3, "სამი");
                digits.put(4, "ოთხი");
                digits.put(5, "ხუთი");
                digits.put(6, "ექვსი");
                for (Map.Entry entry : digits.entrySet()){
                    System.out.printf("გასაღები: %d  მნიშვნელობა: %s\n", (int)entry.getKey(), entry.getValue());
                }
                break;
            case SET:
                HashSet<Integer> intSet = new HashSet<>();
                intSet.addAll(Arrays.asList(8, 3, 25, 3049, 2, 1, 42, 903, 0));
                intSet.forEach(System.out::println);
                break;
        }
    }

}
