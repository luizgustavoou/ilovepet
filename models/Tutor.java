package ilovepet.models;

import java.util.ArrayList;


/*
 * Tutor de Animal de Estimação:

Descrição: Um tutor de animal de estimação é alguém que possui um animal de estimação e é responsável por cuidar dele.
Ações no Sistema: Pode se cadastrar no sistema, fornecer informações sobre seu animal de estimação, como espécie (cão, gato, coelho, rato), nome, idade, entre outros detalh
 */
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
