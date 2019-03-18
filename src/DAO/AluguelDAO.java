/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import CONNECTION.ConnectionFactory;
import DTO.AluguelDTO;
import DTO.VeiculoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AluguelDAO {
    
    public void devolver(AluguelDTO a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
        stmt = con.prepareStatement("UPDATE veiculo INNER JOIN aluguel SET veiculo.disponivel ='S', aluguel.entregue = 'S' WHERE id_aluguel = ?");
        stmt.setString(1, a.getId_aluguel());

            stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Devoluçao realizada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na devolução: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void create(AluguelDTO a,VeiculoDTO v) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO aluguel(veiculo,dataAluguel,dataEntrega,cliente,entregue,observacao,valorPago,disponivel) VALUES (?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, a.getVeiculo());
            stmt.setString(2, a.getDataAluguel());
            stmt.setString(3, a.getDataEntrega());
            stmt.setString(4, a.getCliente());
            stmt.setString(5, a.getEntregue());
            stmt.setString(6, a.getObservação());
            stmt.setString(7, a.getValorPago());
            stmt.setString(8, a.getDisponivel());
            stmt.executeUpdate();
            
             stmt = con.prepareStatement("UPDATE veiculo SET disponivel ='N' where placa =?");
             stmt.setString(1, v.getPlaca());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<AluguelDTO> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AluguelDTO> alugueis = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from aluguel");
            rs = stmt.executeQuery();

            while (rs.next()) {

                AluguelDTO aluguel = new AluguelDTO();
                
                aluguel.setVeiculo(rs.getString("veiculo"));
                aluguel.setDataAluguel(rs.getString("dataAluguel"));
                aluguel.setDataEntrega(rs.getString("dataEntrega"));
                aluguel.setCliente(rs.getString("cliente"));
                aluguel.setEntregue(rs.getString("entregue"));
                aluguel.setObservação(rs.getString("observacao"));
                aluguel.setValorPago(rs.getString("valorPago"));
                aluguel.setId_aluguel(rs.getString("id_aluguel"));
                aluguel.setDisponivel(rs.getString("disponivel"));
                alugueis.add(aluguel);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return alugueis;
    }
    public void update(AluguelDTO a) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE aluguel SET veiculo = ? ,dataAluguel = ? ,dataEntrega = ? ,cliente = ? ,entregue = ? ,observacao = ? ,valorPago = ? ,disponivel = ? WHERE id_aluguel = ?" );
           
            stmt.setString(1, a.getVeiculo());
            stmt.setString(2, a.getDataAluguel());
            stmt.setString(3, a.getDataEntrega());
            stmt.setString(4, a.getCliente());
            stmt.setString(5, a.getEntregue());
            stmt.setString(6, a.getObservação());
            stmt.setString(7, a.getValorPago());
            stmt.setString(8, a.getId_aluguel());
            stmt.setString(9, a.getDisponivel());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com secesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: " + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     public void delete(AluguelDTO a) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM aluguel WHERE id_aluguel = ?" );

            
            stmt.setString(1, a.getId_aluguel());
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
    
}
