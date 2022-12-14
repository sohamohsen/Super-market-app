/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newsupermarket;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author metr
 */
public class selling extends javax.swing.JFrame {

    /**
     * Creates new form selling
     */
    public selling() {
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

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BillID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prodName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prodQuantity = new javax.swing.JTextField();
        prodCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        DeleteProd = new javax.swing.JButton();
        prodClear = new javax.swing.JButton();
        Editprod = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        BillTxt = new javax.swing.JTextField();
        Grdtotallbl = new javax.swing.JLabel();
        DeleteProd1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Seller");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seller");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Products");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 112, 90));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 112, 90));
        jLabel7.setText("Billing Point");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 112, 90));
        jLabel4.setText("Bill ID");

        BillID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BillID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillIDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BillIDMouseEntered(evt);
            }
        });
        BillID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIDActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 112, 90));
        jLabel5.setText("Name");

        prodName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 112, 90));
        jLabel6.setText("Quantity");

        prodQuantity.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQuantityActionPerformed(evt);
            }
        });

        prodCat.setBackground(new java.awt.Color(235, 235, 235));
        prodCat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bevgrape", "Vegetables", "Meat" }));
        prodCat.setBorder(null);
        prodCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodCatActionPerformed(evt);
            }
        });

        prodTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Quality", "Category"
            }
        ));
        prodTable.setInheritsPopupMenu(true);
        prodTable.setRowHeight(25);
        prodTable.setSelectionBackground(new java.awt.Color(0, 112, 90));
        prodTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        prodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTable);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 112, 90));
        jLabel10.setText("Products List");

        DeleteProd.setBackground(new java.awt.Color(235, 235, 235));
        DeleteProd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteProd.setForeground(new java.awt.Color(0, 112, 90));
        DeleteProd.setText("Filter");
        DeleteProd.setBorder(null);
        DeleteProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteProdMouseClicked(evt);
            }
        });
        DeleteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProdActionPerformed(evt);
            }
        });

        prodClear.setBackground(new java.awt.Color(235, 235, 235));
        prodClear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodClear.setForeground(new java.awt.Color(0, 112, 90));
        prodClear.setText("Clear");
        prodClear.setBorder(null);
        prodClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodClearMouseClicked(evt);
            }
        });
        prodClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodClearActionPerformed(evt);
            }
        });

        Editprod.setBackground(new java.awt.Color(235, 235, 235));
        Editprod.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Editprod.setForeground(new java.awt.Color(0, 112, 90));
        Editprod.setText("Print");
        Editprod.setBorder(null);
        Editprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditprodMouseClicked(evt);
            }
        });
        Editprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditprodActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(235, 235, 235));
        Add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 112, 90));
        Add.setText("Add to bill");
        Add.setBorder(null);
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        BillTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillTxtActionPerformed(evt);
            }
        });

        Grdtotallbl.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Grdtotallbl.setForeground(new java.awt.Color(0, 112, 90));
        Grdtotallbl.setText("Rs");

        DeleteProd1.setBackground(new java.awt.Color(235, 235, 235));
        DeleteProd1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteProd1.setForeground(new java.awt.Color(0, 112, 90));
        DeleteProd1.setText("Refrash");
        DeleteProd1.setBorder(null);
        DeleteProd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteProd1MouseClicked(evt);
            }
        });
        DeleteProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(165, 165, 165))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prodClear, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(prodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteProd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(481, 481, 481))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(Editprod, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(Grdtotallbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteProd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(prodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addComponent(BillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Grdtotallbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Editprod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Log out");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Log out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(434, 434, 434))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 665, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(0, 680, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel16))
                    .addComponent(jLabel3))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int i =0;Double Uprice,ProdTot=0.0,GrdTotal=0.0 ;
int AvailQty;
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        new product().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void BillTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTxtActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if (prodQuantity.getText().isEmpty()||prodName .getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else if (AvailQty <= Integer.valueOf(prodQuantity.getText()))
        {
            JOptionPane.showMessageDialog(this, "Not Enough In Stock");
        }
        else {
            i++;
            ProdTot = Uprice * Double.valueOf(prodQuantity.getText());
            GrdTotal = GrdTotal+ProdTot;
            if (i == 1)
            {
                BillTxt.setText(BillTxt.getText()+"\t=====================Super Market====================\n"+"\tNum       PRODUCT      PRICE       QUANTITY       TOTAL\n\t"+i+"        "+prodName.getText()+"        "+Uprice+"      "+prodQuantity.getText()+ProdTot+"\n\t");
            }
            else{
                BillTxt.setText(BillTxt.getText()+i+"        "+prodName.getText()+"        "+Uprice+"      "+prodQuantity.getText()+ProdTot+"\n");

            }
            Grdtotallbl.setText("RS"+GrdTotal);
        }
        // please add the conntion of data base inside else{} (try and catch)
    }//GEN-LAST:event_AddMouseClicked

    private void EditprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditprodActionPerformed

    private void EditprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditprodMouseClicked
        try {
            BillTxt.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_EditprodMouseClicked

    private void prodClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodClearActionPerformed

    private void prodClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodClearMouseClicked
        // make clear button remove anything in textfilds
        BillID.setText("");
        prodName.setText("");
        prodQuantity.setText("");
    }//GEN-LAST:event_prodClearMouseClicked

    private void DeleteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteProdActionPerformed

    private void DeleteProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteProdMouseClicked

        // please write the connetion of database inside else{} (try and catch)
    }//GEN-LAST:event_DeleteProdMouseClicked

    private void prodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)prodTable.getModel();
        int Myindex = prodTable.getSelectedRow();
        //prodID.setText(model.getValueAt(Myindex, 0).toString());
        Uprice = Double.valueOf(model.getValueAt(Myindex, 4).toString());
        AvailQty = Integer.valueOf(model.getValueAt(Myindex, 3).toString());
        prodName.setText(model.getValueAt(Myindex, 1).toString());
        ProdTot = Uprice * Integer.valueOf(prodQuantity.getText());
        // prodPrice.setText(model.getValueAt(Myindex, 2).toString());
        // prodQuantity.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_prodTableMouseClicked

    private void prodCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodCatActionPerformed

    private void prodQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodQuantityActionPerformed

    private void prodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameActionPerformed

    private void BillIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDActionPerformed

    private void BillIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillIDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDMouseEntered

    private void BillIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDMouseClicked

    private void DeleteProd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteProd1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteProd1MouseClicked

    private void DeleteProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteProd1ActionPerformed

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
    private javax.swing.JButton Add;
    private javax.swing.JTextField BillID;
    private javax.swing.JTextField BillTxt;
    private javax.swing.JButton DeleteProd;
    private javax.swing.JButton DeleteProd1;
    private javax.swing.JButton Editprod;
    private javax.swing.JLabel Grdtotallbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> prodCat;
    private javax.swing.JButton prodClear;
    private javax.swing.JTextField prodName;
    private javax.swing.JTextField prodQuantity;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
