package com.company;

public class ContaPoupanca  extends Conta implements Imposto {


    @Override
    public double rendimentos() {

        rendimentos = saldo *0.05;


        System.out.println("o rendimento  de " +titular +" foi de " + rendimentos);

        rendimentos += saldo;


        System.out.println("seu saldo total é " + rendimentos);
        return  rendimentos;
    }

    @Override
    public String toString() {
        return "Conta Poupanca" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo;
    }

    @Override
    public void calcularImposto() {

        rendimentos = rendimentos * 0.10;
        System.out.println("o imposto total é de " +rendimentos);

    }
}

