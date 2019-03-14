/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECTION.ConnectionFactory;
import DTO.ClienteDTO;
import DTO.FabricanteDTO;
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
public class FabricanteDAO {
    
    public void create(FabricanteDTO f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO fabricante(f_nome) VALUES (?)");

            stmt.setString(1, f.getNome());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Fabricante salvo com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar fabricante : " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<FabricanteDTO> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<FabricanteDTO> fabricantes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from fabricante");
            rs = stmt.executeQuery();

            while (rs.next()) {

                FabricanteDTO fabricante = new FabricanteDTO();
                fabricante.setId_fabricante(rs.getInt("id_fabricante"));
                fabricante.setNome(rs.getString("f_nome"));
                
                fabricantes.add(fabricante);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fabricantes;
    }
    
    public void update(FabricanteDTO f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE fabricante SET f_nome = ? WHERE id_fabricante = ?" );

            stmt.setString(1, f.getNome());
            stmt.setInt(2, f.getId_fabricante());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(FabricanteDTO f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM fabricante WHERE id_fabricante = ?" );

            
            stmt.setInt(1, f.getId_fabricante());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
