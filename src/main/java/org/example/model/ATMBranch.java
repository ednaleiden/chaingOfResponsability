package org.example.model;

import javax.swing.*;

public class ATMBranch implements Ihandler{
    private Ihandler ssucesor;
    @Override
    public void petition(int amount) {
        if (amount > 100 && amount < 300){
            JOptionPane.showMessageDialog(null,"La peticion ha sido atendida por el cajero de la sucursal");
        }else {
            ssucesor.petition(amount);
        }
    }

    @Override
    public Ihandler getSuccessor() {
        return ssucesor;
    }

    @Override
    public void setSuccessor(Ihandler ssucesor) {
        this.ssucesor = ssucesor;
    }
}
