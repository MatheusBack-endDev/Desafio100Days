package dia05.exercicio.entities;

public class Company extends Pessoa{
    private Integer numberEmployees;

    public Company(){
        super();
    }

    public Company(String nome, Double rendaAnual, Integer numberEmployees) {
        super(nome, rendaAnual);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        if (numberEmployees > 10){
            return rendaAnual * 0.14;
        }else {
            return rendaAnual * 0.16;
        }
    }


}
