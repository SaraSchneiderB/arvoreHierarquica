/*
Classes Abstratas (Classe Mãe): São as classes que não podem ser instanciadas e não pode criar objeto,
ou seja, serve somente como progenitora;

Método abstrato: Usamos em Interface. Ele é declarado, mas não é implementado na progenitora;
sendo colocado dentro de interface ou de classe abstrata;

Classe Final (Folha): Não pode ser dada por outra classe, logo, não pode ter "filhos";

Método Final: Não pode ser sobrescrito pelas subclasses; é obrigatóriamente herdado;
*/


package arvoreHierarquica;

public class ArvoreHierarquicaMain {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        
        //Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Sara");
        a1.setMatricula(333435);
        a1.setCurso("TI");
        a1.setIdade(35);
        a1.setSexo("F");     
        System.out.println(a1.detalhePessoa());
        System.out.println(a1.detalheAluno());
        a1.pagarMensalidade();
  
        
        //Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Natã");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.setCurso("TI");
        b1.setMatricula(524455);
        System.out.println(b1.detalhePessoa());
        System.out.println(b1.detalheAluno());
        b1.pagarMensalidade();
        b1.renovarBolsa();
        
        
        //Visitante
        Visitante v1 = new Visitante();
        v1.setNome("Leo");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.detalhePessoa());
    }
    
}
