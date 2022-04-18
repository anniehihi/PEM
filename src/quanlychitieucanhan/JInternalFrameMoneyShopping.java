/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychitieucanhan;

import Cryptography.Valition;
import java.util.*;
import entities.*;
import Data.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class JInternalFrameMoneyShopping extends javax.swing.JInternalFrame {

   
    Userdao usdao = new Userdao();
        Valition va = new Valition();
        Moneyshoppingdao msdao = new Moneyshoppingdao();
        Calendar c = Calendar.getInstance();
    public JInternalFrameMoneyShopping(String username) {
        initComponents();
         this.setLocation(5, 98);
        this.setSize(1570, 720);
        
        c.setTime(new Date());
      
        Users us = usdao.findusername(username);
        this.jLabel6finduserid.setText(String.valueOf(us.getUsersid()));
         this.jLabel6finduserid.setVisible(false);
         findtable(msdao.findday(Integer.parseInt(this.jLabel6finduserid.getText()), (c.get(Calendar.MONTH) + 1), (c.get(Calendar.YEAR))));
       // findtable(msdao.findll(Integer.parseInt(this.jLabel6finduserid.getText())));
        
        
    }
    SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd");
        public void findtable(List<MoneyShopping> listms) {
        try {

            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Id");
            dfm.addColumn("Name money");
            dfm.addColumn("Money");
            dfm.addColumn("Date");
            dfm.addColumn("Description");

            for (MoneyShopping ms : listms) {
                dfm.addRow(new Object[]{ms.getId(), ms.getNamemoney(), ms.getMoney(),sdf.format(ms.getDate()) , ms.getDescription()});
            }
            this.jTable1shoppingmoney.setModel(dfm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1namemoney = new javax.swing.JTextField();
        jTextField2money = new javax.swing.JTextField();
        jCalendarCombo1date = new org.freixas.jcalendar.JCalendarCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1description = new javax.swing.JTextArea();
        jButton1create = new javax.swing.JButton();
        jButton2updates = new javax.swing.JButton();
        jButton3clearn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1shoppingmoney = new javax.swing.JTable();
        jTextField3search = new javax.swing.JTextField();
        jButton4search = new javax.swing.JButton();
        jButton5delete = new javax.swing.JButton();
        jLabel6finduserid = new javax.swing.JLabel();
        jComboBox1month = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2year = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jButton1show = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shopping Money");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name Money");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Money");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Description");

        jTextField1namemoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2money.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2money.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextArea1description.setColumns(20);
        jTextArea1description.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1description.setLineWrap(true);
        jTextArea1description.setRows(5);
        jTextArea1description.setWrapStyleWord(true);
        jTextArea1description.setDragEnabled(true);
        jScrollPane1.setViewportView(jTextArea1description);

        jButton1create.setBackground(new java.awt.Color(204, 153, 255));
        jButton1create.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/Creat.png"))); // NOI18N
        jButton1create.setText("Create");
        jButton1create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1createActionPerformed(evt);
            }
        });

        jButton2updates.setBackground(new java.awt.Color(204, 153, 255));
        jButton2updates.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2updates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/edit.png"))); // NOI18N
        jButton2updates.setText("Updates");
        jButton2updates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2updatesActionPerformed(evt);
            }
        });

        jButton3clearn.setBackground(new java.awt.Color(204, 153, 255));
        jButton3clearn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3clearn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/edit-clear.png"))); // NOI18N
        jButton3clearn.setText("Clearn");
        jButton3clearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3clearnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1namemoney)
                            .addComponent(jTextField2money)
                            .addComponent(jCalendarCombo1date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1create, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2updates, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3clearn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1namemoney, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2money, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCalendarCombo1date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1create, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2updates, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3clearn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jTable1shoppingmoney.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1shoppingmoney.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1shoppingmoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1shoppingmoneyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1shoppingmoney);

        jTextField3search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3searchKeyPressed(evt);
            }
        });

        jButton4search.setBackground(new java.awt.Color(204, 153, 255));
        jButton4search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/search.png"))); // NOI18N
        jButton4search.setText("Search");
        jButton4search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4searchActionPerformed(evt);
            }
        });

        jButton5delete.setBackground(new java.awt.Color(204, 153, 255));
        jButton5delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/btn_delete.png"))); // NOI18N
        jButton5delete.setText("Delete");
        jButton5delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5deleteActionPerformed(evt);
            }
        });

        jComboBox1month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Month");

        jComboBox2year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Year");

        jButton1show.setBackground(new java.awt.Color(204, 153, 255));
        jButton1show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1show.setText("Show");
        jButton1show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jTextField3search, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4search, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6finduserid, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(694, 694, 694))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5delete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1month, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2year, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButton1show, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(588, 588, 588))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1show, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jLabel6finduserid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1createActionPerformed
          try {
              String namemoney = this.jTextField1namemoney.getText();
            String money = this.jTextField2money.getText();
            String descipt = this.jTextArea1description.getText();
            if (namemoney.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name money empty");
            } else if (money.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Money empty");
            } else if (!va.checmoney(money)) {
                JOptionPane.showMessageDialog(null, "you enter no reasonable money");
            } else if (!namemoney.isEmpty() && !money.isEmpty()) {

                MoneyShopping ms = new MoneyShopping();
                ms.setNamemoney(namemoney);
                ms.setMoney(Long.parseLong(money));
                ms.setDate(this.jCalendarCombo1date.getDate());
                ms.setDescription(descipt);
                ms.getUsersid().setUsersid(Integer.parseInt(this.jLabel6finduserid.getText()));

                if (msdao.create(ms)) {
                    JOptionPane.showMessageDialog(null, "successfully created");
                  findtable(msdao.findday(Integer.parseInt(this.jLabel6finduserid.getText()), (c.get(Calendar.MONTH) + 1), (c.get(Calendar.YEAR))));
                } else {
                    JOptionPane.showMessageDialog(null, "create failure");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1createActionPerformed

    private void jButton2updatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2updatesActionPerformed
         try {

            int index = this.jTable1shoppingmoney.getSelectedRow();

            if (index == -1) {
                JOptionPane.showMessageDialog(null, "you choose not to update the line in the table");
            } else {
                String id = this.jTable1shoppingmoney.getValueAt(index, 0).toString();
               // MoneyShopping msid = msdao.find(Integer.parseInt(id));
                String namemoney = this.jTextField1namemoney.getText();
                String money = this.jTextField2money.getText();
                String descipt = this.jTextArea1description.getText();
                if (namemoney.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Name money empty");
                } else if (money.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Money empty");
                } else if (!va.checmoney(money)) {
                    JOptionPane.showMessageDialog(null, "you enter no reasonable money");
                } else if (!namemoney.isEmpty() && !money.isEmpty()) {

                    MoneyShopping ms = new MoneyShopping();
                    ms.setNamemoney(namemoney);
                    ms.setMoney(Long.parseLong(money));
                    ms.setDate(this.jCalendarCombo1date.getDate());
                    ms.setDescription(descipt);
                    ms.getUsersid().setUsersid(Integer.parseInt(this.jLabel6finduserid.getText()));

                    ms.setId(Integer.parseInt(id));
                    if (msdao.updates(ms)) {
                        JOptionPane.showMessageDialog(null, "successfully Updates");
                   findtable(msdao.findday(Integer.parseInt(this.jLabel6finduserid.getText()), (c.get(Calendar.MONTH) + 1), (c.get(Calendar.YEAR))));
                    } else {
                        JOptionPane.showMessageDialog(null, "failure Updates");
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2updatesActionPerformed

    private void jButton3clearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3clearnActionPerformed
             this.jTextField1namemoney.setText("");
             this.jTextField2money.setText("");
             this.jTextArea1description.setText("");
    }//GEN-LAST:event_jButton3clearnActionPerformed

    private void jTable1shoppingmoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1shoppingmoneyMouseClicked
      try {

            int index = this.jTable1shoppingmoney.getSelectedRow();
            String id = this.jTable1shoppingmoney.getValueAt(index, 0).toString();
            MoneyShopping ms = msdao.find(Integer.parseInt(id));
            this.jTextField1namemoney.setText(ms.getNamemoney());
            this.jTextField2money.setText(String.valueOf(ms.getMoney()));
            this.jTextArea1description.setText(ms.getDescription());
            this.jCalendarCombo1date.setDate(ms.getDate());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jTable1shoppingmoneyMouseClicked

    private void jButton5deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5deleteActionPerformed
            int index = this.jTable1shoppingmoney.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "you choose not to delete the line in the table");
        } else {
            int result = JOptionPane.showConfirmDialog(null, "are you sure", "Money shopping delete", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String id = this.jTable1shoppingmoney.getValueAt(index, 0).toString();
                if (msdao.delete(Integer.parseInt(id))) {
                    JOptionPane.showMessageDialog(null, "successfully delete");
                         findtable(msdao.findday(Integer.parseInt(this.jLabel6finduserid.getText()), (c.get(Calendar.MONTH) + 1), (c.get(Calendar.YEAR))));
                } else {
                    JOptionPane.showMessageDialog(null, "not delete");
                }

            }
        }
    }//GEN-LAST:event_jButton5deleteActionPerformed

    private void jButton4searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4searchActionPerformed
        search();
    }//GEN-LAST:event_jButton4searchActionPerformed

    private void jTextField3searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3searchKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           search();
       }
    }//GEN-LAST:event_jTextField3searchKeyPressed

    private void jButton1showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1showActionPerformed
        try {
              String month = String.valueOf(this.jComboBox1month.getSelectedItem());
            String year =   String.valueOf(this.jComboBox2year.getSelectedItem());
           int months =  Integer.parseInt(month);
           int years =  Integer.parseInt(year);
           
            findtable(msdao.findday(Integer.parseInt(this.jLabel6finduserid.getText()), months, years));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1showActionPerformed

    
    public void search(){
         DefaultTableModel dtm = (DefaultTableModel) this.jTable1shoppingmoney.getModel();
        dtm.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(dtm);
        this.jTable1shoppingmoney.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(this.jTextField3search.getText()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1create;
    private javax.swing.JButton jButton1show;
    private javax.swing.JButton jButton2updates;
    private javax.swing.JButton jButton3clearn;
    private javax.swing.JButton jButton4search;
    private javax.swing.JButton jButton5delete;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo1date;
    private javax.swing.JComboBox jComboBox1month;
    private javax.swing.JComboBox jComboBox2year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6finduserid;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1shoppingmoney;
    private javax.swing.JTextArea jTextArea1description;
    private javax.swing.JTextField jTextField1namemoney;
    private javax.swing.JTextField jTextField2money;
    private javax.swing.JTextField jTextField3search;
    // End of variables declaration//GEN-END:variables
}