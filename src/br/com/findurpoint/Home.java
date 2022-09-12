package br.com.findurpoint;

import java.util.ArrayList;
import java.util.Scanner;

public class Home extends AbstractEntity{



    public static void main(LoginUser senhaUser) {
        verificaSenha(senhaUser.getSenhaUser(), senhaUser.getConfirmacaoSenha());




    }

    private static void verificaSenha(LoginUser senhaUser, LoginUser confirmacaoSenha) {
        System.out.println("Senha: ");
        Scanner entradaSenha = new Scanner(System.in);

//        LoginUser senhaUser = new LoginUser();
        senhaUser.setSenhaUser(entradaSenha.next());

        System.out.println("confirmação de senha: ");
        Scanner entradaConfirmacaoSenha = new Scanner(System.in);

//        LoginUser confirmacaoSenha = new LoginUser();
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

    ArrayList<LoginUser> loginUsers = new ArrayList<LoginUser>();



    private void verificaSenha(){

    }

}


