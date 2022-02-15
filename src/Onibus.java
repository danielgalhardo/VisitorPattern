public class Onibus implements Veiculo
{
    private int capacidade;
    private int anoFabricacao;

    public Onibus(int capacidade, int anoFabricacao) {
        this.capacidade = capacidade;
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public int aceitar(MecanicoVisitor mecanico) {
        return mecanico.visitar(this);
    }
}
