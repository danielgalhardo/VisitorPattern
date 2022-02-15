public class Manutencao  implements MecanicoVisitor{
    @Override
    public int visitar(Carro carro) {

        int valorManutencao = 0;
        if(carro.getAnoFabricacao() > 2010)
        {
            valorManutencao += 250;
        }
        else {
            valorManutencao += 100;
        }

        if(carro.getCambio().equals("automatico"))
        {
            valorManutencao += 300;
        }
        else {
            valorManutencao += 75;
        }
        return valorManutencao;
    }

    @Override
    public int visitar(Onibus onibus) {
        int valorManutencao = 0;
        if(onibus.getAnoFabricacao() > 2010)
        {
            valorManutencao += 550;
        }
        else {
            valorManutencao += 300;
        }

        if(onibus.getCapacidade() > 25)
        {
            valorManutencao += 750;
        }
        else {
            valorManutencao += 350;
        }

       return valorManutencao;
    }

    @Override
    public int visitar(Moto moto) {
        int valorManutencao = 0;
        if(moto.getAnoFabricacao() > 2015)
        {
            valorManutencao += 350;
        }
        else {
            valorManutencao += 100;
        }

        if(moto.getTipoMotor().equals("monocilindrico") && moto.getTipoMotor().equals("bicilindrico"))
        {
            valorManutencao += 250;
        }
        else if(moto.getTipoMotor().equals("tricilindrico")) {
            valorManutencao += 350;
        }
        else if(moto.getTipoMotor().equals("tetracilindrico")){
            valorManutencao += 550;
        }


        return valorManutencao;
    }

    @Override
    public int visitar(Caminhao caminhao) {
        int valorManutencao = 0;
        if(caminhao.getAnoFabricacao() > 2000)
        {
            valorManutencao += 3000;
        }
        else {
            valorManutencao += 1850;
        }

        if(caminhao.getPeso() > 16000)
        {
            valorManutencao += 2000;
        }
        else {
            valorManutencao += 1000;
        }

        return valorManutencao;
    }
}
