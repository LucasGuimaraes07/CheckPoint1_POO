public class Profissional extends Servico {

    private int id;
    private String nomeProfissional;
    private String sobrenomeProfissional;
    private int cpfProfissional;
    private int telefoneProfissional;
    private double horaTrabalho;

    public Profissional(String categoria, String nomeProfissional, String sobrenomeProfissional, int telefoneProfissional, double horaTrabalho) {
        super(categoria);
        this.nomeProfissional = nomeProfissional;
        this.sobrenomeProfissional = sobrenomeProfissional;
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

    public String imprimirProfissional(String trabalhador){
        trabalhador = " Os dados do Profissional: "+ " \n" +
                nomeProfissional+ " " + sobrenomeProfissional +" \n"+
                "CPF: " + cpfProfissional + " \n"+
                "Telefone: " + telefoneProfissional + " \n"+
                "Valor da hora de trabalho: " +"R$"+ horaTrabalho +"0" +" reais" +" \n" +
                "Funcao: " + categoria;

        return trabalhador;
    }

    public double valorTrabalho(int qtdHoras){
        return qtdHoras * horaTrabalho;

    }
}

