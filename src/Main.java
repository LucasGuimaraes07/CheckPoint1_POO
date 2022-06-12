public class Main {

    public static void main(String[] args){

        // Instancias da classe Cliente:

        System.out.println("//// DADOS CLIENTES ////");
        Cliente fCliente = new Cliente("Lucas", "Guimaraes",12356789);

        fCliente.setId(1);
        fCliente.setCpf(741258963);

        System.out.println("Dados Cliente 1: "+ fCliente.imprimirDados(String.valueOf(fCliente)));

        Cliente sCliente = new Cliente("Salomao", "Santos",987654321);

        sCliente.setId(2);
        sCliente.setCpf(963247158);

        System.out.println("Dados Cliente 2: "+ sCliente.imprimirDados(String.valueOf(sCliente)));

        Cliente tCliente = new Cliente("Regiane", "Machado",987654321);

        tCliente.setId(3);
        tCliente.setCpf(852314567);

        System.out.println("Dados Cliente 3: "+ tCliente.imprimirDados(String.valueOf(tCliente)));

        // Instancias da Classe Serviço:

        System.out.println("//// Servicos ////");

        Servico fJob = new Servico("Encanador");

        fJob.id = 1;
        fJob.descricao = "Problemas nos encanamentos";

        System.out.println(fJob.servicos(String.valueOf(fJob)));

        Servico sJob = new Servico("Eletricista");

        sJob.id = 2;
        sJob.descricao = "Problemas eletricos";

        System.out.println(sJob.servicos(String.valueOf(sJob)));

        Servico tJob = new Servico("Mecanico");

        tJob.id = 3;
        tJob.descricao = "Servico em mecanica";

        System.out.println(tJob.servicos(String.valueOf(tJob)));







    }
}
