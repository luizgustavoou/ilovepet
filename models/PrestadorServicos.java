package ilovepet.models;

import java.util.ArrayList;

/*
 * Prestador de Serviços para Pets:

Descrição: Um prestador de serviços para pets é alguém que oferece serviços relacionados a animais de estimação. Isso pode incluir serviços de cuidados, treinamento, passeios, etc.
Ações no Sistema: Pode se cadastrar no sistema, fornecer informações sobre suas especialidades (treinamento, cuidados veterinários, banho e tosa, etc.), disponibilidade, e outros detalhes relevantes.
 * 
 * 
 */
public class PrestadorServicos extends Usuario {

    // TODO: Acho que nao tem sentido a classe PrestadorServicos ter um atributo animais. Ja que ele apenas vai receber em algum metodo um animal e fazer algo com ele, como alimentar, passear e etc.
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

    public void adicionarEspecialidade(String especialidade) {
        this.especialidades.add(especialidade);
    }

    public void removerEspecialidade(String especialidade) {
        this.especialidades.remove(especialidade);
    }

}
