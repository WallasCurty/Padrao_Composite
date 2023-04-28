public class Banco {
    private Funcionario cargo;

    public void setCargo(Funcionario cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        if (this.cargo == null) {
            throw new NullPointerException("Funcionario sem cargo definido.");
        }
        return this.cargo.getFuncionario();
    }


}
