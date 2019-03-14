/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author MuriloCalmon
 */
public class AluguelDTO {

    private String id_aluguel;
    private String veiculo;
    private String dataAluguel;
    private String dataEntrega;
    private String cliente;
    private String entregue;
    private String observação;
    private String valorPago;
    private String disponivel;

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    
    public AluguelDTO(){
    }
     public AluguelDTO(String id_aluguel, String veiculo, String dataAluguel, String dataEntrega, String cliente, String entregue, String observação, String valorPago) {
        this.id_aluguel = id_aluguel;
        this.veiculo = veiculo;
        this.dataAluguel = dataAluguel;
        this.dataEntrega = dataEntrega;
        this.cliente = cliente;
        this.entregue = entregue;
        this.observação = observação;
        this.valorPago = valorPago;
    }
      public String getId_aluguel() {
        return id_aluguel;
    }

    public void setId_aluguel(String id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(String dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEntregue() {
        return entregue;
    }

    public void setEntregue(String entregue) {
        this.entregue = entregue;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public String getValorPago() {
        return valorPago;
    }

    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }
}
