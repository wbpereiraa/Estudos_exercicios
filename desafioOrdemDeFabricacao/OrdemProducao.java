import java.util.Date;

public class OrdemProducao {
    private int id;
    private String produto;
    private int quantidade;
    private Date dataEntrega;
    private boolean concluida;

    // Getters e Setters

    public OrdemProducao(int id2, String produto2, int quantidade2, Date dataEntrega2, boolean b) {
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }
    public String getProduto() {
        return this.produto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public Date getDataEntrega() {
        return this.dataEntrega;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    public boolean getConcluida() {
        return this.concluida;
    }
}
