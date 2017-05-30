/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


public class BeansModelo {

    /**
     * @return the codigo
     */


     private String descricao;
     private String pesquisar;
     private String Marca;
     private int idMarca;
     private int codigo;
     
     
    public int getCodigo() {
    return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     
     
    public String getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisa to set
     */
    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }

    /**
     * @return the codigo
     */


    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the idMarca
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the descricaoMarca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the descricaoMarca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }



    }
    
   
    
    