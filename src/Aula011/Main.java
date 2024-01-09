package Aula011;

public class Main {
    public static void main(String[] args) {

      Professor p1 = new Professor();

      p1.setNome("Jorge");
      p1.setIdade(45);
      p1.setSexo("M");
      p1.setEspecialidade("Engenheiro de Software");
      p1.setSalario(7000);
      System.out.println(p1.toString());

      Aluno a1 = new Aluno();

      a1.setNome("Miguel");
      a1.setIdade(18);
      a1.setSexo("M");
      a1.setMatricula(1450);
      a1.setCurso("Tecnologia");
      a1.pagarMensalidade();

      Bolsista b1 = new Bolsista();

      b1.setMatricula(1452);
      b1.setNome("Mauricio");
      b1.setBolsa(12.5f);
      b1.setSexo("M");
      b1.pagarMensalidade();

    }
}