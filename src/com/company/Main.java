package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.setNumero(1111);
        contaCorrente.setSaldo(5000);
        contaCorrente.setTitular("Rodrigo");

        System.out.println(contaCorrente.toString());
        contaCorrente.rendimentos();
        contaCorrente.calcularImposto();


        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setNumero(555);
        contaPoupanca.setSaldo(2000);
        contaPoupanca.setTitular("lucas");

        System.out.println(contaPoupanca.toString());

        contaPoupanca.rendimentos();
        contaPoupanca.calcularImposto();


    }
}
