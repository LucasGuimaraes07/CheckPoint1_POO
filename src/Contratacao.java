public class Contratacao {
    public int id;
    public Cliente cliente;
    public Profissional profissional;

    public Profissional funcao;
    public static  Profissional valorTrabalho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String imprimirContrato(String contrato){

        contrato = "Contrato"+ id + ": " + " \n"+
                "Cliente: "+ cliente.getNome()+" "+cliente.getSobrenome()+" \n" +
                "Profissional:"+profissional.getNomeProfissional()+" "+profissional.getSobrenomeProfissional()+" \n"+
                "Funcao: "+funcao.categoria+" \n"+
                "Valor trabalho (4 horas): "+"R$"+ valorTrabalho.valorTrabalho(4)+"0" +" reais" ;

        return contrato;
    }


}
