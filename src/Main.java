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

        System.out.println("//// DADOS PROFISSIONAIS ////");

        Profissional fProfissional = new Profissional(fJob.categoria, "João", "Martins", 995532100, 10.5);

        fProfissional.setId(1);
        fProfissional.setCpfProfissional(999888555);
//        fProfissional.profissao.categoria = fJob.categoria;
        System.out.println(fProfissional.imprimirProfissional(String.valueOf(fProfissional)));
        System.out.println(" \n");
        Profissional sProfissional = new Profissional(sJob.categoria, "Sergio","Martins",989798944,12.5);

        sProfissional.setId(2);
        sProfissional.setCpfProfissional(887888555);
//        sProfissional.profissao.categoria = sJob.categoria;
        System.out.println(sProfissional.imprimirProfissional(String.valueOf(sProfissional)));
        System.out.println(" \n");
        Profissional tProfissional = new Profissional(tJob.categoria, "Fabio","Junior",999756565,16.5);

        tProfissional.setId(3);
        tProfissional.setCpfProfissional(976888555);
//        tProfissional.profissao.categoria = tJob.categoria;
        System.out.println(tProfissional.imprimirProfissional(String.valueOf(tProfissional)));
        System.out.println(" \n");
        System.out.println("//// CONTRATOS ////");

        Contratacao primeiroContrato = new Contratacao();

        primeiroContrato.id = 1;

        primeiroContrato.cliente = fCliente;
        primeiroContrato.profissional = fProfissional;
        primeiroContrato.funcao = fProfissional;
        primeiroContrato.valorTrabalho = fProfissional;

        System.out.println(primeiroContrato.imprimirContrato(String.valueOf(primeiroContrato)));
        System.out.println(" \n");

        Contratacao segundoContrato = new Contratacao();

        segundoContrato.id = 2;

        segundoContrato.cliente = sCliente;
        segundoContrato.profissional = sProfissional;
        segundoContrato.funcao = sProfissional;
        segundoContrato.valorTrabalho = sProfissional;
        System.out.println(segundoContrato.imprimirContrato(String.valueOf(segundoContrato)));
        System.out.println(" \n");
        Contratacao terceiroContrato = new Contratacao();

        terceiroContrato.id = 3;

        terceiroContrato.cliente = tCliente;
        terceiroContrato.profissional = tProfissional;
        terceiroContrato.funcao = tProfissional;
        terceiroContrato.valorTrabalho = tProfissional;
        System.out.println(terceiroContrato.imprimirContrato(String.valueOf(terceiroContrato)));
        System.out.println(" \n");












    }
}
