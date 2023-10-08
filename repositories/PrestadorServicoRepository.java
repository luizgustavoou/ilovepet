package ilovepet.repositories;

import java.util.ArrayList;

import ilovepet.models.PrestadorServicos;

public class PrestadorServicoRepository {
    private ArrayList<PrestadorServicos> prestadoresServico = new ArrayList<PrestadorServicos>();

    private static PrestadorServicoRepository instance;

    private PrestadorServicoRepository() {
    }

    static public PrestadorServicoRepository getInstance() {
        if (instance == null) {
            instance = new PrestadorServicoRepository();
        }

        return instance;
    }

    public void add(PrestadorServicos prestadorServicos) {
        this.prestadoresServico.add(prestadorServicos);
    }

    public void remove(PrestadorServicos prestadorServicos) {
        this.prestadoresServico.remove(prestadorServicos);
    }

    public ArrayList<PrestadorServicos> getAll() {
        return this.prestadoresServico;
    }

}
