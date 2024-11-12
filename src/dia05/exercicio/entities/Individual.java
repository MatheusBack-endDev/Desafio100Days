package dia05.exercicio.entities;

public class Individual extends Pessoa{

    private Double healthTax;

    public Individual(){
        super();
    }

    public Individual(String nome, Double rendaAnual, Double healthTax) {
        super(nome, rendaAnual);
        this.healthTax = healthTax;
    }

    @Override
    public double tax() {
        if (rendaAnual < 20000){
           return (rendaAnual * 0.15) - (healthTax * 0.5);
        }else{
            return (rendaAnual * 0.25) - (healthTax * 0.5);
        }
    }
}
