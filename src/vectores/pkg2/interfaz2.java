/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Payares
 */
public class interfaz2 extends javax.swing.JFrame {

    /**
     * Creates new form interfaz2
     */
    double v[];
    public interfaz2() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        txtLongitud = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lc = new javax.swing.JLabel();
        txtpares = new javax.swing.JTextField();
        lk = new javax.swing.JLabel();
        txtimpares = new javax.swing.JTextField();
        o = new javax.swing.JLabel();
        txtprimo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmbcrear = new javax.swing.JButton();
        cmbLlenarManual = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Blackadder ITC", 0, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLongitud.setBackground(new java.awt.Color(204, 255, 255));
        txtLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLongitudActionPerformed(evt);
            }
        });
        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 90, -1));

        jLabel2.setFont(new java.awt.Font("Blackadder ITC", 0, 18)); // NOI18N
        jLabel2.setText("Longitud :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 110));

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        jLabel1.setText("Calculadora de vectores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Blackadder ITC", 0, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lc.setText("Cantidad de numeros pares:");
        jPanel3.add(lc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, -1));

        txtpares.setAutoscrolls(false);
        txtpares.setEnabled(false);
        jPanel3.add(txtpares, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 100, -1));

        lk.setText("Cantidad de impares:");
        jPanel3.add(lk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        txtimpares.setAutoscrolls(false);
        txtimpares.setEnabled(false);
        jPanel3.add(txtimpares, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, -1));

        o.setText("Cantidad de primos:");
        jPanel3.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        txtprimo.setAutoscrolls(false);
        txtprimo.setEnabled(false);
        jPanel3.add(txtprimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 280, 180));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Blackadder ITC", 0, 24))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbcrear.setBackground(new java.awt.Color(204, 255, 255));
        cmbcrear.setFont(new java.awt.Font("Blackadder ITC", 0, 18)); // NOI18N
        cmbcrear.setText("Crear");
        cmbcrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmbcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        cmbLlenarManual.setBackground(new java.awt.Color(204, 255, 255));
        cmbLlenarManual.setFont(new java.awt.Font("Blackadder ITC", 0, 14)); // NOI18N
        cmbLlenarManual.setText("Llenar vector");
        cmbLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenarManualActionPerformed(evt);
            }
        });
        cmbLlenarManual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbLlenarManualKeyTyped(evt);
            }
        });
        jPanel4.add(cmbLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        cmbBorrar.setBackground(new java.awt.Color(204, 255, 255));
        cmbBorrar.setFont(new java.awt.Font("Blackadder ITC", 0, 14)); // NOI18N
        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Blackadder ITC", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 150, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongitudActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        if(!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmbcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcrearActionPerformed
        // TODO add your handling code here:
        int Longitud;
        if(txtLongitud.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "digite la longitud ","Error",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();

        }
        else if (Integer.parseInt(txtLongitud.getText().trim())==0){
            JOptionPane.showMessageDialog(this, " la longitud no puede ser 0 ","Error",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();

        }
        else{
            Longitud=Integer.parseInt(txtLongitud.getText().trim() );
            v= new double [Longitud];
            JOptionPane.showMessageDialog(this, "Vector creado Exitosamente");

        }

    }//GEN-LAST:event_cmbcrearActionPerformed

    private void cmbLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenarManualActionPerformed
        // TODO add your handling code here:

        String res1,res4,res3;

        double n;

        int Longitud,contador=0,contI=0,cotP=0;

         if(txtLongitud.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "digite la longitud ","Error",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();

         }else{
         
         for (int i = 0; i < v.length; i++) {
            n= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite los elementos en la posicion"+i));
            v[i]=n;
              

        
            
            
             if(v[i]%2==0){
            contador++;
             }
            
             else{
                     contI=contI+1;
             }
               if (v[i]%2>0){
                    cotP++;
                    }
             }
               res1 = String.valueOf(contador);
                   res3=String.valueOf(contI);
                    res4=String.valueOf(cotP);
                   
                  txtpares.setText(res1);
        txtimpares.setText(res3);
         txtprimo.setText(res4);
       
       
        }

    }//GEN-LAST:event_cmbLlenarManualActionPerformed

    private void cmbLlenarManualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbLlenarManualKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbLlenarManualKeyTyped

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
        // TODO add your handling code here:
        txtpares.setText("");
        txtimpares.setText("");
        txtprimo.setText("");
        
        txtLongitud.setText("");
        v = null;
        txtLongitud.requestFocusInWindow();
    }//GEN-LAST:event_cmbBorrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbLlenarManual;
    private javax.swing.JButton cmbcrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lc;
    private javax.swing.JLabel lk;
    private javax.swing.JLabel o;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtimpares;
    private javax.swing.JTextField txtpares;
    private javax.swing.JTextField txtprimo;
    // End of variables declaration//GEN-END:variables
}
