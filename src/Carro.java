public class Carro  implements Veiculo{
    private int anoFabricacao;
    private String cambio;

    public Carro(int anoFabricacao, String cambio) {
        this.anoFabricacao = anoFabricacao;
        this.cambio = cambio;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }



    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override
    public int aceitar(MecanicoVisitor mecanico) {
        return mecanico.visitar(this);
    }
}
