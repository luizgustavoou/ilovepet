package ilovepet.models;

public class PrestadorServicos extends Usuario {

    private String[] especialidades;
    
    public PrestadorServicos(String name, int age, String[] especialidades) {
        super(name, age);
        this.especialidades = especialidades;
    }

    public String[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String[] especialidades) {
        this.especialidades = especialidades;
    }

}
