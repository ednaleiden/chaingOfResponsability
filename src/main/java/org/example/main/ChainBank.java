package org.example.main;

import org.example.model.Bank;

import javax.swing.*;

public class ChainBank {
    public static void main(String[] args) {
        int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el monto a retirar"));
        Bank bank = new Bank();
        bank.petition(amount);

    }
}