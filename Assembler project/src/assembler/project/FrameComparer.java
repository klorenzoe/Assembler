/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembler.project;

import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author usuario
 */
public class FrameComparer extends javax.swing.JFrame
{

   /**
    * Creates new form FrameComparer
    */
   Frame Callback;
   public FrameComparer()
   {
      initComponents();
   }
   
   public FrameComparer(String nand2tetris, String myCode, String Hack, Frame forReturn){
      initComponents();
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
      
      Enumerator(Hack.split("\n"), txtHack);
      Enumerator(nand2tetris.split("\n"), txtItsCode);
      Enumerator(myCode.split("\n"), txtmyCode);
      Callback = forReturn;
      Enumerator(Comparison(nand2tetris.split("\n"), myCode.split("\n")).split("\n"), txtComparison);
   }
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   
   /*
   * This method compares my code with the nand2tetris
   */
   private String Comparison(String[] A, String[] B){
      String C="";
      int length = B.length;
      if(A.length< B.length) length = A.length;
      
      for (int i = 0; i < length; i++)
      {
         if(A[i].equals(B[i])){
            C+="TRUE\n";
         }else{
            C+="FALSE\n";
         }
      }
      return A.length!=B.length? C+="THE LENGTH IS DIFFERENT!": C;
   }
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jScrollPane3 = new javax.swing.JScrollPane();
      txtCode2 = new javax.swing.JTextArea();
      jLabel5 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      txtmyCode = new javax.swing.JTextArea();
      jLabel3 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      txtItsCode = new javax.swing.JTextArea();
      jLabel4 = new javax.swing.JLabel();
      jScrollPane4 = new javax.swing.JScrollPane();
      txtComparison = new javax.swing.JTextArea();
      jLabel6 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jScrollPane5 = new javax.swing.JScrollPane();
      txtHack = new javax.swing.JTextArea();
      jLabel7 = new javax.swing.JLabel();

      txtCode2.setColumns(20);
      txtCode2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtCode2.setRows(5);
      txtCode2.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      txtCode2.setEnabled(false);
      jScrollPane3.setViewportView(txtCode2);

      jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
      jLabel5.setText("Hack code");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setUndecorated(true);

      jPanel1.setBackground(new java.awt.Color(2, 48, 89));

      txtmyCode.setEditable(false);
      txtmyCode.setBackground(new java.awt.Color(242, 242, 242));
      txtmyCode.setColumns(20);
      txtmyCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtmyCode.setRows(5);
      txtmyCode.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      jScrollPane1.setViewportView(txtmyCode);

      jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("My result");

      txtItsCode.setBackground(new java.awt.Color(242, 242, 242));
      txtItsCode.setColumns(20);
      txtItsCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtItsCode.setRows(5);
      txtItsCode.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      jScrollPane2.setViewportView(txtItsCode);

      jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setText("Nand2tetris result");

      txtComparison.setBackground(new java.awt.Color(242, 242, 242));
      txtComparison.setColumns(20);
      txtComparison.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtComparison.setRows(5);
      txtComparison.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      jScrollPane4.setViewportView(txtComparison);

      jLabel6.setBackground(new java.awt.Color(255, 255, 255));
      jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(255, 255, 255));
      jLabel6.setText("Comparison");

      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assembler/project/close.png"))); // NOI18N
      jLabel2.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            jLabel2MouseClicked(evt);
         }
      });

      txtHack.setEditable(false);
      txtHack.setBackground(new java.awt.Color(242, 242, 242));
      txtHack.setColumns(20);
      txtHack.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtHack.setRows(5);
      txtHack.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      jScrollPane5.setViewportView(txtHack);

      jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
      jLabel7.setForeground(new java.awt.Color(255, 255, 255));
      jLabel7.setText("Hack code");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel7)
               .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel3)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(55, 55, 55)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel4)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(58, 58, 58)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel6)
               .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(52, 52, 52))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel2))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane1))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel6)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane2))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel7)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jScrollPane5)))
            .addContainerGap(64, Short.MAX_VALUE))
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

   
   /*
   * This method fills of numbers the txtAreas
   */
   private void Enumerator(String[] text, javax.swing.JTextArea componet){
      for (int i = 0; i < text.length; i++)
      {
         text[i] = i +". "+text[i];
      }
      componet.setText(String.join("\n", text));
   }
   private void jLabel2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel2MouseClicked
   {//GEN-HEADEREND:event_jLabel2MouseClicked
      // TODO add your handling code here:
      Callback.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_jLabel2MouseClicked

   /**
    * @param args the command line arguments
    */
   public static void main(String args[])
   {
      /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try
      {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
         {
            if ("Nimbus".equals(info.getName()))
            {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }
      catch (ClassNotFoundException ex)
      {
         java.util.logging.Logger.getLogger(FrameComparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(FrameComparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(FrameComparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(FrameComparer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new FrameComparer().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JTextArea txtCode2;
   private javax.swing.JTextArea txtComparison;
   private javax.swing.JTextArea txtHack;
   private javax.swing.JTextArea txtItsCode;
   private javax.swing.JTextArea txtmyCode;
   // End of variables declaration//GEN-END:variables
}
