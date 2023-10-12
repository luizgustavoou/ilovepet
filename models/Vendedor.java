package ilovepet.models;

/*Vendedor da ILovePets:

Descrição: Um vendedor da ILovePets trabalha para a loja e está envolvido na venda de produtos relacionados a animais de estimação. Isso pode incluir alimentos, brinquedos, acessórios, etc.
Ações no Sistema: Pode se cadastrar no sistema, gerenciar informações sobre os produtos que vende, verificar pedidos, e fornecer suporte aos clientes.
 * 
 * 
 */
public class Vendedor extends Usuario {
    private static int nextId = 0;
    private int id;

    public Vendedor(String name, int age) {
        super(name, age);
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void venderBrinquedo() {
        System.out.println("Vendi um brinquedo");
    }

    public void venderAlimento() {
        System.out.println("Vendi um alimento");

    }

    public void venderAcessorio() {
        System.out.println("Vendi um acessorio");

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", age='" + this.getAge() + '\'' +
                '}';
    }

}
