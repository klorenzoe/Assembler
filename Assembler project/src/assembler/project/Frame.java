/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembler.project;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.JOptionPane; 

/**
 *
 * @author usuario
 */
public class Frame extends javax.swing.JFrame
{
   translate code;
   /**
    * Creates new form Frame
    */
   public Frame()
   {
      initComponents();
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      txtCode = new javax.swing.JTextArea();
      jScrollPane2 = new javax.swing.JScrollPane();
      txtAssembler = new javax.swing.JTextArea();
      jLabel2 = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      btnExport = new javax.swing.JButton();
      btnImport = new javax.swing.JButton();
      lblClear = new javax.swing.JLabel();
      jScrollPane6 = new javax.swing.JScrollPane();
      txtDictionary = new javax.swing.JTextArea();
      jLabel7 = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      jScrollPane5 = new javax.swing.JScrollPane();
      txtComments = new javax.swing.JTextArea();
      jLabel4 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jScrollPane3 = new javax.swing.JScrollPane();
      txtTags = new javax.swing.JTextArea();
      jLabel5 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jScrollPane4 = new javax.swing.JScrollPane();
      txtVariables = new javax.swing.JTextArea();
      jLabel6 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(239, 69, 102));

      txtCode.setColumns(20);
      txtCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtCode.setRows(5);
      txtCode.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      txtCode.setEnabled(false);
      jScrollPane1.setViewportView(txtCode);

      txtAssembler.setColumns(20);
      txtAssembler.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtAssembler.setRows(5);
      txtAssembler.setDisabledTextColor(new java.awt.Color(0, 0, 153));
      txtAssembler.setEnabled(false);
      jScrollPane2.setViewportView(txtAssembler);

      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assembler/project/flecha.png"))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
      jLabel1.setText("Assembler");

      jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
      jLabel3.setText("Hack code");

      btnExport.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
      btnExport.setText("Export");

      btnImport.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
      btnImport.setText("Import");
      btnImport.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btnImportActionPerformed(evt);
         }
      });

      lblClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assembler/project/clear.png"))); // NOI18N
      lblClear.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            lblClearMouseClicked(evt);
         }
      });

      txtDictionary.setBackground(new java.awt.Color(199, 219, 208));
      txtDictionary.setColumns(20);
      txtDictionary.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtDictionary.setRows(5);
      jScrollPane6.setViewportView(txtDictionary);

      jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
      jLabel7.setText("Final dictionary...");

      jPanel2.setBackground(new java.awt.Color(239, 69, 102));

      txtComments.setBackground(new java.awt.Color(249, 205, 174));
      txtComments.setColumns(20);
      txtComments.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtComments.setRows(5);
      txtComments.setEnabled(false);
      jScrollPane5.setViewportView(txtComments);

      jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
      jLabel4.setText("Delete comments...");

      jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assembler/project/flecha2.png"))); // NOI18N

      txtTags.setBackground(new java.awt.Color(249, 205, 174));
      txtTags.setColumns(20);
      txtTags.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtTags.setRows(5);
      txtTags.setEnabled(false);
      jScrollPane3.setViewportView(txtTags);

      jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
      jLabel5.setText("Processing tags...");

      jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assembler/project/flecha2.png"))); // NOI18N

      txtVariables.setBackground(new java.awt.Color(249, 205, 174));
      txtVariables.setColumns(20);
      txtVariables.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
      txtVariables.setRows(5);
      txtVariables.setEnabled(false);
      jScrollPane4.setViewportView(txtVariables);

      jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
      jLabel6.setText("Processing variables...");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(26, 26, 26)
                  .addComponent(jLabel9))
               .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jLabel8))
               .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel6)
               .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(jLabel5)
                     .addComponent(jLabel6))
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel9))
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8))))
               .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnImport))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(253, 253, 253)
                  .addComponent(jLabel1)
                  .addGap(289, 289, 289)
                  .addComponent(btnExport))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jLabel2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblClear)
            .addGap(21, 21, 21))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addContainerGap(42, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(lblClear)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnExport)
                        .addComponent(btnImport)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel7)
                  .addGap(18, 18, 18)
                  .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(27, 27, 27))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnImportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnImportActionPerformed
   {//GEN-HEADEREND:event_btnImportActionPerformed
      // TODO add your handling code here:
       try{
          //front-end
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setCurrentDirectory(new File("C:\\Users\\usuario\\Desktop\\Universidad\\Arquitectura\\Assember java"));
            chooser.showOpenDialog(chooser);
            
            //back-end
            code = new translate(chooser.getSelectedFile().getAbsolutePath());
            
            //front-end
            txtCode.setText(code.codeContent);
            
            //back-end abd front-end
            FillTxtAssembler();
              
        }catch(Exception e){
           
        }
      
   }//GEN-LAST:event_btnImportActionPerformed

   private void lblClearMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblClearMouseClicked
   {//GEN-HEADEREND:event_lblClearMouseClicked
      // TODO add your handling code here:
      txtCode.setText("");
      txtAssembler.setText("");
      txtDictionary.setText("");
      txtTags.setText("");
      txtVariables.setText("");
      txtComments.setText("");
   }//GEN-LAST:event_lblClearMouseClicked

   private void FillTxts(){
      try{
         //back-end
         String[] txts = code.ConvertToAssembler().split("$");
         //front-end
         txtComments.setText(txts[0]);
         txtTags.setText(txts[1]);
         txtVariables.setText(txts[2]);
         txtDictionary.setText(txts[3]);
         txtAssembler.setText(txts[4]);
      }catch(Exception e){
         //front-end
         JOptionPane.showMessageDialog(null,"I can not processing the code, probably your file have a sintax error"); 
      }
   }
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
         java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex)
      {
         java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex)
      {
         java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex)
      {
         java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            new Frame().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnExport;
   private javax.swing.JButton btnImport;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JScrollPane jScrollPane6;
   private javax.swing.JLabel lblClear;
   private javax.swing.JTextArea txtAssembler;
   private javax.swing.JTextArea txtCode;
   private javax.swing.JTextArea txtComments;
   private javax.swing.JTextArea txtDictionary;
   private javax.swing.JTextArea txtTags;
   private javax.swing.JTextArea txtVariables;
   // End of variables declaration//GEN-END:variables
}
