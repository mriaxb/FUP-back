package br.com.findurpoint;

public class CadastroUser extends AbstractEntity{

    private String nomeDeUsuario;

    private String senha;

    private String confirmacaoSenha;

    private Home home;

    private LoginUser login;

    private String email;

    private double cpf;

    public CadastroUser(){
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public LoginUser getLogin() {
        return login;
    }

    public void setLogin(LoginUser login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
}
