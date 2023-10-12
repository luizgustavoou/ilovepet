package ilovepet.repositories;

import java.util.ArrayList;

import ilovepet.models.Animal;
import ilovepet.models.Tutor;

public class TutorRepository implements IRepository<Tutor> {
    private ArrayList<Tutor> Tutores = new ArrayList<Tutor>();

    static private TutorRepository instance;

    private TutorRepository() {
    }

    static public TutorRepository getInstance() {
        if (instance == null) {
            instance = new TutorRepository();
        }

        return instance;
    }

    @Override
    public void add(Tutor tutor) {
        this.Tutores.add(tutor);
    }

    @Override
    public void remove(Tutor tutor) {
        this.Tutores.remove(tutor);
    }

    @Override
    public ArrayList<Tutor> getAll() {
        return this.Tutores;
    }

    public Tutor addAnimacaoEstimacaoTutor(int id, Animal animal) {
        Tutor tutor = null;

        for (Tutor tu : this.getAll()) {
            if (tu.getId() == id) {
                tutor = tu;
                break;
            }

        }

        if (tutor instanceof Tutor) {
            tutor.addAnimalEstimacao(animal);

        }

        return tutor;

    }

}
