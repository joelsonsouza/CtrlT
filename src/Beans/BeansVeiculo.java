/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


public class BeansVeiculo {



   

    private String placa;
    private int renavan;
    private int ano;
    private int anoModelo;
    private String cor;
    private String chassi;
    private boolean ativar;
    private String pesquisar;
    private String modelo;
    private String marca;
    private int codigo;
    private int Idmodelo;
    
     public String getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   
    
    
    public String getPlaca() {
        return placa;
    }

    /**
     * @param p
     * 
     * laca the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

       /**
     * @return the renavan
     */
    public int getRenavan() {
        return renavan;
    }

    /**
     * @param renavan the renavan to set
     */
    public void setRenavan(int renavan) {
        this.renavan = renavan;
    }


    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the anoModelo
     */
    public int getAnoModelo() {
        return anoModelo;
    }

    /**
     * @param anoModelo the anoModelo to set
     */
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the ativar
     */
    public boolean isAtivar() {
        return ativar;
    }

    /**
     * @param ativar the ativar to set
     */
    public void setAtivar(boolean ativar) {
        this.ativar = ativar;
    }


 /**
     * @return the Idmodelo
     */
    public int getIdmodelo() {
        return Idmodelo;
    }

    /**
     * @param Idmodelo the Idmodelo to set
     */
    public void setIdmodelo(int Idmodelo) {
        this.Idmodelo = Idmodelo;
    }
    
        /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPesquisar(int selectedRow, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
