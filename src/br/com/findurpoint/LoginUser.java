package br.com.findurpoint;

import java.util.ArrayList;
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


}
