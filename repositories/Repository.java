package ilovepet.repositories;

import java.util.ArrayList;

// TODO: Se der, colocar essa classe para ser extendida em todos os repositories.

public abstract class Repository<T> {
    private ArrayList<T> repository = new ArrayList<T>();

    public void add(T algo) {
        this.repository.add(algo);
    }

    public void remove(T algo) {
        this.repository.remove(algo);
    }

    public ArrayList<T> getAll() {
        return this.repository;
    }

}
