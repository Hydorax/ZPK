/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author Sebastian
 */
public class SuwakForm extends JPanel{

    private int wartosc_r;
    private int wartosc_g;
    private int wartosc_b;
    private int wartosc_rgb;
    private SuwakOrientacja orientacja;
    private JSlider r;
    private JSlider g;
    private JSlider b;
    
 public SuwakForm(){
     
        this.setLayout(new GridLayout(3, 1));
        r = new JSlider(0, 200, 120); 
        r.setUI(new BasicSliderUI(r){
         public void paintThumb(Graphics g){
             Graphics2D g2d = (Graphics2D) g;
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             Rectangle t = thumbRect;
             g2d.setColor(Color.blue);
             int tw2 = t.width / 2;
             
             //g2d.drawLine(t.x, t.y, t.x+t.width, t.y);
             //g2d.drawLine(t.x, t.y, t.x, t.height);
             g2d.drawLine(t.x, t.y, t.x + t.width -1, t.y);
             g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
             g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
             g2d.setColor(Color.red);
             
             wartosc_r = r.getValue();
             
             
         }
     });
        
        g = new JSlider(0, 200, 120); 
        g.setUI(new BasicSliderUI(g){
         public void paintThumb(Graphics gg){
             Graphics2D g2d = (Graphics2D) gg;
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             Rectangle t = thumbRect;
             g2d.setColor(Color.blue);
             int tw2 = t.width / 2;
             
             //g2d.drawLine(t.x, t.y, t.x+t.width, t.y);
             //g2d.drawLine(t.x, t.y, t.x, t.height);
             g2d.drawLine(t.x, t.y, t.x + t.width -1, t.y);
             g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
             g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
             g2d.setColor(Color.red);
             wartosc_g = g.getValue();
             
         }
     });
        
        b = new JSlider(0, 200, 120); 
        b.setUI(new BasicSliderUI(b){
         public void paintThumb(Graphics g){
             Graphics2D g2d = (Graphics2D) g;
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             Rectangle t = thumbRect;
             g2d.setColor(Color.blue);
             int tw2 = t.width / 2;
             
             //g2d.drawLine(t.x, t.y, t.x+t.width, t.y);
             //g2d.drawLine(t.x, t.y, t.x, t.height);
             g2d.drawLine(t.x, t.y, t.x + t.width -1, t.y);
             g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
             g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
             g2d.setColor(Color.red);
             
            wartosc_b = b.getValue(); 
            
         }
     });
     this.add(r);
     this.add(g);
     this.add(b);
     
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
    public int getWartosc_rgb(){
        wartosc_rgb = Integer.valueOf(String.valueOf(wartosc_r) + String.valueOf(wartosc_g) + String.valueOf(wartosc_b)); 
        return wartosc_rgb;
    }
    public void setWartosc_rgb(int wartosc_rgb){
        int old_wartosc_rgb = this.wartosc_rgb;
        this.wartosc_rgb = wartosc_rgb;
        b.setValue(wartosc_rgb);
        firePropertyChange("wartosc_rgb",old_wartosc_rgb, wartosc_rgb);        
    }
    
    public SuwakOrientacja getOrientacja(){
        return orientacja;
    }
    public void setOrientacja(SuwakOrientacja orientacja){
        SuwakOrientacja old_orientacja = this.orientacja;
        this.orientacja = orientacja;
        firePropertyChange("orientacja",old_orientacja, orientacja);       
    }
    
}



