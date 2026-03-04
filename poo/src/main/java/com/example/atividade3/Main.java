package com.example.atividade3;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("BancoDoBrasi", "34508", "12345-0",
                "Corrente",1700000,200.000);
        Funcionario funcionario1 = new Funcionario(01,"Guilherme","Arraial do Retiro",
                "71988215919","guilhermesilvadesouza20@gmail.com", conta1);

        System.out.println("-----CONTA BANCÁRIA-----");

        System.out.println("BANCO: " + conta1.getBanco());
        System.out.println("AGÊNCIA: " + conta1.getAgencia());
        System.out.println("NUMEROCONTA: " + conta1.getNumeroconta());
        System.out.println("TIPOCONTA: " + conta1.getTipoconta());
        System.out.println("SALDO_ATUAL: " +conta1.getSaldoatual());
        System.out.println("LIMITE_DISPONIVEL: " + conta1.getLimitedisponivel());

        System.out.println("-----DADOS DO FUNCIONÁRIO-----");

        System.out.println("CÓDIGO: " + funcionario1.getContabanco().get);
        System.out.println("");
        System.out.println("");
        
    }
}
