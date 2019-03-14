/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import DAO.AluguelDAO;
import DAO.ClienteDAO;
import DAO.VeiculoDAO;
import DTO.AluguelDTO;
import DTO.VeiculoDTO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MuriloCalmon
 */
public class ListarVeiculos extends javax.swing.JFrame {
private static ListarVeiculos instancia=null;
    /**
     * Creates new form ListarVeiculos
     */
    public ListarVeiculos() {
        initComponents();
    }
    public static ListarVeiculos getInstancia(){
        if(instancia==null)
            instancia = new ListarVeiculos();
        
        return instancia;
    }
   
     public void ViewJtable() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTVeiculos.getModel();
        jTVeiculos.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
      public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTVeiculos.getModel();
        modelo.setNumRows(0);
        VeiculoDAO cdao = new VeiculoDAO();
        AluguelDAO adao = new AluguelDAO();
        for (VeiculoDTO v : cdao.read()) {
                
            
            modelo.addRow(new Object[]{
                v.getPlaca(),
                v.getAnoModelo(),
                v.getQtdPortas(),
                v.getAcessorios(),
                v.getId_fabricante(),
                v.getId_modelo(),
                v.getId_veiculo(),
                v.getDisponivel(),
                
                
                

            });
            
            }
        

    }
      private void limpar(){
        String texto = " ";
        
        txtIdVeiculo.setText(texto);
        txtIdPlaca.setText(texto);
        txtIdModelo.setText(texto);
        txtPorta.setText(texto);
        txtAcessorio.setText(texto);
        txtAno.setText(texto);
        txtFabricante.setText(texto);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVeiculos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdVeiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFabricante = new javax.swing.JTextField();
        txtAcessorio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de  Veículos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTVeiculos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Ano", "Nº Portas", "Acessórios", "Fabricante", "Modelo", "Número", "Disponível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClickVeiculos(evt);
            }
        });
        jTVeiculos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ViewVeiculos(evt);
            }
        });
        jScrollPane1.setViewportView(jTVeiculos);

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickExcluir(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickAtualizarVeiculo(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Número");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Placa");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Modelo");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Ano");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("N° de Portas");

        txtPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Fabricante");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Acessorios");

        jButton1.setText("Atualizar Tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel1)
                            .addComponent(txtIdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortaActionPerformed

    private void ViewVeiculos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ViewVeiculos
        // TODO add your handling code here:
            if (jTVeiculos.getSelectedRow() != -1) {

            txtIdPlaca.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 0).toString());
            txtAno.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 1).toString());
            txtPorta.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 2).toString());
            txtAcessorio.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 3).toString());
            txtFabricante.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 4).toString());
            txtIdModelo.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 5).toString());
            txtIdVeiculo.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 6).toString());
            //txtdisponivel.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 6).toString());
            
        }
    }//GEN-LAST:event_ViewVeiculos

    private void ClickAtualizarVeiculo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickAtualizarVeiculo
        // TODO add your handling code here:
        if (jTVeiculos.getSelectedRow() != -1) {

            VeiculoDTO v = new VeiculoDTO();
            VeiculoDAO dao = new VeiculoDAO();

            v.setPlaca(txtIdPlaca.getText());
            v.setAnoModelo(txtAno.getText());
            v.setQtdPortas(txtPorta.getText());
            v.setAcessorios(txtAcessorio.getText());
            v.setId_fabricante(txtFabricante.getText());
            v.setId_modelo(txtIdModelo.getText());
            v.setId_veiculo(txtIdVeiculo.getText());
            //v.setDisponivel(txtdisponivel.getText());

            dao.update(v);

            readJTable();
            limpar();
        }
    }//GEN-LAST:event_ClickAtualizarVeiculo

    private void MouseClickVeiculos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseClickVeiculos
        // TODO add your handling code here:
                 if (jTVeiculos.getSelectedRow() != -1) {

            txtIdPlaca.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 0).toString());
            txtAno.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 1).toString());
            txtPorta.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 2).toString());
            txtAcessorio.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 3).toString());
            txtFabricante.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 4).toString());
            txtIdModelo.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 5).toString());
            txtIdVeiculo.setText(jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 6).toString());
            
        }
    }//GEN-LAST:event_MouseClickVeiculos

    private void ClickExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickExcluir
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (jTVeiculos.getSelectedRow() != -1) {
            VeiculoDTO v = new VeiculoDTO();
            VeiculoDAO dao = new VeiculoDAO();

            
            v.setId_veiculo((String) jTVeiculos.getValueAt(jTVeiculos.getSelectedRow(), 6));

            dao.delete(v);

            readJTable();
            this.setVisible(false);
        }
    }//GEN-LAST:event_ClickExcluir

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        readJTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVeiculos;
    private javax.swing.JTextField txtAcessorio;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtIdModelo;
    private javax.swing.JTextField txtIdPlaca;
    private javax.swing.JTextField txtIdVeiculo;
    private javax.swing.JTextField txtPorta;
    // End of variables declaration//GEN-END:variables
}
