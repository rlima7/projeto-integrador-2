/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Claudio
 */
public class VeiculoDTO {

    public String getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(String id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(String qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(String id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(String id_modelo) {
        this.id_modelo = id_modelo;
    }

    public VeiculoDTO(String id_veiculo, String placa, String anoModelo, String qtdPortas, String acessorios, String id_fabricante, String id_modelo,String disponivel) {
        this.id_veiculo = id_veiculo;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.qtdPortas = qtdPortas;
        this.acessorios = acessorios;
        this.id_fabricante = id_fabricante;
        this.id_modelo = id_modelo;
        this.disponivel = disponivel;
    }
    
    private String id_veiculo;
    private String placa;
    private String anoModelo;
    private String qtdPortas;
    private String acessorios;
    private String id_fabricante;
    private String id_modelo;
    private String disponivel;

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }
    

    public VeiculoDTO() {
    }

//    public VeiculoDTO(int id_veiculo, String placa, int anoModelo, int qtdPortas, String acessorios, int id_fabricante, int id_modelo) {
//        this.id_veiculo = id_veiculo;
//        this.placa = placa;
//        this.anoModelo = anoModelo;
//        this.qtdPortas = qtdPortas;
//        this.acessorios = acessorios;
//        this.id_fabricante = id_fabricante;
//        this.id_modelo = id_modelo;
//    }
//
//    public int getId_fabricante() {
//        return id_fabricante;
//    }
//
//    public void setId_fabricante(int id_fabricante) {
//        this.id_fabricante = id_fabricante;
//    }
//
//    public int getId_modelo() {
//        return id_modelo;
//    }
//
//    public void setId_modelo(int id_modelo) {
//        this.id_modelo = id_modelo;
//    }
//
//    
//
//    public int getId_veiculo() {
//        return id_veiculo;
//    }
//
//    public void setId_veiculo(int id_veiculo) {
//        this.id_veiculo = id_veiculo;
//    }
//
//    public String getPlaca() {
//        return placa;
//    }
//
//    public void setPlaca(String placa) {
//        this.placa = placa;
//    }
//
//    public int getAnoModelo() {
//        return anoModelo;
//    }
//
//    public void setAnoModelo(int anoModelo) {
//        this.anoModelo = anoModelo;
//    }
//
//    public int getQtdPortas() {
//        return qtdPortas;
//    }
//
//    public void setQtdPortas(int qtdPortas) {
//        this.qtdPortas = qtdPortas;
//    }
//
//    public String getAcessorios() {
//        return acessorios;
//    }
//
//    public void setAcessorios(String acessorios) {
//        this.acessorios = acessorios;
//    }
    
    
    
}
