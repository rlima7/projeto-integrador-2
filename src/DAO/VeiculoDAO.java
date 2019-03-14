/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONNECTION.ConnectionFactory;
import DTO.VeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudio
 */
public class VeiculoDAO {
    
    private Connection conexao;
    public void create(VeiculoDTO v) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO veiculo(placa,anoModelo,qtdPortas,acessorios,id_fabricante,id_modelo,disponivel) VALUES (?,?,?,?,?,?,?)");

            stmt.setString(1, v.getPlaca());
            stmt.setString(2, v.getAnoModelo());
            stmt.setString(3, v.getQtdPortas());
            stmt.setString(4, v.getAcessorios());
            stmt.setString(5, v.getId_fabricante());
            stmt.setString(6, v.getId_modelo());
            stmt.setString(7, v.getDisponivel());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
     public List<VeiculoDTO> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<VeiculoDTO> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from veiculo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                VeiculoDTO veiculo = new VeiculoDTO();

                veiculo.setId_veiculo(rs.getString("id_veiculo"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setAnoModelo(rs.getString("anoModelo"));
                veiculo.setQtdPortas(rs.getString("qtdPortas"));
                veiculo.setAcessorios(rs.getString("acessorios"));
                veiculo.setId_fabricante(rs.getString("id_fabricante"));
                veiculo.setId_modelo(rs.getString("id_modelo"));
                veiculo.setDisponivel(rs.getString("disponivel"));
                veiculos.add(veiculo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return veiculos;
    }
    
      public void update(VeiculoDTO p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculo SET placa = ?,anoModelo = ?,qtdPortas = ?,acessorios = ?,id_fabricante= ?,id_modelo= ?,disponivel = ? WHERE id_veiculo = ?" );

            stmt.setString(1, p.getPlaca());
            stmt.setString(2, p.getAnoModelo());
            stmt.setString(3, p.getQtdPortas());
            stmt.setString(4, p.getAcessorios());
            stmt.setString(5, p.getId_fabricante());
            stmt.setString(6, p.getId_modelo());
            stmt.setString(7, p.getId_veiculo());
            stmt.setString(8, p.getDisponivel());

            stmt.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Atualizado com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
      
      public void delete(VeiculoDTO p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM veiculo WHERE id_veiculo = ?" );

            
            stmt.setString(1, p.getId_veiculo());
            int r  = JOptionPane.showConfirmDialog(null, "tem certeza que deseja excluir?");
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
        public boolean disponivel(String placa) {
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        //Statement stm = this.conexao.createStatement();
        ResultSet rs;
        String dis = null;
        //VeiculoDTO p = new VeiculoDTO();
       try{
        stmt = con.prepareStatement("select disponivel from veiculo where placa = ?");
        rs = stmt.executeQuery();     
        
        
        while(rs.next()){
            
            dis = rs.getString("disponivel");
            //veiculo.setDisponivel(rs.getString("disponivel"));
            //veiculo.setPlaca(rs.getString("placa"));
        }
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro : " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        if(dis.equals("N")){
            return false;
        }else{
            return true;
        }
        
        
       
        
    }
        
      
}
