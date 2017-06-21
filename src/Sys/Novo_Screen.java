package Sys;

import FileCtrl.ImageFilter;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import FileCtrl.PackgesSelect;
import FileCtrl.acceptFiles;
import Telas.Meio;
import java.io.File;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import static FileCtrl.acceptFiles.doc;

public class Novo_Screen extends javax.swing.JInternalFrame {

    Main main;
    ArrayList<Boolean> checkObjs = new ArrayList<>();
    ArrayList<File> externals = new ArrayList<>();
    
    File folder = new File(doc.getPath()+"//EngineProjects//");
    
    public Novo_Screen(Main p) {
        initComponents();
        folder.mkdir();
        
        fillPackges();
        
        main = p;
        
        checkForNumbers();
        
        //Remove barra de titulo do JInternalFrame
        JComponent bar = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        bar.setSize(0,0);
        bar.setPreferredSize(new Dimension(0,0));
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

        myTitleBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campo_NamePr = new javax.swing.JTextField();
        createP = new javax.swing.JButton();
        cancelBnt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enderecoBar = new javax.swing.JTextField();
        SearchBnt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaExt = new javax.swing.JTable();

        setBackground(new java.awt.Color(100, 100, 100));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(800, 658));

        myTitleBar.setBackground(new java.awt.Color(150, 150, 150));

        closeButton.setBackground(new java.awt.Color(150, 150, 150));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/exit.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myTitleBarLayout = new javax.swing.GroupLayout(myTitleBar);
        myTitleBar.setLayout(myTitleBarLayout);
        myTitleBarLayout.setHorizontalGroup(
            myTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myTitleBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myTitleBarLayout.setVerticalGroup(
            myTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel1.setText("Nome do Projeto");

        campo_NamePr.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        campo_NamePr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_NamePr.setText("Novo Projeto");
        campo_NamePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_NamePrActionPerformed(evt);
            }
        });

        createP.setBackground(new java.awt.Color(110, 110, 100));
        createP.setText("Criar Projeto");
        createP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPActionPerformed(evt);
            }
        });

        cancelBnt.setBackground(new java.awt.Color(110, 110, 100));
        cancelBnt.setText("Cancelar");
        cancelBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBntActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Carregar Arquivo Externo");

        enderecoBar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        SearchBnt.setText("Procurar");
        SearchBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBntActionPerformed(evt);
            }
        });

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
        Tabela.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(Tabela);

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
        TabelaExt.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(TabelaExt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enderecoBar, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBnt))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(campo_NamePr, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createP, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(cancelBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_NamePr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBnt))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelBnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        main.someComp(this);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void createPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPActionPerformed
        if(!campo_NamePr.getText().equals("")){
            checkForNumbers();
            DefaultTableModel tabs = (DefaultTableModel) Tabela.getModel();
        
            for(int i=0; i<checkObjs.size(); i++){
                checkObjs.set(i, (Boolean) tabs.getValueAt(i, 1));
            }
            
            //Cria a pasta do projeto
            PackgesSelect.createFolder(campo_NamePr.getText());
            
            //Passa os Aqruivos e Pacotes para serem criados
            PackgesSelect.createWithThis(checkObjs, externals);
            
            //Muda o titulo do JFrame para o nome do Projeto
            main.setTitle("EngineTeste - "+campo_NamePr.getText());
            main.someComp(this);
            if(main.meio == null)
                main.criaComp(main.meio = new Meio(main), main.AREA_CENTER);
            else{
                main.someComp(main.meio);
                main.meio.close();
                main.meio = null;
                main.criaComp(main.meio = new Meio(main), main.AREA_CENTER);
            }
        }else
            JOptionPane.showMessageDialog(main, "O nome do projeto não pode estar vazio");
    }//GEN-LAST:event_createPActionPerformed

    private void SearchBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBntActionPerformed
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
    }//GEN-LAST:event_SearchBntActionPerformed

    private void cancelBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBntActionPerformed
        main.someComp(this);
    }//GEN-LAST:event_cancelBntActionPerformed

    private void campo_NamePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_NamePrActionPerformed
        checkForNumbers();
    }//GEN-LAST:event_campo_NamePrActionPerformed

    void checkForNumbers(){
        String camp = campo_NamePr.getText();
        for (File listFile : folder.listFiles()) {
            camp = acceptFiles.quant(folder.listFiles(), campo_NamePr.getText());
        }
        campo_NamePr.setText(camp);
    }
    
    void addFilter(JFileChooser jfk){
        FileFilter img = new FileNameExtensionFilter("Images Files Only", "jpg", "jpeg", "png", "giff");
        jfk.setFileFilter(img);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBnt;
    private javax.swing.JTable Tabela;
    private javax.swing.JTable TabelaExt;
    private javax.swing.JTextField campo_NamePr;
    private javax.swing.JButton cancelBnt;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton createP;
    private javax.swing.JTextField enderecoBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel myTitleBar;
    // End of variables declaration//GEN-END:variables
}
