package Sys;

import FileCtrl.ImageFilter;
import static FileCtrl.PackgesSelect.Assents;
import static FileCtrl.PackgesSelect.copiaArq;
import static FileCtrl.PackgesSelect.typeFile;
import FileCtrl.acceptFiles;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddExternal extends javax.swing.JFrame {

    ArrayList<File> externals = new ArrayList<>();
    
    Main main;
    
    public AddExternal(Main main) {
        initComponents();
        setResizable(false);
        
        this.main = main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaExt = new javax.swing.JTable();
        enderecoBar = new javax.swing.JTextField();
        SearchBnt = new javax.swing.JButton();
        AddExtrBnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TabelaExt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Arquivos Externos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TabelaExt);

        enderecoBar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        SearchBnt.setText("Procurar");
        SearchBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBntActionPerformed(evt);
            }
        });

        AddExtrBnt.setText("Adicionar");
        AddExtrBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddExtrBntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(enderecoBar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddExtrBnt)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddExtrBnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBntActionPerformed
        search();
    }//GEN-LAST:event_SearchBntActionPerformed

    private void AddExtrBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddExtrBntActionPerformed
        if(externals != null){
            externals.stream().forEach((external) -> Assents.add(external));
            
            Assents.stream().forEach((copyFile) -> copiaArq(copyFile, typeFile(copyFile)));
            main.meio.reload(Assents);
            dispose();
        }else
            dispose();
    }//GEN-LAST:event_AddExtrBntActionPerformed

    private void search(){
        JFileChooser jfk = new JFileChooser();
        jfk.setFileFilter(new ImageFilter());

        int returnVal = jfk.showOpenDialog(main);
        DefaultTableModel tabs = (DefaultTableModel) TabelaExt.getModel();
        Vector linha = new Vector();

        if(returnVal == JFileChooser.APPROVE_OPTION){
            if(acceptFiles.canAdd(jfk.getSelectedFile(), externals) &&
                acceptFiles.canAdd(jfk.getSelectedFile().getName())){
                File fl = jfk.getSelectedFile();
                linha.add(fl.getName());
                externals.add(fl);
                enderecoBar.setText(fl.toString());

                tabs.addRow(linha);
            }else
            JOptionPane.showMessageDialog(main, "Esse Arquivo Ja foi Selecionado\nOu o formato não é reconhecido");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddExtrBnt;
    private javax.swing.JButton SearchBnt;
    private javax.swing.JTable TabelaExt;
    private javax.swing.JTextField enderecoBar;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
