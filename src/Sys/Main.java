package Sys;

import Packages.Elemento;
import Telas.Meio;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

public class Main extends javax.swing.JFrame {

    public final int AREA_CENTER = 0; 
    public final int AREA_LADO = 1;
    
    Dimension tool = getToolkit().getScreenSize();
    public Meio meio;

    public Main() {
        initComponents();
        setTitle("EngineTeste");
        setLocation( (tool.width/2)-(getSize().width/2) , (tool.height/2)-(getSize().height/2) );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Menus = new javax.swing.JTabbedPane();
        fundo1 = new javax.swing.JPanel();
        Novo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Abrir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Save1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addPackge = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addExternal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fundo2 = new javax.swing.JPanel();
        objLab = new javax.swing.JLabel();
        trnsPos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        xp_camp = new javax.swing.JTextField();
        yp_camp = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        trnsScale = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        xs_camp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ys_camp = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        moveTool = new javax.swing.JLabel();
        scaleTool = new javax.swing.JLabel();
        AreaCenter = new javax.swing.JPanel();
        AreaLado = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(40, 40, 40));

        BG.setBackground(new java.awt.Color(40, 40, 40));

        fundo1.setBackground(new java.awt.Color(40, 40, 40));

        Novo.setBackground(new java.awt.Color(80, 80, 80));
        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/new.png"))); // NOI18N
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Novo");

        Abrir.setBackground(new java.awt.Color(80, 80, 80));
        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/load.png"))); // NOI18N
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Abrir");

        Save.setBackground(new java.awt.Color(80, 80, 80));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/save.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salvar Projeto");

        Save1.setBackground(new java.awt.Color(80, 80, 80));
        Save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/save.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salvar Projeto Como:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        addPackge.setBackground(new java.awt.Color(80, 80, 80));
        addPackge.setText("[Adiciona P]");
        addPackge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPackgeActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Adicionar Pacote");

        addExternal.setBackground(new java.awt.Color(80, 80, 80));
        addExternal.setText("[Adiciona AE]");
        addExternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExternalActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Adicionar Arquivo Externo");

        javax.swing.GroupLayout fundo1Layout = new javax.swing.GroupLayout(fundo1);
        fundo1.setLayout(fundo1Layout);
        fundo1Layout.setHorizontalGroup(
            fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo1Layout.createSequentialGroup()
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Save1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPackge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(addExternal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        fundo1Layout.setVerticalGroup(
            fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(fundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Novo)
                            .addComponent(Abrir)
                            .addComponent(Save)
                            .addComponent(Save1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(fundo1Layout.createSequentialGroup()
                        .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPackge, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addExternal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );

        fundo1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Abrir, Novo, Save});

        Menus.addTab("Arquivo", fundo1);

        fundo2.setBackground(new java.awt.Color(40, 40, 40));

        objLab.setForeground(new java.awt.Color(255, 255, 255));
        objLab.setText("Objeto: ");

        trnsPos.setForeground(new java.awt.Color(255, 255, 255));
        trnsPos.setText("Posição");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Y:");

        xp_camp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xp_campActionPerformed(evt);
            }
        });

        yp_camp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yp_campActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        trnsScale.setForeground(new java.awt.Color(255, 255, 255));
        trnsScale.setText("Escala");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X:");

        xs_camp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xs_campActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Y:");

        ys_camp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ys_campActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        moveTool.setBackground(new java.awt.Color(51, 51, 51));
        moveTool.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        moveTool.setForeground(new java.awt.Color(255, 255, 255));
        moveTool.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moveTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/move.png"))); // NOI18N
        moveTool.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moveTool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveTool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moveToolMouseClicked(evt);
            }
        });

        scaleTool.setBackground(new java.awt.Color(51, 51, 51));
        scaleTool.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        scaleTool.setForeground(new java.awt.Color(255, 255, 255));
        scaleTool.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scaleTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icones/scale.png"))); // NOI18N
        scaleTool.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scaleTool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scaleTool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scaleToolMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fundo2Layout = new javax.swing.GroupLayout(fundo2);
        fundo2.setLayout(fundo2Layout);
        fundo2Layout.setHorizontalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(objLab)
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trnsPos)
                            .addGroup(fundo2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addComponent(xp_camp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yp_camp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trnsScale)
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(xs_camp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ys_camp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(moveTool, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scaleTool, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        fundo2Layout.setVerticalGroup(
            fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jSeparator2)
                .addGap(11, 11, 11))
            .addComponent(jSeparator3)
            .addGroup(fundo2Layout.createSequentialGroup()
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xp_camp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yp_camp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xs_camp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ys_camp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fundo2Layout.createSequentialGroup()
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundo2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(objLab))
                            .addGroup(fundo2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(trnsScale)
                                    .addComponent(trnsPos))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scaleTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moveTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menus.addTab("Objeto", fundo2);

        AreaCenter.setBackground(new java.awt.Color(110, 110, 110));
        AreaCenter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout AreaCenterLayout = new javax.swing.GroupLayout(AreaCenter);
        AreaCenter.setLayout(AreaCenterLayout);
        AreaCenterLayout.setHorizontalGroup(
            AreaCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AreaCenterLayout.setVerticalGroup(
            AreaCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        AreaLado.setBackground(new java.awt.Color(110, 110, 110));
        AreaLado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menus)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(AreaCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaLado, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(Menus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AreaLado)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        Component cmp = null;
        for(Component c: AreaCenter.getComponents())
            if(c instanceof Novo_Screen)
                cmp = c;
            else if(c instanceof Open_Screen)
                someComp(c);
            else if(c instanceof Meio)
                someComp(c, meio);
        
        if(cmp == null){
            Novo_Screen ns = new Novo_Screen(this);
            AreaCenter.add(ns);
            ns.setVisible(true);
            ns.setSize(AreaCenter.getSize());
        }
    }//GEN-LAST:event_NovoActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        Component cmp = null;
        for(Component c: AreaCenter.getComponents())
            if(c instanceof Open_Screen)
                cmp = c;
            else if(c instanceof Novo_Screen)
                someComp(c);
            else if(c instanceof Meio)
                someComp(c, meio);
        
        if(cmp == null){
            Open_Screen op = new Open_Screen(this);
            AreaCenter.add(op);
            op.setVisible(true);
            op.setSize(AreaCenter.getSize());
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void xp_campActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xp_campActionPerformed
        if(meio.screen.selectElm != null){
            Elemento elm = meio.screen.selectElm;
            elm.changeVals(Integer.parseInt(xp_camp.getText()), "PX");
        }
    }//GEN-LAST:event_xp_campActionPerformed

    private void yp_campActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yp_campActionPerformed
        if(meio.screen.selectElm != null){
            Elemento elm = meio.screen.selectElm;
            elm.changeVals(Integer.parseInt(yp_camp.getText()), "PY");
        }
    }//GEN-LAST:event_yp_campActionPerformed

    private void xs_campActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xs_campActionPerformed
        if(meio.screen.selectElm != null){
            Elemento elm = meio.screen.selectElm;
            elm.changeVals(Integer.parseInt(xs_camp.getText()), "SX");
        }
    }//GEN-LAST:event_xs_campActionPerformed

    private void ys_campActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ys_campActionPerformed
        if(meio.screen.selectElm != null){
            Elemento elm = meio.screen.selectElm;
            elm.changeVals(Integer.parseInt(ys_camp.getText()), "SY");
        }
    }//GEN-LAST:event_ys_campActionPerformed

    private void moveToolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveToolMouseClicked
        meio.screen.selectTool("drag");
        
        moveTool.setIcon(new ImageIcon(getClass().getResource("/resource/icones/moveSel.png")));
        scaleTool.setIcon(new ImageIcon(getClass().getResource("/resource/icones/scale.png")));
    }//GEN-LAST:event_moveToolMouseClicked

    private void scaleToolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scaleToolMouseClicked
        meio.screen.selectTool("scale");
        
        moveTool.setIcon(new ImageIcon(getClass().getResource("/resource/icones/move.png")));
        scaleTool.setIcon(new ImageIcon(getClass().getResource("/resource/icones/scaleSel.png")));
    }//GEN-LAST:event_scaleToolMouseClicked

    private void addPackgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPackgeActionPerformed
        if(meio != null){
            int x = getX()+getWidth()/2, y = getY()+getHeight()/2;
            AddPackge addPck = new AddPackge(x, y, meio);
            addPck.setVisible(true);
        }
    }//GEN-LAST:event_addPackgeActionPerformed

    private void addExternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExternalActionPerformed
        if(meio != null){
            int x = getX()+getWidth()/2, y = getY()+getHeight()/2;
            AddExternal addExt = new AddExternal(this);
            addExt.setVisible(true);
        }
    }//GEN-LAST:event_addExternalActionPerformed
    
    public void backTool(){
        moveTool.setIcon(new ImageIcon(getClass().getResource("/resource/icones/move.png")));
        scaleTool.setIcon(new ImageIcon(getClass().getResource("/resource/icones/scale.png")));
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void someComp(Component comp){
        comp.setVisible(false);
        AreaCenter.remove(comp);
        for(Component c: AreaCenter.getComponents()){
            c.setVisible(true);
            if(c instanceof Meio)
                meio.running = true;
        }
    }
    
    public void someComp(Component comp, Meio meio){
        comp.setVisible(false);
        meio.running = false;
    }
    
    public void criaComp(Component comp, int type){
        if(type == AREA_CENTER)
            AreaCenter.add(comp);
        if(type == AREA_LADO)
            AreaLado.add(comp);
        
        comp.setLocation(0, 0);
    }
    
    public Dimension igualaMeio(Component comp, int type){
        if(type == AREA_CENTER)
            return AreaCenter.getSize();
        if(type == AREA_LADO)
            return AreaLado.getSize();
        
        return null;
    }
    
    public JTabbedPane areaL(){return AreaLado;}
    
    public void setTransformValues(int px, int py, int sx, int sy){
        xp_camp.setText(""+px);
        yp_camp.setText(""+py);
        xs_camp.setText(""+sx);
        ys_camp.setText(""+sy);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JPanel AreaCenter;
    private javax.swing.JTabbedPane AreaLado;
    private javax.swing.JPanel BG;
    private javax.swing.JTabbedPane Menus;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Save;
    private javax.swing.JButton Save1;
    private javax.swing.JButton addExternal;
    private javax.swing.JButton addPackge;
    private javax.swing.JPanel fundo1;
    private javax.swing.JPanel fundo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel moveTool;
    private javax.swing.JLabel objLab;
    private javax.swing.JLabel scaleTool;
    private javax.swing.JLabel trnsPos;
    private javax.swing.JLabel trnsScale;
    private javax.swing.JTextField xp_camp;
    private javax.swing.JTextField xs_camp;
    private javax.swing.JTextField yp_camp;
    private javax.swing.JTextField ys_camp;
    // End of variables declaration//GEN-END:variables
}
