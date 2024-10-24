/**
 * Crie uma classe chamada Caixa que faça venda de produtos, conforme o layout em anexo.
 * A função da venda deverá acrescer o valor do produto no saldo, e deverá retornar o valor do novo saldo
 * Faça também uma classe para testes que instancie o objeto Caixa e invoque a função venda.
 * <p>
 * Obs.:  A entrega deste exercício deve ser apenas o arquivo .java com o código que você escreveu.
 * Nesta atividade NÃO submeta nada além do arquivo .java que você fez, NÃO SUBMETA link do GITHUB,
 * nem arquivos compactado, como exemplo os arquivos com a extensão .zip
 * Ao submeter pode ser que o Microsoft Teams reclame a tentativa de submeter um arquivo com
 * a extensão .java, neste caso renomeie a extensão do arquivo para .txt antes de submetê-lo.
 */

public abstract class Main {
    double saldo;
    double venda;
    boolean sim_nao;


    public abstract void entrada();

    public abstract void exibicao();


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }


}