public class Profissional {

    private int id;
    private String nomeProfissional;
    private String sobrenomeProfissional;
    private int cpfProfissional;
    private int telefoneProfissional;
    private double horaTrabalho;

    protected Servico categoria;

    protected Servico descricao;


    public Profissional(int id, String nomeProfissional, String sobrenomeProfissional, int cpfProfissional, int telefoneProfissional, double horaTrabalho) {
        this.id = id;
        this.nomeProfissional = nomeProfissional;
        this.sobrenomeProfissional = sobrenomeProfissional;
        this.cpfProfissional = cpfProfissional;
        this.telefoneProfissional = telefoneProfissional;
        this.horaTrabalho = horaTrabalho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getSobrenomeProfissional() {
        return sobrenomeProfissional;
    }

    public void setSobrenomeProfissional(String sobrenomeProfissional) {
        this.sobrenomeProfissional = sobrenomeProfissional;
    }

    public int getCpfProfissional() {
        return cpfProfissional;
    }

    public void setCpfProfissional(int cpfProfissional) {
        this.cpfProfissional = cpfProfissional;
    }

    public int getTelefoneProfissional() {
        return telefoneProfissional;
    }

    public void setTelefoneProfissional(int telefoneProfissional) {
        this.telefoneProfissional = telefoneProfissional;
    }

    public double getHoraTrabalho() {
        return horaTrabalho;
    }

    public void setHoraTrabalho(double horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }

    public String[] imprimirProfissional(String[] trabalhador){
        trabalhador = new String[]{String.valueOf(id), nomeProfissional, nomeProfissional, String.valueOf(cpfProfissional), String.valueOf(telefoneProfissional), String.valueOf(horaTrabalho), String.valueOf(categoria)};

        return trabalhador;
    }



    public double valorTrabalho(int qtdHoras){
        return qtdHoras * horaTrabalho;

    }
}

