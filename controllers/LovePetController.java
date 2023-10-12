package ilovepet.controllers;

import ilovepet.models.Animal;
import ilovepet.models.PrestadorServicos;
import ilovepet.models.Tutor;
import ilovepet.models.Vendedor;
import ilovepet.repositories.PrestadorServicoRepository;
import ilovepet.repositories.TutorRepository;
import ilovepet.repositories.VendedorRepository;

//TODO: Nao eh responsabilidade do controller implementar uma funcao de relatorio, deixar isso para uma outra classe
//TODO: Injetar depedencia de prestadorServicoRepository, tutorRepository, vendedorRepository
public class LovePetController {
    private PrestadorServicoRepository prestadorServicoRepository;
    private TutorRepository tutorRepository;
    private VendedorRepository vendedorRepository;

    public LovePetController() {
        this.prestadorServicoRepository = PrestadorServicoRepository.getInstance();
        this.tutorRepository = TutorRepository.getInstance();
        this.vendedorRepository = VendedorRepository.getInstance();
    }

    public int addPrestadorServico(String name, int age) {
        PrestadorServicos prestadorServicos = new PrestadorServicos(name, age);

        this.prestadorServicoRepository.add(prestadorServicos);

        return prestadorServicos.getId();
    }

    public int addTutor(String name, int age) {
        Tutor tutor = new Tutor(name, age);
        tutorRepository.add(tutor);

        return tutor.getId();
    }

    public int addVendedor(String name, int age) {
        Vendedor vendedor = new Vendedor(name, age);
        vendedorRepository.add(vendedor);

        return vendedor.getId();
    }

    public void addEspecialidadePrestadorServico(int id, String novaEspecialidade) {
        for (PrestadorServicos prestadorServicos : this.prestadorServicoRepository.getAll()) {
            if (prestadorServicos.getId() == id) {
                prestadorServicos.adicionarEspecialidade(novaEspecialidade);

                System.out.println("Especialidade do prestador de serviço " + prestadorServicos.getName() + " adicionado com sucesso.");

                break;
            }

        }
    }

    public void addAnimacaoEstimacaoTutor(int id, Animal animal) {
        for (Tutor tutor : this.tutorRepository.getAll()) {
            if (tutor.getId() == id) {
                tutor.addAnimalEstimacao(animal);

                System.out.println("Animal de estimação do " + tutor.getName() + " adicionado com sucesso.");
                break;
            }

        }
    }

    public void relatorioPrestadorServico() {
        System.out.println(this.prestadorServicoRepository.getAll().toString());
    }

    public void relatorioTutor() {
        System.out.println(this.tutorRepository.getAll().toString());
    }

    public void relatorioVendedor() {
        System.out.println(this.vendedorRepository.getAll().toString());
    }

}
