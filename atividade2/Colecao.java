public class Colecao implements ItemEmprestavel {
    private String proprietario;
    private Integer quantidadeItens;


    public Colecao(String titulo, Integer anoPublicacao, String proprietario, Integer quantidadeItens) {
        this.proprietario = proprietario;
        this.quantidadeItens = quantidadeItens;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public void descricao(){
        System.out.println("Proprietario: " + this.proprietario);
        System.out.println("Quantidade de Itens: " + this.quantidadeItens);
    }
}