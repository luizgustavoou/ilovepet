package ilovepet;

import ilovepet.controllers.LovePetController;
import ilovepet.models.Cachorro;
import ilovepet.models.Gato;

public class Main {
    public static void main(String[] args) {
        LovePetController lovePetController = new LovePetController();

        lovePetController.addPrestadorServico("Luiz", 22);
        lovePetController.addPrestadorServico("Joab", 21);

        lovePetController.addEspecialidadePrestadorServico("Luiz", 22, "cachorro");
        lovePetController.addEspecialidadePrestadorServico("Joab", 21, "pato");
        lovePetController.addEspecialidadePrestadorServico("Joab", 21, "coruja");

        lovePetController.addTutor("Patricia", 47);
        lovePetController.addAnimacaoEstimacaoTutor("Patricia", 47, new Gato("Dolores", 6));
        lovePetController.addAnimacaoEstimacaoTutor("Patricia", 47, new Cachorro("Luccy", 18));

        lovePetController.addVendedor("Joselma", 40);

        lovePetController.relatorioPrestadorServico();
        lovePetController.relatorioTutor();
        lovePetController.relatorioVendedor();

    }

}
