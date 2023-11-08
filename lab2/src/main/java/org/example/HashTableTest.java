package org.example;

import org.testng.annotations.Test;

public class HashTableTest {

    @Test
    public void testContainsTermWhenTermExists()
    {
        HashTable hashTable = new HashTable(10);
        hashTable.add("apple");

        assert(hashTable.containsTerm("apple"));
    }


    @Test
    public void testContainsTermWhenTermDoesNotExist()
    {
        HashTable hashTable = new HashTable(10);
        assert(!hashTable.containsTerm("banana"));
    }


    @Test
    public void testAddWhenTermDoesNotExist()
    {
        HashTable hashTable = new HashTable(10);
        assert(hashTable.add("apple"));
    }


    @Test
    public void testAddWhenTermAlreadyExists()
    {
        HashTable hashTable = new HashTable(10);
        hashTable.add("apple");
        assert(!hashTable.add("apple"));
    }
}
