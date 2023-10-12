package ilovepet.repositories;

import java.util.ArrayList;

import ilovepet.models.PrestadorServicos;

public class PrestadorServicoRepository implements IRepository<PrestadorServicos> {
    private ArrayList<PrestadorServicos> prestadoresServico = new ArrayList<PrestadorServicos>();

    static private PrestadorServicoRepository instance;

    private PrestadorServicoRepository() {
    }

    static public PrestadorServicoRepository getInstance() {
        if (instance == null) {
            instance = new PrestadorServicoRepository();
        }

        return instance;
    }

    @Override
    public void add(PrestadorServicos prestadorServicos) {
        this.prestadoresServico.add(prestadorServicos);
    }

    @Override
    public void remove(PrestadorServicos PrestadorServicos) {
        this.prestadoresServico.remove(PrestadorServicos);
    }

    @Override
    public ArrayList<PrestadorServicos> getAll() {
        return this.prestadoresServico;
    }

    public PrestadorServicos addEspecialidadePrestadorServico(int id, String novaEspecialidade) {
        PrestadorServicos prestadorServicos = null;

        for (PrestadorServicos ps : this.getAll()) {
            if (ps.getId() == id) {
                prestadorServicos = ps;
                break;
            }

        }

        if (prestadorServicos instanceof PrestadorServicos) {

            prestadorServicos.adicionarEspecialidade(novaEspecialidade);
        }

        return prestadorServicos;

    }

}
