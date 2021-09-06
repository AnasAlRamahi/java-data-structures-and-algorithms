package hashTable;

import java.util.Arrays;
import java.util.LinkedList;

public class hashTable<T>{
    private long size;
    Node[] hashArray;


    public hashTable(int size) {
        this.size = size;
        hashArray = new Node[size];
    }

    public long hash(String key) {
        long count = 0;
        for (int i = 0; i < key.length(); i++) {
            count += (long)key.charAt(i);
        }
        count = (count * 599) % this.size;
        return count;
    }

    public void add(String key ,T value) {
       Node newNode = new Node(key, value);
       long hashedKey = hash(key);
       if(hashArray[(int) hashedKey] == null){
           hashArray[(int) hashedKey] = newNode;
       }else{
           newNode.next = hashArray[(int) hashedKey];
           hashArray[(int) hashedKey] = newNode;
       }
    }

    public T get(String key){
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            return null;
        }else{
            Node counter;
            counter = hashArray[(int) hashedKey];
            while(counter != null)
                if(counter.getKey() == key)
                    return (T)counter.getValue();
                else{
                    counter = counter.next;
                }
        }
        return null;
    }

    public boolean contains(String key){
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            return false;
        }else{
            Node counter;
            counter = hashArray[(int) hashedKey];
            while(counter != null)
                if(counter.getKey() == key)
                    return true;
                else{
                    counter = counter.next;
                }
        }
        return false;
    }

    public static String repeatedWord(String input){
        String[] splittedString = input.split("[, ?.@]+", -1);
        hashTable stringHashTable = new hashTable(1024);
        for(int i = 0 ; i < splittedString.length ; i++){
            if(stringHashTable.get(splittedString[i]) != null){
                return splittedString[i];
            }
            stringHashTable.add(splittedString[i], splittedString[i]);
        }
        System.out.println(Arrays.toString(splittedString));
        return null;
    }
}
