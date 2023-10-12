<<<<<<< HEAD
package org.example.model;

public class Bank implements Ihandler {

    private Ihandler ssucesor;
    @Override

    //cadena de peticion
    public int petition(int amount) {
        ATM ca = new ATM();
        setSuccessor(ca);

        ATMBranch cs = new ATMBranch();
        ca.setSuccessor(cs);

        FinancialAdvisor af = new FinancialAdvisor();
        cs.setSuccessor(af);

        ssucesor.petition(amount);
        return amount;
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
=======
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
>>>>>>> 2c4f5db775468f77c3c8513a6c2f71633817f2a5
