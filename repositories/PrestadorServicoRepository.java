package ilovepet.repositories;

import ilovepet.models.PrestadorServicos;

public class PrestadorServicoRepository extends Repository<PrestadorServicos> {

    private static PrestadorServicoRepository instance;

    private PrestadorServicoRepository() {
    }

    static public PrestadorServicoRepository getInstance() {
        if (instance == null) {
            instance = new PrestadorServicoRepository();
        }

        return instance;
    }

}
