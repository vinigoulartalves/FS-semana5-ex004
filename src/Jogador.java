public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public void adicionaPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public void adicionaTentativa() {
        this.numeroTentativas++;
    }

    public void perdePontos(int pontos) {
        if (this.pontuacao < 0) {
            this.pontuacao = 0;
        } else {
            this.pontuacao -= pontos;
        }
    }

}
