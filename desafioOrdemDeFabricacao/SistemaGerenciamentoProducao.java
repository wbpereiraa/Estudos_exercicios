import java.util.Date;
import java.util.ArrayList;


public class SistemaGerenciamentoProducao {
    private ArrayList<OrdemProducao> ordensProducao = new ArrayList<>();

    // Função para registrar uma nova ordem de produção
    public void criarOrdemProducao(int id, String produto, int quantidade, Date dataEntrega) {
        OrdemProducao novaOrdem = new OrdemProducao(id, produto, quantidade, dataEntrega, false);
        ordensProducao.add(novaOrdem);
        System.out.println("Ordem de produção criada com sucesso.");
    }

    // Função para listar todas as ordens de produção existentes
    public void listarOrdensProducao() {
        if (ordensProducao.isEmpty()) {
            System.out.println("Não há ordens de produção registradas.");
        } else {
            System.out.println("Lista de Ordens de Produção:");
            for (OrdemProducao ordem : ordensProducao) {
                System.out.println("ID: " + ordem.getId());
                System.out.println("Produto: " + ordem.getProduto());
                System.out.println("Quantidade: " + ordem.getQuantidade());
                System.out.println("Data de Entrega: " + ordem.getDataEntrega());
                System.out.println("Status: " + (ordem.getConcluida() ? "Concluída" : "Em andamento"));
                System.out.println("--------------");
            }
        }
    }

    // Função para verificar a disponibilidade de materiais com base nas ordens
    public void verificarDisponibilidadeMateriais() {
        // Implemente a lógica de verificação da disponibilidade de materiais aqui
        // Você pode usar informações das ordens de produção para verificar os materiais
        System.out.println("Verificação de materiais em andamento...");
    }

    // Função para atualizar o status de uma ordem de produção
    public void atualizarStatusOrdem(int id, boolean concluida) {
        for (OrdemProducao ordem : ordensProducao) {
            if (ordem.getId() == id) {
                ordem.setConcluida(concluida);
                System.out.println("Status da ordem de produção atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Ordem de produção não encontrada.");
    }

    // Função para gerar relatórios de produção
    public void gerarRelatorioProducao() {
        // Implemente a geração de relatórios com base nas informações das ordens de produção
        System.out.println("Geração de relatórios de produção em andamento...");
    }

    public static void main(String[] args) {
        SistemaGerenciamentoProducao sistema = new SistemaGerenciamentoProducao();

        // Exemplo de uso das funções:
        sistema.criarOrdemProducao(1, "Produto A", 100, new Date());
        sistema.criarOrdemProducao(2, "Produto B", 50, new Date());
        sistema.listarOrdensProducao();
        sistema.verificarDisponibilidadeMateriais();
        sistema.atualizarStatusOrdem(1, true);
        sistema.gerarRelatorioProducao();
    }
}
