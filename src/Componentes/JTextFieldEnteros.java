package Componentes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Dani
 */
public class JTextFieldEnteros extends javax.swing.JTextField{
    //metodos set
    public void setTextEnt(Integer num){

         this.setText(num.toString());
    }
    //metodos get
    public Integer getTextEnt(){
        Integer ret = 0;
        if(this.getText().isEmpty()){
            return ret;
        }else{
            ret=Integer.valueOf(this.getText());
            return ret;
        }
    }
    
    private void jTextFieldFocusLost(java.awt.event.FocusEvent evt) {                                      
      
    }   
    
    
     private void jTextFieldDecimalesKeyReleased(java.awt.event.KeyEvent evt) { 
 
    }  
     
     private void jTextFieldDecimalesKeyTyped(java.awt.event.KeyEvent evt) {                                              
        char c;
        c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }   
 
    
     //constructor
     public JTextFieldEnteros(){
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDecimalesKeyReleased(evt);
            }
        });
        
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDecimalesKeyTyped(evt);
            }
        });
        
        this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFocusLost(evt);
            }
        });

     }//fin constructor
}//fin de la clase
