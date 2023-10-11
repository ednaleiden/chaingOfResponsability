package org.example.model;

public class Bank implements Ihandler {

    private Ihandler ssucesor;
    @Override

    //cadena de peticion
    public void petition(int amount) {
        ATM ca = new ATM();
        setSuccessor(ca);

        ATMBranch cs = new ATMBranch();
        ca.setSuccessor(cs);

        FinancialAdvisor af = new FinancialAdvisor();
        cs.setSuccessor(af);

        ssucesor.petition(amount);
    }

    @Override
    public Ihandler getSuccessor() {
        return ssucesor;
    }

    @Override
    public void setSuccessor(Ihandler successor) {
        this.ssucesor = successor;

    }
}
