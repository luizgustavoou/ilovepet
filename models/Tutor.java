package ilovepet.models;

import java.util.ArrayList;

public class Tutor extends Usuario {
    private ArrayList<Animal> animaisEstimacao;

    public Tutor(String name, int age, ArrayList<Animal> animaisEstimacao) {
        super(name, age);
        this.animaisEstimacao = animaisEstimacao;
    }

    public ArrayList<Animal> getAnimaisEstimacao() {
        return animaisEstimacao;
    }

    public void setAnimaisEstimacao(ArrayList<Animal> animaisEstimacao) {
        this.animaisEstimacao = animaisEstimacao;
    }

}
