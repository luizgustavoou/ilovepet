package ilovepet.controllers;

import ilovepet.models.Animal;
import ilovepet.models.Food;
import ilovepet.models.PrestadorServicos;
import ilovepet.models.Sausage;
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

    public PrestadorServicos addPrestadorServico(String name, int age) {
        PrestadorServicos prestadorServicos = new PrestadorServicos(name, age);

        this.prestadorServicoRepository.add(prestadorServicos);

        return prestadorServicos;
    }

    public Tutor addTutor(String name, int age) {
        Tutor tutor = new Tutor(name, age);
        tutorRepository.add(tutor);

        return tutor;
    }

    public Vendedor addVendedor(String name, int age) {
        Vendedor vendedor = new Vendedor(name, age);
        vendedorRepository.add(vendedor);

        return vendedor;
    }

    public void addEspecialidadePrestadorServico(int id, String novaEspecialidade) {
        PrestadorServicos prestadorServicos = prestadorServicoRepository.addEspecialidadePrestadorServico(id,
                novaEspecialidade);

        if (prestadorServicos == null) {
            System.out.println("Prestador de serviço com id=" + id + " não encontrado.");
        } else {
            System.out.println("Especialidade do prestador de serviço " + prestadorServicos.getName()
                    + " adicionado com sucesso.");

        }
    }

    public void addAnimacaoEstimacaoTutor(int id, Animal animal) {
        Tutor tutor = tutorRepository.addAnimacaoEstimacaoTutor(id, animal);

        if (tutor == null) {
            System.out.println("Tutor com id=" + id + " não encontrado.");
        } else {
            System.out.println("Animal de estimação do tutor " + tutor.getName()
                    + " adicionado com sucesso.");

        }
    }

    public void alimentarAnimalPrestadorServico(int idPrestadorServico, Animal animal, Food food) {
        PrestadorServicos prestadorServicos = this.prestadorServicoRepository.getById(idPrestadorServico);

        if (prestadorServicos == null) {
            System.out.println("Prestador de serviço não encontrado para alimentar o animal " + animal.getName() + ".");
            return;
        }

        prestadorServicos.alimentarAnimal(animal, food);

    }

    public void passearAnimalPrestadorServico(int idPrestadorServico, Animal animal) {
        PrestadorServicos prestadorServicos = this.prestadorServicoRepository.getById(idPrestadorServico);

        if (prestadorServicos == null) {
            System.out.println("Prestador de serviço não encontrado para passear.");
            return;
        }

        prestadorServicos.caminharComAnimal(animal);

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
