public class Caminhao implements  Veiculo{
    private int anoFabricacao;
    private int peso;

    public Caminhao(int anoFabricacao,  int peso) {
        this.anoFabricacao = anoFabricacao;
        this.peso = peso;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int aceitar(MecanicoVisitor mecanico) {
        return mecanico.visitar(this);
    }
}
