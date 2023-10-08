package ilovepet.repositories;

import java.util.ArrayList;

import ilovepet.models.Tutor;

public class TutorRepository {
    private ArrayList<Tutor> Tutores = new ArrayList<Tutor>();

    private static TutorRepository instance;

    private TutorRepository() {
    }

    static public TutorRepository getInstance() {
        if (instance == null) {
            instance = new TutorRepository();
        }

        return instance;
    }

    public void add(Tutor tutor) {
        this.Tutores.add(tutor);
    }

    public void remove(Tutor tutor) {
        this.Tutores.remove(tutor);
    }

    public ArrayList<Tutor> getAll() {
        return this.Tutores;
    }

}
