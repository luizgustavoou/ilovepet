package ilovepet.repositories;

import ilovepet.models.Tutor;

public class TutorRepository extends Repository<Tutor> {

    private static TutorRepository instance;

    private TutorRepository() {
    }

    static public TutorRepository getInstance() {
        if (instance == null) {
            instance = new TutorRepository();
        }

        return instance;
    }

}
