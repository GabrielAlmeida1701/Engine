package Telas;

import FileControl.PackgesSelect;
import Sys.Main;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Meio extends JPanel implements Runnable{

    Main main;
    MenusLaterais lado;
    public Screen screen = new Screen();
    
    Thread thread;
    boolean run;
    BufferedImage img;
    Graphics2D g;
    
    ArrayList<File> assents;
    
    public BufferedImage fnd;
    public boolean running = true;
    
    public Meio(Main main) {
        initComponents();
        this.main = main;
        setSize(main.igualaMeio(this, main.AREA_CENTER));
        assents = new ArrayList<>(Arrays.asList(PackgesSelect.assFolder.listFiles()));
        
        lado = new Lado(main, this, assents);
        
        createTabs();
        
        screen.meio = this;
        
        addMouseListener(screen);
        addMouseMotionListener(screen);
        
        try {
            fnd = ImageIO.read(getClass().getResourceAsStream("/resource/engine/fundo.png"));
        } catch (IOException ex) {}
    }
    
    public void reload(){
        lado.AddMoreButtons();
    }
    
    private void createTabs(){
        main.areaL().addTab("Imagens", null, lado, "Arquivos de Imagens");
    }
    
    @Override
    public void addNotify() {
	super.addNotify();
	if(thread == null) {
		thread = new Thread(this);
		thread.start();
	}
    }
    
    public void init(){
        img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        g = (Graphics2D) getGraphics();
        run = true;
    }
    
    private void reload(int width, int height){
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g = (Graphics2D) getGraphics();
    }
    
    @Override
    public void run() {
        init();
        
        long start, elapsed, wait;
        while(run){
            start = System.nanoTime();
            
            if(running){
                update();
                draw();
                drawToScreen();
            }
            
            elapsed = System.nanoTime() - start;
            wait = (1000/60) - elapsed/1000000;
            if(wait < 0) wait = 5;
            
            try {
                Thread.sleep(wait);
            } catch (Exception e) {}
        }
    }
    
    int x;
    int y;
    void update(){
        setSize(main.igualaMeio(this, main.AREA_CENTER));
        lado.corrige_Tam();
        
        if(x != getWidth() || y != getHeight()){
            x = getWidth();
            y = getHeight();
            reload(x, y);
        }
        
        screen.update();
    }
    
    void draw(){
        g.drawImage(fnd, 0, 0, getWidth(), getHeight(), null);
        
        screen.draw(g);
    }
    
    void drawToScreen(){
        Graphics g2 = getGraphics();
        
        g2.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        
        g2.dispose();
    }
    
    public void close(){
        main.areaL().removeAll();
        running = false;
        run = false;
        img = null;
        assents.removeAll(assents);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
