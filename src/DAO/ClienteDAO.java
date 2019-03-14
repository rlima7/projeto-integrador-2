/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECTION.ConnectionFactory;
import DTO.ClienteDTO;
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
 * @author Yuri Brandao
 */
public class ClienteDAO {
Connection conn;
    public void create(ClienteDTO c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente(nomeCliente,endereco,uf,telefone,cpf,email) VALUES (?,?,?,?,?,?)");

            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getUf());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getCpf());
            stmt.setString(6, c.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<ClienteDTO> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ClienteDTO> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ClienteDTO cliente = new ClienteDTO();

                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setUf(rs.getString("uf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;
    }

    public void update(ClienteDTO c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET nomeCliente = ?,endereco = ?,uf = ?,telefone = ?,email= ? WHERE cpf = ?" );

            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getUf());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEmail());
            stmt.setString(6, c.getCpf());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(ClienteDTO c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE cpf = ?" );

            
            stmt.setString(1, c.getCpf());
           int r  = JOptionPane.showConfirmDialog(null, "tem certeza que deseja excluir?" + c.getNomeCliente());
           if(r==JOptionPane.YES_OPTION){

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com secesso!");
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
