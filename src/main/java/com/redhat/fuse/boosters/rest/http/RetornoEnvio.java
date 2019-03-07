package com.redhat.fuse.boosters.rest.http;

public class RetornoEnvio {

    private int Codigo;
    private String Mensagem;

    public RetornoEnvio() {
    }


    public RetornoEnvio(int Codigo, String Mensagem) {
        this.Codigo = Codigo;
        this.Mensagem = Mensagem;
    }



    public int getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getMensagem() {
        return this.Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }


}