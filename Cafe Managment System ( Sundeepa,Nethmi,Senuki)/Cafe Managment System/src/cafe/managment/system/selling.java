/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.managment.system;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class selling extends javax.swing.JFrame {

    /**
     * Creates new form selling
     */
    public selling() {
        initComponents();
        Selects();
        txt_SPrice.setEditable(false);
        txt_SName.setEditable(false);
    }

    
    Connection Con = null;
  Statement St = null;
  ResultSet Rs = null;
  
  
    public void Selects(){
       try{
       Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_managment_system","root","");
       St = Con.createStatement();
       Rs = St.executeQuery("select * from item_managment");
       tble_list.setModel(DbUtils.resultSetToTableModel(Rs));
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(this, e);
       }
  }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_SPrice = new javax.swing.JTextField();
        txt_SQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble_Bill = new javax.swing.JTable();
        txt_SName = new javax.swing.JTextField();
        txt_SSeller = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tble_list = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1339, 896));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Items");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Gallery");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 0, 0));
        kGradientPanel1.setkGradientFocus(150);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sell Item");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txt_SPrice.setBackground(new java.awt.Color(255, 255, 255));
        txt_SPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_SPrice.setForeground(new java.awt.Color(102, 0, 0));
        kGradientPanel1.add(txt_SPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, -1));

        txt_SQuantity.setBackground(new java.awt.Color(255, 255, 255));
        txt_SQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_SQuantity.setForeground(new java.awt.Color(102, 0, 0));
        kGradientPanel1.add(txt_SQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 194, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Bill");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seller");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        btn_print.setBackground(new java.awt.Color(255, 255, 255));
        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_print.setForeground(new java.awt.Color(102, 0, 0));
        btn_print.setText("Print");
        btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printMouseClicked(evt);
            }
        });
        kGradientPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 800, 140, 40));

        tble_Bill.setBackground(new java.awt.Color(255, 255, 255));
        tble_Bill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tble_Bill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tble_Bill.setForeground(new java.awt.Color(204, 0, 0));
        tble_Bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Total"
            }
        ));
        tble_Bill.setGridColor(new java.awt.Color(153, 0, 0));
        tble_Bill.setRowHeight(25);
        tble_Bill.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tble_Bill.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tble_Bill.setShowGrid(true);
        tble_Bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tble_BillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tble_Bill);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 560, 520));

        txt_SName.setBackground(new java.awt.Color(255, 255, 255));
        txt_SName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_SName.setForeground(new java.awt.Color(102, 0, 0));
        kGradientPanel1.add(txt_SName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 194, -1));

        txt_SSeller.setBackground(new java.awt.Color(255, 255, 255));
        txt_SSeller.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_SSeller.setForeground(new java.awt.Color(102, 0, 0));
        txt_SSeller.setText("User(Privilaged)");
        kGradientPanel1.add(txt_SSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 194, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        lbl_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total.setText("Total");
        kGradientPanel1.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 740, -1, -1));

        tble_list.setBackground(new java.awt.Color(255, 255, 255));
        tble_list.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tble_list.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tble_list.setForeground(new java.awt.Color(204, 0, 0));
        tble_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Categpry", "Price"
            }
        ));
        tble_list.setGridColor(new java.awt.Color(153, 0, 0));
        tble_list.setRowHeight(25);
        tble_list.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tble_list.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tble_list.setShowGrid(true);
        tble_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tble_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tble_list);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 540, 390));

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(102, 0, 0));
        btn_add.setText("Add to Bill");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        kGradientPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 140, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantity");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Selling");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     dispose();
     gallery g = new gallery();
     g.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        try{
          tble_Bill.print();
       
        } catch (PrinterException ex) {
            Logger.getLogger(selling.class.getName()).log(Level.SEVERE, null, ex);
        }            
        
    }//GEN-LAST:event_btn_printMouseClicked

    private void tble_BillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tble_BillMouseClicked

    }//GEN-LAST:event_tble_BillMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void tble_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tble_listMouseClicked
        DefaultTableModel model  = (DefaultTableModel)tble_list.getModel();
        int tableindex = tble_list.getSelectedRow();
        txt_SName.setText(model.getValueAt(tableindex, 0).toString());
        txt_SPrice.setText(model.getValueAt(tableindex, 2).toString());
    }//GEN-LAST:event_tble_listMouseClicked

    int GrdTot = 0;
    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        
        if(txt_SName.getText().isBlank() || txt_SQuantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Entries!!");
        }else{
        
        int Total = Integer.valueOf(txt_SPrice.getText()) * Integer.valueOf(txt_SQuantity.getText());
        GrdTot = GrdTot + Total;
        lbl_total.setText("Rs." + GrdTot);
        DefaultTableModel model  = (DefaultTableModel)tble_Bill.getModel();
        String nextRowId = Integer.toString(model.getRowCount());
        model.addRow(new Object[]{
            Integer.valueOf(nextRowId)+1,
            txt_SName.getText(),
            txt_SPrice.getText(),
            txt_SQuantity.getText(),
            Total
        });     
        }        
    }//GEN-LAST:event_btn_addMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        Items i = new Items();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTable tble_Bill;
    private javax.swing.JTable tble_list;
    private javax.swing.JTextField txt_SName;
    private javax.swing.JTextField txt_SPrice;
    private javax.swing.JTextField txt_SQuantity;
    private javax.swing.JTextField txt_SSeller;
    // End of variables declaration//GEN-END:variables
}
