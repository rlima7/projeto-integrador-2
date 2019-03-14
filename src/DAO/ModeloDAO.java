/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECTION.ConnectionFactory;
import DTO.ModeloDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudio
 */
public class ModeloDAO {
    public void create(ModeloDTO m) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO modelo(id_fabricante,m_nome) VALUES (?,?)");

            stmt.setInt(1, m.getId_fabricante());
            stmt.setString(2, m.getNome());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modelo salvo com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar modelo : " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<ModeloDTO> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ModeloDTO> modelos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from modelo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ModeloDTO modelo = new ModeloDTO();
                modelo.setId_modelo(rs.getInt("id_modelo"));
                modelo.setId_fabricante(rs.getInt("id_fabricante"));
                modelo.setNome(rs.getString("m_nome"));
                
                modelos.add(modelo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return modelos;
    }
    
    public void update(ModeloDTO m) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE modelo SET id_fabricante,f_nome = ? WHERE id_modelo = ?" );

            stmt.setInt(1, m.getId_fabricante());
            stmt.setString(2, m.getNome());
            stmt.setInt(3, m.getId_modelo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(ModeloDTO m) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM modelo WHERE id_modelo = ?" );

            
            stmt.setInt(1, m.getId_modelo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
