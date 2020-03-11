/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Youssef
 */
public abstract class OBJECT {
    public JPanel AB;
    public JPanel IB;
    public JLabel shape;
    public int width,height;
    public String name;
    protected Location L;
    public boolean collectable;
    
    public void select(){}
}
