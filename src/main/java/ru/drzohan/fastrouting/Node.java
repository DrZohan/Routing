package ru.drzohan.fastrouting;

/**
 * Created by ivan on 18.04.17.
 */
public class Node implements INode{
    private int index;
    void Node(int index,int lat,int lon)
    {
        this.index = index;
    }
    public int getIndex()
    {
        return index;
    }
    public void setIndex(int index)
    {
        this.index =index;
    }
}
