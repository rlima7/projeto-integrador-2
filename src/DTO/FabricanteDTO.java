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
public class FabricanteDTO {
    private int id_fabricante;
    private String  nome;

    public FabricanteDTO() {
    }

    public FabricanteDTO(int id_fabricante, String nome) {
        this.id_fabricante = id_fabricante;
        this.nome = nome;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
