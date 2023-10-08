package ilovepet;

import ilovepet.controllers.LovePetController;

public class Main {
    public static void main(String[] args) {
        LovePetController lovePetController = new LovePetController();

        lovePetController.addPrestadorServico("Luiz", 22);
        lovePetController.addPrestadorServico("Joab", 21);

        lovePetController.addEspecialidadePrestadorServico("Luiz", 22, "cachorro");
        lovePetController.addEspecialidadePrestadorServico("Joab", 21, "pato");
        lovePetController.addEspecialidadePrestadorServico("Joab", 21, "coruja");

        lovePetController.addVendedor("Joselma", 40);

        lovePetController.relatorioPrestadorServico();
        lovePetController.relatorioTutor();
        lovePetController.relatorioVendedor();

    }

}
