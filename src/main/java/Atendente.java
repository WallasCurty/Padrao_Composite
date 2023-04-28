import java.util.ArrayList;
import java.util.List;

public class Atendente extends Funcionario{
    private List<Funcionario> funcionarios;

    public Atendente(String descricao) {
        super(descricao);
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public String getFuncionario() {
        String saida = "";
        saida = "Atendente: " + this.getDescricao() + "\n";
        for (Funcionario funcionario : funcionarios) {
            saida += funcionario.getFuncionario();
        }
        return saida;
    }
}
