//Classe Mãe
package arvoreHierarquica;

public class Pessoa {

    protected String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario() {
        this.idade++;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    //setters
    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public String detalhePessoa() {
        return "Dados " + "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + '.';
    }
    
    

}
