package ilovepet.controllers;

import java.util.ArrayList;

import ilovepet.models.Animal;
import ilovepet.models.PrestadorServicos;
import ilovepet.models.Tutor;
import ilovepet.models.Vendedor;
import ilovepet.repositories.PrestadorServicoRepository;
import ilovepet.repositories.TutorRepository;
import ilovepet.repositories.VendedorRepository;

public class LovePetController {
    private PrestadorServicoRepository prestadorServicoRepository;
    private TutorRepository tutorRepository;
    private VendedorRepository vendedorRepository;

    public LovePetController() {
        this.prestadorServicoRepository = PrestadorServicoRepository.getInstance();
        this.tutorRepository = TutorRepository.getInstance();
        this.vendedorRepository = VendedorRepository.getInstance();
    }

    public void addPrestadorServico(String name, int age, ArrayList<String> especialidades) {
        PrestadorServicos prestadorServicos = new PrestadorServicos(name, age, especialidades);

        this.prestadorServicoRepository.add(prestadorServicos);
    }

    public void addTutor(String name, int age, ArrayList<Animal> animaisEstimacao) {
        Tutor tutor = new Tutor(name, age, animaisEstimacao);
        tutorRepository.add(tutor);
    }

    public void addVendedor(String name, int age) {
        Vendedor tutor = new Vendedor(name, age);
        vendedorRepository.add(tutor);
    }

    public void addEspecialidadePrestadorServico(String name, int age, String novaEspecialidade) {
        for (PrestadorServicos prestadorServicos : this.prestadorServicoRepository.getAll()) {
            if (prestadorServicos.getName() == name && prestadorServicos.getAge() == age) {
                prestadorServicos.adicionarEspecialidade(novaEspecialidade);

                System.out.println("Especialidade do prestador de serviço " + name + "adicionado com sucesso.");

                break;
            }

        }
    }

    public void addAnimacaoEsimaçaoTutor(String name, int age, Animal animal) {
        for (Tutor tutor : this.tutorRepository.getAll()) {
            if (tutor.getName() == name && tutor.getAge() == age) {
                tutor.addAnimalEstimacao(animal);

                System.out.println("Animal de estimação do " + name + "adicionado com sucesso.");
                break;
            }

        }
    }

    public void relatorioPrestadorServico() {
        System.out.println(this.prestadorServicoRepository.getAll().toString());
    }



}
