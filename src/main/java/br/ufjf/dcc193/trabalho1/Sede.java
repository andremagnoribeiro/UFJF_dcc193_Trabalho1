package br.ufjf.dcc193.trabalho1;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



/**
 * Sede
 */
@Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nomeFantasia;
    private String estadoDaFederacao;
    private String cidade;
    private String bairro;
    private String telefone;
    private String email;
    
    
    public Sede(){

    }

    public Sede(String nomeFatasia, String estadoDaFederacao, String cidade, String bairro , String telefone, String email){
    this.nomeFantasia=nomeFatasia;
    this.estadoDaFederacao= estadoDaFederacao;
    this.cidade= cidade;
    this.bairro= bairro;
    this.telefone= telefone;
    this.email= email;

    }


    @Override
    public String toString() {
        return "Nome da Sede:"+this.nomeFantasia;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @return the estadoDaFederacao
     */
    public String getEstadoDaFederacao() {
        return estadoDaFederacao;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param estadoDaFederacao the estadoDaFederacao to set
     */
    public void setEstadoDaFederacao(String estadoDaFederacao) {
        this.estadoDaFederacao = estadoDaFederacao;
    }/**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}