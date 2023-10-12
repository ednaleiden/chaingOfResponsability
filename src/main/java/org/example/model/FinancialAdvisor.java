<<<<<<< HEAD
package org.example.model;

import javax.swing.*;

public class FinancialAdvisor implements Ihandler{
    private Ihandler ssucesor;
    @Override
    public int petition(int amount) {
        if (amount >= 300 ){
            JOptionPane.showMessageDialog(null,"La peticion ha sido atendida por el asesor financiero");
        }else {
            ssucesor.petition(amount);
        }
        return amount;
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
=======
package org.example.model;

import javax.swing.*;

public class FinancialAdvisor implements Ihandler{
    private Ihandler ssucesor;
    @Override
    public void petition(int amount) {
        if (amount >= 300 ){
            JOptionPane.showMessageDialog(null,"La peticion ha sido atendida por el asesor financiero");
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
>>>>>>> 2c4f5db775468f77c3c8513a6c2f71633817f2a5
