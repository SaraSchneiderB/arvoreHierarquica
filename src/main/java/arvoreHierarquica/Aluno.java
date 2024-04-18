
package arvoreHierarquica;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade da(o) aluna(o) " + this.nome + "\n");
    }
    
    //getters

    public double getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
    
    //setters

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public void setCurso(String c) {
        this.curso = c;
    } 

    
    public String detalheAluno() {
        return "Registro educacional:" + "\nMatricula: " + matricula + "\nCurso: " + curso + '.';
    }
    
}
