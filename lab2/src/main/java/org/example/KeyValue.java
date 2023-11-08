package org.example;

public class KeyValue {
    private final Integer first;
    private final Integer second;



    public Integer getFirst()
    {
        return this.first;
    }

    public Integer getSecond()
    {
        return this.second;
    }

    public KeyValue(Integer first, Integer second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
