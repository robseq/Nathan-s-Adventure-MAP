/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author 39333
 */
public class HelpForm extends javax.swing.JFrame {

    /**
     * Creates new form HelpForm
     */
    public HelpForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border global_panel = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 204, 0));
        jPanel1.setBorder(global_panel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        visualizzaHelp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("help");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        visualizzaHelp.setEditable(false);
        visualizzaHelp.setColumns(20);
        visualizzaHelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        visualizzaHelp.setRows(5);
        visualizzaHelp.setText("Per poter giocare utilizza i seguenti comandi:\n\n-OSSERVA per avere informazioni sulla stanza in cui ti trovi;\n\n-NORD, SUD, EST, OVEST per poterti muovere tra le stanze;\n\n-SALVA per poter salvare la partita;\n\n-a,b,c  nei dialoghi a scelta multipla;\n\n-USA per poter utilizzare gli oggetti che si trovano nell'inventario;\n\n-PRENDI per poter raccogliere un oggetto;\n\n-ROMPI per poter rompere un oggetto;\n\n-APRI per poter aprire un oggetto;\n\n-LEGGI per poter leggere libri, note, diari;\n\n-TIRA per poter tirare un oggetto;\n\n-LASCIA per rimuovere un oggetto dall'inventario;\n\n-INVENTARIO per poter aprire l'inventario");
        jScrollPane2.setViewportView(visualizzaHelp);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea visualizzaHelp;
    // End of variables declaration//GEN-END:variables
}
