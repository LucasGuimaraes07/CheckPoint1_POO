import java.sql.SQLOutput;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private int cpf;
    private int telefone;


    public Cliente( String nome, String sobrenome, int telefone) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String imprimirDados(String dadosCliente){
        dadosCliente ="id: " + id + " Nome: " + nome + " " + sobrenome + " CPF: " + cpf + " Telefone: " + telefone;

        return dadosCliente;
    }
}
