package Componentes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dani
 */
public class JTextFieldMayusculas extends javax.swing.JTextField{
    private void jTextFieldMayusculasKeyReleased(java.awt.event.KeyEvent evt) {                                                  
       String var=this.getText();
       var=var.toUpperCase();
       this.setText(var);
    }       
    
    private void jTextFieldMayusculasKeyTyped(java.awt.event.KeyEvent evt) {                                               
       char nom = evt.getKeyChar();
        if ((nom < 'a' || nom > 'z') && (nom < 'A' || nom > 'Z')&&(nom < '0' || nom > '9')) {
            evt.consume();
        }
    }        
    
    public JTextFieldMayusculas(){
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMayusculasKeyReleased(evt);
            }
        });
        
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMayusculasKeyTyped(evt);
            }
        });
    }
}
