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

}
