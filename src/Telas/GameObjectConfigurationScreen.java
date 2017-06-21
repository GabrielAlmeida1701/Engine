package Telas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GameObjectConfigurationScreen extends javax.swing.JFrame implements Runnable{

    BufferedImage img, fnd;
    Graphics2D g;
    
    private File spriteFile;
    
    public GameObjectConfigurationScreen(File spriteFile) {
        initComponents();
        
        setResizable(false);
        
        this.spriteFile = spriteFile;
        
        try {
            fnd = ImageIO.read(getClass().getResourceAsStream("/resource/engine/fundo.png"));
        } catch (IOException ex) {}
        
        setVisible(true);
    }
    
    public void init(){
        img = new BufferedImage(spritePreview.getWidth(), spritePreview.getHeight(), BufferedImage.TYPE_INT_ARGB);
        g = (Graphics2D) getGraphics();
    }
    
    @Override
    public void run() {
        init();
        
        long start, elapsed, wait;
        while(true){
            start = System.nanoTime();
            
            drawToScreen();
            
            elapsed = System.nanoTime() - start;
            wait = (1000/60) - elapsed/1000000;
            if(wait < 0) wait = 5;
            
            try {
                Thread.sleep(wait);
            } catch (Exception e) {}
        }
    }
    
    void draw(){
        g.drawImage(fnd, 0, 0, getWidth(), getHeight(), null);
    }
    
    void drawToScreen(){
        Graphics g2 = spritePreview.getGraphics();
        
        g2.drawImage(img, 0, 0, spritePreview.getWidth(), spritePreview.getHeight(), null);
        
        g2.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        spritePreview = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout spritePreviewLayout = new javax.swing.GroupLayout(spritePreview);
        spritePreview.setLayout(spritePreviewLayout);
        spritePreviewLayout.setHorizontalGroup(
            spritePreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        spritePreviewLayout.setVerticalGroup(
            spritePreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(spritePreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spritePreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel spritePreview;
    // End of variables declaration//GEN-END:variables

}
