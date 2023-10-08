package ilovepet.repositories;

import java.util.ArrayList;

public interface IRepository<T> {
    public void add(T algo);

    public void remove(T algo);

    public ArrayList<T> getAll();

}
