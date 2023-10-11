package org.example.model;

public interface Ihandler {

    public void petition(int amount);
    public  Ihandler getSuccessor();

    public void  setSuccessor(Ihandler successor);
}
