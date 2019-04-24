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
    private String sedeId;
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String horasAssistencial;//assistencial, jurídica, financeira e executiva;
    private String horasJuridica;//assistencial, jurídica, financeira e executiva;
    private String horasFinanceira;
    private String horasExecutiva;


    public Atividades(){
        
    }
    public Atividades(String titulo, String descricao, String dataInicio,String dataFim , String horasComputadas){
        this.titulo=titulo;
        this.descricao=descricao;
        this.dataInicio=dataInicio;
        this.dataFim=dataFim;
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

    /**
     * @param horasAssistencial the horasAssistencial to set
     */
    public void setHorasAssistencial(String horasAssistencial) {
        this.horasAssistencial = horasAssistencial;
    }

    /**
     * @param horasExecutiva the horasExecutiva to set
     */
    public void setHorasExecutiva(String horasExecutiva) {
        this.horasExecutiva = horasExecutiva;
    }

    /**
     * @param horasFinanceira the horasFinanceira to set
     */
    public void setHorasFinanceira(String horasFinanceira) {
        this.horasFinanceira = horasFinanceira;
    }

    /**
     * @param horasJuridica the horasJuridica to set
     */
    public void setHorasJuridica(String horasJuridica) {
        this.horasJuridica = horasJuridica;
    }

    /**
     * @return the horasAssistencial
     */
    public String getHorasAssistencial() {
        return horasAssistencial;
    }

    /**
     * @return the horasExecutiva
     */
    public String getHorasExecutiva() {
        return horasExecutiva;
    }

    /**
     * @return the horasFinanceira
     */
    public String getHorasFinanceira() {
        return horasFinanceira;
    }

    /**
     * @return the horasJuridica
     */
    public String getHorasJuridica() {
        return horasJuridica;
    }

    /**
     * @return the sedeId
     */
    public String getSedeId() {
        return sedeId;
    }

    /**
     * @param sedeId the sedeId to set
     */
    public void setSedeId(String sedeId) {
        this.sedeId = sedeId;
    }
    


}