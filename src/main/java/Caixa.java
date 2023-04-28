public class Caixa extends Funcionario{
    private String nomeFuncionario;

    public Caixa(String descricao, String nomeFuncionario) {
        super(descricao);
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setCargaHoraria(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getFuncionario() {
        return "Nome: " + this.nomeFuncionario + " - Caixa: "  + this.getDescricao() + "\n";
    }

}
