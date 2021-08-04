public class Empregado{
    private String nome;
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;

    public double calculaSalario(){
        if(tipo == 1){
            return salario;
        }else if(tipo == 2){
            return salario+salario*comissao;
        }else if(tipo == 3){
            return salario + bonus;
        }
        return 0;        
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getIdade(){
        return this.idade;
    }

    public void setIdade(String idade){
        this.idade=idade;
    }
}