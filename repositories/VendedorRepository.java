package ilovepet.repositories;

import java.util.ArrayList;

import ilovepet.models.Vendedor;

public class VendedorRepository {
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

    public void add(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public void remove(Vendedor vendedor) {
        this.vendedores.remove(vendedor);
    }

    public ArrayList<Vendedor> getAll() {
        return this.vendedores;
    }

}
