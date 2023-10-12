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
    static private int nextId = 0;
    private int id;

    private ArrayList<String> especialidades;

    public PrestadorServicos(String name, int age, ArrayList<String> especialidades) {
        super(name, age);
        this.especialidades = especialidades;

    }

    public PrestadorServicos(String name, int age) {
        super(name, age);
        this.especialidades = new ArrayList<String>();
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public void adicionarEspecialidade(String especialidade) {
        this.especialidades.add(especialidade);
    }

    public void removerEspecialidade(String especialidade) {
        this.especialidades.remove(especialidade);
    }

    @Override
    public String toString() {
        String retorno = "PrestadorServicos{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() + '\'' + ", especialidades=[";

        for (String especialidade : this.especialidades) {
            retorno += especialidade + ", ";
        }

        retorno += "]";
        retorno += '}';

        return retorno;
    }

    public void caminharComAnimal(Animal animal) {
        System.out.println(
                "Prestador de serviço " + this.getName() + " passeando com o animal " + animal.getName() + "..");
        animal.walk();
    }

    public void alimentarAnimal(Animal animal, Food food) {
        System.out
                .println("Prestador de serviço " + this.getName() + " alimentando o animal " + animal.getName() + "..");

        animal.eat(food);
    }

}
