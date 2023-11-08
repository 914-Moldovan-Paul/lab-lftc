package org.example;

public class SymbolTable {


    private Integer size;
    private final HashTable hashTable;


    public SymbolTable(Integer size)
    {
        hashTable = new HashTable(size);
    }

    public KeyValue findPositionOfTerm(String term)
    {
        return hashTable.findPositionOfTerm(term);
    }

    public boolean containsTerm(String term)
    {
        return hashTable.containsTerm(term);
    }

    public boolean add(String term)
    {
        return hashTable.add(term);
    }

    public HashTable getHashTable()
    {
        return hashTable;
    }

    public Integer getSize()
    {
        return hashTable.getSize();
    }

}