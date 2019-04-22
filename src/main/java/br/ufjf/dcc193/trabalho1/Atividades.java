package br.ufjf.dcc193.trabalho1;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Atividades
 */
@Entity
public class Atividades {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String horasComputadas;//assistencial, jurídica, financeira e executiva;



    public Atividades(){
        
    }
    public Atividades(String titulo, String descricao, String dataInicio,String dataFim , String horasComputadas){
        this.titulo=titulo;
        this.descricao=descricao;
        this.dataInicio=dataInicio;
        this.dataFim=dataFim;
        this.horasComputadas=horasComputadas; 
    }




    @Override
    public String toString() {
        return super.toString();
    }
    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param horasComputadas the horasComputadas to set
     */
    public void setHorasComputadas(String horasComputadas) {
        this.horasComputadas = horasComputadas;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the horasComputadas
     */
    public String getHorasComputadas() {
        return horasComputadas;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }


}