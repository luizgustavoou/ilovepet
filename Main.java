package ilovepet;

import ilovepet.controllers.LovePetController;
import ilovepet.models.Cachorro;
import ilovepet.models.Gato;

public class Main {
    public static void main(String[] args) {
        LovePetController lovePetController = new LovePetController();

        int idPrestadorServico1 = lovePetController.addPrestadorServico("Luiz", 22);
        int idPrestadorServico2 = lovePetController.addPrestadorServico("Joab", 21);

        lovePetController.addEspecialidadePrestadorServico(idPrestadorServico1, "cachorro");
        lovePetController.addEspecialidadePrestadorServico(idPrestadorServico2, "pato");
        lovePetController.addEspecialidadePrestadorServico(idPrestadorServico2, "coruja");

        int idTutor1 = lovePetController.addTutor("Patricia", 47);
        lovePetController.addAnimacaoEstimacaoTutor(idTutor1, new Gato("Dolores", 6));
        lovePetController.addAnimacaoEstimacaoTutor(idTutor1, new Cachorro("Luccy", 18));
        lovePetController.addAnimacaoEstimacaoTutor(idTutor1, new Cachorro("Pingo", 11));
        lovePetController.addAnimacaoEstimacaoTutor(idTutor1, new Gato("Dumbo", 6));

        int idVendedor1 = lovePetController.addVendedor("Joselma", 40);
        int idVendedor2 = lovePetController.addVendedor("Carlos", 40);

        lovePetController.relatorioPrestadorServico();
        lovePetController.relatorioTutor();
        lovePetController.relatorioVendedor();

    }

}
