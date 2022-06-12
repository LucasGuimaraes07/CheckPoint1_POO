public class Servico {
    protected int id;
    protected  String categoria;
    protected String descricao;

    public Servico(String categoria) {
        this.categoria = categoria;
    }

    public String servicos(String modelo){

        modelo = id + " " + categoria + ": " + descricao;

        return modelo;
    }



}
