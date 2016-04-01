package Sys;

import FileControl.PackgesSelect;
import static FileControl.PackgesSelect.Assents;
import static FileControl.PackgesSelect.assents;
import static FileControl.PackgesSelect.copiaArq;
import static FileControl.PackgesSelect.getPacksNames;
import static FileControl.PackgesSelect.typeFile;
import FileControl.acceptFiles;
import Telas.Meio;
import java.io.File;
import java.util.ArrayList;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class AddPackge extends javax.swing.JFrame {

    ArrayList<Boolean> checkObjs = new ArrayList<>();
    Meio meio;
    
    public AddPackge(int x, int y, Meio meio) {
        initComponents();
        this.meio = meio;
        setResizable(false);
        setLocation(x-getWidth()/2, y-getHeight()/2);
        
        fillPackges();
    }
    
    private void fillPackges(){
        DefaultTableModel tabs = (DefaultTableModel) Tabela.getModel();
        
        Object ob[] = {null, null};
        for(int i=0; i<PackgesSelect.getNumPacks(); i++){
            checkObjs.add(false);
            tabs.addRow(ob);
            tabs.setValueAt(PackgesSelect.getPacksNames(i), i, 0);
            tabs.setValueAt(checkObjs.get(i), i, 1);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        DoneBnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(110, 110, 110));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Importar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabela);

        DoneBnt.setBackground(new java.awt.Color(100, 100, 100));
        DoneBnt.setText("Concluido");
        DoneBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneBntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DoneBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoneBnt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneBntActionPerformed
        DefaultTableModel tabs = (DefaultTableModel) Tabela.getModel();
        
        for(int i=0; i<checkObjs.size(); i++){
            checkObjs.set(i, (Boolean) tabs.getValueAt(i, 1));
        }
        
        for(int i=0; i<checkObjs.size(); i++){
            if(checkObjs.get(i)){
                File file[] = new File(assents.getPath()+"\\"+getPacksNames(i)).listFiles();
                for(File f: file){
                    if(acceptFiles.canAdd(f.getName()))
                        Assents.add(f);
                }
            }
        }
        
        Assents.stream().forEach((copyFile) -> copiaArq(copyFile, typeFile(copyFile)));
        
        meio.reload(Assents);
        dispose();
    }//GEN-LAST:event_DoneBntActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneBnt;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
