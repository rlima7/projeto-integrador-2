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
public class ModeloDTO {
    private int id_modelo;
    private String nome;
    private int id_fabricante;

    public ModeloDTO() {
    }

    public ModeloDTO(int id_modelo, String nome, int id_fabricante) {
        this.id_modelo = id_modelo;
        this.nome = nome;
        this.id_fabricante = id_fabricante;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }
    
    
}
