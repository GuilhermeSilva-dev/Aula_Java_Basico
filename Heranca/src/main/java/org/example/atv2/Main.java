package org.example.atv2;

public class Main {
    public static void main(String[] args) {
        Fisica fisica1 = new Fisica("Guilherme","71988215919","09470611260",
                "12343211211","20/07/2005");
        Juridica juridica1 = new Juridica("DevInDevelopment", "71988215919",
                "21676630001-01","110.042.490.114");
        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
