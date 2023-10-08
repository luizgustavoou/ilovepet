package ilovepet.repositories;

import java.util.ArrayList;

import ilovepet.models.Vendedor;

public class VendedorRepository implements IRepository<Vendedor> {
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

    private static VendedorRepository instance;

    private VendedorRepository() {
    }

    static public VendedorRepository getInstance() {
        if (instance == null) {
            instance = new VendedorRepository();
        }

        return instance;
    }

    @Override
    public void add(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    @Override
    public void remove(Vendedor vendedor) {
        this.vendedores.remove(vendedor);
    }

    @Override
    public ArrayList<Vendedor> getAll() {
        return this.vendedores;
    }

}
