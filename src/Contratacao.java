public class Contratacao {
    public int id;
    public Cliente nome;
    public Profissional nomeProfissional;
    public Profissional categoria;
    public static Profissional valorTrabalho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] imprimirContrato(String[] contrato){

        contrato = new String[]{String.valueOf(id), String.valueOf(nome), String.valueOf(nomeProfissional), String.valueOf(categoria), String.valueOf(valorTrabalho)};

        return contrato;
    }
}
