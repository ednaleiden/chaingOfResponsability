package org.example.model;

public interface Ihandler {

    public int petition(int amount);
    public  Ihandler getSuccessor();

    public void  setSuccessor(Ihandler successor);
}
