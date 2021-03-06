/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychitieucanhan;

import Cryptography.Valition;
import entities.*;
import Data.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JInternalFramecashbalance extends javax.swing.JInternalFrame {

     Userdao usdao = new Userdao();
    Valition va = new Valition();
  Cashbalancedao cbdao = new Cashbalancedao();
  Calendar C = Calendar.getInstance();
    public JInternalFramecashbalance(String username) {
        initComponents();
          this.setLocation(5, 98);
        this.setSize(1570, 720);
          Users us = usdao.findusername(username);

         C.setTime(new Date());
           this.jLabel8userid.setText(String.valueOf(us.getUsersid()));
        this.jLabel8userid.setVisible(false);
        
           findtable(cbdao.findday(Integer.parseInt(this.jLabel8userid.getText()), (C.get(Calendar.MONTH)+1), C.get(Calendar.YEAR)));
    }

    
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd");
      public void findtable(List<cashbalance> listcb) {
        try {

            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Id");
            dfm.addColumn("Name money");
            dfm.addColumn("Money");
            dfm.addColumn("Date");
            dfm.addColumn("Description");

            for (cashbalance cb : listcb) {
                dfm.addRow(new Object[]{cb.getId(), cb.getNamemoney(), cb.getMoney(), sdf.format(cb.getDate()), cb.getDescription()});
            }
            this.jTable1cashbalance.setModel(dfm);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1descripton = new javax.swing.JTextArea();
        jCalendarCombo1date = new org.freixas.jcalendar.JCalendarCombo();
        jButton1create = new javax.swing.JButton();
        jButton2updates = new javax.swing.JButton();
        jButton3cleaen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1cashbalance = new javax.swing.JTable();
        jTextField3search = new javax.swing.JTextField();
        jButton4shearch = new javax.swing.JButton();
        jButton5delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1month = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2year = new javax.swing.JComboBox();
        jButton6show = new javax.swing.JButton();
        jLabel8userid = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cash balance");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name money");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Money");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(" Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Description");

        jTextField1namemoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2money.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2money.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextArea1descripton.setColumns(20);
        jTextArea1descripton.setRows(5);
        jScrollPane1.setViewportView(jTextArea1descripton);

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

        jButton3cleaen.setBackground(new java.awt.Color(204, 153, 255));
        jButton3cleaen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3cleaen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/edit-clear.png"))); // NOI18N
        jButton3cleaen.setText("Clearn");
        jButton3cleaen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3cleaenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1create, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2updates, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3cleaen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(29, 29, 29)
                            .addComponent(jTextField1namemoney))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(74, 74, 74)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addComponent(jTextField2money)
                                .addComponent(jCalendarCombo1date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1namemoney, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2money, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jCalendarCombo1date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1create, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2updates, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3cleaen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jTable1cashbalance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1cashbalance.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1cashbalance);

        jTextField3search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3searchKeyPressed(evt);
            }
        });

        jButton4shearch.setBackground(new java.awt.Color(204, 153, 255));
        jButton4shearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4shearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/search.png"))); // NOI18N
        jButton4shearch.setText("Search");
        jButton4shearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4shearchActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Month");

        jComboBox1month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Year");

        jComboBox2year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" }));

        jButton6show.setBackground(new java.awt.Color(204, 153, 255));
        jButton6show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6show.setText("Show");
        jButton6show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel8userid)
                        .addGap(217, 217, 217)
                        .addComponent(jTextField3search, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton4shearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5delete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1month, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2year, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6show, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(644, 644, 644)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel8userid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4shearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox2year, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6show, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5deleteActionPerformed
         int index = this.jTable1cashbalance.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "you choose not to delete the line in the table");
        } else {
            int result = JOptionPane.showConfirmDialog(null, "are you sure", "cash balance delete", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                String id = this.jTable1cashbalance.getValueAt(index, 0).toString();
                if (cbdao.delete(Integer.parseInt(id))) {
                    JOptionPane.showMessageDialog(null, "successfully delete");
         findtable(cbdao.findday(Integer.parseInt(this.jLabel8userid.getText()), (C.get(Calendar.MONTH)+1), C.get(Calendar.YEAR)));
                } else {
                    JOptionPane.showMessageDialog(null, "not delete");
                }

            }
        }

    }//GEN-LAST:event_jButton5deleteActionPerformed

    private void jButton1createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1createActionPerformed
         try {

            String namemoney = this.jTextField1namemoney.getText();
            String money = this.jTextField2money.getText();
            String descipt = this.jTextArea1descripton.getText();
            if (namemoney.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name money empty");
            } else if (money.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Money empty");
            } else if (!va.checmoney(money)) {
                JOptionPane.showMessageDialog(null, "you enter no reasonable money");
            } else if (!namemoney.isEmpty() && !money.isEmpty()) {

                cashbalance cb = new cashbalance();
                cb.setNamemoney(namemoney);
                cb.setMoney(Long.parseLong(money));
                cb.setDate(this.jCalendarCombo1date.getDate());
                cb.setDescription(descipt);
                cb.getUsersid().setUsersid(Integer.parseInt(this.jLabel8userid.getText()));

                if (cbdao.create(cb)) {
                    JOptionPane.showMessageDialog(null, "successfully created");
                      findtable(cbdao.findday(Integer.parseInt(this.jLabel8userid.getText()), (C.get(Calendar.MONTH)+1), C.get(Calendar.YEAR)));
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

            int index = this.jTable1cashbalance.getSelectedRow();

            if (index == -1) {
                JOptionPane.showMessageDialog(null, "you choose not to update the line in the table");
            } else {
                String id = this.jTable1cashbalance.getValueAt(index, 0).toString();
              //  DailyMoney dai = dmdao.find(Integer.parseInt(id));
                String namemoney = this.jTextField1namemoney.getText();
                String money = this.jTextField2money.getText();
                String descipt = this.jTextArea1descripton.getText();
                if (namemoney.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Name money empty");
                } else if (money.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Money empty");
                } else if (!va.checmoney(money)) {
                    JOptionPane.showMessageDialog(null, "you enter no reasonable money");
                } else if (!namemoney.isEmpty() && !money.isEmpty()) {

                   cashbalance cb = new cashbalance();
                    cb.setNamemoney(namemoney);
                    cb.setMoney(Long.parseLong(money));
                    cb.setDate(this.jCalendarCombo1date.getDate());
                    cb.setDescription(descipt);
                    cb.getUsersid().setUsersid(Integer.parseInt(this.jLabel8userid.getText()));

                    cb.setId(Integer.parseInt(id));
                    if (cbdao.updates(cb)) {
                        JOptionPane.showMessageDialog(null, "successfully Updates");
                     findtable(cbdao.findday(Integer.parseInt(this.jLabel8userid.getText()), (C.get(Calendar.MONTH)+1), C.get(Calendar.YEAR)));
                    } else {
                        JOptionPane.showMessageDialog(null, "failure Updates");
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2updatesActionPerformed

    private void jButton3cleaenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3cleaenActionPerformed
      this.jTextField1namemoney.setText("");
             this.jTextField2money.setText("");
                 this.jTextArea1descripton.setText("");
    }//GEN-LAST:event_jButton3cleaenActionPerformed

    private void jButton6showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6showActionPerformed
               try {
            String month = String.valueOf(this.jComboBox1month.getSelectedItem());
            String year =   String.valueOf(this.jComboBox2year.getSelectedItem());
           int months =  Integer.parseInt(month);
           int years =  Integer.parseInt(year);
           
            findtable(cbdao.findday(Integer.parseInt(this.jLabel8userid.getText()), months, years));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton6showActionPerformed

    private void jButton4shearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4shearchActionPerformed
      search();
    }//GEN-LAST:event_jButton4shearchActionPerformed

    private void jTextField3searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3searchKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            search();
        }
         
     
    }//GEN-LAST:event_jTextField3searchKeyPressed

    
      public void search(){
          DefaultTableModel dtm = (DefaultTableModel) this.jTable1cashbalance.getModel();
        dtm.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(dtm);
        this.jTable1cashbalance.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(this.jTextField3search.getText()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1create;
    private javax.swing.JButton jButton2updates;
    private javax.swing.JButton jButton3cleaen;
    private javax.swing.JButton jButton4shearch;
    private javax.swing.JButton jButton5delete;
    private javax.swing.JButton jButton6show;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo1date;
    private javax.swing.JComboBox jComboBox1month;
    private javax.swing.JComboBox jComboBox2year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8userid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1cashbalance;
    private javax.swing.JTextArea jTextArea1descripton;
    private javax.swing.JTextField jTextField1namemoney;
    private javax.swing.JTextField jTextField2money;
    private javax.swing.JTextField jTextField3search;
    // End of variables declaration//GEN-END:variables
}
