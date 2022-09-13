package br.com.findurpoint;

public class Footer extends AbstractEntity{

    private String email;

    private String comentario;

    public Footer(){}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
