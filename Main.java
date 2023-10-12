package ilovepet;

import ilovepet.controllers.LovePetController;
import ilovepet.models.Cachorro;
import ilovepet.models.Gato;
import ilovepet.models.PrestadorServicos;
import ilovepet.models.Sausage;
import ilovepet.models.Tutor;
import ilovepet.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        // Instanciar LovePetController
        LovePetController lovePetController = new LovePetController();

        // Criar prestadores de serviço
        PrestadorServicos prestadorServico1 = lovePetController.addPrestadorServico("Luiz", 22);
        PrestadorServicos prestadorServico2 = lovePetController.addPrestadorServico("Joab", 21);

        // Criar vendedores
        Vendedor vendedor1 = lovePetController.addVendedor("Joselma", 40);
        Vendedor vendedor2 = lovePetController.addVendedor("Carlos", 40);

        // Criar tutores
        Tutor tutor1 = lovePetController.addTutor("Patricia", 47);

        // Adicionar especialidade dos prestadores de serviço
        lovePetController.addEspecialidadePrestadorServico(prestadorServico1.getId(), "cachorro");
        lovePetController.addEspecialidadePrestadorServico(prestadorServico2.getId(), "pato");
        lovePetController.addEspecialidadePrestadorServico(prestadorServico2.getId(), "coruja");

        // Adicionar animais dus tutores
        lovePetController.addAnimacaoEstimacaoTutor(tutor1.getId(), new Gato("Dolores", 6));
        lovePetController.addAnimacaoEstimacaoTutor(tutor1.getId(), new Cachorro("Luccy", 18));
        lovePetController.addAnimacaoEstimacaoTutor(tutor1.getId(), new Cachorro("Pingo", 11));
        lovePetController.addAnimacaoEstimacaoTutor(tutor1.getId(), new Gato("Dumbo", 6));

        // Prestadores de serviço alimentar ou andar com os animais
        lovePetController.alimentarAnimalPrestadorServico(prestadorServico2.getId(),
                tutor1.getAnimaisEstimacao().get(0), new Sausage());
        lovePetController.passearAnimalPrestadorServico(prestadorServico1.getId(), tutor1.getAnimaisEstimacao().get(0));

        // Emitir relatorio dos prestadores de serviço, tutor e vendedor
        lovePetController.relatorioPrestadorServico();
        lovePetController.relatorioTutor();
        lovePetController.relatorioVendedor();

    }

}
