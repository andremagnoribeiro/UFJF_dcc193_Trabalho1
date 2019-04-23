package br.ufjf.dcc193.trabalho1;

import java.util.ArrayList;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



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
    
    private ArrayList<Membro> membros;
    private ArrayList<Atividades> atividades;
    
    /*
    @Autowired
    AtividadesRepository repAtividades;
    @Autowired
    MembroRepository repMembro;
    */
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


   /*
    public AtividadesRepository getRepAtividades() {
        return repAtividades;
    }
  
    public void setRepAtividades(AtividadesRepository repAtividades) {
        this.repAtividades = repAtividades;
    }
   
    public MembroRepository getRepMembro() {
        return repMembro;
    }

    public void setRepMembro(MembroRepository repMembro) {
        this.repMembro = repMembro;
    }

*/





    public void setAtividades(ArrayList<Atividades> atividades) {
        this.atividades = atividades;
    }
    public void setMembros(ArrayList<Membro> membros) {
        this.membros = membros;
    }

    public ArrayList<Atividades> getAtividades() {
        return atividades;
    }


    public ArrayList<Membro> getMembros() {
        return membros;
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