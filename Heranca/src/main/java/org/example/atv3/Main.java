package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro1 = new Engenheiro("Guilherme","guilherme.dev@gmail.com",9.760f,
                new Endereco("Rua direta do Uruguai","433",
                        "Em frente a barroquinha","41204115","Serra preta"),"123423");
        Medico medico1 = new Medico("Andressa","AndresaMedica123@gmail.com",12.986f,
                new Endereco("Engomadeira","323",
                        "Em frente ao vanilla","41204115","Rondonia"),"12331");

        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());

    }
}
