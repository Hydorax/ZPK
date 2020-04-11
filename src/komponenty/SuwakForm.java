/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenty;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

    int wartosc_r;
    int wartosc_g;
    int wartosc_b;
    
 public SuwakForm(){
     
        
        JSlider r = new JSlider(0, 200, 120); 
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
        
         JSlider g = new JSlider(0, 200, 120); 
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
        
        JSlider b = new JSlider(0, 200, 120); 
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
        firePropertyChange("wartosc_r",old_wartosc_r, wartosc_r);       
    }
    

public int getWartosc_g(){
        return wartosc_g;
    }
    public void setWartosc_g(int wartosc_g){
        int old_wartosc_g = this.wartosc_g;
        this.wartosc_g = wartosc_g;
        firePropertyChange("wartosc_g",old_wartosc_g, wartosc_g);       
    }
    


public int getWartosc_b(){
        return wartosc_b;
    }
    public void setWartosc_b(int wartosc_b){
        int old_wartosc_b = this.wartosc_b;
        this.wartosc_b = wartosc_b;
        firePropertyChange("wartosc_b",old_wartosc_b, wartosc_b);       
    }
    
}



