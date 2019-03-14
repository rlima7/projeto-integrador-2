/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.FabricanteDAO;
import DTO.FabricanteDTO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Claudio
 */
public class CadastroFabricante extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroFabricante
     */
    public CadastroFabricante() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTFabricante.getModel();
        jTFabricante.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTFabricante.getModel();
        modelo.setNumRows(0);
        FabricanteDAO fdao = new FabricanteDAO();

        for (FabricanteDTO f : fdao.read()) {

            modelo.addRow(new Object[]{
                f.getId_fabricante(),
                f.getNome()

            });

        }

    }
    
    private void limpar(){
        String texto = " ";
        
        txtNome.setText(texto);
        txtId.setText(texto);
        
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
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFabricante = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Fabricante");

        jLabel1.setText("Digite o nome do fabricante");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jTFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jTFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFabricanteMouseClicked(evt);
            }
        });
        jTFabricante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFabricanteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTFabricante);

        jLabel2.setText("ID");

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDeletar)
                                .addGap(46, 46, 46)
                                .addComponent(btnAtualizar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        FabricanteDTO f = new FabricanteDTO();
        FabricanteDAO dao = new FabricanteDAO();

        f.setNome(txtNome.getText());
       

        dao.create(f);

        readJTable();
        limpar();
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {
            FabricanteDTO f = new FabricanteDTO();
            FabricanteDAO dao = new FabricanteDAO();

            
            f.setId_fabricante((int) jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 0));

            dao.delete(f);

            readJTable();
            limpar();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {

            FabricanteDTO f = new FabricanteDTO();
            FabricanteDAO dao = new FabricanteDAO();

            f.setNome(txtNome.getText());
            
            f.setId_fabricante((int) jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 0));

            dao.update(f);

            readJTable();
            limpar();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jTFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFabricanteMouseClicked
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {

            txtId.setText(jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 0).toString());
            txtNome.setText(jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 1).toString());
           
        }
    }//GEN-LAST:event_jTFabricanteMouseClicked

    private void jTFabricanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFabricanteKeyReleased
        // TODO add your handling code here:
        if (jTFabricante.getSelectedRow() != -1) {

            txtId.setText(jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 0).toString());
            txtNome.setText(jTFabricante.getValueAt(jTFabricante.getSelectedRow(), 1).toString());
           
        }
    }//GEN-LAST:event_jTFabricanteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFabricante;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
