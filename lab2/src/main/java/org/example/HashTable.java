package org.example;

import java.util.ArrayList;

public class HashTable {

    private Integer size;
    private ArrayList<ArrayList<String>> table;


    public HashTable(Integer size)
    {
        this.size = size;
        this.table = new ArrayList<>();
        for(int i = 0; i < size; i++){
            this.table.add(new ArrayList<>());
        }
    }

    public Integer getSize(){
        return size;
    }


    private Integer hash(String key)
    {
        int sum_chars = 0;
        char[] key_characters = key.toCharArray();
        for(char c: key_characters){
            sum_chars += c;
        }
        return sum_chars % size;
    }


    public boolean containsTerm(String term)
    {
        return this.findPositionOfTerm(term) != null;
    }

    public KeyValue findPositionOfTerm(String term)
    {
        int pos = hash(term);
        if(!table.get(pos).isEmpty())
        {
            ArrayList<String> elems = this.table.get(pos);
            for(int i = 0; i < elems.size(); i++)
            {
                if(elems.get(i).equals(term))
                {
                    return new KeyValue(pos, i);
                }
            }
        }
        return null;
    }

    public boolean add(String term)
    {
        if(containsTerm(term))
        {
            return false;
        }

        Integer pos = hash(term);
        ArrayList<String> elems = this.table.get(pos);
        elems.add(term);
        return true;
    }

    @Override
    public String toString()
    {
        return "SymbolTable { " + "elements=" + table + ", size = " + size + " }";
    }

}