package com.redhat.fuse.boosters.rest.http;



public class Email{

    private String para;
    private String assunto;
    private String conteudo;
    private String de;
    private String comCopiaPara;
    private String copiaOcultaPara;
    private String responderPara;
    private String enderecoResposta;
    private String identificacaoSistema;
    private String tipoConteudo;



    public Email() {
    }

    public Email(String para, String assunto, String conteudo, String de, String comCopiaPara, String copiaOcultaPara, String responderPara, String enderecoResposta, String identificacaoSistema, String tipoConteudo) {
        this.para = para;
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.de = de;
        this.comCopiaPara = comCopiaPara;
        this.copiaOcultaPara = copiaOcultaPara;
        this.responderPara = responderPara;
        this.enderecoResposta = enderecoResposta;
        this.identificacaoSistema = identificacaoSistema;
        this.tipoConteudo = tipoConteudo;
    }

    public String getPara() {
        return this.para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDe() {
        return this.de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getComCopiaPara() {
        return this.comCopiaPara;
    }

    public void setComCopiaPara(String comCopiaPara) {
        this.comCopiaPara = comCopiaPara;
    }

    public String getCopiaOcultaPara() {
        return this.copiaOcultaPara;
    }

    public void setCopiaOcultaPara(String copiaOcultaPara) {
        this.copiaOcultaPara = copiaOcultaPara;
    }

    public String getResponderPara() {
        return this.responderPara;
    }

    public void setResponderPara(String responderPara) {
        this.responderPara = responderPara;
    }

    public String getEnderecoResposta() {
        return this.enderecoResposta;
    }

    public void setEnderecoResposta(String enderecoResposta) {
        this.enderecoResposta = enderecoResposta;
    }

    public String getIdentificacaoSistema() {
        return this.identificacaoSistema;
    }

    public void setIdentificacaoSistema(String identificacaoSistema) {
        this.identificacaoSistema = identificacaoSistema;
    }

    public String getTipoConteudo() {
        return this.tipoConteudo;
    }

    public void setTipoConteudo(String tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
    }

}