public class Moto implements Veiculo{

    private int anoFabricacao;
    private String tipoMotor;

    public Moto(int anoFabricacao, String tipoMotor) {
        this.anoFabricacao = anoFabricacao;
        this.tipoMotor = tipoMotor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int aceitar(MecanicoVisitor mecanico) {
        return mecanico.visitar(this);
    }
}
