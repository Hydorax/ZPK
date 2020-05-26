/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.beans.PropertyChangeListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.HORIZONTAL;
import static javax.swing.SwingConstants.VERTICAL;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author Sebastian
 */
public class SuwakForm extends JPanel{

    private int wartosc_r;
    private int wartosc_g;
    private int wartosc_b;
    private Color kolor;
    private SuwakOrientacja orientacja = SuwakOrientacja.Poziomo;
    private JSlider r;
    private JSlider g;
    private JSlider b;
    private JLabel label_r;
    private JLabel label_g;
    private JLabel label_b;
    
    
 public SuwakForm(){
     
        
        this.setLayout(new GridLayout(3, 2));
        
        JPanel r_panel = new JPanel();
        JPanel g_panel = new JPanel();
        JPanel b_panel = new JPanel();
        JPanel rr_panel = new JPanel();
        JPanel gg_panel = new JPanel();
        JPanel bb_panel = new JPanel();
        
        
        r = new JSlider(0, 255, 0); 
        r.setUI(new BasicSliderUI(r){
         public void paintThumb(Graphics g){
             Graphics2D g2d = (Graphics2D) g;
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             Rectangle t = thumbRect;
             g2d.setColor(Color.blue);
             int tw2 = t.width / 2;
             
            
             
             if(orientacja == SuwakOrientacja.Pionowo){
                g2d.drawLine(t.x, t.y, t.x, t.y + t.height);
                g2d.drawLine(t.x, t.y, t.x + t.width, t.y + (tw2/2));
                g2d.drawLine(t.x, t.y + t.height, t.x + t.width, t.y + (tw2/2));
             }else{
                g2d.drawLine(t.x, t.y, t.x + t.width -1, t.y);
                g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
                g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
             }
             
             g2d.setColor(Color.red);
             
             wartosc_r = r.getValue();
             r_panel.setBackground(new java.awt.Color(wartosc_r, 0, 0));
             
         }
     });
        r_panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        r_panel.setLayout(new BorderLayout());
        this.add(r_panel);
        r_panel.add(r);
                
        
        g = new JSlider(0, 255, 0); 
        g.setUI(new BasicSliderUI(g){
         public void paintThumb(Graphics gg){
             Graphics2D g2d = (Graphics2D) gg;
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             Rectangle t = thumbRect;
             g2d.setColor(Color.blue);
             int tw2 = t.width / 2;
             
             if(orientacja == SuwakOrientacja.Pionowo){
                g2d.drawLine(t.x, t.y, t.x, t.y + t.height);
                g2d.drawLine(t.x, t.y, t.x + t.width, t.y + (tw2/2));
                g2d.drawLine(t.x, t.y + t.height, t.x + t.width, t.y + (tw2/2));
             }else{
                g2d.drawLine(t.x, t.y, t.x + t.width -1, t.y);
                g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
                g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
             }
             g2d.setColor(Color.red);
             wartosc_g = g.getValue();
             g_panel.setBackground(new java.awt.Color(0, wartosc_g, 0));
             
         }
     });
        g_panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        g_panel.setLayout(new BorderLayout());
        this.add(g_panel);
        g_panel.add(g);
        
        b = new JSlider(0, 255, 0); 
        b.setUI(new BasicSliderUI(b){
         public void paintThumb(Graphics g){
             Graphics2D g2d = (Graphics2D) g;
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             Rectangle t = thumbRect;
             g2d.setColor(Color.blue);
             int tw2 = t.width / 2;
             
             if(orientacja == SuwakOrientacja.Pionowo){
                g2d.drawLine(t.x, t.y, t.x, t.y + t.height);
                g2d.drawLine(t.x, t.y, t.x + t.width, t.y + (tw2/2));
                g2d.drawLine(t.x, t.y + t.height, t.x + t.width, t.y + (tw2/2));
             }else{
                g2d.drawLine(t.x, t.y, t.x + t.width -1, t.y);
                g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
                g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
             }
             g2d.setColor(Color.red);
             
            wartosc_b = b.getValue(); 
            b_panel.setBackground(new java.awt.Color(0, 0, wartosc_b));
            
         }
     });
        
        
        b_panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        b_panel.setLayout(new BorderLayout());
        this.add(b_panel);
        b_panel.add(b);
//     this.add(r);
//     this.add(g);
//     this.add(b);
     

     
 }
    public int getWartosc_r(){
        return wartosc_r;
    }
    public void setWartosc_r(int wartosc_r){
        int old_wartosc_r = this.wartosc_r;
        this.wartosc_r = wartosc_r;
        r.setValue(wartosc_r);
        firePropertyChange("wartosc_r",old_wartosc_r, wartosc_r);       
    }
    

    public int getWartosc_g(){
        return wartosc_g;
    }
    public void setWartosc_g(int wartosc_g){
        int old_wartosc_g = this.wartosc_g;
        this.wartosc_g = wartosc_g;
        g.setValue(wartosc_g);
        firePropertyChange("wartosc_g",old_wartosc_g, wartosc_g);       
    }
    


    public int getWartosc_b(){
        return wartosc_b;
    }
    public void setWartosc_b(int wartosc_b){
        int old_wartosc_b = this.wartosc_b;
        this.wartosc_b = wartosc_b;
        b.setValue(wartosc_b);
        firePropertyChange("wartosc_b",old_wartosc_b, wartosc_b);       
    }
    public Color getKolor(){
        kolor = new Color(wartosc_r, wartosc_g, wartosc_b);
       // kolor = Integer.valueOf(String.valueOf(wartosc_r) + String.valueOf(wartosc_g) + String.valueOf(wartosc_b)); 
        return kolor;
    }
    public void setKolor(Color kolor){
        
        
        
        Color old_kolor = this.kolor;
        this.kolor = kolor;
        wartosc_r = kolor.getRed();
        wartosc_g = kolor.getGreen();
        wartosc_b = kolor.getBlue();
        r.setValue(wartosc_r);
        g.setValue(wartosc_g);
        b.setValue(wartosc_b);
        //b.setValue(wartosc_rgb);
        firePropertyChange("Kolor",old_kolor, kolor);        
    }
    
    public SuwakOrientacja getOrientacja(){
        return orientacja;
    }
    public void setOrientacja(SuwakOrientacja orientacja){
        SuwakOrientacja old_orientacja = this.orientacja;
        this.orientacja = orientacja;
        firePropertyChange("orientacja",old_orientacja, orientacja);   
         if(orientacja == SuwakOrientacja.Pionowo){
             setLayout(new GridLayout(1, 3));
             r.setOrientation(VERTICAL);
             g.setOrientation(VERTICAL);
             b.setOrientation(VERTICAL);
             
         }else{
             setLayout(new GridLayout(3, 1));
             r.setOrientation(HORIZONTAL);
             g.setOrientation(HORIZONTAL);
             b.setOrientation(HORIZONTAL);
         }
         invalidate();
    }
    
}



