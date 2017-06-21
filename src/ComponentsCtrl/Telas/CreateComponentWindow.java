package ComponentsCtrl.Telas;

import Telas.Meio;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class CreateComponentWindow extends javax.swing.JFrame {

    private File folder;
    private ArrayList<String> pacotesExistentes = new ArrayList<>();
    
    public CreateComponentWindow(File scrpFolder) {
        folder = scrpFolder;
        initComponents();
        ProjectExplorer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setResizable(false);
    }
    
    private DefaultTableModel createTable(){
        if(folder.listFiles().length > 0){
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Pacotes");
            
            for(int i=0; i < folder.listFiles().length; i++){
                File f = folder.listFiles()[i];
                if(f.isDirectory()){
                    dtm.addRow(new Object[] {f.getName()});
                    pacotesExistentes.add(f.getName());
                }
            }
            
            return dtm;
        }
        
        return new DefaultTableModel(new Object[] {"Pacotes"},0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComponentNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProjectExplorer = new javax.swing.JTable();
        PacoteName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CreatePacote = new javax.swing.JButton();
        CreateComponent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome do Componente:");

        ProjectExplorer.setModel(createTable());
        jScrollPane1.setViewportView(ProjectExplorer);

        PacoteName.setText("Default");

        jLabel2.setText("Nome do Pacote:");

        CreatePacote.setText("Criar Pacote");
        CreatePacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePacoteActionPerformed(evt);
            }
        });

        CreateComponent.setText("Criar Componente");
        CreateComponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateComponentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComponentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PacoteName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CreatePacote)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CreateComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComponentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PacoteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CreatePacote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreatePacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePacoteActionPerformed
        String nome = PacoteName.getText();
        if(!nome.equals("Default")){
            if(folder.listFiles().length > 0){
                for(int i=0; i < folder.listFiles().length; i++){
                    if(nome.equals(pacotesExistentes.get(i))){
                        JOptionPane.showMessageDialog(null, "Pacote Já Existente");
                        return;
                    }
                }
                new File(folder.getPath()+"\\"+nome).mkdir();
                rewindTable(nome);
            }else{
                new File(folder.getPath()+"\\"+nome).mkdir();
                rewindTable(nome);
            }
        }else
            JOptionPane.showMessageDialog(null, "Pacote Já Existente");
    }//GEN-LAST:event_CreatePacoteActionPerformed

    private void CreateComponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateComponentActionPerformed
        if(ComponentNameField.getText().equals("")) return;
        if(ComponentNameField.getText().contains(" ")) return;
        
        if(ProjectExplorer.getSelectedRow() == -1){
            String path = folder.getPath()+"\\"+ComponentNameField.getText()+".phx";
            path = path.replaceAll(" ", "+");
            
            Meio.AddComp();
            
            try {
                Runtime.getRuntime().exec("java -jar PhoenixCompiler.jar "+
                        path+" "+ComponentNameField.getText()+".phx");
            } catch (IOException ex) {
                JOptionPane.showInputDialog(null, "Erro ao executar o compilador",
                            "Compilador não encontrado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_CreateComponentActionPerformed

    private void rewindTable(String newItem){
        DefaultTableModel dfm = (DefaultTableModel)ProjectExplorer.getModel();
        pacotesExistentes.add(newItem);
        dfm.addRow(new Object[] {newItem});
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ComponentNameField;
    private javax.swing.JButton CreateComponent;
    private javax.swing.JButton CreatePacote;
    private javax.swing.JTextField PacoteName;
    private javax.swing.JTable ProjectExplorer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}