package br.com.findurpoint;


import java.util.Scanner;

public class LoginUser extends AbstractEntity{


    private String senhaUser;
    private String confirmacaoSenha;

    private Home home;

    public String getSenhaUser(){

        return this.senhaUser;
    }
    public void setSenhaUser(String senhaUser){

        this.senhaUser = senhaUser;
    }

    public String getConfirmacaoSenha(){

        return this.confirmacaoSenha;
    }
    public void setConfirmacaoSenha(String confirmacaoSenha){

        this.confirmacaoSenha = confirmacaoSenha;
    }

    public Home getHome(){

        return this.home;
    }
    public void setHome(Home home){

        this.home = home;
    }


    public void verificaSenha() {
        System.out.println("Senha: ");
        Scanner entradaSenha = new Scanner(System.in);

        LoginUser senhaUser = new LoginUser();
        senhaUser.setSenhaUser(entradaSenha.next());

        System.out.println("confirmação de senha: ");
        Scanner entradaConfirmacaoSenha = new Scanner(System.in);

        LoginUser confirmacaoSenha = new LoginUser();
        confirmacaoSenha.setConfirmacaoSenha(entradaConfirmacaoSenha.next());

//        System.out.println("senha é " + senhaUser.getSenhaUser());
//        System.out.println("confirmação de senha é " + confirmacaoSenha.getConfirmacaoSenha());

        if (senhaUser.getSenhaUser().equals(confirmacaoSenha.getConfirmacaoSenha())){
            System.out.println("as senhas são iguais");

        }else {
            System.out.println("as senhas não são iguais");
        }

        entradaSenha.close();
        entradaConfirmacaoSenha.close();



    }



}
