package ilovepet.models;

import java.util.ArrayList;

public class PrestadorServicos extends Usuario {

    private ArrayList<Animal> animais;
    private ArrayList<String> especialidades;

    public PrestadorServicos(String name, int age, ArrayList<Animal> animais, ArrayList<String> especialidades) {
        super(name, age);
        this.animais = animais;
        this.especialidades = especialidades;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

}
