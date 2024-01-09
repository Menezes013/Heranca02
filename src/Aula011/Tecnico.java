package Aula011;

public class Tecnico extends Aluno {
   private Float registoProfissional;

   public void praticar(){
       System.out.println(this.nome + " Praticando ensino Técnico profissional");
   }

    public Float getRegistoProfissional() {
        return registoProfissional;
    }

    public void setRegistoProfissional(Float registoProfissional) {
        this.registoProfissional = registoProfissional;
    }
}
