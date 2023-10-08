package ilovepet.repositories;

import ilovepet.models.Vendedor;

public class VendedorRepository extends Repository<Vendedor> {

    private static VendedorRepository instance;

    private VendedorRepository() {
    }

    static public VendedorRepository getInstance() {
        if (instance == null) {
            instance = new VendedorRepository();
        }

        return instance;
    }

}
