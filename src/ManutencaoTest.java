import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ManutencaoTest {

    @Test
    void deveRetornarPrecoManutencaoCarroAntigoAutomatico()
    {
        Carro carro = new Carro(1997, "automatico");

        Manutencao manutencao = new Manutencao();
        assertEquals(400, manutencao.visitar(carro));
    }

    @Test
    void deveRetornarPrecoManutencaoCarroNovoAutomatico()
    {
        Carro carro = new Carro(2021, "automatico");

        Manutencao manutencao = new Manutencao();
        assertEquals(550, manutencao.visitar(carro));
    }

    @Test
    void deveRetornarPrecoManutencaoCarroAntigoManual()
    {
        Carro carro = new Carro(1997, "manual");

        Manutencao manutencao = new Manutencao();
        assertEquals(175, manutencao.visitar(carro));
    }

    @Test
    void deveRetornarPrecoManutencaoCarroNovoManual()
    {
        Carro carro = new Carro(2021, "manual");

        Manutencao manutencao = new Manutencao();
        assertEquals(325, manutencao.visitar(carro));
    }

    @Test
    void deveRetornarPrecoManutencaoCaminhaoNovoPesado()
    {
        Caminhao caminhao = new Caminhao(2020,18000);
        Manutencao manutencao = new Manutencao();
        assertEquals(5000, manutencao.visitar(caminhao));
    }

    @Test
    void deveRetornarPrecoManutencaoCaminhaoAntigoPesado()
    {
        Caminhao caminhao = new Caminhao(1989,18000);
        Manutencao manutencao = new Manutencao();
        assertEquals(3850, manutencao.visitar(caminhao));
    }

    @Test
    void deveRetornarPrecoManutencaoCaminhaoNovoLeve()
    {
        Caminhao caminhao = new Caminhao(2020,12000);
        Manutencao manutencao = new Manutencao();
        assertEquals(4000, manutencao.visitar(caminhao));
    }

    @Test
    void deveRetornarPrecoManutencaoCaminhaoAntigoLeve()
    {
        Caminhao caminhao = new Caminhao(1989,12000);
        Manutencao manutencao = new Manutencao();
        assertEquals(2850, manutencao.visitar(caminhao));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoNovaMono()
    {
        Moto moto = new Moto(2020,"monocilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(350, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoNovaBi()
    {
        Moto moto = new Moto(2020,"bicilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(350, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoNovaTri()
    {
        Moto moto = new Moto(2020,"tricilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(700, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoNovaTetra()
    {
        Moto moto = new Moto(2020,"tetracilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(900, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoAntigaMono()
    {
        Moto moto = new Moto(2000,"monocilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(100, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoAntigaBi()
    {
        Moto moto = new Moto(2000,"bicilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(100, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoAntigaTri()
    {
        Moto moto = new Moto(2000,"tricilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(450, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoMotoAntigaTetra()
    {
        Moto moto = new Moto(2000,"tetracilindrico");
        Manutencao manutencao = new Manutencao();
        assertEquals(650, manutencao.visitar(moto));
    }

    @Test
    void deveRetornarPrecoManutencaoOnibusAntigoAltaCapacidade()
    {
        Onibus onibus = new Onibus(35,2010);
        Manutencao manutencao = new Manutencao();
        assertEquals(1050, manutencao.visitar(onibus));
    }

    @Test
    void deveRetornarPrecoManutencaoOnibusNovoAltaCapacidade()
    {
        Onibus onibus = new Onibus(35,2016);
        Manutencao manutencao = new Manutencao();
        assertEquals(1300, manutencao.visitar(onibus));
    }

    @Test
    void deveRetornarPrecoManutencaoOnibusAntigoBaixaCapacidade()
    {
        Onibus onibus = new Onibus(25,2010);
        Manutencao manutencao = new Manutencao();
        assertEquals(650, manutencao.visitar(onibus));
    }

    @Test
    void deveRetornarPrecoManutencaoOnibusNovoBaixaCapacidade()
    {
        Onibus onibus = new Onibus(25,2016);
        Manutencao manutencao = new Manutencao();
        assertEquals(900, manutencao.visitar(onibus));
    }
}
