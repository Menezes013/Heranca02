package Aula011;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void ReceberAumento(){
        this.salario ++;
        System.out.println("Parabéns " + this.nome  + " Você recebeu um aumento");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
