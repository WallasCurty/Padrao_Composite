import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
    @Test
    void deveRetornarCargosBanco() {
        Atendente atendente1 = new Atendente("Atendente Mesa");

        Atendente atendente2 = new Atendente("Atendente Idoso");
        Caixa caixa1 = new Caixa("Atendente Caixa", "João Fernando");
        atendente2.addFuncionario(caixa1);

        Atendente atendente3 = new Atendente("Supervisor");
        Caixa caixa2 = new Caixa("Caixa Idoso", "Rita Maria");
        Caixa caixa3 = new Caixa("Atendente Jovem Aprendiz", "Julia Silva");
        atendente3.addFuncionario(caixa2);
        atendente3.addFuncionario(caixa3);

        Atendente cargo = new Atendente("Gerencia");
        cargo.addFuncionario(atendente1);
        cargo.addFuncionario(atendente2);
        cargo.addFuncionario(atendente3);

        Banco banco = new Banco();
        banco.setCargo(cargo);

        assertEquals("Atendente: Gerencia\n" +
                "Atendente: Atendente Mesa\n" +
                "Atendente: Atendente Idoso\n" +
                "Caixa: Atendente Caixa - Nome: João Fernando\n" +
                "Atendente: Supervisor\n" +
                "Caixa: Caixa Idoso - Nome: Rita Maria\n" +
                "Caixa: Padrão State - Nome: Julia Silva\n", banco.getCargo());
    }

    @Test
    void deveRetornarExecacaoFuncionarioSemCargo() {
        try {
            Banco banco = new Banco();
            banco.getCargo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Funcionario está sem Cargo", e.getMessage());
        }
    }
}
